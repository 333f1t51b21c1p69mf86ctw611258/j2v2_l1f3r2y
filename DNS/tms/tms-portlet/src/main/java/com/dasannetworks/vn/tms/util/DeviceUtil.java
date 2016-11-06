package com.dasannetworks.vn.tms.util;

import java.util.ArrayList;
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
		List<DevicePOJO> studentVOList = new ArrayList<DevicePOJO>();
		if (studentList != null && !studentList.isEmpty()) {
			LOGGER.info("Device Size is " + studentList.size());
			// Copy list to all student view
			DevicePOJO studentVO = null;
			for (Device student : studentList) {
				studentVO = new DevicePOJO();
				BeanUtils.copyProperties(student, studentVO);
				studentVOList.add(studentVO);
			}
			LOGGER.info("Device View list size " + studentVOList.size());
		}
		return studentVOList;
	}
}
