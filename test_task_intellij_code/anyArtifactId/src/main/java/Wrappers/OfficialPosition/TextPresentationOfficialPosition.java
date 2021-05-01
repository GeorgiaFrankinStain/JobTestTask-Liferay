package Wrappers.OfficialPosition;

import com.liferay.docs.eventlisting.NoSuchOfficialPositionException;
import com.liferay.portal.kernel.exception.SystemException;

public interface TextPresentationOfficialPosition {
    public void trySetDataFromExitOfficialPosition(long officialPositionId) throws SystemException, NoSuchOfficialPositionException;
    public String getIdText();
    public String getName();
    public boolean isArchived();
}
