package Wrappers.Worker;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.persistence.WorkerPersistence;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;

public interface DataWorker {
    Worker getUpdatedWorker(WorkerPersistence workerPersistence) throws NoSuchModelException, SystemException;
    Worker getCreatedWorker(
            CounterLocalService counterLocalService,
            WorkerPersistence workerPersistence
    ) throws NoSuchModelException, SystemException;
    boolean isCreatingWorker();
}
