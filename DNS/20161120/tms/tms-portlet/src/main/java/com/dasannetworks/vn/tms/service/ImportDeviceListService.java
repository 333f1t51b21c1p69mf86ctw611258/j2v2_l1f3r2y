package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.sb.NoSuchDeviceException;
import com.dasannetworks.vn.sb.NoSuchPurchaseOrderException;
import com.dasannetworks.vn.sb.NoSuchWarrantyFormException;
import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.tms.pojo.PurchaseOrderVO;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Date;
import java.util.List;

@Service
public class ImportDeviceListService {
	private static Log _log = LogFactoryUtil.getLog(ImportDeviceListService.class);
	private final ExcelService excelService;
	private final DeviceService deviceService;
	private final PurchaseOrderService purchaseOrderService;
	private final WarrantyFormService warrantyFormService;

	@Autowired
	public ImportDeviceListService(ExcelService excelService, DeviceService deviceService, PurchaseOrderService purchaseOrderService, WarrantyFormService warrantyFormService) {
		this.excelService = excelService;
		this.deviceService = deviceService;
		this.purchaseOrderService = purchaseOrderService;
		this.warrantyFormService = warrantyFormService;
	}

	public void importPurchaseOrder(DeviceListInputFile file, PurchaseOrderVO purchaseOrderVO) throws SystemException, PortalException {
		// lack of specification, hardware_revision, software_revision
		PurchaseOrder po = null;
		if (purchaseOrderVO.getPurchaseOrderId() != null) {
			try {
			po = purchaseOrderService.get(purchaseOrderVO.getPurchaseOrderId());
			po.setModifiedDate(new Date());
				_log.info(String.format("update purchase order [%s]", po.getPurchaseOrderNumber()));
			} catch (NoSuchPurchaseOrderException e) {
				po = purchaseOrderService.createPurchaseOrder();
				_log.info(String.format("import purchase order [%s]", po.getPurchaseOrderNumber()));
			}
		} else {
			po = purchaseOrderService.createPurchaseOrder();
		}

		purchaseOrderVO.update(po);

		purchaseOrderService.updatePurchaseOrder(po);
		for (DeviceListInputRow row : file.getRows()) {
			Device device = null;
			WarrantyForm warrantyForm = null;
			try {
				device = deviceService.getBySerialNumber(row.getSerialNumber());
				warrantyForm = warrantyFormService.get(device.getWarrantyFormId());
				_log.info(String.format("update device [%s]", row.getSerialNumber()));
			} catch (NoSuchDeviceException | NoSuchWarrantyFormException e) {
				if (e instanceof  NoSuchDeviceException) {
					device = deviceService.create();
				}
				warrantyForm = warrantyFormService.create();
				device.setWarrantyFormId(warrantyForm.getWarrantyFormId());
				_log.info(String.format("import new device with serial number [%s], device id [%d]", row.getSerialNumber(), device.getDeviceId()));
			}

			device.setSerialNumber(row.getSerialNumber());
			device.setMacAddress(row.getMacAddress());
			device.setManufacturerSerial(row.getManufacturerSerial());
			device.setModelName(row.getProductName());
			device.setPartNumber(row.getPartNumber());
			device.setFactoryOut(row.getFactoryOut());
			if (po != null) {
				device.setPurchaseOrderId(po.getPurchaseOrderId());
			}
			warrantyForm.setWarrantyStartDate(purchaseOrderVO.getWarrantyStartDate());
			warrantyForm.setWarrantyEndDate(purchaseOrderVO.getWarrantyEndDate());
			deviceService.updateDevice(device);
			warrantyFormService.updateWarrantyForm(warrantyForm);
		}
	}

	public String importPurchaseOrder(File file, PurchaseOrderVO purchaseOrderVO) throws SystemException, PortalException {
		DeviceListInputFile input = ExcelService.parseDeviceList(file);
		importPurchaseOrder(input, purchaseOrderVO);
		return purchaseOrderVO.getPurchaseOrderNumber();
	}

	/**
	 *
	 */
	@Data
	public static class DeviceListInputFile {
		// TODO consider move to config file
		public static String FACTORY_OUT = "Factory out";
		public static String PRODUCT_NAME = "Product name";
		public static String PART_NUMBER = "Part Number";
		public static String QTY = "Qty";
		public static String SERIAL_NUMBER = "Serial Number";
		public static String MAC_ADDRESS = "MAC Address (GPON)";
		// TODO maybe this is a custom field.
		public static String VIETTEL_SERIAL_NUMBER = "Viettel Serial Number";
		public static String CARTON_BOX_SERIAL = "Carton Box Serial";
		public static String MANUFACTURER_SERIAL = "Manufawacturer Serial (WAN  MAC)";

		private List<DeviceListInputRow> rows;
		private String fileName;
		private String sheetName;

		public DeviceListInputFile(String fileName, List<DeviceListInputRow> rows) {
			this.fileName = fileName;
			this.rows = rows;
		}
	}

	/**
	 *
	 */
	@Data
	public static class DeviceListInputRow {
		private Date factoryOut;
		private String productName;
		private String partNumber;
		private Integer qty;
		private String serialNumber;
		private String macAddress;
		private Long viettelSerialNumber;
		private String cartonBoxSerial;
		private String manufacturerSerial;

		public DeviceListInputRow() {

		}

		public DeviceListInputRow(Date factoryOut, String productName, String partNumber, Integer qty, String serialNumber, String macAddress, Long viettelSerialNumber, String cartonBoxSerial, String manufacturerSerial) {
			this.factoryOut = factoryOut;
			this.productName = productName;
			this.partNumber = partNumber;
			this.qty = qty;
			this.serialNumber = serialNumber;
			this.macAddress = macAddress;
			this.viettelSerialNumber = viettelSerialNumber;
			this.cartonBoxSerial = cartonBoxSerial;
			this.manufacturerSerial = manufacturerSerial;
		}
	}
}