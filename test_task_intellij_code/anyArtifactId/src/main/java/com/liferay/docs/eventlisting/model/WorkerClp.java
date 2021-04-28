package com.liferay.docs.eventlisting.model;

import com.liferay.docs.eventlisting.service.ClpSerializer;
import com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil;

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


public class WorkerClp extends BaseModelImpl<Worker> implements Worker {
    private long _workerId;
    private String _name;
    private String _lastname;
    private String _patronymic;
    private BaseModel<?> _workerRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.docs.eventlisting.service.ClpSerializer.class;

    public WorkerClp() {
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
    public long getPrimaryKey() {
        return _workerId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setWorkerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _workerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getWorkerId() {
        return _workerId;
    }

    @Override
    public void setWorkerId(long workerId) {
        _workerId = workerId;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setWorkerId", long.class);

                method.invoke(_workerRemoteModel, workerId);
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

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_workerRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastname() {
        return _lastname;
    }

    @Override
    public void setLastname(String lastname) {
        _lastname = lastname;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setLastname", String.class);

                method.invoke(_workerRemoteModel, lastname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPatronymic() {
        return _patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setPatronymic", String.class);

                method.invoke(_workerRemoteModel, patronymic);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getWorkerRemoteModel() {
        return _workerRemoteModel;
    }

    public void setWorkerRemoteModel(BaseModel<?> workerRemoteModel) {
        _workerRemoteModel = workerRemoteModel;
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

        Class<?> remoteModelClass = _workerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_workerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            WorkerLocalServiceUtil.addWorker(this);
        } else {
            WorkerLocalServiceUtil.updateWorker(this);
        }
    }

    @Override
    public Worker toEscapedModel() {
        return (Worker) ProxyUtil.newProxyInstance(Worker.class.getClassLoader(),
            new Class[] { Worker.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        WorkerClp clone = new WorkerClp();

        clone.setWorkerId(getWorkerId());
        clone.setName(getName());
        clone.setLastname(getLastname());
        clone.setPatronymic(getPatronymic());

        return clone;
    }

    @Override
    public int compareTo(Worker worker) {
        long primaryKey = worker.getPrimaryKey();

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

        if (!(obj instanceof WorkerClp)) {
            return false;
        }

        WorkerClp worker = (WorkerClp) obj;

        long primaryKey = worker.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{workerId=");
        sb.append(getWorkerId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", lastname=");
        sb.append(getLastname());
        sb.append(", patronymic=");
        sb.append(getPatronymic());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.liferay.docs.eventlisting.model.Worker");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>workerId</column-name><column-value><![CDATA[");
        sb.append(getWorkerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastname</column-name><column-value><![CDATA[");
        sb.append(getLastname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>patronymic</column-name><column-value><![CDATA[");
        sb.append(getPatronymic());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
