package Wrappers.Worker;

import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.Date;

public interface TextPresentationWorker {

    public void trySetDataFromExitWorker(long workerId) throws NoSuchWorkerException, SystemException;

    public boolean isCurrentBankThisWorker(long bankId);
    public boolean isCurrentOfficePositionThisWorker(long officialPositionId);

    public String getId();
    public String getName();
    public String getLastname();
    public String getPatronymic();
    public boolean isMan();
    public String getDateBirthText();
    public String getPosition();
    public String getDateEmploymentText();
    public String getSalaryLevelText();
    public String getWorkNumberText();
    public String getTelephoneNumberText();
    public boolean isArchived();
}
