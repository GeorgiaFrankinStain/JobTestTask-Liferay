package com.liferay.docs.eventlisting.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Worker service. Represents a row in the &quot;Event_Worker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.eventlisting.model.impl.WorkerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.eventlisting.model.impl.WorkerImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see Worker
 * @see com.liferay.docs.eventlisting.model.impl.WorkerImpl
 * @see com.liferay.docs.eventlisting.model.impl.WorkerModelImpl
 * @generated
 */
public interface WorkerModel extends BaseModel<Worker> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a worker model instance should use the {@link Worker} interface instead.
     */

    /**
     * Returns the primary key of this worker.
     *
     * @return the primary key of this worker
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this worker.
     *
     * @param primaryKey the primary key of this worker
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the worker ID of this worker.
     *
     * @return the worker ID of this worker
     */
    public long getWorkerId();

    /**
     * Sets the worker ID of this worker.
     *
     * @param workerId the worker ID of this worker
     */
    public void setWorkerId(long workerId);

    /**
     * Returns the name of this worker.
     *
     * @return the name of this worker
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this worker.
     *
     * @param name the name of this worker
     */
    public void setName(String name);

    /**
     * Returns the lastname of this worker.
     *
     * @return the lastname of this worker
     */
    @AutoEscape
    public String getLastname();

    /**
     * Sets the lastname of this worker.
     *
     * @param lastname the lastname of this worker
     */
    public void setLastname(String lastname);

    /**
     * Returns the patronymic of this worker.
     *
     * @return the patronymic of this worker
     */
    @AutoEscape
    public String getPatronymic();

    /**
     * Sets the patronymic of this worker.
     *
     * @param patronymic the patronymic of this worker
     */
    public void setPatronymic(String patronymic);

    /**
     * Returns the gender of this worker.
     *
     * @return the gender of this worker
     */
    public boolean getGender();

    /**
     * Returns <code>true</code> if this worker is gender.
     *
     * @return <code>true</code> if this worker is gender; <code>false</code> otherwise
     */
    public boolean isGender();

    /**
     * Sets whether this worker is gender.
     *
     * @param gender the gender of this worker
     */
    public void setGender(boolean gender);

    /**
     * Returns the date_of_birth of this worker.
     *
     * @return the date_of_birth of this worker
     */
    public Date getDate_of_birth();

    /**
     * Sets the date_of_birth of this worker.
     *
     * @param date_of_birth the date_of_birth of this worker
     */
    public void setDate_of_birth(Date date_of_birth);

    /**
     * Returns the position of this worker.
     *
     * @return the position of this worker
     */
    @AutoEscape
    public String getPosition();

    /**
     * Sets the position of this worker.
     *
     * @param position the position of this worker
     */
    public void setPosition(String position);

    /**
     * Returns the date_of_employment of this worker.
     *
     * @return the date_of_employment of this worker
     */
    public Date getDate_of_employment();

    /**
     * Sets the date_of_employment of this worker.
     *
     * @param date_of_employment the date_of_employment of this worker
     */
    public void setDate_of_employment(Date date_of_employment);

    /**
     * Returns the salary_level of this worker.
     *
     * @return the salary_level of this worker
     */
    public long getSalary_level();

    /**
     * Sets the salary_level of this worker.
     *
     * @param salary_level the salary_level of this worker
     */
    public void setSalary_level(long salary_level);

    /**
     * Returns the work_number of this worker.
     *
     * @return the work_number of this worker
     */
    @AutoEscape
    public String getWork_number();

    /**
     * Sets the work_number of this worker.
     *
     * @param work_number the work_number of this worker
     */
    public void setWork_number(String work_number);

    /**
     * Returns the telephone_number of this worker.
     *
     * @return the telephone_number of this worker
     */
    @AutoEscape
    public String getTelephone_number();

    /**
     * Sets the telephone_number of this worker.
     *
     * @param telephone_number the telephone_number of this worker
     */
    public void setTelephone_number(String telephone_number);

    /**
     * Returns the banking_organization of this worker.
     *
     * @return the banking_organization of this worker
     */
    public long getBanking_organization();

    /**
     * Sets the banking_organization of this worker.
     *
     * @param banking_organization the banking_organization of this worker
     */
    public void setBanking_organization(long banking_organization);

    /**
     * Returns the archival_status of this worker.
     *
     * @return the archival_status of this worker
     */
    public boolean getArchival_status();

    /**
     * Returns <code>true</code> if this worker is archival_status.
     *
     * @return <code>true</code> if this worker is archival_status; <code>false</code> otherwise
     */
    public boolean isArchival_status();

    /**
     * Sets whether this worker is archival_status.
     *
     * @param archival_status the archival_status of this worker
     */
    public void setArchival_status(boolean archival_status);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.liferay.docs.eventlisting.model.Worker worker);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.docs.eventlisting.model.Worker> toCacheModel();

    @Override
    public com.liferay.docs.eventlisting.model.Worker toEscapedModel();

    @Override
    public com.liferay.docs.eventlisting.model.Worker toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
