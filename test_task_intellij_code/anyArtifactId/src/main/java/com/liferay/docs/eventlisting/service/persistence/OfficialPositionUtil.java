package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.model.OfficialPosition;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the official position service. This utility wraps {@link OfficialPositionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see OfficialPositionPersistence
 * @see OfficialPositionPersistenceImpl
 * @generated
 */
public class OfficialPositionUtil {
    private static OfficialPositionPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(OfficialPosition officialPosition) {
        getPersistence().clearCache(officialPosition);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<OfficialPosition> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<OfficialPosition> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<OfficialPosition> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static OfficialPosition update(OfficialPosition officialPosition)
        throws SystemException {
        return getPersistence().update(officialPosition);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static OfficialPosition update(OfficialPosition officialPosition,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(officialPosition, serviceContext);
    }

    /**
    * Caches the official position in the entity cache if it is enabled.
    *
    * @param officialPosition the official position
    */
    public static void cacheResult(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition) {
        getPersistence().cacheResult(officialPosition);
    }

    /**
    * Caches the official positions in the entity cache if it is enabled.
    *
    * @param officialPositions the official positions
    */
    public static void cacheResult(
        java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> officialPositions) {
        getPersistence().cacheResult(officialPositions);
    }

    /**
    * Creates a new official position with the primary key. Does not add the official position to the database.
    *
    * @param officialPositionId the primary key for the new official position
    * @return the new official position
    */
    public static com.liferay.docs.eventlisting.model.OfficialPosition create(
        long officialPositionId) {
        return getPersistence().create(officialPositionId);
    }

    /**
    * Removes the official position with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param officialPositionId the primary key of the official position
    * @return the official position that was removed
    * @throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException if a official position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.eventlisting.model.OfficialPosition remove(
        long officialPositionId)
        throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(officialPositionId);
    }

    public static com.liferay.docs.eventlisting.model.OfficialPosition updateImpl(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(officialPosition);
    }

    /**
    * Returns the official position with the primary key or throws a {@link com.liferay.docs.eventlisting.NoSuchOfficialPositionException} if it could not be found.
    *
    * @param officialPositionId the primary key of the official position
    * @return the official position
    * @throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException if a official position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.eventlisting.model.OfficialPosition findByPrimaryKey(
        long officialPositionId)
        throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(officialPositionId);
    }

    /**
    * Returns the official position with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param officialPositionId the primary key of the official position
    * @return the official position, or <code>null</code> if a official position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.eventlisting.model.OfficialPosition fetchByPrimaryKey(
        long officialPositionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(officialPositionId);
    }

    /**
    * Returns all the official positions.
    *
    * @return the official positions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.liferay.docs.eventlisting.model.OfficialPosition> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the official positions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of official positions.
    *
    * @return the number of official positions
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static OfficialPositionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (OfficialPositionPersistence) PortletBeanLocatorUtil.locate(com.liferay.docs.eventlisting.service.ClpSerializer.getServletContextName(),
                    OfficialPositionPersistence.class.getName());

            ReferenceRegistry.registerReference(OfficialPositionUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(OfficialPositionPersistence persistence) {
    }
}
