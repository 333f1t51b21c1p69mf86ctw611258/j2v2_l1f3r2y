package com.dasannetworks.vn.tms.controller.hofapproval;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dasannetworks.vn.tms.controller.BaseController;
import com.liferay.portal.kernel.exception.SystemException;

@Controller("hofApprovalController")
@RequestMapping("VIEW")
public class HofApprovalController extends BaseController {

	public static String RENDER_PATH_VIEW = "hof-approval/view";

	@Override
	public String defaultHandler(Map<String, Object> map) throws SystemException {

		return RENDER_PATH_VIEW;

	}

}
