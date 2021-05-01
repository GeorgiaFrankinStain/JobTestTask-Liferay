package Wrappers.Bank;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.eventlisting.NoSuchBankException;
import com.liferay.docs.eventlisting.model.Bank;
import com.liferay.docs.eventlisting.service.persistence.BankPersistence;
import com.liferay.portal.kernel.exception.SystemException;

public interface DataBank {
    public Bank getCreateBank(CounterLocalService counterLocalService, BankPersistence bankPersistence) throws SystemException;
    public Bank getUpdateBank(BankPersistence bankPersistence) throws SystemException, NoSuchBankException;
    public boolean isNew();
}
