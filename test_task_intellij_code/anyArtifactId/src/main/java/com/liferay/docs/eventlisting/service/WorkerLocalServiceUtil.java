package com.liferay.docs.eventlisting.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Worker. This utility wraps
 * {@link com.liferay.docs.eventlisting.service.impl.WorkerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Joe Bloggs
 * @see WorkerLocalService
 * @see com.liferay.docs.eventlisting.service.base.WorkerLocalServiceBaseImpl
 * @see com.liferay.docs.eventlisting.service.impl.WorkerLocalServiceImpl
 * @generated
 */
public class WorkerLocalServiceUtil {
    private static WorkerLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.eventlisting.service.impl.WorkerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the worker to the database. Also notifies the appropriate model listeners.
    *
    * @param worker the worker
    * @return the worker that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.eventlisting.model.Worker addWorker(
        com.liferay.docs.eventlisting.model.Worker worker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addWorker(worker);
    }

    /**
    * Creates a new worker with the primary key. Does not add the worker to the database.
    *
    * @param workerId the primary key for the new worker
    * @return the new worker
    */
    public static com.liferay.docs.eventlisting.model.Worker createWorker(
        long workerId) {
        return getService().createWorker(workerId);
    }

    /**
    * Deletes the worker with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param workerId the primary key of the worker
    * @return the worker that was removed
    * @throws PortalException if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.eventlisting.model.Worker deleteWorker(
        long workerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteWorker(workerId);
    }

    /**
    * Deletes the worker from the database. Also notifies the appropriate model listeners.
    *
    * @param worker the worker
    * @return the worker that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.eventlisting.model.Worker deleteWorker(
        com.liferay.docs.eventlisting.model.Worker worker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteWorker(worker);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.liferay.docs.eventlisting.model.Worker fetchWorker(
        long workerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchWorker(workerId);
    }

    /**
    * Returns the worker with the primary key.
    *
    * @param workerId the primary key of the worker
    * @return the worker
    * @throws PortalException if a worker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.eventlisting.model.Worker getWorker(
        long workerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getWorker(workerId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.liferay.docs.eventlisting.model.Worker> getWorkers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getWorkers(start, end);
    }

    /**
    * Returns the number of workers.
    *
    * @return the number of workers
    * @throws SystemException if a system exception occurred
    */
    public static int getWorkersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getWorkersCount();
    }

    /**
    * Updates the worker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param worker the worker
    * @return the worker that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.eventlisting.model.Worker updateWorker(
        com.liferay.docs.eventlisting.model.Worker worker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateWorker(worker);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.liferay.docs.eventlisting.model.Worker addWorker(
        Wrappers.Worker.DataWorker dataWorker)
        throws com.liferay.portal.NoSuchModelException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addWorker(dataWorker);
    }

    public static com.liferay.docs.eventlisting.model.Worker updateWorker(
        Wrappers.Worker.DataWorker dataWorker)
        throws com.liferay.portal.NoSuchModelException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateWorker(dataWorker);
    }

    public static com.liferay.docs.eventlisting.model.Worker deleteWorker(
        Wrappers.Worker.DataWorker dataWorker)
        throws com.liferay.portal.NoSuchModelException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteWorker(dataWorker);
    }

    public static java.util.ArrayList<com.liferay.docs.eventlisting.model.Worker> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findAll();
    }

    public static com.liferay.docs.eventlisting.model.Worker findById(
        long workerId)
        throws com.liferay.docs.eventlisting.NoSuchWorkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().findById(workerId);
    }

    public static java.util.ArrayList<com.liferay.docs.eventlisting.model.Worker> findWorkerWithBank(
        long bankId) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findWorkerWithBank(bankId);
    }

    public static java.util.ArrayList<com.liferay.docs.eventlisting.model.Worker> findWorkerWithOfficialPosition(
        long officialPositionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findWorkerWithOfficialPosition(officialPositionId);
    }

    public static void clearService() {
        _service = null;
    }

    public static WorkerLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    WorkerLocalService.class.getName());

            if (invokableLocalService instanceof WorkerLocalService) {
                _service = (WorkerLocalService) invokableLocalService;
            } else {
                _service = new WorkerLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(WorkerLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(WorkerLocalService service) {
    }
}
