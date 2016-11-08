package com.dasannetworks.vn.tms.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.tms.pojo.DevicePOJO;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * A utility class for Device
 * 
 * @author aspire20
 * 
 */
public class DeviceUtil {

	private static Log LOGGER = LogFactoryUtil.getLog(DeviceUtil.class);

	/**
	 * Load student VO list from the student list
	 * 
	 * @param studentList
	 * @return
	 */
	public static List<DevicePOJO> getDeviceVOList(List<Device> studentList) {
		List<DevicePOJO> devicePOJOList = new ArrayList<DevicePOJO>();
		if (studentList != null && !studentList.isEmpty()) {
			LOGGER.info("Device Size is " + studentList.size());
			
			DevicePOJO devicePOJO = null;
			for (Device student : studentList) {
				devicePOJO = new DevicePOJO();
				BeanUtils.copyProperties(student, devicePOJO);
				
				Date now = new Date();
				if (devicePOJO.getWarrantyEndDate() == null || !now.after(devicePOJO.getWarrantyEndDate())) {
					devicePOJO.setExpired(false);
				} else {
					devicePOJO.setExpired(true);
				}
				
				devicePOJOList.add(devicePOJO);
			}
			LOGGER.info("Device View list size " + devicePOJOList.size());
		}
		return devicePOJOList;
	}
}
