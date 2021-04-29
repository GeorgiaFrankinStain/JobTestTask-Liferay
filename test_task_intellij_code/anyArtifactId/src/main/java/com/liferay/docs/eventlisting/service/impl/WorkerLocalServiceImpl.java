package com.liferay.docs.eventlisting.service.impl;

import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.base.WorkerLocalServiceBaseImpl;
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

    public Worker addWorker(
            String name,
            String lastname,
            String patronymic,
            boolean isMan,
            Date birthDate,
            String position,
            Date employmentDate,
            long salaryLevel,
            String workNumber,
            String telephoneNumber,
            long idBankService,
            long officialPositionId,
            boolean isArchived
    ) throws SystemException {
        long workerId = counterLocalService.increment(Worker.class.getName());
        Worker worker = workerPersistence.create(workerId);

        worker.setName(name);
        worker.setLastname(lastname);
        worker.setPatronymic(patronymic);
        worker.setGender(isMan);
        worker.setDate_of_birth(birthDate);
        worker.setPosition(position);
        worker.setDate_of_employment(employmentDate);
        worker.setSalary_level(salaryLevel);
        worker.setWork_number(workNumber);
        worker.setTelephone_number(telephoneNumber);
        worker.setBankId(idBankService);
        worker.setOfficialPositionId(officialPositionId);
        worker.setArchival_status(isArchived);


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
