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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
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
    public static final FinderPath FINDER_PATH_FETCH_BY_BANKID = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, WorkerImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByBankId",
            new String[] { Long.class.getName() },
            WorkerModelImpl.BANKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKID = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBankId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_BANKID_BANKID_2 = "worker.bankId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, WorkerImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByOfficialPositionId",
            new String[] { Long.class.getName() },
            WorkerModelImpl.OFFICIALPOSITIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_OFFICIALPOSITIONID = new FinderPath(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByOfficialPositionId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_OFFICIALPOSITIONID_OFFICIALPOSITIONID_2 =
        "worker.officialPositionId = ?";
    private static final String _SQL_SELECT_WORKER = "SELECT worker FROM Worker worker";
    private static final String _SQL_SELECT_WORKER_WHERE = "SELECT worker FROM Worker worker WHERE ";
    private static final String _SQL_COUNT_WORKER = "SELECT COUNT(worker) FROM Worker worker";
    private static final String _SQL_COUNT_WORKER_WHERE = "SELECT COUNT(worker) FROM Worker worker WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "worker.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Worker exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Worker exists with the key {";
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
     * Returns the worker where bankId = &#63; or throws a {@link com.liferay.docs.eventlisting.NoSuchWorkerException} if it could not be found.
     *
     * @param bankId the bank ID
     * @return the matching worker
     * @throws com.liferay.docs.eventlisting.NoSuchWorkerException if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker findByBankId(long bankId)
        throws NoSuchWorkerException, SystemException {
        Worker worker = fetchByBankId(bankId);

        if (worker == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("bankId=");
            msg.append(bankId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchWorkerException(msg.toString());
        }

        return worker;
    }

    /**
     * Returns the worker where bankId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param bankId the bank ID
     * @return the matching worker, or <code>null</code> if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByBankId(long bankId) throws SystemException {
        return fetchByBankId(bankId, true);
    }

    /**
     * Returns the worker where bankId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param bankId the bank ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching worker, or <code>null</code> if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByBankId(long bankId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { bankId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BANKID,
                    finderArgs, this);
        }

        if (result instanceof Worker) {
            Worker worker = (Worker) result;

            if ((bankId != worker.getBankId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_WORKER_WHERE);

            query.append(_FINDER_COLUMN_BANKID_BANKID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(bankId);

                List<Worker> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "WorkerPersistenceImpl.fetchByBankId(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Worker worker = list.get(0);

                    result = worker;

                    cacheResult(worker);

                    if ((worker.getBankId() != bankId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKID,
                            finderArgs, worker);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BANKID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Worker) result;
        }
    }

    /**
     * Removes the worker where bankId = &#63; from the database.
     *
     * @param bankId the bank ID
     * @return the worker that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker removeByBankId(long bankId)
        throws NoSuchWorkerException, SystemException {
        Worker worker = findByBankId(bankId);

        return remove(worker);
    }

    /**
     * Returns the number of workers where bankId = &#63;.
     *
     * @param bankId the bank ID
     * @return the number of matching workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBankId(long bankId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANKID;

        Object[] finderArgs = new Object[] { bankId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_WORKER_WHERE);

            query.append(_FINDER_COLUMN_BANKID_BANKID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(bankId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the worker where officialPositionId = &#63; or throws a {@link com.liferay.docs.eventlisting.NoSuchWorkerException} if it could not be found.
     *
     * @param officialPositionId the official position ID
     * @return the matching worker
     * @throws com.liferay.docs.eventlisting.NoSuchWorkerException if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker findByOfficialPositionId(long officialPositionId)
        throws NoSuchWorkerException, SystemException {
        Worker worker = fetchByOfficialPositionId(officialPositionId);

        if (worker == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("officialPositionId=");
            msg.append(officialPositionId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchWorkerException(msg.toString());
        }

        return worker;
    }

    /**
     * Returns the worker where officialPositionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param officialPositionId the official position ID
     * @return the matching worker, or <code>null</code> if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByOfficialPositionId(long officialPositionId)
        throws SystemException {
        return fetchByOfficialPositionId(officialPositionId, true);
    }

    /**
     * Returns the worker where officialPositionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param officialPositionId the official position ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching worker, or <code>null</code> if a matching worker could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker fetchByOfficialPositionId(long officialPositionId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { officialPositionId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
                    finderArgs, this);
        }

        if (result instanceof Worker) {
            Worker worker = (Worker) result;

            if ((officialPositionId != worker.getOfficialPositionId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_WORKER_WHERE);

            query.append(_FINDER_COLUMN_OFFICIALPOSITIONID_OFFICIALPOSITIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(officialPositionId);

                List<Worker> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "WorkerPersistenceImpl.fetchByOfficialPositionId(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Worker worker = list.get(0);

                    result = worker;

                    cacheResult(worker);

                    if ((worker.getOfficialPositionId() != officialPositionId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
                            finderArgs, worker);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Worker) result;
        }
    }

    /**
     * Removes the worker where officialPositionId = &#63; from the database.
     *
     * @param officialPositionId the official position ID
     * @return the worker that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker removeByOfficialPositionId(long officialPositionId)
        throws NoSuchWorkerException, SystemException {
        Worker worker = findByOfficialPositionId(officialPositionId);

        return remove(worker);
    }

    /**
     * Returns the number of workers where officialPositionId = &#63;.
     *
     * @param officialPositionId the official position ID
     * @return the number of matching workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByOfficialPositionId(long officialPositionId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_OFFICIALPOSITIONID;

        Object[] finderArgs = new Object[] { officialPositionId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_WORKER_WHERE);

            query.append(_FINDER_COLUMN_OFFICIALPOSITIONID_OFFICIALPOSITIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(officialPositionId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
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

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKID,
            new Object[] { worker.getBankId() }, worker);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
            new Object[] { worker.getOfficialPositionId() }, worker);

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

        clearUniqueFindersCache(worker);
    }

    @Override
    public void clearCache(List<Worker> workers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Worker worker : workers) {
            EntityCacheUtil.removeResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
                WorkerImpl.class, worker.getPrimaryKey());

            clearUniqueFindersCache(worker);
        }
    }

    protected void cacheUniqueFindersCache(Worker worker) {
        if (worker.isNew()) {
            Object[] args = new Object[] { worker.getBankId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BANKID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKID, args, worker);

            args = new Object[] { worker.getOfficialPositionId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OFFICIALPOSITIONID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
                args, worker);
        } else {
            WorkerModelImpl workerModelImpl = (WorkerModelImpl) worker;

            if ((workerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_BANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { worker.getBankId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BANKID, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BANKID, args,
                    worker);
            }

            if ((workerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { worker.getOfficialPositionId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OFFICIALPOSITIONID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
                    args, worker);
            }
        }
    }

    protected void clearUniqueFindersCache(Worker worker) {
        WorkerModelImpl workerModelImpl = (WorkerModelImpl) worker;

        Object[] args = new Object[] { worker.getBankId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BANKID, args);

        if ((workerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_BANKID.getColumnBitmask()) != 0) {
            args = new Object[] { workerModelImpl.getOriginalBankId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BANKID, args);
        }

        args = new Object[] { worker.getOfficialPositionId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFFICIALPOSITIONID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
            args);

        if ((workerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID.getColumnBitmask()) != 0) {
            args = new Object[] { workerModelImpl.getOriginalOfficialPositionId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFFICIALPOSITIONID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OFFICIALPOSITIONID,
                args);
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

        if (isNew || !WorkerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(WorkerModelImpl.ENTITY_CACHE_ENABLED,
            WorkerImpl.class, worker.getPrimaryKey(), worker);

        clearUniqueFindersCache(worker);
        cacheUniqueFindersCache(worker);

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
        workerImpl.setArchival_status(worker.isArchival_status());
        workerImpl.setBankId(worker.getBankId());
        workerImpl.setOfficialPositionId(worker.getOfficialPositionId());

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
