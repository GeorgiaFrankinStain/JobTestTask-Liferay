package com.liferay.docs.eventlisting.service.impl;

import Wrappers.Worker.DataWorker;
import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.base.WorkerLocalServiceBaseImpl;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.Date;

/**
 * The implementation of the worker local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.eventlisting.service.WorkerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.eventlisting.service.base.WorkerLocalServiceBaseImpl
 * @see com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil
 */
public class WorkerLocalServiceImpl extends WorkerLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil} to access the worker local service.
     */

    public Worker addWorker(DataWorker dataWorker
    ) throws SystemException, NoSuchModelException {
        Worker worker = dataWorker.getCreatedWorker(counterLocalService, workerPersistence);
        super.addWorker(worker);
        return worker;
    }


    public Worker updateWorker(DataWorker dataWorker) throws SystemException, NoSuchModelException {
        Worker worker = dataWorker.getUpdatedWorker(workerPersistence);
        super.updateWorker(worker);
        return worker;
    }

    public Worker deleteWorker(DataWorker dataWorker) throws SystemException, NoSuchModelException {
        Worker worker = dataWorker.getUpdatedWorker(workerPersistence);
        super.deleteWorker(worker);
        return worker;
    }


    public ArrayList<Worker> findAll() throws SystemException {
        ArrayList<Worker> result = new ArrayList<Worker>();
        result.addAll(workerPersistence.findAll());
        return result;
    }

    public Worker findById(long workerId) throws NoSuchWorkerException, SystemException {
        return workerPersistence.findByPrimaryKey(workerId);
    }

}
