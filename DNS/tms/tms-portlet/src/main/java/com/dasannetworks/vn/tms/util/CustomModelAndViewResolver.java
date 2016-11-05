package com.dasannetworks.vn.tms.util;

import java.lang.reflect.Method;

import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.dasannetworks.vn.tms.controller.deviceimport.DeviceRegistrationResponse;

public class CustomModelAndViewResolver implements ModelAndViewResolver {
	@Override
	public ModelAndView resolveModelAndView(Method arg0, Class arg1, Object returnValue, ExtendedModelMap arg3, NativeWebRequest arg4) {
		/*
		 * Return a special ModelAndView if our method returns YourAjaxResultTypeHere.
		 */
		if(returnValue instanceof DeviceRegistrationResponse) {
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
		return UNRESOLVED;
	}
}
