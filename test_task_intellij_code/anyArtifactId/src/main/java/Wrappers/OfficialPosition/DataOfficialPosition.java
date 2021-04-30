package Wrappers.OfficialPosition;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.eventlisting.NoSuchOfficialPositionException;
import com.liferay.docs.eventlisting.model.OfficialPosition;
import com.liferay.docs.eventlisting.service.persistence.OfficialPositionPersistence;
import com.liferay.portal.kernel.exception.SystemException;

public interface DataOfficialPosition {
    public OfficialPosition getCreateOfficialPosition(
            CounterLocalService counterLocalService,
            OfficialPositionPersistence officialPositionPersistence
    ) throws SystemException;
    public OfficialPosition getUpdateOfficialPosition(OfficialPositionPersistence officialPositionPersistence) throws SystemException, NoSuchOfficialPositionException;
    public boolean isNew();
}
