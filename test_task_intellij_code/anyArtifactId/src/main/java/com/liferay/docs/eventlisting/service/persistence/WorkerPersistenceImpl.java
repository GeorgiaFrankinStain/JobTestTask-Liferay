package com.liferay.docs.eventlisting.service.persistence;

import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.model.impl.WorkerImpl;
import com.liferay.docs.eventlisting.model.impl.WorkerModelImpl;
import com.liferay.docs.eventlisting.service.persistence.WorkerPersistence;

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
 * The persistence implementation for the worker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see WorkerPersistence
 * @see WorkerUtil
 * @generated
 */
public class WorkerPersistenceImpl extends BasePersistenceImpl<Worker>
    implements WorkerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link WorkerUtil} to access the worker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = WorkerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, WorkerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, WorkerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_WORKER = "SELECT worker FROM Worker worker";
    private static final String _SQL_COUNT_WORKER = "SELECT COUNT(worker) FROM Worker worker";
    private static final String _ORDER_BY_ENTITY_ALIAS = "worker.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Worker exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(WorkerPersistenceImpl.class);
    private static Worker _nullWorker = new WorkerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Worker> toCacheModel() {
                return _nullWorkerCacheModel;
            }
        };

    private static CacheModel<Worker> _nullWorkerCacheModel = new CacheModel<Worker>() {
            @Override
            public Worker toEntityModel() {
                return _nullWorker;
            }
        };

    public WorkerPersistenceImpl() {
        setModelClass(Worker.class);
    }

    /**
     * Caches the worker in the entity cache if it is enabled.
     *
     * @param worker the worker
     */
    @Override
    public void cacheResult(Worker worker) {
        EntityCacheUtil.putResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerImpl.class, worker.getPrimaryKey(), worker);

        worker.resetOriginalValues();
    }

    /**
     * Caches the workers in the entity cache if it is enabled.
     *
     * @param workers the workers
     */
    @Override
    public void cacheResult(List<Worker> workers) {
        for (Worker worker : workers) {
            if (EntityCacheUtil.getResult(
                        WorkerModelImpl.ENTITY_CACHE_ENABLED, WorkerImpl.class,
                        worker.getPrimaryKey()) == null) {
                cacheResult(worker);
            } else {
                worker.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all workers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(WorkerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(WorkerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the worker.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Worker worker) {
        EntityCacheUtil.removeResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerImpl.class, worker.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Worker> workers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Worker worker : workers) {
            EntityCacheUtil.removeResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                WorkerImpl.class, worker.getPrimaryKey());
        }
    }

    /**
     * Creates a new worker with the primary key. Does not add the worker to the database.
     *
     * @param workerId the primary key for the new worker
     * @return the new worker
     */
    @Override
    public Worker create(long workerId) {
        Worker worker = new WorkerImpl();

        worker.setNew(true);
        worker.setPrimaryKey(workerId);

        return worker;
    }

    /**
     * Removes the worker with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param workerId the primary key of the worker
     * @return the worker that was removed
     * @throws com.liferay.docs.eventlisting.NoSuchWorkerException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker remove(long workerId)
        throws NoSuchWorkerException, SystemException {
        return remove((Serializable) workerId);
    }

    /**
     * Removes the worker with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the worker
     * @return the worker that was removed
     * @throws com.liferay.docs.eventlisting.NoSuchWorkerException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker remove(Serializable primaryKey)
        throws NoSuchWorkerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Worker worker = (Worker) session.get(WorkerImpl.class, primaryKey);

            if (worker == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchWorkerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(worker);
        } catch (NoSuchWorkerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Worker removeImpl(Worker worker) throws SystemException {
        worker = toUnwrappedModel(worker);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(worker)) {
                worker = (Worker) session.get(WorkerImpl.class,
                        worker.getPrimaryKeyObj());
            }

            if (worker != null) {
                session.delete(worker);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (worker != null) {
            clearCache(worker);
        }

        return worker;
    }

    @Override
    public Worker updateImpl(com.liferay.docs.eventlisting.model.Worker worker)
        throws SystemException {
        worker = toUnwrappedModel(worker);

        boolean isNew = worker.isNew();

        Session session = null;

        try {
            session = openSession();

            if (worker.isNew()) {
                session.save(worker);

                worker.setNew(false);
            } else {
                session.merge(worker);
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

        EntityCacheUtil.putResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerImpl.class, worker.getPrimaryKey(), worker);

        return worker;
    }

    protected Worker toUnwrappedModel(Worker worker) {
        if (worker instanceof WorkerImpl) {
            return worker;
        }

        WorkerImpl workerImpl = new WorkerImpl();

        workerImpl.setNew(worker.isNew());
        workerImpl.setPrimaryKey(worker.getPrimaryKey());

        workerImpl.setWorkerId(worker.getWorkerId());
        workerImpl.setName(worker.getName());
        workerImpl.setLastname(worker.getLastname());
        workerImpl.setPatronymic(worker.getPatronymic());
        workerImpl.setGender(worker.isGender());
        workerImpl.setDate_of_birth(worker.getDate_of_birth());
        workerImpl.setPosition(worker.getPosition());
        workerImpl.setDate_of_employment(worker.getDate_of_employment());
        workerImpl.setSalary_level(worker.getSalary_level());
        workerImpl.setWork_number(worker.getWork_number());
        workerImpl.setTelephone_number(worker.getTelephone_number());
        workerImpl.setBanking_organization(worker.getBanking_organization());
        workerImpl.setArchival_status(worker.isArchival_status());

        return workerImpl;
    }

    /**
     * Returns the worker with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the worker
     * @return the worker
     * @throws com.liferay.docs.eventlisting.NoSuchWorkerException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker findByPrimaryKey(Serializable primaryKey)
        throws NoSuchWorkerException, SystemException {
        Worker worker = fetchByPrimaryKey(primaryKey);

        if (worker == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchWorkerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return worker;
    }

    /**
     * Returns the worker with the primary key or throws a {@link com.liferay.docs.eventlisting.NoSuchWorkerException} if it could not be found.
     *
     * @param workerId the primary key of the worker
     * @return the worker
     * @throws com.liferay.docs.eventlisting.NoSuchWorkerException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker findByPrimaryKey(long workerId)
        throws NoSuchWorkerException, SystemException {
        return findByPrimaryKey((Serializable) workerId);
    }

    /**
     * Returns the worker with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the worker
     * @return the worker, or <code>null</code> if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Worker worker = (Worker) EntityCacheUtil.getResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                WorkerImpl.class, primaryKey);

        if (worker == _nullWorker) {
            return null;
        }

        if (worker == null) {
            Session session = null;

            try {
                session = openSession();

                worker = (Worker) session.get(WorkerImpl.class, primaryKey);

                if (worker != null) {
                    cacheResult(worker);
                } else {
                    EntityCacheUtil.putResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                        WorkerImpl.class, primaryKey, _nullWorker);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                    WorkerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return worker;
    }

    /**
     * Returns the worker with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param workerId the primary key of the worker
     * @return the worker, or <code>null</code> if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByPrimaryKey(long workerId) throws SystemException {
        return fetchByPrimaryKey((Serializable) workerId);
    }

    /**
     * Returns all the workers.
     *
     * @return the workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Worker> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Worker> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the workers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.eventlisting.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of workers
     * @param end the upper bound of the range of workers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Worker> findAll(int start, int end,
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

        List<Worker> list = (List<Worker>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_WORKER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_WORKER;

                if (pagination) {
                    sql = sql.concat(WorkerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Worker>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Worker>(list);
                } else {
                    list = (List<Worker>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the workers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Worker worker : findAll()) {
            remove(worker);
        }
    }

    /**
     * Returns the number of workers.
     *
     * @return the number of workers
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

                Query q = session.createQuery(_SQL_COUNT_WORKER);

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
     * Initializes the worker persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.liferay.docs.eventlisting.model.Worker")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Worker>> listenersList = new ArrayList<ModelListener<Worker>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Worker>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(WorkerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
