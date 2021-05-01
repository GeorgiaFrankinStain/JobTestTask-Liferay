package com.liferay.docs.eventlisting.model;

import com.liferay.docs.eventlisting.service.ClpSerializer;
import com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class OfficialPositionClp extends BaseModelImpl<OfficialPosition>
    implements OfficialPosition {
    private long _officialPositionId;
    private String _name;
    private boolean _is_archived;
    private BaseModel<?> _officialPositionRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.docs.eventlisting.service.ClpSerializer.class;

    public OfficialPositionClp() {
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
    public long getPrimaryKey() {
        return _officialPositionId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setOfficialPositionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _officialPositionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getOfficialPositionId() {
        return _officialPositionId;
    }

    @Override
    public void setOfficialPositionId(long officialPositionId) {
        _officialPositionId = officialPositionId;

        if (_officialPositionRemoteModel != null) {
            try {
                Class<?> clazz = _officialPositionRemoteModel.getClass();

                Method method = clazz.getMethod("setOfficialPositionId",
                        long.class);

                method.invoke(_officialPositionRemoteModel, officialPositionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_officialPositionRemoteModel != null) {
            try {
                Class<?> clazz = _officialPositionRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_officialPositionRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getIs_archived() {
        return _is_archived;
    }

    @Override
    public boolean isIs_archived() {
        return _is_archived;
    }

    @Override
    public void setIs_archived(boolean is_archived) {
        _is_archived = is_archived;

        if (_officialPositionRemoteModel != null) {
            try {
                Class<?> clazz = _officialPositionRemoteModel.getClass();

                Method method = clazz.getMethod("setIs_archived", boolean.class);

                method.invoke(_officialPositionRemoteModel, is_archived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getOfficialPositionRemoteModel() {
        return _officialPositionRemoteModel;
    }

    public void setOfficialPositionRemoteModel(
        BaseModel<?> officialPositionRemoteModel) {
        _officialPositionRemoteModel = officialPositionRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _officialPositionRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_officialPositionRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            OfficialPositionLocalServiceUtil.addOfficialPosition(this);
        } else {
            OfficialPositionLocalServiceUtil.updateOfficialPosition(this);
        }
    }

    @Override
    public OfficialPosition toEscapedModel() {
        return (OfficialPosition) ProxyUtil.newProxyInstance(OfficialPosition.class.getClassLoader(),
            new Class[] { OfficialPosition.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        OfficialPositionClp clone = new OfficialPositionClp();

        clone.setOfficialPositionId(getOfficialPositionId());
        clone.setName(getName());
        clone.setIs_archived(getIs_archived());

        return clone;
    }

    @Override
    public int compareTo(OfficialPosition officialPosition) {
        long primaryKey = officialPosition.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof OfficialPositionClp)) {
            return false;
        }

        OfficialPositionClp officialPosition = (OfficialPositionClp) obj;

        long primaryKey = officialPosition.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{officialPositionId=");
        sb.append(getOfficialPositionId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", is_archived=");
        sb.append(getIs_archived());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.liferay.docs.eventlisting.model.OfficialPosition");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>officialPositionId</column-name><column-value><![CDATA[");
        sb.append(getOfficialPositionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>is_archived</column-name><column-value><![CDATA[");
        sb.append(getIs_archived());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
