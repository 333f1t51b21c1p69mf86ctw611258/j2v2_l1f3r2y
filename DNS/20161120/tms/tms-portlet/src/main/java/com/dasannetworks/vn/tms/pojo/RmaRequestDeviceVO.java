package com.dasannetworks.vn.tms.pojo;

import com.dasannetworks.vn.sb.model.HandOverDevice;
import com.dasannetworks.vn.sb.model.RmaRequestDevice;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
@Data
public class RmaRequestDeviceVO implements Serializable {
    private DeviceVO device;
    private String faultNote;
    private String status;


    public static List<RmaRequestDeviceVO> from(List<RmaRequestDevice> rmaRequestDeviceList, List<DeviceVO> deviceVOList) {
        return rmaRequestDeviceList.stream().map(rmaRequestDevice -> {
            RmaRequestDeviceVO value = new RmaRequestDeviceVO();
            value.setStatus(rmaRequestDevice.getStatus());
            value.setFaultNote(rmaRequestDevice.getFaultNote());

            value.setDevice(deviceVOList.
                    stream().
                    filter(deviceVO -> deviceVO.getDeviceId() == rmaRequestDevice.getDeviceId()).
                    findAny().
                    orElse(null));

            return value;
        }).collect(Collectors.toList());
    }
}
