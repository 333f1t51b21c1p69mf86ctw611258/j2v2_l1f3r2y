package com.dasannetworks.vn.tms.controller.rmarequest;

import com.dasannetworks.vn.sb.model.RmaRequest;
import com.dasannetworks.vn.sb.service.RmaRequestLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.RmaRequestVO;
import com.dasannetworks.vn.tms.service.RmaRequestService;
import com.dasannetworks.vn.tms.util.JsonServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.*;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping("VIEW")
public class RmaRequestController {
	private static Log _log = LogFactoryUtil.getLog(RmaRequestController.class);
	private final RmaRequestService rmaRequestService;

	@Autowired
	public RmaRequestController(RmaRequestService rmaRequestService) {
		this.rmaRequestService = rmaRequestService;
	}

	@RenderMapping
	public String init(Model model) throws SystemException {
		List<RmaRequest> all = rmaRequestService.getAll();
		model.addAttribute("rmaRequests", all);
		return "rma-request/view";
	}

	@RenderMapping(params = "render=edit")
	public String initEdit(RenderRequest request,
			@RequestParam(value = "rma_request_id", required = false) Long rmaRequestId,
			RenderResponse response,
			Model model) throws SystemException, PortalException {

		RmaRequestVO rmaRequestVO = rmaRequestService.initRmaRequestVO(rmaRequestId);
		model.addAttribute("rmaRequest", rmaRequestVO);
		return "rma-request/edit";
	}

	@RenderMapping(params = "render=send")
	public String initSend(RenderRequest request,
			@RequestParam(value = "rma_request_id", required = false) Long rmaRequestId,
			RenderResponse response,
			Model model) throws SystemException, PortalException {

		RmaRequestVO rmaRequestVO = rmaRequestService.initRmaRequestVO(rmaRequestId);
		model.addAttribute("rmaRequest", rmaRequestVO);
		return "rma-request/send";
	}

	@ActionMapping(params = "action=delete")
	@ResponseBody
	public void delete(ActionRequest request,
			ActionResponse response,
			Model model) throws SystemException, PortalException {
		Long rmaRequestId = ParamUtil.getLong(request, "rma_request_id");

		rmaRequestService.delete(rmaRequestId);
	}

	@ModelAttribute("rmaRequest")
	public RmaRequestVO rmaRequestVO() {
		return new RmaRequestVO();
	}

	@RenderMapping(params = "render=view")
	public String initDetailsHandOverForm(@RequestParam("rma_request_id") long rmaRequestId,
			RenderResponse response,
			Model model) throws PortalException, SystemException {
		model.addAttribute("rmaRequest", rmaRequestService.initRmaRequestVO(rmaRequestId));
		return "rma-request/details";
	}

	@ActionMapping(params = "action=save")
	public void save(@Valid @ModelAttribute("rmaRequest") RmaRequestVO form,
			BindingResult bindingResult,
			ActionRequest request,
			Model model,
			ActionResponse response) throws PortalException, SystemException {
		response.setRenderParameter("render", "edit");

		if (bindingResult.hasErrors()) {
			for (FieldError error : bindingResult.getFieldErrors()) {
				SessionErrors.add(request, "save_failure", error.getDefaultMessage());
			}
			return;
		}
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		File file = uploadRequest.getFile("deviceListFile", false);
		if (file.exists()) {
			form.setDeviceListFile(file);
		}
		try {
			RmaRequest rmaRequest = rmaRequestService.handleForm(form);
			model.addAttribute("rmaRequestSaved", rmaRequest);
			model.addAttribute("rmaRequest", new RmaRequestVO());
			SessionMessages.add(request, "save_success");
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e.getMessage());
			model.addAttribute("rmaRequest", form);
			SessionErrors.add(request, "save_failure", e.getMessage());
		}

	}

	@ResourceMapping("getAllRmaRequests")
	public void getAllHandOverForms(ResourceRequest request, ResourceResponse response) throws IOException {
		List<RmaRequest> rmaRequestList = null;

		try {
			rmaRequestList = RmaRequestLocalServiceUtil.getRmaRequests(0, RmaRequestLocalServiceUtil.getRmaRequestsCount());
		} catch (Exception e) {
			_log.error("Error while getting all forms", e);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<RmaRequestVO> rmaRequestVOList = RmaRequestService.getRmaRequestVOList(rmaRequestList);
		map.put("aaData", rmaRequestVOList);

		PrintWriter writer = null;
		writer = response.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

	@ActionMapping(params = "action=submit")
	public void submit(@Valid @ModelAttribute("rmaRequest") RmaRequestVO form,
			BindingResult bindingResult,
			ActionRequest request,
			ActionResponse response) throws PortalException, SystemException {

	}

	@ResourceMapping("download_excel")
	public void serveDownloadExcel(ResourceRequest request, ResourceResponse response,
			@RequestParam("rma_request_id") Long rmaRequestId) throws Exception {
		System.out.println("SpringFileController -> serverResource -> Started");

		String fileName = "SampleSpringFile.txt";
		// Convert String to bytes
		String sampleContent = "Spring MVC portlet : File upload and download example";
		byte[] bytes = sampleContent.getBytes();

		// Writing file to output
		response.setContentType("application/xml");
		response.addProperty("Content-disposition", "atachment; filename=" + fileName);

		OutputStream out = response.getPortletOutputStream();
		out.write(bytes);
		out.flush();
		out.close();

		System.out.println("SpringFileController -> serverResource -> Completed");
	}

	@InitBinder
	private void dateBinder(WebDataBinder binder) {
		// The date format to parse or output your dates
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		// Create a new CustomDateEditor
		CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
		// Register it as custom editor for the Date type
		binder.registerCustomEditor(Date.class, editor);
	}
}
