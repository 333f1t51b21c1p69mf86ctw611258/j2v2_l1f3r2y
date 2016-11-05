package com.dasannetworks.vn.tms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 */
@RunWith(JUnit4.class)
public class ExcelServiceTest {
    @Test
    public void testLoadDeviceFile() throws Exception {
        ExcelService service = new ExcelService();
        File file = Paths.get(ClassLoader.getSystemResource("sample.xlsx").toURI()).toFile();

        Instant start = Instant.now();
        ImportDeviceListService.DeviceListInputFile result = service.parseDeviceList(file);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        assertThat(result).isNotNull();
        assertThat(result.getRows()).hasSize(100);
        ImportDeviceListService.DeviceListInputRow row = result.getRows().get(0);
        assertThat(row.getProductName()).isEqualTo("H680W_MT_4GE-WiFi-USB_Viettel");
        assertThat(row.getSerialNumber()).isEqualTo("MH6RREG312A1281");
        assertThat(row.getMacAddress()).isEqualTo("DSNW826fad42");
        assertThat(row.getPartNumber()).isEqualTo("DPW:G-P-H680W0-G1");
        assertThat(row.getCartonBoxSerial()).isEqualTo("E20H6A0000A0129");
        assertThat(row.getManufacturerSerial()).isEqualTo("18D0716FAD43");
        assertThat(row.getQty()).isEqualTo(1);
        assertThat(sdf.format(row.getFactoryOut())).isEqualTo("07/04/2016");
    }

    @Test
    public void testGetExcelColumnName() throws Exception {
        ExcelService service = new ExcelService();
        File file = Paths.get(ClassLoader.getSystemResource("sample.xlsx").toURI()).toFile();

        int factoryOutRowNum = service.findColumnIndex(service.getSheet(file), "Factory out");
        assertThat(factoryOutRowNum).isEqualTo(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetExcelColumnNameException() throws Exception {
        ExcelService service = new ExcelService();
        File file = Paths.get(ClassLoader.getSystemResource("sample.xlsx").toURI()).toFile();

        int factoryOutRowNum = service.findColumnIndex(service.getSheet(file), "Factory out 2");
    }
}
