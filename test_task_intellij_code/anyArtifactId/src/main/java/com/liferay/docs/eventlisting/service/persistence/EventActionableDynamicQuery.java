package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.model.Event;
import com.liferay.docs.eventlisting.service.EventLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Joe Bloggs
 * @generated
 */
public abstract class EventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EventLocalServiceUtil.getService());
        setClass(Event.class);

        setClassLoader(com.liferay.docs.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("eventId");
    }
}
