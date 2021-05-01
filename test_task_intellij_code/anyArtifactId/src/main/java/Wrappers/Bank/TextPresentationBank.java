package Wrappers.Bank;

import com.liferay.docs.eventlisting.NoSuchBankException;
import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.portal.kernel.exception.SystemException;

public interface TextPresentationBank {

    public void trySetDataFromExitBank(long bankId) throws NoSuchWorkerException, SystemException, NoSuchBankException;

    public String getId();
    public String getName();
    public String getAddress();
    public String getBic();
}
