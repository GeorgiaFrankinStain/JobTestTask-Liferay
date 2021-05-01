package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.model.OfficialPosition;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the official position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see OfficialPositionPersistenceImpl
 * @see OfficialPositionUtil
 * @generated
 */
public interface OfficialPositionPersistence extends BasePersistence<OfficialPosition> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link OfficialPositionUtil} to access the official position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the official position in the entity cache if it is enabled.
    *
    * @param officialPosition the official position
    */
    public void cacheResult(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition);

    /**
    * Caches the official positions in the entity cache if it is enabled.
    *
    * @param officialPositions the official positions
    */
    public void cacheResult(
        java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> officialPositions);

    /**
    * Creates a new official position with the primary key. Does not add the official position to the database.
    *
    * @param officialPositionId the primary key for the new official position
    * @return the new official position
    */
    public com.liferay.docs.eventlisting.model.OfficialPosition create(
        long officialPositionId);

    /**
    * Removes the official position with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param officialPositionId the primary key of the official position
    * @return the official position that was removed
    * @throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException if a official position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.eventlisting.model.OfficialPosition remove(
        long officialPositionId)
        throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.docs.eventlisting.model.OfficialPosition updateImpl(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the official position with the primary key or throws a {@link com.liferay.docs.eventlisting.NoSuchOfficialPositionException} if it could not be found.
    *
    * @param officialPositionId the primary key of the official position
    * @return the official position
    * @throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException if a official position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.eventlisting.model.OfficialPosition findByPrimaryKey(
        long officialPositionId)
        throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the official position with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param officialPositionId the primary key of the official position
    * @return the official position, or <code>null</code> if a official position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.eventlisting.model.OfficialPosition fetchByPrimaryKey(
        long officialPositionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the official positions.
    *
    * @return the official positions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the official positions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.OfficialPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of official positions
    * @param end the upper bound of the range of official positions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of official positions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the official positions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of official positions.
    *
    * @return the number of official positions
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
