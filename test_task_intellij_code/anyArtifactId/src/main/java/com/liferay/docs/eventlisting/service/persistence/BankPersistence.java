package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.model.Bank;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the bank service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see BankPersistenceImpl
 * @see BankUtil
 * @generated
 */
public interface BankPersistence extends BasePersistence<Bank> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BankUtil} to access the bank persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the bank in the entity cache if it is enabled.
    *
    * @param bank the bank
    */
    public void cacheResult(com.liferay.docs.eventlisting.model.Bank bank);

    /**
    * Caches the banks in the entity cache if it is enabled.
    *
    * @param banks the banks
    */
    public void cacheResult(
        java.util.List<com.liferay.docs.eventlisting.model.Bank> banks);

    /**
    * Creates a new bank with the primary key. Does not add the bank to the database.
    *
    * @param bankId the primary key for the new bank
    * @return the new bank
    */
    public com.liferay.docs.eventlisting.model.Bank create(long bankId);

    /**
    * Removes the bank with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bankId the primary key of the bank
    * @return the bank that was removed
    * @throws com.liferay.docs.eventlisting.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.eventlisting.model.Bank remove(long bankId)
        throws com.liferay.docs.eventlisting.NoSuchBankException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.docs.eventlisting.model.Bank updateImpl(
        com.liferay.docs.eventlisting.model.Bank bank)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank with the primary key or throws a {@link com.liferay.docs.eventlisting.NoSuchBankException} if it could not be found.
    *
    * @param bankId the primary key of the bank
    * @return the bank
    * @throws com.liferay.docs.eventlisting.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.eventlisting.model.Bank findByPrimaryKey(
        long bankId)
        throws com.liferay.docs.eventlisting.NoSuchBankException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bankId the primary key of the bank
    * @return the bank, or <code>null</code> if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.eventlisting.model.Bank fetchByPrimaryKey(
        long bankId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the banks.
    *
    * @return the banks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.eventlisting.model.Bank> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.docs.eventlisting.model.Bank> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the banks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of banks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.eventlisting.model.Bank> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the banks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of banks.
    *
    * @return the number of banks
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
