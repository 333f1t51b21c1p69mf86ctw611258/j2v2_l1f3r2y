package com.dasannetworks.vn.tms.thymeleaf.controller;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.ResourceURL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.dasannetworks.vn.tms.thymeleaf.bean.Product;
import com.dasannetworks.vn.tms.thymeleaf.bean.SampleFormBean;
import com.dasannetworks.vn.tms.thymeleaf.util.LiferayUrlUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * Spring Portlet MVC controller with samples of Action, Render & Resource phases. 
 * 
 * @author Vianney FAIVRE
 */
@Controller
@RequestMapping("VIEW")
public class LiferayThymeleafPortletController {

	private static final Log LOGGER = LogFactoryUtil.getLog(LiferayThymeleafPortletController.class);

	@RenderMapping
	public String defaultHandler(Model m, PortletRequest portletRequest, PortletResponse portletResponse) {
		LOGGER.debug("default called");

		m.addAttribute("mySampleFormBean", new SampleFormBean("default value"));

		return "thymeleaf/view";
	}

	@ActionMapping(params = { "action=actionSample" })
	public void doActionSample(Model m, PortletRequest portletRequest, ActionResponse actionResponse, @ModelAttribute SampleFormBean mySampleFormBean,
			BindingResult result) {
		LOGGER.debug("actionSample called " + mySampleFormBean);

		m.addAttribute("mySampleFormBean", mySampleFormBean);

		actionResponse.setRenderParameter("render", "renderSample");
	}

	@RenderMapping(params = { "render=renderSample" })
	public String doRenderActionSample(Model m, PortletRequest portletRequest, PortletResponse portletResponse) {
		LOGGER.debug("renderSample called");

		return "thymeleaf/view";
	}

	@ResourceMapping("ajaxTest")
	public void doResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		LOGGER.debug("doResource called");

		JSONObject json = JSONFactoryUtil.createJSONObject();
		json.put("ajaxCallRes", "CALL BACKEND FUNCTION ARE SUCCESSFUL 123");

		OutputStream out = null;
		try {
			resourceResponse.setContentType("application/json");
			out = resourceResponse.getPortletOutputStream();
			StreamUtil.transfer(new ByteArrayInputStream(json.toString().getBytes("utf-8")), out);
		} catch (Exception e) {
			LOGGER.error(e);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				LOGGER.error(e);
			}
		}
	}

	@ModelAttribute("productList")
	public List<Product> getProductList(PortletRequest portletRequest) {
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product("desciption 1", 123, new Date()));
		products.add(new Product("desciption 2", 345, new Date()));
		
		return products;
	}
	
	@ModelAttribute("themeDisplay")
	public ThemeDisplay getThemeDisplay(PortletRequest portletRequest) {
		return (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY);
	}

	@ModelAttribute("sampleActionURL")
	public String getSampleActionURL(PortletRequest portletRequest, ThemeDisplay themeDisplay) {
		PortletURL actionSampleURL = LiferayUrlUtil.createActionURL(portletRequest, themeDisplay,
				LiferayWindowState.NORMAL, LiferayPortletMode.VIEW);
		actionSampleURL.setParameter("action", "actionSample");
		return actionSampleURL.toString();
	}

	@ModelAttribute("sampleResourceURL")
	public String getSampleResourceURL(PortletResponse portletResponse) {
		ResourceURL sampleResourceURL = LiferayUrlUtil.createResourceURL("ajaxTest", portletResponse);
		return sampleResourceURL.toString();
	}
}
