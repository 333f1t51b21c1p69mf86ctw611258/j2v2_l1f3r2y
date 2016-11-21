package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.tms.pojo.DeviceVO;
import com.dasannetworks.vn.tms.pojo.RmaRequestDeviceVO;
import com.dasannetworks.vn.tms.pojo.RmaRequestVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
@RunWith(JUnit4.class)
public class ExcelExportHandOverFormServiceTest {
    @Test
    public void testExport() {
        ExcelExportHandOverFormService service = new ExcelExportHandOverFormService();
        RmaRequestVO rmaRequestVO = new RmaRequestVO();
        rmaRequestVO.setRmaRequestNumber("hand over form number");
        List<RmaRequestDeviceVO> rmaRequestDeviceVOList = new ArrayList<>();
        RmaRequestDeviceVO rmaRequestDeviceVO = new RmaRequestDeviceVO();
        DeviceVO deviceVO = new DeviceVO();
        deviceVO.setSerialNumber("serial number");
        deviceVO.setWarrantyStartDate(new Date());
        rmaRequestDeviceVO.setDevice(deviceVO);
        rmaRequestDeviceVO.setFaultNote("fault Note");
        rmaRequestDeviceVO.setStatus("Status");
        rmaRequestDeviceVOList.add(rmaRequestDeviceVO);
        rmaRequestVO.setRmaRequestDeviceList(rmaRequestDeviceVOList);
        Path generated = service.generate(rmaRequestVO);
        System.out.println(generated);
    }
}
