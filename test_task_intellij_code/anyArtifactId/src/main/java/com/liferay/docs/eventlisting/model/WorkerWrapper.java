package com.liferay.docs.eventlisting.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

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
