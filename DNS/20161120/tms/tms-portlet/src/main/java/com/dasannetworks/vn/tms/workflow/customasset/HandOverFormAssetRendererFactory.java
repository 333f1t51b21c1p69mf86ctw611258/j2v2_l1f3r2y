package com.dasannetworks.vn.tms.workflow.customasset;

import com.dasannetworks.vn.sb.model.HandOverForm;
import com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

public class HandOverFormAssetRendererFactory extends BaseAssetRendererFactory {

	public static final String TYPE = "HandOverForm";
	public static final String CLASS_NAME = HandOverForm.class.getName();

	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type) throws PortalException, SystemException {
		HandOverForm feedback = HandOverFormLocalServiceUtil.getHandOverForm(classPK);
		return new HandOverFormAssetRenderer(feedback);
	}

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
