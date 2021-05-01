package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.model.Bank;
import com.liferay.docs.eventlisting.service.BankLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Joe Bloggs
 * @generated
 */
public abstract class BankActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BankActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BankLocalServiceUtil.getService());
        setClass(Bank.class);

        setClassLoader(com.liferay.docs.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bankId");
    }
}
