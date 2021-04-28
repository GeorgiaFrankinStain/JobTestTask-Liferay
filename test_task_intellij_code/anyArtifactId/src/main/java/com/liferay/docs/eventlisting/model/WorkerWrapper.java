package com.liferay.docs.eventlisting.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Worker}.
 * </p>
 *
 * @author Joe Bloggs
 * @see Worker
 * @generated
 */
public class WorkerWrapper implements Worker, ModelWrapper<Worker> {
    private Worker _worker;

    public WorkerWrapper(Worker worker) {
        _worker = worker;
    }

    @Override
    public Class<?> getModelClass() {
        return Worker.class;
    }

    @Override
    public String getModelClassName() {
        return Worker.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("workerId", getWorkerId());
        attributes.put("name", getName());
        attributes.put("lastname", getLastname());
        attributes.put("patronymic", getPatronymic());
        attributes.put("gender", getGender());
        attributes.put("date_of_birth", getDate_of_birth());
        attributes.put("position", getPosition());
        attributes.put("date_of_employment", getDate_of_employment());
        attributes.put("salary_level", getSalary_level());
        attributes.put("work_number", getWork_number());
        attributes.put("telephone_number", getTelephone_number());
        attributes.put("banking_organization", getBanking_organization());
        attributes.put("archival_status", getArchival_status());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long workerId = (Long) attributes.get("workerId");

        if (workerId != null) {
            setWorkerId(workerId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String lastname = (String) attributes.get("lastname");

        if (lastname != null) {
            setLastname(lastname);
        }

        String patronymic = (String) attributes.get("patronymic");

        if (patronymic != null) {
            setPatronymic(patronymic);
        }

        Boolean gender = (Boolean) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        Date date_of_birth = (Date) attributes.get("date_of_birth");

        if (date_of_birth != null) {
            setDate_of_birth(date_of_birth);
        }

        String position = (String) attributes.get("position");

        if (position != null) {
            setPosition(position);
        }

        Date date_of_employment = (Date) attributes.get("date_of_employment");

        if (date_of_employment != null) {
            setDate_of_employment(date_of_employment);
        }

        Long salary_level = (Long) attributes.get("salary_level");

        if (salary_level != null) {
            setSalary_level(salary_level);
        }

        String work_number = (String) attributes.get("work_number");

        if (work_number != null) {
            setWork_number(work_number);
        }

        String telephone_number = (String) attributes.get("telephone_number");

        if (telephone_number != null) {
            setTelephone_number(telephone_number);
        }

        Long banking_organization = (Long) attributes.get(
                "banking_organization");

        if (banking_organization != null) {
            setBanking_organization(banking_organization);
        }

        Boolean archival_status = (Boolean) attributes.get("archival_status");

        if (archival_status != null) {
            setArchival_status(archival_status);
        }
    }

    /**
    * Returns the primary key of this worker.
    *
    * @return the primary key of this worker
    */
    @Override
    public long getPrimaryKey() {
        return _worker.getPrimaryKey();
    }

    /**
    * Sets the primary key of this worker.
    *
    * @param primaryKey the primary key of this worker
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _worker.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the worker ID of this worker.
    *
    * @return the worker ID of this worker
    */
    @Override
    public long getWorkerId() {
        return _worker.getWorkerId();
    }

    /**
    * Sets the worker ID of this worker.
    *
    * @param workerId the worker ID of this worker
    */
    @Override
    public void setWorkerId(long workerId) {
        _worker.setWorkerId(workerId);
    }

    /**
    * Returns the name of this worker.
    *
    * @return the name of this worker
    */
    @Override
    public java.lang.String getName() {
        return _worker.getName();
    }

    /**
    * Sets the name of this worker.
    *
    * @param name the name of this worker
    */
    @Override
    public void setName(java.lang.String name) {
        _worker.setName(name);
    }

    /**
    * Returns the lastname of this worker.
    *
    * @return the lastname of this worker
    */
    @Override
    public java.lang.String getLastname() {
        return _worker.getLastname();
    }

    /**
    * Sets the lastname of this worker.
    *
    * @param lastname the lastname of this worker
    */
    @Override
    public void setLastname(java.lang.String lastname) {
        _worker.setLastname(lastname);
    }

    /**
    * Returns the patronymic of this worker.
    *
    * @return the patronymic of this worker
    */
    @Override
    public java.lang.String getPatronymic() {
        return _worker.getPatronymic();
    }

    /**
    * Sets the patronymic of this worker.
    *
    * @param patronymic the patronymic of this worker
    */
    @Override
    public void setPatronymic(java.lang.String patronymic) {
        _worker.setPatronymic(patronymic);
    }

    /**
    * Returns the gender of this worker.
    *
    * @return the gender of this worker
    */
    @Override
    public boolean getGender() {
        return _worker.getGender();
    }

    /**
    * Returns <code>true</code> if this worker is gender.
    *
    * @return <code>true</code> if this worker is gender; <code>false</code> otherwise
    */
    @Override
    public boolean isGender() {
        return _worker.isGender();
    }

    /**
    * Sets whether this worker is gender.
    *
    * @param gender the gender of this worker
    */
    @Override
    public void setGender(boolean gender) {
        _worker.setGender(gender);
    }

    /**
    * Returns the date_of_birth of this worker.
    *
    * @return the date_of_birth of this worker
    */
    @Override
    public java.util.Date getDate_of_birth() {
        return _worker.getDate_of_birth();
    }

    /**
    * Sets the date_of_birth of this worker.
    *
    * @param date_of_birth the date_of_birth of this worker
    */
    @Override
    public void setDate_of_birth(java.util.Date date_of_birth) {
        _worker.setDate_of_birth(date_of_birth);
    }

    /**
    * Returns the position of this worker.
    *
    * @return the position of this worker
    */
    @Override
    public java.lang.String getPosition() {
        return _worker.getPosition();
    }

    /**
    * Sets the position of this worker.
    *
    * @param position the position of this worker
    */
    @Override
    public void setPosition(java.lang.String position) {
        _worker.setPosition(position);
    }

    /**
    * Returns the date_of_employment of this worker.
    *
    * @return the date_of_employment of this worker
    */
    @Override
    public java.util.Date getDate_of_employment() {
        return _worker.getDate_of_employment();
    }

    /**
    * Sets the date_of_employment of this worker.
    *
    * @param date_of_employment the date_of_employment of this worker
    */
    @Override
    public void setDate_of_employment(java.util.Date date_of_employment) {
        _worker.setDate_of_employment(date_of_employment);
    }

    /**
    * Returns the salary_level of this worker.
    *
    * @return the salary_level of this worker
    */
    @Override
    public long getSalary_level() {
        return _worker.getSalary_level();
    }

    /**
    * Sets the salary_level of this worker.
    *
    * @param salary_level the salary_level of this worker
    */
    @Override
    public void setSalary_level(long salary_level) {
        _worker.setSalary_level(salary_level);
    }

    /**
    * Returns the work_number of this worker.
    *
    * @return the work_number of this worker
    */
    @Override
    public java.lang.String getWork_number() {
        return _worker.getWork_number();
    }

    /**
    * Sets the work_number of this worker.
    *
    * @param work_number the work_number of this worker
    */
    @Override
    public void setWork_number(java.lang.String work_number) {
        _worker.setWork_number(work_number);
    }

    /**
    * Returns the telephone_number of this worker.
    *
    * @return the telephone_number of this worker
    */
    @Override
    public java.lang.String getTelephone_number() {
        return _worker.getTelephone_number();
    }

    /**
    * Sets the telephone_number of this worker.
    *
    * @param telephone_number the telephone_number of this worker
    */
    @Override
    public void setTelephone_number(java.lang.String telephone_number) {
        _worker.setTelephone_number(telephone_number);
    }

    /**
    * Returns the banking_organization of this worker.
    *
    * @return the banking_organization of this worker
    */
    @Override
    public long getBanking_organization() {
        return _worker.getBanking_organization();
    }

    /**
    * Sets the banking_organization of this worker.
    *
    * @param banking_organization the banking_organization of this worker
    */
    @Override
    public void setBanking_organization(long banking_organization) {
        _worker.setBanking_organization(banking_organization);
    }

    /**
    * Returns the archival_status of this worker.
    *
    * @return the archival_status of this worker
    */
    @Override
    public boolean getArchival_status() {
        return _worker.getArchival_status();
    }

    /**
    * Returns <code>true</code> if this worker is archival_status.
    *
    * @return <code>true</code> if this worker is archival_status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchival_status() {
        return _worker.isArchival_status();
    }

    /**
    * Sets whether this worker is archival_status.
    *
    * @param archival_status the archival_status of this worker
    */
    @Override
    public void setArchival_status(boolean archival_status) {
        _worker.setArchival_status(archival_status);
    }

    @Override
    public boolean isNew() {
        return _worker.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _worker.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _worker.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _worker.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _worker.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _worker.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _worker.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _worker.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _worker.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _worker.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _worker.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new WorkerWrapper((Worker) _worker.clone());
    }

    @Override
    public int compareTo(com.liferay.docs.eventlisting.model.Worker worker) {
        return _worker.compareTo(worker);
    }

    @Override
    public int hashCode() {
        return _worker.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.docs.eventlisting.model.Worker> toCacheModel() {
        return _worker.toCacheModel();
    }

    @Override
    public com.liferay.docs.eventlisting.model.Worker toEscapedModel() {
        return new WorkerWrapper(_worker.toEscapedModel());
    }

    @Override
    public com.liferay.docs.eventlisting.model.Worker toUnescapedModel() {
        return new WorkerWrapper(_worker.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _worker.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _worker.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _worker.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof WorkerWrapper)) {
            return false;
        }

        WorkerWrapper workerWrapper = (WorkerWrapper) obj;

        if (Validator.equals(_worker, workerWrapper._worker)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Worker getWrappedWorker() {
        return _worker;
    }

    @Override
    public Worker getWrappedModel() {
        return _worker;
    }

    @Override
    public void resetOriginalValues() {
        _worker.resetOriginalValues();
    }
}
