package com.dasannetworks.vn.sb.service.messaging;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.ContactLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;
import com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.RmaRequestLocalServiceUtil;
import com.dasannetworks.vn.sb.service.WarrantyFormLocalServiceUtil;

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

            DeviceLocalServiceUtil.clearService();

            PurchaseOrderLocalServiceUtil.clearService();

            RmaRequestLocalServiceUtil.clearService();

            RmaRequestDeviceLocalServiceUtil.clearService();

            WarrantyFormLocalServiceUtil.clearService();
        }
    }
}
