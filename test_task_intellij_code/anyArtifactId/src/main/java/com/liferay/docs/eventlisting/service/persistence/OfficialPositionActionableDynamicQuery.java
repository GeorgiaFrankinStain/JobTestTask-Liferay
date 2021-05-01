package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.model.OfficialPosition;
import com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Joe Bloggs
 * @generated
 */
public abstract class OfficialPositionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public OfficialPositionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(OfficialPositionLocalServiceUtil.getService());
        setClass(OfficialPosition.class);

        setClassLoader(com.liferay.docs.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("officialPositionId");
    }
}
