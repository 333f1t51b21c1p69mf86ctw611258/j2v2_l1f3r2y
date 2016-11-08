package com.dasannetworks.vn.sb.service.messaging;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.ContactLocalServiceUtil;
import com.dasannetworks.vn.sb.service.ContactServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceServiceUtil;
import com.dasannetworks.vn.sb.service.HandOverDeviceServiceUtil;
import com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil;
import com.dasannetworks.vn.sb.service.HandOverFormServiceUtil;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;
import com.dasannetworks.vn.sb.service.PurchaseOrderServiceUtil;

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
            ContactLocalServiceUtil.clearService();

            ContactServiceUtil.clearService();
            DeviceLocalServiceUtil.clearService();

            DeviceServiceUtil.clearService();

            HandOverDeviceServiceUtil.clearService();
            HandOverFormLocalServiceUtil.clearService();

            HandOverFormServiceUtil.clearService();
            PurchaseOrderLocalServiceUtil.clearService();

            PurchaseOrderServiceUtil.clearService();
        }
    }
}
