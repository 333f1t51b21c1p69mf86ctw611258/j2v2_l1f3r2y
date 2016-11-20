package com.dasannetworks.vn.tms.util;

import java.lang.reflect.Method;
import java.util.List;

import com.dasannetworks.vn.tms.controller.checkdevicewarranty.CheckDeviceWarrantyController;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.dasannetworks.vn.tms.controller.deviceimport.DeviceListUploadResponse;

public class CustomModelAndViewResolver implements ModelAndViewResolver {
	private static Log LOGGER = LogFactoryUtil.getLog(CustomModelAndViewResolver.class);
	@Override
	public ModelAndView resolveModelAndView(Method method, Class arg1, Object returnValue, ExtendedModelMap extendedModelMap, NativeWebRequest nativeWebRequest) {
		/*
		 * Return a special ModelAndView if our method returns YourAjaxResultTypeHere.
		 */
		if(returnValue instanceof DeviceListUploadResponse || returnValue instanceof List) {
			ModelAndView mav = new ModelAndView();
			MappingJackson2JsonView v = new MappingJackson2JsonView();
			v.setBeanName("result");
			
			mav.setView(v);
			mav.addObject("result", returnValue);
			return mav;
		}
		
		/*
		 * Otherwise just do the default thing.
		 */
		if (returnValue != null && !( returnValue instanceof String)) {
			LOGGER.error("AJAX failed " + returnValue.getClass());
		}
		return UNRESOLVED;
	}
}
