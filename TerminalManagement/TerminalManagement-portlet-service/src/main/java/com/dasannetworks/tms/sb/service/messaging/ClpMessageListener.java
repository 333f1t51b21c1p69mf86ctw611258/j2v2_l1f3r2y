package com.dasannetworks.tms.sb.service.messaging;

import com.dasannetworks.tms.sb.service.BookLocalServiceUtil;
import com.dasannetworks.tms.sb.service.BookServiceUtil;
import com.dasannetworks.tms.sb.service.ClpSerializer;
import com.dasannetworks.tms.sb.service.ContactLocalServiceUtil;
import com.dasannetworks.tms.sb.service.ContactServiceUtil;
import com.dasannetworks.tms.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.tms.sb.service.DeviceServiceUtil;
import com.dasannetworks.tms.sb.service.FeedbackLocalServiceUtil;
import com.dasannetworks.tms.sb.service.FeedbackServiceUtil;
import com.dasannetworks.tms.sb.service.FooLocalServiceUtil;
import com.dasannetworks.tms.sb.service.FooServiceUtil;
import com.dasannetworks.tms.sb.service.StudentLocalServiceUtil;
import com.dasannetworks.tms.sb.service.StudentServiceUtil;

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
            BookLocalServiceUtil.clearService();

            BookServiceUtil.clearService();
            ContactLocalServiceUtil.clearService();

            ContactServiceUtil.clearService();
            DeviceLocalServiceUtil.clearService();

            DeviceServiceUtil.clearService();
            FeedbackLocalServiceUtil.clearService();

            FeedbackServiceUtil.clearService();
            FooLocalServiceUtil.clearService();

            FooServiceUtil.clearService();
            StudentLocalServiceUtil.clearService();

            StudentServiceUtil.clearService();
        }
    }
}
