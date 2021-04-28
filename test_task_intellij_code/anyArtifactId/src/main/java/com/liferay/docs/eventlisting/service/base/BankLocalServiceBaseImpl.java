package com.liferay.docs.eventlisting.service.base;

import com.liferay.docs.eventlisting.model.Bank;
import com.liferay.docs.eventlisting.service.BankLocalService;
import com.liferay.docs.eventlisting.service.persistence.BankPersistence;
import com.liferay.docs.eventlisting.service.persistence.OfficialPositionPersistence;
import com.liferay.docs.eventlisting.service.persistence.WorkerPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the bank local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.docs.eventlisting.service.impl.BankLocalServiceImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.eventlisting.service.impl.BankLocalServiceImpl
 * @see com.liferay.docs.eventlisting.service.BankLocalServiceUtil
 * @generated
 */
public abstract class BankLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements BankLocalService, IdentifiableBean {
    @BeanReference(type = com.liferay.docs.eventlisting.service.BankLocalService.class)
    protected com.liferay.docs.eventlisting.service.BankLocalService bankLocalService;
    @BeanReference(type = BankPersistence.class)
    protected BankPersistence bankPersistence;
    @BeanReference(type = com.liferay.docs.eventlisting.service.OfficialPositionLocalService.class)
    protected com.liferay.docs.eventlisting.service.OfficialPositionLocalService officialPositionLocalService;
    @BeanReference(type = OfficialPositionPersistence.class)
    protected OfficialPositionPersistence officialPositionPersistence;
    @BeanReference(type = com.liferay.docs.eventlisting.service.WorkerLocalService.class)
    protected com.liferay.docs.eventlisting.service.WorkerLocalService workerLocalService;
    @BeanReference(type = WorkerPersistence.class)
    protected WorkerPersistence workerPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private BankLocalServiceClpInvoker _clpInvoker = new BankLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.liferay.docs.eventlisting.service.BankLocalServiceUtil} to access the bank local service.
     */

    /**
     * Adds the bank to the database. Also notifies the appropriate model listeners.
     *
     * @param bank the bank
     * @return the bank that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Bank addBank(Bank bank) throws SystemException {
        bank.setNew(true);

        return bankPersistence.update(bank);
    }

    /**
     * Creates a new bank with the primary key. Does not add the bank to the database.
     *
     * @param bankId the primary key for the new bank
     * @return the new bank
     */
    @Override
    public Bank createBank(long bankId) {
        return bankPersistence.create(bankId);
    }

    /**
     * Deletes the bank with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bankId the primary key of the bank
     * @return the bank that was removed
     * @throws PortalException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Bank deleteBank(long bankId) throws PortalException, SystemException {
        return bankPersistence.remove(bankId);
    }

    /**
     * Deletes the bank from the database. Also notifies the appropriate model listeners.
     *
     * @param bank the bank
     * @return the bank that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Bank deleteBank(Bank bank) throws SystemException {
        return bankPersistence.remove(bank);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Bank.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return bankPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return bankPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return bankPersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return bankPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return bankPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Bank fetchBank(long bankId) throws SystemException {
        return bankPersistence.fetchByPrimaryKey(bankId);
    }

    /**
     * Returns the bank with the primary key.
     *
     * @param bankId the primary key of the bank
     * @return the bank
     * @throws PortalException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank getBank(long bankId) throws PortalException, SystemException {
        return bankPersistence.findByPrimaryKey(bankId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return bankPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the banks.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @return the range of banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> getBanks(int start, int end) throws SystemException {
        return bankPersistence.findAll(start, end);
    }

    /**
     * Returns the number of banks.
     *
     * @return the number of banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getBanksCount() throws SystemException {
        return bankPersistence.countAll();
    }

    /**
     * Updates the bank in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param bank the bank
     * @return the bank that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Bank updateBank(Bank bank) throws SystemException {
        return bankPersistence.update(bank);
    }

    /**
     * Returns the bank local service.
     *
     * @return the bank local service
     */
    public com.liferay.docs.eventlisting.service.BankLocalService getBankLocalService() {
        return bankLocalService;
    }

    /**
     * Sets the bank local service.
     *
     * @param bankLocalService the bank local service
     */
    public void setBankLocalService(
        com.liferay.docs.eventlisting.service.BankLocalService bankLocalService) {
        this.bankLocalService = bankLocalService;
    }

    /**
     * Returns the bank persistence.
     *
     * @return the bank persistence
     */
    public BankPersistence getBankPersistence() {
        return bankPersistence;
    }

    /**
     * Sets the bank persistence.
     *
     * @param bankPersistence the bank persistence
     */
    public void setBankPersistence(BankPersistence bankPersistence) {
        this.bankPersistence = bankPersistence;
    }

    /**
     * Returns the official position local service.
     *
     * @return the official position local service
     */
    public com.liferay.docs.eventlisting.service.OfficialPositionLocalService getOfficialPositionLocalService() {
        return officialPositionLocalService;
    }

    /**
     * Sets the official position local service.
     *
     * @param officialPositionLocalService the official position local service
     */
    public void setOfficialPositionLocalService(
        com.liferay.docs.eventlisting.service.OfficialPositionLocalService officialPositionLocalService) {
        this.officialPositionLocalService = officialPositionLocalService;
    }

    /**
     * Returns the official position persistence.
     *
     * @return the official position persistence
     */
    public OfficialPositionPersistence getOfficialPositionPersistence() {
        return officialPositionPersistence;
    }

    /**
     * Sets the official position persistence.
     *
     * @param officialPositionPersistence the official position persistence
     */
    public void setOfficialPositionPersistence(
        OfficialPositionPersistence officialPositionPersistence) {
        this.officialPositionPersistence = officialPositionPersistence;
    }

    /**
     * Returns the worker local service.
     *
     * @return the worker local service
     */
    public com.liferay.docs.eventlisting.service.WorkerLocalService getWorkerLocalService() {
        return workerLocalService;
    }

    /**
     * Sets the worker local service.
     *
     * @param workerLocalService the worker local service
     */
    public void setWorkerLocalService(
        com.liferay.docs.eventlisting.service.WorkerLocalService workerLocalService) {
        this.workerLocalService = workerLocalService;
    }

    /**
     * Returns the worker persistence.
     *
     * @return the worker persistence
     */
    public WorkerPersistence getWorkerPersistence() {
        return workerPersistence;
    }

    /**
     * Sets the worker persistence.
     *
     * @param workerPersistence the worker persistence
     */
    public void setWorkerPersistence(WorkerPersistence workerPersistence) {
        this.workerPersistence = workerPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.liferay.docs.eventlisting.model.Bank",
            bankLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.liferay.docs.eventlisting.model.Bank");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Bank.class;
    }

    protected String getModelClassName() {
        return Bank.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = bankPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
