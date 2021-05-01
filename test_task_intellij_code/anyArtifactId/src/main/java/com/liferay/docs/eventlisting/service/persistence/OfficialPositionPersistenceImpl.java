package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.NoSuchOfficialPositionException;
import com.liferay.docs.eventlisting.model.OfficialPosition;
import com.liferay.docs.eventlisting.model.impl.OfficialPositionImpl;
import com.liferay.docs.eventlisting.model.impl.OfficialPositionModelImpl;
import com.liferay.docs.eventlisting.service.persistence.OfficialPositionPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the official position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see OfficialPositionPersistence
 * @see OfficialPositionUtil
 * @generated
 */
public class OfficialPositionPersistenceImpl extends BasePersistenceImpl<OfficialPosition>
    implements OfficialPositionPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link OfficialPositionUtil} to access the official position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = OfficialPositionImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
            OfficialPositionModelImpl.FINDER_CACHE_ENABLED,
            OfficialPositionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
            OfficialPositionModelImpl.FINDER_CACHE_ENABLED,
            OfficialPositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
            OfficialPositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_OFFICIALPOSITION = "SELECT officialPosition FROM OfficialPosition officialPosition";
    private static final String _SQL_COUNT_OFFICIALPOSITION = "SELECT COUNT(officialPosition) FROM OfficialPosition officialPosition";
    private static final String _ORDER_BY_ENTITY_ALIAS = "officialPosition.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OfficialPosition exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(OfficialPositionPersistenceImpl.class);
    private static OfficialPosition _nullOfficialPosition = new OfficialPositionImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<OfficialPosition> toCacheModel() {
                return _nullOfficialPositionCacheModel;
            }
        };

    private static CacheModel<OfficialPosition> _nullOfficialPositionCacheModel = new CacheModel<OfficialPosition>() {
            @Override
            public OfficialPosition toEntityModel() {
                return _nullOfficialPosition;
            }
        };

    public OfficialPositionPersistenceImpl() {
        setModelClass(OfficialPosition.class);
    }

    /**
     * Caches the official position in the entity cache if it is enabled.
     *
     * @param officialPosition the official position
     */
    @Override
    public void cacheResult(OfficialPosition officialPosition) {
        EntityCacheUtil.putResult(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
            OfficialPositionImpl.class, officialPosition.getPrimaryKey(),
            officialPosition);

        officialPosition.resetOriginalValues();
    }

    /**
     * Caches the official positions in the entity cache if it is enabled.
     *
     * @param officialPositions the official positions
     */
    @Override
    public void cacheResult(List<OfficialPosition> officialPositions) {
        for (OfficialPosition officialPosition : officialPositions) {
            if (EntityCacheUtil.getResult(
                        OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
                        OfficialPositionImpl.class,
                        officialPosition.getPrimaryKey()) == null) {
                cacheResult(officialPosition);
            } else {
                officialPosition.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all official positions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(OfficialPositionImpl.class.getName());
        }

        EntityCacheUtil.clearCache(OfficialPositionImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the official position.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(OfficialPosition officialPosition) {
        EntityCacheUtil.removeResult(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
            OfficialPositionImpl.class, officialPosition.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<OfficialPosition> officialPositions) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (OfficialPosition officialPosition : officialPositions) {
            EntityCacheUtil.removeResult(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
                OfficialPositionImpl.class, officialPosition.getPrimaryKey());
        }
    }

    /**
     * Creates a new official position with the primary key. Does not add the official position to the database.
     *
     * @param officialPositionId the primary key for the new official position
     * @return the new official position
     */
    @Override
    public OfficialPosition create(long officialPositionId) {
        OfficialPosition officialPosition = new OfficialPositionImpl();

        officialPosition.setNew(true);
        officialPosition.setPrimaryKey(officialPositionId);

        return officialPosition;
    }

    /**
     * Removes the official position with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param officialPositionId the primary key of the official position
     * @return the official position that was removed
     * @throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException if a official position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OfficialPosition remove(long officialPositionId)
        throws NoSuchOfficialPositionException, SystemException {
        return remove((Serializable) officialPositionId);
    }

    /**
     * Removes the official position with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the official position
     * @return the official position that was removed
     * @throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException if a official position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OfficialPosition remove(Serializable primaryKey)
        throws NoSuchOfficialPositionException, SystemException {
        Session session = null;

        try {
            session = openSession();

            OfficialPosition officialPosition = (OfficialPosition) session.get(OfficialPositionImpl.class,
                    primaryKey);

            if (officialPosition == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchOfficialPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(officialPosition);
        } catch (NoSuchOfficialPositionException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected OfficialPosition removeImpl(OfficialPosition officialPosition)
        throws SystemException {
        officialPosition = toUnwrappedModel(officialPosition);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(officialPosition)) {
                officialPosition = (OfficialPosition) session.get(OfficialPositionImpl.class,
                        officialPosition.getPrimaryKeyObj());
            }

            if (officialPosition != null) {
                session.delete(officialPosition);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (officialPosition != null) {
            clearCache(officialPosition);
        }

        return officialPosition;
    }

    @Override
    public OfficialPosition updateImpl(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition)
        throws SystemException {
        officialPosition = toUnwrappedModel(officialPosition);

        boolean isNew = officialPosition.isNew();

        Session session = null;

        try {
            session = openSession();

            if (officialPosition.isNew()) {
                session.save(officialPosition);

                officialPosition.setNew(false);
            } else {
                session.merge(officialPosition);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
            OfficialPositionImpl.class, officialPosition.getPrimaryKey(),
            officialPosition);

        return officialPosition;
    }

    protected OfficialPosition toUnwrappedModel(
        OfficialPosition officialPosition) {
        if (officialPosition instanceof OfficialPositionImpl) {
            return officialPosition;
        }

        OfficialPositionImpl officialPositionImpl = new OfficialPositionImpl();

        officialPositionImpl.setNew(officialPosition.isNew());
        officialPositionImpl.setPrimaryKey(officialPosition.getPrimaryKey());

        officialPositionImpl.setOfficialPositionId(officialPosition.getOfficialPositionId());
        officialPositionImpl.setName(officialPosition.getName());
        officialPositionImpl.setIs_archived(officialPosition.isIs_archived());

        return officialPositionImpl;
    }

    /**
     * Returns the official position with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the official position
     * @return the official position
     * @throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException if a official position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OfficialPosition findByPrimaryKey(Serializable primaryKey)
        throws NoSuchOfficialPositionException, SystemException {
        OfficialPosition officialPosition = fetchByPrimaryKey(primaryKey);

        if (officialPosition == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchOfficialPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return officialPosition;
    }

    /**
     * Returns the official position with the primary key or throws a {@link com.liferay.docs.eventlisting.NoSuchOfficialPositionException} if it could not be found.
     *
     * @param officialPositionId the primary key of the official position
     * @return the official position
     * @throws com.liferay.docs.eventlisting.NoSuchOfficialPositionException if a official position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OfficialPosition findByPrimaryKey(long officialPositionId)
        throws NoSuchOfficialPositionException, SystemException {
        return findByPrimaryKey((Serializable) officialPositionId);
    }

    /**
     * Returns the official position with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the official position
     * @return the official position, or <code>null</code> if a official position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OfficialPosition fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        OfficialPosition officialPosition = (OfficialPosition) EntityCacheUtil.getResult(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
                OfficialPositionImpl.class, primaryKey);

        if (officialPosition == _nullOfficialPosition) {
            return null;
        }

        if (officialPosition == null) {
            Session session = null;

            try {
                session = openSession();

                officialPosition = (OfficialPosition) session.get(OfficialPositionImpl.class,
                        primaryKey);

                if (officialPosition != null) {
                    cacheResult(officialPosition);
                } else {
                    EntityCacheUtil.putResult(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
                        OfficialPositionImpl.class, primaryKey,
                        _nullOfficialPosition);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(OfficialPositionModelImpl.ENTITY_CACHE_ENABLED,
                    OfficialPositionImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return officialPosition;
    }

    /**
     * Returns the official position with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param officialPositionId the primary key of the official position
     * @return the official position, or <code>null</code> if a official position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OfficialPosition fetchByPrimaryKey(long officialPositionId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) officialPositionId);
    }

    /**
     * Returns all the official positions.
     *
     * @return the official positions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OfficialPosition> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<OfficialPosition> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<OfficialPosition> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<OfficialPosition> list = (List<OfficialPosition>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_OFFICIALPOSITION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_OFFICIALPOSITION;

                if (pagination) {
                    sql = sql.concat(OfficialPositionModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<OfficialPosition>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OfficialPosition>(list);
                } else {
                    list = (List<OfficialPosition>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the official positions from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (OfficialPosition officialPosition : findAll()) {
            remove(officialPosition);
        }
    }

    /**
     * Returns the number of official positions.
     *
     * @return the number of official positions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_OFFICIALPOSITION);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the official position persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.liferay.docs.eventlisting.model.OfficialPosition")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<OfficialPosition>> listenersList = new ArrayList<ModelListener<OfficialPosition>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<OfficialPosition>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(OfficialPositionImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
