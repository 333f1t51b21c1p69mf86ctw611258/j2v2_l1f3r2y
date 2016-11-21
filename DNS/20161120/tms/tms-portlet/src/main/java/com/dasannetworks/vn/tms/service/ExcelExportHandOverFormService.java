package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.tms.pojo.RmaRequestDeviceVO;
import com.dasannetworks.vn.tms.pojo.RmaRequestVO;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 */
@Service
public class ExcelExportHandOverFormService {
    private static Log _log = LogFactoryUtil.getLog(ExcelExportHandOverFormService.class);
    private final String templateName = "Purchase_Order_Template.xlsx";

    protected XSSFWorkbook getTemplate() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("template/" + templateName).getFile());
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
            return workbook;

        } catch (Exception e) {
            e.printStackTrace();
            _log.error("Error read template: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public Cell findCell(XSSFSheet sheet, String text) {
        for(Row row : sheet) {
            for(Cell cell : row) {
                if(cell.getCellTypeEnum() == CellType.STRING && text.equals(cell.getStringCellValue())) {
                    return cell;
                }
            }
        }
        return null;
    }

    public Path generate(RmaRequestVO rmaRequestVO) {
        try {
            Path temp = Files.createTempFile(rmaRequestVO.getRmaRequestNumber(), ".xlsx");

            XSSFWorkbook workbook = this.getTemplate();
            XSSFSheet sheet = workbook.getSheetAt(0);
            fillCell(sheet, "$handOverFormNumber", rmaRequestVO.getRmaRequestNumber());

            fillDeviceVO(sheet, rmaRequestVO.getRmaRequestDeviceList());

            workbook.write(new FileOutputStream(temp.toFile()));

//            workbook.close();
            return temp;
        } catch (Exception e) {
            e.printStackTrace();
            _log.error(e.getMessage());
        }

        return null;
    }

    private void fillDeviceVO(XSSFSheet sheet, List<RmaRequestDeviceVO> deviceVOList) {
        Cell serialNumberCell = findCell(sheet, "Serial Number");
        Cell noteCell = findCell(sheet, "Note");
        Cell warrantyStartDateCell = findCell(sheet, "Warranty Start date");
        Cell warrantyEndDateCell = findCell(sheet, "Warranty End date");

        int startRow = serialNumberCell.getRowIndex() + 1;
        int serialNumberColumn = serialNumberCell.getColumnIndex();
        int noteColumn = serialNumberCell.getColumnIndex();
        int warrantyStartDateColumn = serialNumberCell.getColumnIndex();
        int warrantyEndDateColumn = serialNumberCell.getColumnIndex();

        for (RmaRequestDeviceVO rmaRequestDeviceVO : deviceVOList) {
            XSSFRow row = sheet.createRow(startRow++);
            serialNumberCell = row.createCell(serialNumberColumn);
            serialNumberCell.setCellValue(rmaRequestDeviceVO.getDevice().getSerialNumber());
            noteCell = row.createCell(noteColumn);
            noteCell.setCellValue(rmaRequestDeviceVO.getFaultNote());
            warrantyEndDateCell = row.createCell(warrantyEndDateColumn);
            warrantyEndDateCell.setCellValue(rmaRequestDeviceVO.getDevice().getWarrantyEndDate());
            warrantyStartDateCell = row.createCell(warrantyStartDateColumn);
            warrantyStartDateCell.setCellValue(rmaRequestDeviceVO.getDevice().getWarrantyStartDate());
        }
    }

    private void fillCell(XSSFSheet sheet, String cellName, String value) {
        Cell cell = findCell(sheet, cellName);
        if (cell != null) {
            cell.setCellValue(value);
        }
    }
}
