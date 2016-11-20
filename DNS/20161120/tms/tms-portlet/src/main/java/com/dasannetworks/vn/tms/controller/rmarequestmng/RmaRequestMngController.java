package com.dasannetworks.vn.tms.controller.rmarequestmng;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.dasannetworks.vn.sb.model.RmaRequest;
import com.dasannetworks.vn.sb.service.RmaRequestLocalServiceUtil;
import com.dasannetworks.vn.tms.controller.BaseController;
import com.dasannetworks.vn.tms.pojo.RmaRequestVO;
import com.dasannetworks.vn.tms.service.RmaRequestService;
import com.dasannetworks.vn.tms.util.JsonServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class RmaRequestMngController
 */
@Controller
@RequestMapping("VIEW")
public class RmaRequestMngController extends BaseController {

	private final Log LOGGER = LogFactoryUtil.getLog(RmaRequestMngController.class);

	@Override
	@RenderMapping
	public String defaultHandler(Map<String, Object> map) throws SystemException {
		map.put("name", "Henrik");

		return "rma-request-mng/view";
	}

	@ResourceMapping("getAllRmaRequests")
	public void getAllHandOverForms(ResourceRequest request, ResourceResponse response) throws IOException {
		List<RmaRequest> rmaRequestList = null;

		try {
			rmaRequestList = RmaRequestLocalServiceUtil.getRmaRequests(0,
					RmaRequestLocalServiceUtil.getRmaRequestsCount());
		} catch (Exception e) {
			LOGGER.error("Error while getting all forms", e);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<RmaRequestVO> rmaRequestVOList = RmaRequestService.getRmaRequestVOList(rmaRequestList);
		map.put("aaData", rmaRequestVOList);

		PrintWriter writer = null;
		writer = response.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

	@RenderMapping(params = "render=newRmaRequest")
	public String createRmaRequest(@RequestParam(value = "rmaRequestId", required = false) Long rmaRequestId, Map<String, Object> map) {

		return "rma-request-mng/create_rma_request";
	}

	@RenderMapping(params = "render=createdRmaRequest")
	public String renderCreatedRmaRequest(@RequestParam(value = "rmaRequestId", required = true) Long rmaRequestId, Map<String, Object> map)
			throws PortalException, SystemException {

		RmaRequestVO rmarequestVO = null;
		if (rmaRequestId != null) {
			RmaRequest rmaRequest = RmaRequestLocalServiceUtil.getRmaRequest(rmaRequestId);
			rmarequestVO = new RmaRequestVO();
			BeanUtils.copyProperties(rmaRequest, rmarequestVO);
		}

		if (rmarequestVO != null) {
			map.put("rmaRequest", rmarequestVO);
		}

		return "rma-request-mng/send_rma_request";
	}

	@ActionMapping(params = "action=sendRmaRequest")
	public void sendRmaRequest(ActionRequest actionRequest, ActionResponse actionResponse, Model model, @ModelAttribute("rmaRequest") RmaRequestVO rmaRequestVO, BindingResult bindingResult) {
		// try {
		//
		// rmaRequestVO = studentService.saveStudent(rmaRequestVO);
		// } catch (Exception e) {
		// logger.error("Error while saving student", e);
		// }

		// if (rmaRequestVO != null) {
		// actionRequest.setAttribute(Constants.SUCCESS, messageSource.getMessage("student.save.success", null, null));
		// } else {
		// actionRequest.setAttribute(Constants.ERROR, messageSource.getMessage("student.error.success", null, null));
		// }
	}

}
