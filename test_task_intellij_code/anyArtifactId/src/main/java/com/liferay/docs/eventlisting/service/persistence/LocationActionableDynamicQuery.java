package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.model.Location;
import com.liferay.docs.eventlisting.service.LocationLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Joe Bloggs
 * @generated
 */
public abstract class LocationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LocationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LocationLocalServiceUtil.getService());
        setClass(Location.class);

        setClassLoader(com.liferay.docs.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("locationId");
    }
}
