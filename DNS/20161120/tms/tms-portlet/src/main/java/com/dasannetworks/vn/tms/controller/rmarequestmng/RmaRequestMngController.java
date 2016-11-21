package com.dasannetworks.vn.tms.controller.rmarequestmng;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
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

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.model.RmaRequest;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.RmaRequestLocalServiceUtil;
import com.dasannetworks.vn.tms.constant.RmaRequestStatus;
import com.dasannetworks.vn.tms.controller.BaseController;
import com.dasannetworks.vn.tms.pojo.RmaRequestVO;
import com.dasannetworks.vn.tms.service.RmaRequestService;
import com.dasannetworks.vn.tms.util.JsonServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;

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

	@RenderMapping(params = { "render=rerenderView" })
	public String rerenderView(Model model, PortletRequest portletRequest, PortletResponse portletResponse) throws SystemException {
		LOGGER.info("selectedTab = " + (model.containsAttribute("selectedTab") ? "true" : "false"));

		return "rma-request-mng/view";
	}

	@ResourceMapping("getAllRmaRequests_Created")
	public void getAllHandOverForms_Created(ResourceRequest request, ResourceResponse response) throws IOException {
		getRmaRequestsByStatus(response, RmaRequestStatus.CREATED);
	}

	@ResourceMapping("getAllRmaRequests_Sent")
	public void getAllHandOverForms_Sent(ResourceRequest request, ResourceResponse response) throws IOException {
		getRmaRequestsByStatus(response, RmaRequestStatus.SENT);
	}

	@ResourceMapping("getAllRmaRequests_Received")
	public void getAllHandOverForms_Received(ResourceRequest request, ResourceResponse response) throws IOException {
		getRmaRequestsByStatus(response, RmaRequestStatus.RECEIVED);
	}

	@ResourceMapping("getAllRmaRequests_Returned")
	public void getAllHandOverForms_Returned(ResourceRequest request, ResourceResponse response) throws IOException {
		getRmaRequestsByStatus(response, RmaRequestStatus.RETURNED);
	}

	private void getRmaRequestsByStatus(ResourceResponse response, int status) throws IOException {
		List<RmaRequest> rmaRequestList = null;

		try {
			rmaRequestList = RmaRequestLocalServiceUtil.findByStatus(status);
		} catch (Exception e) {
			LOGGER.error("Error while getting RmaRequests by status: " + status, e);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<RmaRequestVO> rmaRequestVOList = RmaRequestService.getRmaRequestVOList(rmaRequestList);
		map.put("aaData", rmaRequestVOList);

		PrintWriter writer = null;
		writer = response.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

	@RenderMapping(params = "render=newRmaRequest_ForCreating")
	public String createRmaRequest(@RequestParam(value = "rmaRequestId", required = false) Long rmaRequestId, Map<String, Object> map) {

		return "rma-request-mng/create_rma_request";
	}

	@RenderMapping(params = "render=createdRmaRequest_ForSending")
	public String renderCreatedRmaRequest(@RequestParam(value = "rmaRequestId", required = true) Long rmaRequestId, Map<String, Object> map)
			throws PortalException, SystemException {

		RmaRequestVO rmaRequestVO = null;
		if (rmaRequestId != null) {
			RmaRequest rmaRequest = RmaRequestLocalServiceUtil.getRmaRequest(rmaRequestId);
			rmaRequestVO = new RmaRequestVO();
			BeanUtils.copyProperties(rmaRequest, rmaRequestVO);
		}

		if (rmaRequestVO != null) {
			map.put("rmaRequest", rmaRequestVO);
		}

		return "rma-request-mng/send_rma_request";
	}

	@ActionMapping(params = "action=sendRmaRequest")
	public void sendRmaRequest(ActionRequest actionRequest, ActionResponse actionResponse, Model model, @ModelAttribute("rmaRequest") RmaRequestVO rmaRequestVO, BindingResult bindingResult) {
		try {
			LOGGER.info(rmaRequestVO.toString());

			RmaRequest rmaRequest = RmaRequestLocalServiceUtil.getRmaRequest(rmaRequestVO.getRmaRequestId());
			rmaRequest.setPartnerCode(rmaRequestVO.getPartnerCode());
			rmaRequest.setPartnerEmail(rmaRequestVO.getPartnerEmail());
			rmaRequest.setPartnerInCharge(rmaRequestVO.getPartnerInCharge());
			rmaRequest.setPartnerLocation(rmaRequestVO.getPartnerLocation());
			rmaRequest.setPartnerPhone(rmaRequestVO.getPartnerPhone());
			rmaRequest.setSendingAssignedDate(rmaRequestVO.getSendingAssignedDate());
			rmaRequest.setSendingEstReturnDate(rmaRequestVO.getSendingEstReturnDate());
			rmaRequest.setSendingNote(rmaRequestVO.getSendingNote());
			rmaRequest.setSendingReturnedDate(rmaRequestVO.getSendingReturnedDate());

			rmaRequest.setStatus(RmaRequestStatus.SENT);

			RmaRequestLocalServiceUtil.updateRmaRequest(rmaRequest);

			SessionMessages.add(actionRequest, "send_rma_request_success");
		} catch (Exception e) {

			LOGGER.error("Error while saving RmaRequest: " + rmaRequestVO.getRmaRequestId(), e);
			SessionMessages.add(actionRequest, "send_rma_request_error");
		}

		actionResponse.setRenderParameter("selectedTab", "Sent RMA Requests");

		actionResponse.setRenderParameter("render", "rerenderView");
	}

	@RenderMapping(params = "render=sentRmaRequest_ForReceiving")
	public String renderSentRmaRequest(@RequestParam(value = "rmaRequestId", required = true) Long rmaRequestId, Map<String, Object> map)
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

		return "rma-request-mng/receive_rma_request";
	}

	@ActionMapping(params = "action=receiveRmaRequest")
	public void receiveRmaRequest(ActionRequest actionRequest, ActionResponse actionResponse, Model model, @ModelAttribute("rmaRequest") RmaRequestVO rmaRequestVO, BindingResult bindingResult) {
		try {
			LOGGER.info(rmaRequestVO.toString());

			RmaRequest rmaRequest = RmaRequestLocalServiceUtil.getRmaRequest(rmaRequestVO.getRmaRequestId());

			rmaRequest.setReceivingNote(rmaRequestVO.getReceivingNote());
			rmaRequest.setReceivingReturnedDate(rmaRequestVO.getReceivingReturnedDate());

			rmaRequest.setStatus(RmaRequestStatus.RECEIVED);

			RmaRequestLocalServiceUtil.updateRmaRequest(rmaRequest);

			SessionMessages.add(actionRequest, "receive_rma_request_success");
		} catch (Exception e) {

			LOGGER.error("Error while saving RmaRequest: " + rmaRequestVO.getRmaRequestId(), e);
			SessionMessages.add(actionRequest, "receive_rma_request_error");
		}

		actionResponse.setRenderParameter("selectedTab", "Received From Partners");

		actionResponse.setRenderParameter("render", "rerenderView");
	}

}
