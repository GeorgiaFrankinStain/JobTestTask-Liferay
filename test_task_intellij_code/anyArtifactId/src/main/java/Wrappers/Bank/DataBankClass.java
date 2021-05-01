package Wrappers.Bank;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.eventlisting.NoSuchBankException;
import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.docs.eventlisting.model.Bank;
import com.liferay.docs.eventlisting.service.BankLocalServiceUtil;
import com.liferay.docs.eventlisting.service.persistence.BankPersistence;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;

public class DataBankClass implements DataBank, TextPresentationBank {
    private long bankId = 0;
    private String name = "";
    private String bic = "";
    private String address = "";


    public DataBankClass() {
    }

    public DataBankClass(ActionRequest request) {
        this.bankId = ParamUtil.getLong(request, "bankId");
        this.name = ParamUtil.getString(request, "name");
        this.bic = ParamUtil.getString(request, "bic");
        this.address = ParamUtil.getString(request, "address");
    }

    @Override
    public void trySetDataFromExitBank(long bankId) throws NoSuchWorkerException, SystemException, NoSuchBankException {
        Bank bank = getBank(bankId);
        boolean isBankExist = bank != null;
        if (isBankExist) {
            this.bankId = bank.getBankId();
            this.name = bank.getName();
            this.bic = bank.getBic();
            this.address = bank.getAddress();
        }
    }

    @Override
    public String getId() {
        return String.valueOf(this.getBankId());
    }

    private Bank getBank(long bankId) throws NoSuchWorkerException, SystemException, NoSuchBankException {
        if (bankId == 0) {
            return null;
        } else {
            return BankLocalServiceUtil.findById(bankId);
        }
    }

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Bank getCreateBank(CounterLocalService counterLocalService, BankPersistence bankPersistence) throws SystemException {
        long bankId = counterLocalService.increment(Bank.class.getName());
        Bank bank = bankPersistence.create(bankId);
        setData(bank);
        return bank;
    }

    @Override
    public Bank getUpdateBank(BankPersistence bankPersistence) throws SystemException, NoSuchBankException {
        Bank bank = bankPersistence.findByPrimaryKey(this.bankId);
        setData(bank);
        return bank;
    }

    private void setData(Bank bank) {
        bank.setName(name);
        bank.setBic(bic);
        bank.setAddress(address);
    }

    @Override
    public boolean isNew() {
        return this.bankId == 0;
    }
}
