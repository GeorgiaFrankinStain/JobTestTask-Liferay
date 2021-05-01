package com.liferay.docs.eventlisting.service.messaging;

import com.liferay.docs.eventlisting.service.BankLocalServiceUtil;
import com.liferay.docs.eventlisting.service.ClpSerializer;
import com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil;
import com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil;

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
            BankLocalServiceUtil.clearService();

            OfficialPositionLocalServiceUtil.clearService();

            WorkerLocalServiceUtil.clearService();
        }
    }
}
