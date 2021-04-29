package com.liferay.docs.eventlisting.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WorkerLocalService}.
 *
 * @author Joe Bloggs
 * @see WorkerLocalService
 * @generated
 */
public class WorkerLocalServiceWrapper implements WorkerLocalService,
    ServiceWrapper<WorkerLocalService> {
    private WorkerLocalService _workerLocalService;

    public WorkerLocalServiceWrapper(WorkerLocalService workerLocalService) {
        _workerLocalService = workerLocalService;
    }

    /**
    * Adds the worker to the database. Also notifies the appropriate model listeners.
    *
    * @param worker the worker
    * @return the worker that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.Worker addWorker(
        com.liferay.docs.eventlisting.model.Worker worker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.addWorker(worker);
    }

    /**
    * Creates a new worker with the primary key. Does not add the worker to the database.
    *
    * @param workerId the primary key for the new worker
    * @return the new worker
    */
    @Override
    public com.liferay.docs.eventlisting.model.Worker createWorker(
        long workerId) {
        return _workerLocalService.createWorker(workerId);
    }

    /**
    * Deletes the worker with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param workerId the primary key of the worker
    * @return the worker that was removed
    * @throws PortalException if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.Worker deleteWorker(
        long workerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.deleteWorker(workerId);
    }

    /**
    * Deletes the worker from the database. Also notifies the appropriate model listeners.
    *
    * @param worker the worker
    * @return the worker that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.Worker deleteWorker(
        com.liferay.docs.eventlisting.model.Worker worker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.deleteWorker(worker);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _workerLocalService.dynamicQuery();
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
        return _workerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _workerLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _workerLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _workerLocalService.dynamicQueryCount(dynamicQuery);
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
        return _workerLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.liferay.docs.eventlisting.model.Worker fetchWorker(long workerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.fetchWorker(workerId);
    }

    /**
    * Returns the worker with the primary key.
    *
    * @param workerId the primary key of the worker
    * @return the worker
    * @throws PortalException if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.Worker getWorker(long workerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.getWorker(workerId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the workers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of workers
    * @param end the upper bound of the range of workers (not inclusive)
    * @return the range of workers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.docs.eventlisting.model.Worker> getWorkers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.getWorkers(start, end);
    }

    /**
    * Returns the number of workers.
    *
    * @return the number of workers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getWorkersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.getWorkersCount();
    }

    /**
    * Updates the worker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param worker the worker
    * @return the worker that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.docs.eventlisting.model.Worker updateWorker(
        com.liferay.docs.eventlisting.model.Worker worker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.updateWorker(worker);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _workerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _workerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _workerLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.liferay.docs.eventlisting.model.Worker addWorker(
        java.lang.String name, java.lang.String lastname,
        java.lang.String patronymic, boolean isMan, java.util.Date birthDate,
        java.lang.String position, java.util.Date employmentDate,
        long salaryLevel, java.lang.String workNumber,
        java.lang.String telephoneNumber, long idBankService,
        long officialPositionId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.addWorker(name, lastname, patronymic, isMan,
            birthDate, position, employmentDate, salaryLevel, workNumber,
            telephoneNumber, idBankService, officialPositionId, isArchived);
    }

    @Override
    public java.util.ArrayList<com.liferay.docs.eventlisting.model.Worker> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.findAll();
    }

    @Override
    public com.liferay.docs.eventlisting.model.Worker findById(long workerId)
        throws com.liferay.docs.eventlisting.NoSuchWorkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return _workerLocalService.findById(workerId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public WorkerLocalService getWrappedWorkerLocalService() {
        return _workerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedWorkerLocalService(
        WorkerLocalService workerLocalService) {
        _workerLocalService = workerLocalService;
    }

    @Override
    public WorkerLocalService getWrappedService() {
        return _workerLocalService;
    }

    @Override
    public void setWrappedService(WorkerLocalService workerLocalService) {
        _workerLocalService = workerLocalService;
    }
}
