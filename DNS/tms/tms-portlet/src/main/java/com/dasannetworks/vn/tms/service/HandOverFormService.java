package com.dasannetworks.vn.tms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.dasannetworks.vn.sb.model.HandOverForm;
import com.dasannetworks.vn.tms.pojo.HandOverFormVO;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class HandOverFormService {

	private static Log LOGGER = LogFactoryUtil.getLog(HandOverFormService.class);

	public static List<HandOverFormVO> getHandOverFormVOList(List<HandOverForm> handOverFormList) {
		List<HandOverFormVO> handOverFormVOList = new ArrayList<HandOverFormVO>();
		if (handOverFormList != null && !handOverFormList.isEmpty()) {
			LOGGER.info("HandOverForm Size is " + handOverFormList.size());

			HandOverFormVO handOverFormVO = null;
			for (HandOverForm aHandOverForm : handOverFormList) {
				handOverFormVO = new HandOverFormVO();
				BeanUtils.copyProperties(aHandOverForm, handOverFormVO);

				handOverFormVOList.add(handOverFormVO);
			}
			LOGGER.info("HandOverForm View list size " + handOverFormVOList.size());
		}
		return handOverFormVOList;
	}
}
