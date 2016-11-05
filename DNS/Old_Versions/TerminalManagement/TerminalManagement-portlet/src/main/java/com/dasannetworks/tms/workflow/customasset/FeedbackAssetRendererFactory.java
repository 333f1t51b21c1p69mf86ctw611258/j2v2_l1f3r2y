package com.dasannetworks.tms.workflow.customasset;
import com.dasannetworks.tms.sb.model.Feedback;
import com.dasannetworks.tms.sb.service.FeedbackLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

/**
 * Portlet implementation class FeedbackAction
 */
public class FeedbackAssetRendererFactory extends BaseAssetRendererFactory {
    @Override
    public AssetRenderer getAssetRenderer(long classPK, int type)
            throws PortalException, SystemException {
        Feedback feedback = FeedbackLocalServiceUtil.getFeedback(classPK);
        return new FeedbackAssetRenderer(feedback);
    }
 
    @Override
    public String getClassName() {
		return CLASS_NAME;
	}
    @Override
	public String getType() {
		return TYPE;
	}
    public static final String TYPE = "Feedback";
    public static final String CLASS_NAME = Feedback.class.getName();
}
