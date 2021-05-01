package Wrappers.OfficialPosition;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.eventlisting.NoSuchOfficialPositionException;
import com.liferay.docs.eventlisting.model.OfficialPosition;
import com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil;
import com.liferay.docs.eventlisting.service.persistence.OfficialPositionPersistence;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;

public class DataOfficialPositionClass implements TextPresentationOfficialPosition, DataOfficialPosition {

    private long officialPositionId = 0;
    private String name = "";
    private boolean isArchived = false;

    public DataOfficialPositionClass() {
    }

    public DataOfficialPositionClass(ActionRequest request) {
        this.officialPositionId = ParamUtil.getLong(request, "officialPositionId");
        this.name = ParamUtil.getString(request, "name");
        this.isArchived = ParamUtil.getBoolean(request, "isArchived");
    }


    @Override
    public void trySetDataFromExitOfficialPosition(long officialPositionId) throws SystemException, NoSuchOfficialPositionException {
        OfficialPosition officialPosition = getOfficialPosition(officialPositionId);
        boolean isOfficialPositionExist = officialPosition != null;
        if (isOfficialPositionExist) {
            this.officialPositionId = officialPositionId;
            this.name = officialPosition.getName();
            this.isArchived = officialPosition.getIs_archived();
        }
    }

    @Override
    public String getIdText() {
        return String.valueOf(this.officialPositionId);
    }

    private OfficialPosition getOfficialPosition(long officialPositionId) throws SystemException, NoSuchOfficialPositionException {
        if (officialPositionId == 0) {
            return null;
        } else {
            return OfficialPositionLocalServiceUtil.findById(officialPositionId);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean archived) {
        isArchived = archived;
    }

    @Override
    public OfficialPosition getCreateOfficialPosition(
            CounterLocalService counterLocalService,
            OfficialPositionPersistence officialPositionPersistence
    ) throws SystemException {
        long officialPositionId = counterLocalService.increment(OfficialPosition.class.getName());
        OfficialPosition officialPosition = officialPositionPersistence.create(officialPositionId);

        setDataIn(officialPosition);

        return officialPosition;
    }

    @Override
    public OfficialPosition getUpdateOfficialPosition(OfficialPositionPersistence officialPositionPersistence) throws SystemException, NoSuchOfficialPositionException {
        OfficialPosition officialPosition = officialPositionPersistence.findByPrimaryKey(this.officialPositionId);
        setDataIn(officialPosition);
        return officialPosition;
    }

    private void setDataIn(OfficialPosition officialPosition) {
        officialPosition.setName(name);
        officialPosition.setIs_archived(isArchived);
    }

    @Override
    public boolean isNew() {
        return this.officialPositionId == 0;
    }
}
