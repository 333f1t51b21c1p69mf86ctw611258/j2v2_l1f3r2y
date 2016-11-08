package com.dasannetworks.vn.tms.controller.handoverformmng;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.dasannetworks.vn.sb.model.HandOverForm;
import com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil;
import com.dasannetworks.vn.tms.controller.BaseController;
import com.dasannetworks.vn.tms.pojo.HandOverFormVO;
import com.dasannetworks.vn.tms.service.HandOverFormService;
import com.dasannetworks.vn.tms.util.JsonServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@Controller("handOverFormMngController")
@RequestMapping("VIEW")
public class HandOverFormMngController extends BaseController {

	private static Log LOGGER = LogFactoryUtil.getLog(HandOverFormMngController.class);

	@RenderMapping
	public String defaultHandler(Map<String, Object> map) throws SystemException {

		return "hand-over-form-mng/view";

	}

	@RenderMapping(params = { "render=rerenderView" })
	public String rerenderView(Model model, PortletRequest portletRequest, PortletResponse portletResponse) throws SystemException {

		return "hand-over-form-mng/view";
	}

	@ResourceMapping("getAllHandOverForms")
	public void getAllHandOverForms(ResourceRequest request, ResourceResponse response) throws IOException {
		List<HandOverForm> handOverFormList = null;

		try {
			handOverFormList = HandOverFormLocalServiceUtil.getHandOverForms(0, HandOverFormLocalServiceUtil.getHandOverFormsCount());
		} catch (Exception e) {
			LOGGER.error("Error while getting all forms", e);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<HandOverFormVO> handOverFormVOList = HandOverFormService.getHandOverFormVOList(handOverFormList);
		map.put("aaData", handOverFormVOList);

		PrintWriter writer = null;
		writer = response.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

}
