package com.liferay.docs.eventlisting.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OfficialPositionLocalService}.
 *
 * @author Joe Bloggs
 * @see OfficialPositionLocalService
 * @generated
 */
public class OfficialPositionLocalServiceWrapper
    implements OfficialPositionLocalService,
        ServiceWrapper<OfficialPositionLocalService> {
    private OfficialPositionLocalService _officialPositionLocalService;

    public OfficialPositionLocalServiceWrapper(
        OfficialPositionLocalService officialPositionLocalService) {
        _officialPositionLocalService = officialPositionLocalService;
    }

    /**
    * Adds the official position to the database. Also notifies the appropriate model listeners.
    *
    * @param officialPosition the official position
    * @return the official position that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition addOfficialPosition(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.addOfficialPosition(officialPosition);
    }

    /**
    * Creates a new official position with the primary key. Does not add the official position to the database.
    *
    * @param officialPositionId the primary key for the new official position
    * @return the new official position
    */
    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition createOfficialPosition(
        long officialPositionId) {
        return _officialPositionLocalService.createOfficialPosition(officialPositionId);
    }

    /**
    * Deletes the official position with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param officialPositionId the primary key of the official position
    * @return the official position that was removed
    * @throws PortalException if a official position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition deleteOfficialPosition(
        long officialPositionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.deleteOfficialPosition(officialPositionId);
    }

    /**
    * Deletes the official position from the database. Also notifies the appropriate model listeners.
    *
    * @param officialPosition the official position
    * @return the official position that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition deleteOfficialPosition(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.deleteOfficialPosition(officialPosition);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _officialPositionLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.OfficialPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.OfficialPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition fetchOfficialPosition(
        long officialPositionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.fetchOfficialPosition(officialPositionId);
    }

    /**
    * Returns the official position with the primary key.
    *
    * @param officialPositionId the primary key of the official position
    * @return the official position
    * @throws PortalException if a official position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition getOfficialPosition(
        long officialPositionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.getOfficialPosition(officialPositionId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the official positions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.OfficialPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of official positions
    * @param end the upper bound of the range of official positions (not inclusive)
    * @return the range of official positions
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> getOfficialPositions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.getOfficialPositions(start, end);
    }

    /**
    * Returns the number of official positions.
    *
    * @return the number of official positions
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getOfficialPositionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.getOfficialPositionsCount();
    }

    /**
    * Updates the official position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param officialPosition the official position
    * @return the official position that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition updateOfficialPosition(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.updateOfficialPosition(officialPosition);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _officialPositionLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _officialPositionLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _officialPositionLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition addOfficialPosition(
        Wrappers.OfficialPosition.DataOfficialPosition dataOfficialPosition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.addOfficialPosition(dataOfficialPosition);
    }

    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition updateOfficialPosition(
        Wrappers.OfficialPosition.DataOfficialPosition dataOfficialPosition)
        throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException,
            com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.updateOfficialPosition(dataOfficialPosition);
    }

    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition deleteOfficialPosition(
        Wrappers.OfficialPosition.DataOfficialPosition dataOfficialPosition)
        throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException,
            com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.deleteOfficialPosition(dataOfficialPosition);
    }

    @Override
    public java.util.ArrayList<com.liferay.docs.eventlisting.model.OfficialPosition> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.findAll();
    }

    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition findById(
        long OfficialPositionId)
        throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException,
            com.liferay.portal.kernel.exception.SystemException {
        return _officialPositionLocalService.findById(OfficialPositionId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public OfficialPositionLocalService getWrappedOfficialPositionLocalService() {
        return _officialPositionLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedOfficialPositionLocalService(
        OfficialPositionLocalService officialPositionLocalService) {
        _officialPositionLocalService = officialPositionLocalService;
    }

    @Override
    public OfficialPositionLocalService getWrappedService() {
        return _officialPositionLocalService;
    }

    @Override
    public void setWrappedService(
        OfficialPositionLocalService officialPositionLocalService) {
        _officialPositionLocalService = officialPositionLocalService;
    }
}
