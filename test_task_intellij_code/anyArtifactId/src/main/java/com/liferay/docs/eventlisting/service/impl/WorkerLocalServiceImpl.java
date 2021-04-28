package com.liferay.docs.eventlisting.service.impl;

import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.base.WorkerLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

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
    public Worker addWorker(String name, String lastname, String patronymic) throws SystemException {
        long workerId = counterLocalService.increment(Worker.class.getName());
        Worker worker = workerPersistence.create(workerId);

        worker.setName(name);
        worker.setLastname(lastname);
        worker.setPatronymic(patronymic);

        super.addWorker(worker);



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
