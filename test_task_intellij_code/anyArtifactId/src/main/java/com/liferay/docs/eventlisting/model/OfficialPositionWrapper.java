package com.liferay.docs.eventlisting.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OfficialPosition}.
 * </p>
 *
 * @author Joe Bloggs
 * @see OfficialPosition
 * @generated
 */
public class OfficialPositionWrapper implements OfficialPosition,
    ModelWrapper<OfficialPosition> {
    private OfficialPosition _officialPosition;

    public OfficialPositionWrapper(OfficialPosition officialPosition) {
        _officialPosition = officialPosition;
    }

    @Override
    public Class<?> getModelClass() {
        return OfficialPosition.class;
    }

    @Override
    public String getModelClassName() {
        return OfficialPosition.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("officialPositionId", getOfficialPositionId());
        attributes.put("name", getName());
        attributes.put("is_archived", getIs_archived());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long officialPositionId = (Long) attributes.get("officialPositionId");

        if (officialPositionId != null) {
            setOfficialPositionId(officialPositionId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Boolean is_archived = (Boolean) attributes.get("is_archived");

        if (is_archived != null) {
            setIs_archived(is_archived);
        }
    }

    /**
    * Returns the primary key of this official position.
    *
    * @return the primary key of this official position
    */
    @Override
    public long getPrimaryKey() {
        return _officialPosition.getPrimaryKey();
    }

    /**
    * Sets the primary key of this official position.
    *
    * @param primaryKey the primary key of this official position
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _officialPosition.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the official position ID of this official position.
    *
    * @return the official position ID of this official position
    */
    @Override
    public long getOfficialPositionId() {
        return _officialPosition.getOfficialPositionId();
    }

    /**
    * Sets the official position ID of this official position.
    *
    * @param officialPositionId the official position ID of this official position
    */
    @Override
    public void setOfficialPositionId(long officialPositionId) {
        _officialPosition.setOfficialPositionId(officialPositionId);
    }

    /**
    * Returns the name of this official position.
    *
    * @return the name of this official position
    */
    @Override
    public java.lang.String getName() {
        return _officialPosition.getName();
    }

    /**
    * Sets the name of this official position.
    *
    * @param name the name of this official position
    */
    @Override
    public void setName(java.lang.String name) {
        _officialPosition.setName(name);
    }

    /**
    * Returns the is_archived of this official position.
    *
    * @return the is_archived of this official position
    */
    @Override
    public boolean getIs_archived() {
        return _officialPosition.getIs_archived();
    }

    /**
    * Returns <code>true</code> if this official position is is_archived.
    *
    * @return <code>true</code> if this official position is is_archived; <code>false</code> otherwise
    */
    @Override
    public boolean isIs_archived() {
        return _officialPosition.isIs_archived();
    }

    /**
    * Sets whether this official position is is_archived.
    *
    * @param is_archived the is_archived of this official position
    */
    @Override
    public void setIs_archived(boolean is_archived) {
        _officialPosition.setIs_archived(is_archived);
    }

    @Override
    public boolean isNew() {
        return _officialPosition.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _officialPosition.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _officialPosition.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _officialPosition.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _officialPosition.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _officialPosition.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _officialPosition.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _officialPosition.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _officialPosition.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _officialPosition.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _officialPosition.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new OfficialPositionWrapper((OfficialPosition) _officialPosition.clone());
    }

    @Override
    public int compareTo(
        com.liferay.docs.eventlisting.model.OfficialPosition officialPosition) {
        return _officialPosition.compareTo(officialPosition);
    }

    @Override
    public int hashCode() {
        return _officialPosition.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.docs.eventlisting.model.OfficialPosition> toCacheModel() {
        return _officialPosition.toCacheModel();
    }

    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition toEscapedModel() {
        return new OfficialPositionWrapper(_officialPosition.toEscapedModel());
    }

    @Override
    public com.liferay.docs.eventlisting.model.OfficialPosition toUnescapedModel() {
        return new OfficialPositionWrapper(_officialPosition.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _officialPosition.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _officialPosition.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _officialPosition.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof OfficialPositionWrapper)) {
            return false;
        }

        OfficialPositionWrapper officialPositionWrapper = (OfficialPositionWrapper) obj;

        if (Validator.equals(_officialPosition,
                    officialPositionWrapper._officialPosition)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public OfficialPosition getWrappedOfficialPosition() {
        return _officialPosition;
    }

    @Override
    public OfficialPosition getWrappedModel() {
        return _officialPosition;
    }

    @Override
    public void resetOriginalValues() {
        _officialPosition.resetOriginalValues();
    }
}
