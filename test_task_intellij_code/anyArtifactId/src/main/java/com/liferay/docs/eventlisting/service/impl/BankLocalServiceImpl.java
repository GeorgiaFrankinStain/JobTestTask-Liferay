package com.liferay.docs.eventlisting.service.impl;

import com.liferay.docs.eventlisting.NoSuchBankException;
import com.liferay.docs.eventlisting.model.Bank;
import com.liferay.docs.eventlisting.service.base.BankLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;

/**
 * The implementation of the bank local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.eventlisting.service.BankLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.eventlisting.service.base.BankLocalServiceBaseImpl
 * @see com.liferay.docs.eventlisting.service.BankLocalServiceUtil
 */
public class BankLocalServiceImpl extends BankLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.eventlisting.service.BankLocalServiceUtil} to access the bank local service.
     */
    public Bank addBank(String name, String bic, String address) throws SystemException {
        long bankId = counterLocalService.increment(Bank.class.getName());
        Bank bank = bankPersistence.create(bankId);

        bank.setName(name);
        bank.setBic(bic);
        bank.setAddress(address);

        super.addBank(bank);



        return bank;
    }

    public ArrayList<Bank> findAll() throws SystemException {
        ArrayList<Bank> result = new ArrayList<Bank>();
        result.addAll(bankPersistence.findAll());
        return result;
    }

    public Bank findById(long bankId) throws NoSuchBankException, SystemException {
        return bankPersistence.findByPrimaryKey(bankId);
    }
}
