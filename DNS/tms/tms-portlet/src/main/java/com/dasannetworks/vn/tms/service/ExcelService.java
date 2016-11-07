package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.tms.exception.FileUploadException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
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
			for (int i = 1; i < rowNum; i++) {
				Row row = sheet.getRow(i);
				Date factoryOut = sdf.parse(row.getCell(factoryOutColumnIndex).getStringCellValue());
				String productName = row.getCell(productNameColumnIndex).getStringCellValue();
				String partNumber = row.getCell(partNumberColumnIndex).getStringCellValue();
				Integer qty = (int) row.getCell(qtyColumnIndex).getNumericCellValue();
				String serialNumber = row.getCell(serialNumberColumnIndex).getStringCellValue();
				String macAddress = row.getCell(macAddressColumnIndex).getStringCellValue();
				Long viettelSerialNumber = (long) row.getCell(viettelSerialNumberColumnIndex).getNumericCellValue();
				String cartonBoxSerial = row.getCell(cartonBoxSerialColumnIndex).getStringCellValue();
				String manufacturerSerial = row.getCell(manufacturerSerialColumnIndex).getStringCellValue();

				ImportDeviceListService.DeviceListInputRow inputRow = new ImportDeviceListService.DeviceListInputRow(factoryOut, productName, partNumber, qty, serialNumber, macAddress, viettelSerialNumber, cartonBoxSerial, manufacturerSerial);
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

	public XSSFSheet getSheet(File file) throws IOException, InvalidFormatException {
		XSSFWorkbook myWorkBook = new XSSFWorkbook(file);
		return myWorkBook.getSheetAt(0);
	}

	public static int findColumnIndex(XSSFSheet sheet, String columnName) {
		Row row = sheet.getRow(0);
		for (Cell cell : row) {
			if (cell.getCellTypeEnum() == CellType.STRING &&
					StringUtils.equals(cell.getRichStringCellValue().getString(), columnName)) {
				return cell.getColumnIndex();
			}
		}

		throw new IllegalArgumentException(String.format("Column name [%s] not found in sheet [%s]", columnName, sheet.getSheetName()));
	}
}
