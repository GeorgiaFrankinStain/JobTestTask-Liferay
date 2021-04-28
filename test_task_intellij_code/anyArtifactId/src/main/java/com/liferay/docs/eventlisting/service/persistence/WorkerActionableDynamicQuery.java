package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Joe Bloggs
 * @generated
 */
public abstract class WorkerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public WorkerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(WorkerLocalServiceUtil.getService());
        setClass(Worker.class);

        setClassLoader(com.liferay.docs.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("workerId");
    }
}
