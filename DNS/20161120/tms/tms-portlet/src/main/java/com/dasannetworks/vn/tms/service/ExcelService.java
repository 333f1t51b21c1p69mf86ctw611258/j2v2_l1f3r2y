package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.tms.exception.FileUploadException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Component
public class ExcelService {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	private static Log _log = LogFactoryUtil.getLog(ExcelService.class);

	public static ImportDeviceListService.DeviceListInputFile parseDeviceSerialNumberList(File file) {
		List<ImportDeviceListService.DeviceListInputRow> rows = new ArrayList<>();
		try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			final int serialNumberColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.SERIAL_NUMBER);

			int rowNum = sheet.getLastRowNum();
			for (int i = 1; i <= rowNum; i++) {
				Row row = sheet.getRow(i);
				
				String serialNumber = getString(serialNumberColumnIndex, row);

				ImportDeviceListService.DeviceListInputRow inputRow = new ImportDeviceListService.DeviceListInputRow();
				inputRow.setSerialNumber(serialNumber);
				
				rows.add(inputRow);
			}

			String fileName = file.getName();

			ImportDeviceListService.DeviceListInputFile result = new ImportDeviceListService.DeviceListInputFile(fileName, rows);
			result.setSheetName(sheet.getSheetName());
			return result;
		} catch (Exception e) {
			_log.error("Import file failed" + e.getMessage());
			throw new FileUploadException(e.getMessage());
		}
	}
	
	public static ImportDeviceListService.DeviceListInputFile parseDeviceList(File file) {
		List<ImportDeviceListService.DeviceListInputRow> rows = new ArrayList<>();
		try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			final int factoryOutColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.FACTORY_OUT);
			final int productNameColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.PRODUCT_NAME);
			final int partNumberColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.PART_NUMBER);
			final int qtyColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.QTY);
			final int serialNumberColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.SERIAL_NUMBER);
			final int macAddressColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.MAC_ADDRESS);
			final int viettelSerialNumberColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.VIETTEL_SERIAL_NUMBER);
			final int cartonBoxSerialColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.CARTON_BOX_SERIAL);
			final int manufacturerSerialColumnIndex = findColumnIndex(sheet, ImportDeviceListService.DeviceListInputFile.MANUFACTURER_SERIAL);

			int rowNum = sheet.getLastRowNum();
			for (int i = 1; i <= rowNum; i++) {
				Row row = sheet.getRow(i);
				Date factoryOut = getDate(factoryOutColumnIndex, row);
				String productName = getString(productNameColumnIndex, row);
				String partNumber = getString(partNumberColumnIndex, row);
				Integer qty = getInteger(qtyColumnIndex, row);
				String serialNumber = getString(serialNumberColumnIndex, row);
				String macAddress = getString(macAddressColumnIndex, row);
				Long viettelSerialNumber = getLong(viettelSerialNumberColumnIndex, row);
				String cartonBoxSerial = getString(cartonBoxSerialColumnIndex, row);
				String manufacturerSerial = getString(manufacturerSerialColumnIndex, row);

				ImportDeviceListService.DeviceListInputRow inputRow = new ImportDeviceListService.DeviceListInputRow(factoryOut, productName, partNumber, qty, serialNumber, macAddress, viettelSerialNumber, cartonBoxSerial, manufacturerSerial);
				rows.add(inputRow);
			}

			String fileName = file.getName();

			ImportDeviceListService.DeviceListInputFile result = new ImportDeviceListService.DeviceListInputFile(fileName, rows);
			result.setSheetName(sheet.getSheetName());
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			_log.error("Import file failed " + e.getMessage());
			return new ImportDeviceListService.DeviceListInputFile(null, new ArrayList<>());
			//throw new FileUploadException(e.getMessage());
		}
	}

	public static int findColumnIndex(XSSFSheet sheet, String columnName) {
		Row row = sheet.getRow(0);
		for (Cell cell : row) {
			if (cell.getCellTypeEnum() == CellType.STRING &&
					StringUtils.equals(cell.getRichStringCellValue().getString(), columnName)) {
				return cell.getColumnIndex();
			}
		}

		return -1;
	}

	public RmaRequestService.DeviceListFile parseDeviceListHandOverForm(File listDeviceFile) {
		RmaRequestService.DeviceListFile deviceList = new RmaRequestService.DeviceListFile();
		try (XSSFWorkbook workbook = new XSSFWorkbook(listDeviceFile)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			final int serialNumberColumnIndex = findColumnIndex(sheet, RmaRequestService.DeviceListFile.SERIAL_NUMBER);
			final int noteColumnIndex = findColumnIndex(sheet, RmaRequestService.DeviceListFile.NOTE);
			int rowNum = sheet.getLastRowNum();
			List<RmaRequestService.DeviceListRow> rows = new ArrayList<>();
			for (int i = 1; i <= rowNum; i++) {
				Row row = sheet.getRow(i);
				String serialNumber = getString(serialNumberColumnIndex, row);
				String note = getString(noteColumnIndex, row);

				rows.add(new RmaRequestService.DeviceListRow(serialNumber, note));
			}
			deviceList.setFileName(listDeviceFile.getName());
			deviceList.setRows(rows);
		} catch (Exception e) {
			_log.error("Import file failed" + e.getMessage());
			throw new FileUploadException(e.getMessage());
		}
		return deviceList;
	}

	private static String getString(int columnIndex, Row row) {
		String value = "";
		if (columnIndex != -1) {
			value = row.getCell(columnIndex).getStringCellValue();
		}
		return value;
	}

	private static Date getDate(int columnIndex, Row row) {
		Date value = null;
		if (columnIndex != -1) {
			try {
				Cell cell = row.getCell(columnIndex);
				if (cell.getCellTypeEnum() == CellType.FORMULA && HSSFDateUtil.isCellDateFormatted(cell)) {
					return cell.getDateCellValue();
				}

				value = sdf.parse(cell.getStringCellValue());
			} catch (ParseException e) {

			}
		}
		return value;
	}

	private static Integer getInteger(int columnIndex, Row row) {
		Integer value = null;
		if (columnIndex != -1) {
			value = (int) row.getCell(columnIndex).getNumericCellValue();
		}
		return value;
	}

	private static Long getLong(int columnIndex, Row row) {
		Long value = null;
		if (columnIndex != -1) {
			value = (long) row.getCell(columnIndex).getNumericCellValue();
		}
		return value;
	}
}
