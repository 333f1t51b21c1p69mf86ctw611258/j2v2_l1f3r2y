package com.dasannetworks.vn.sb.service.messaging;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceServiceUtil;
import com.dasannetworks.vn.sb.service.UploadFileLocalServiceUtil;
import com.dasannetworks.vn.sb.service.UploadFileServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            DeviceLocalServiceUtil.clearService();

            DeviceServiceUtil.clearService();
            UploadFileLocalServiceUtil.clearService();

            UploadFileServiceUtil.clearService();
        }
    }
}
