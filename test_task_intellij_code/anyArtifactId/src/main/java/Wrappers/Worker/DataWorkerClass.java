package Wrappers.Worker;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil;
import com.liferay.docs.eventlisting.service.persistence.WorkerPersistence;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataWorkerClass implements DataWorker, TextPresentationWorker {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private SimpleDateFormat formatForInputTag = new SimpleDateFormat("yyyy-MM-dd");
    private long workerId = 0;
    private String name = "";
    private String lastname = "";
    private String patronymic = "";
    private boolean isMan = true;
    private Date dateBirth = null;
    private String position = "";
    private Date dateEmployment;
    private long salaryLevel;
    private String workNumber = "";
    private String telephoneNumber = "";
    private long bankOrganization = 0;
    private long officialPositionId = 0;
    private boolean isArchived = false;

    public DataWorkerClass(ActionRequest request) {
        this.workerId = ParamUtil.getLong(request, "workerId");

        this.name = ParamUtil.getString(request, "name");
        this.lastname = ParamUtil.getString(request, "lastname");
        this.patronymic = ParamUtil.getString(request, "patronymic");
        this.isMan = ParamUtil.getBoolean(request, "is_man");
        this.dateBirth = ParamUtil.getDate(request, "date_of_birth", dateFormat);
        this.position = ParamUtil.getString(request, "position");
        this.dateEmployment = ParamUtil.getDate(request, "date_of_employment", dateFormat);
        this.salaryLevel = ParamUtil.getLong(request, "salary_level");
        this.workNumber = ParamUtil.getString(request, "work_number");
        this.telephoneNumber = ParamUtil.getString(request, "telephone_number");
        this.bankOrganization = ParamUtil.getLong(request, "bankId");
        this.officialPositionId = ParamUtil.getLong(request, "officialPositionId");
        this.isArchived = ParamUtil.getBoolean(request, "archival_status");
    }

    @Override
    public void trySetDataFromExitWorker(long workerId) throws NoSuchWorkerException, SystemException {


        Worker worker = getWorker(workerId);
        boolean isWorkerExist = worker != null;
        if (isWorkerExist) {
            this.workerId = worker.getWorkerId();
            this.name = worker.getName();
            this.lastname = worker.getLastname();
            this.patronymic = worker.getPatronymic();
            this.isMan = worker.isGender();
            this.dateBirth = worker.getDate_of_birth();
            this.position = worker.getPosition();
            this.dateEmployment = worker.getDate_of_employment();
            this.salaryLevel = worker.getSalary_level();
            this.workNumber = worker.getWork_number();
            this.telephoneNumber = worker.getTelephone_number();
            this.bankOrganization = worker.getBankId();
            this.officialPositionId = worker.getOfficialPositionId();
            this.isArchived = worker.isArchival_status();
        }
    }

    @Override
    public boolean isCurrentBankThisWorker(long bankId) {
        return bankId == this.bankOrganization;
    }
    @Override
    public boolean isCurrentOfficePositionThisWorker(long officialPositionId) {
        return officialPositionId == this.officialPositionId;
    }

    @Override
    public String getId() {
        if (workerId <= 0) {
            return "";
        } else {
            return String.valueOf(workerId);
        }
    }

    public DataWorkerClass() {
    }

    @Override
    public Worker getUpdatedWorker(WorkerPersistence workerPersistence) throws NoSuchModelException, SystemException {
        Worker worker = workerPersistence.findByPrimaryKey(this.getWorkerId());

        setDataToWorker(worker);

        return worker;
    }

    @Override
    public Worker getCreatedWorker(
            CounterLocalService counterLocalService,
            WorkerPersistence workerPersistence
    ) throws NoSuchModelException, SystemException {
        long workerId = counterLocalService.increment(Worker.class.getName());
        Worker worker = workerPersistence.create(workerId);

        setDataToWorker(worker);

        return worker;
    }

    @Override
    public boolean isCreatingWorker() {
        return this.workerId == 0;
    }


    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }


    public Date getDateBirth() {
        return dateBirth;
    }
    public String getDateBirthText() {
        if (dateBirth != null) {
            return formatForInputTag.format(dateBirth);
        } else {
            return "";
        }
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getDateEmploymentText() {
        if (dateEmployment != null) {
            return formatForInputTag.format(dateEmployment);
        } else {
            return "";
        }
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateEmployment() {
        return dateEmployment;
    }

    public void setDateEmployment(Date dateEmployment) {
        this.dateEmployment = dateEmployment;
    }

    public long getSalaryLevel() {
        return salaryLevel;
    }

    @Override
    public String getSalaryLevelText() {
        return String.valueOf(this.getSalaryLevel());
    }

    public void setSalaryLevel(long salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public String getWorkNumberText() {
        return String.valueOf(this.getWorkNumber());
    }

    @Override
    public String getTelephoneNumberText() {
        return String.valueOf(this.getTelephoneNumber());
    }


    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public long getBankOrganization() {
        return bankOrganization;
    }

    public void setBankOrganization(long bankOrganization) {
        this.bankOrganization = bankOrganization;
    }

    public long getOfficialPositionId() {
        return officialPositionId;
    }

    public void setOfficialPositionId(long officialPositionId) {
        this.officialPositionId = officialPositionId;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean archived) {
        isArchived = archived;
    }

    private void setDataToWorker(Worker worker) {
        worker.setName(this.getName());
        worker.setLastname(this.getLastname());
        worker.setPatronymic(this.getPatronymic());
        worker.setGender(this.isMan());
        System.out.println("========================== set before data");

        worker.setDate_of_birth(this.getDateBirth());
        System.out.println("============================== set after date");
        worker.setPosition(this.getPosition());
        worker.setDate_of_employment(this.getDateEmployment());
        worker.setSalary_level(this.getSalaryLevel());
        worker.setWork_number(this.getWorkNumber());
        worker.setTelephone_number(this.getTelephoneNumber());
        worker.setBankId(this.getBankOrganization());
        worker.setOfficialPositionId(this.getOfficialPositionId());
        worker.setArchival_status(this.isArchived());
    }

    private Worker getWorker(long workerId) throws NoSuchWorkerException, SystemException {
        if (workerId == 0) {
            return null;
        } else {
            return WorkerLocalServiceUtil.findById(workerId);
        }
    }
}
