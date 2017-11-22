package com.dasannetworks.vn.sb.service.messaging;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.CustomerLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceExtHisLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceExtLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceExtOrderLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceHisLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.DeviceServiceUtil;
import com.dasannetworks.vn.sb.service.PartnerLocalServiceUtil;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;
import com.dasannetworks.vn.sb.service.RmaReplacementLocalServiceUtil;
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
            CustomerLocalServiceUtil.clearService();

            DeviceLocalServiceUtil.clearService();

            DeviceServiceUtil.clearService();
            DeviceExtLocalServiceUtil.clearService();

            DeviceExtHisLocalServiceUtil.clearService();

            DeviceExtOrderLocalServiceUtil.clearService();

            DeviceHisLocalServiceUtil.clearService();

            PartnerLocalServiceUtil.clearService();

            PurchaseOrderLocalServiceUtil.clearService();

            RmaReplacementLocalServiceUtil.clearService();

            RmaRequestLocalServiceUtil.clearService();

            RmaRequestDeviceLocalServiceUtil.clearService();

            WarrantyFormLocalServiceUtil.clearService();
        }
    }
}
