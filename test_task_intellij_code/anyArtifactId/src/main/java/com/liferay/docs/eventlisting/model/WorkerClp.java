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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class WorkerClp extends BaseModelImpl<Worker> implements Worker {
    private long _workerId;
    private String _name;
    private String _lastname;
    private String _patronymic;
    private boolean _gender;
    private Date _date_of_birth;
    private String _position;
    private Date _date_of_employment;
    private long _salary_level;
    private String _work_number;
    private String _telephone_number;
    private boolean _archival_status;
    private long _bankId;
    private long _officialPositionId;
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
        attributes.put("gender", getGender());
        attributes.put("date_of_birth", getDate_of_birth());
        attributes.put("position", getPosition());
        attributes.put("date_of_employment", getDate_of_employment());
        attributes.put("salary_level", getSalary_level());
        attributes.put("work_number", getWork_number());
        attributes.put("telephone_number", getTelephone_number());
        attributes.put("archival_status", getArchival_status());
        attributes.put("bankId", getBankId());
        attributes.put("officialPositionId", getOfficialPositionId());

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

        Boolean archival_status = (Boolean) attributes.get("archival_status");

        if (archival_status != null) {
            setArchival_status(archival_status);
        }

        Long bankId = (Long) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        Long officialPositionId = (Long) attributes.get("officialPositionId");

        if (officialPositionId != null) {
            setOfficialPositionId(officialPositionId);
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

    @Override
    public boolean getGender() {
        return _gender;
    }

    @Override
    public boolean isGender() {
        return _gender;
    }

    @Override
    public void setGender(boolean gender) {
        _gender = gender;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setGender", boolean.class);

                method.invoke(_workerRemoteModel, gender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDate_of_birth() {
        return _date_of_birth;
    }

    @Override
    public void setDate_of_birth(Date date_of_birth) {
        _date_of_birth = date_of_birth;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_birth", Date.class);

                method.invoke(_workerRemoteModel, date_of_birth);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPosition() {
        return _position;
    }

    @Override
    public void setPosition(String position) {
        _position = position;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition", String.class);

                method.invoke(_workerRemoteModel, position);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDate_of_employment() {
        return _date_of_employment;
    }

    @Override
    public void setDate_of_employment(Date date_of_employment) {
        _date_of_employment = date_of_employment;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_employment",
                        Date.class);

                method.invoke(_workerRemoteModel, date_of_employment);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSalary_level() {
        return _salary_level;
    }

    @Override
    public void setSalary_level(long salary_level) {
        _salary_level = salary_level;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary_level", long.class);

                method.invoke(_workerRemoteModel, salary_level);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getWork_number() {
        return _work_number;
    }

    @Override
    public void setWork_number(String work_number) {
        _work_number = work_number;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setWork_number", String.class);

                method.invoke(_workerRemoteModel, work_number);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTelephone_number() {
        return _telephone_number;
    }

    @Override
    public void setTelephone_number(String telephone_number) {
        _telephone_number = telephone_number;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setTelephone_number",
                        String.class);

                method.invoke(_workerRemoteModel, telephone_number);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchival_status() {
        return _archival_status;
    }

    @Override
    public boolean isArchival_status() {
        return _archival_status;
    }

    @Override
    public void setArchival_status(boolean archival_status) {
        _archival_status = archival_status;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setArchival_status",
                        boolean.class);

                method.invoke(_workerRemoteModel, archival_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBankId() {
        return _bankId;
    }

    @Override
    public void setBankId(long bankId) {
        _bankId = bankId;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setBankId", long.class);

                method.invoke(_workerRemoteModel, bankId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getOfficialPositionId() {
        return _officialPositionId;
    }

    @Override
    public void setOfficialPositionId(long officialPositionId) {
        _officialPositionId = officialPositionId;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setOfficialPositionId",
                        long.class);

                method.invoke(_workerRemoteModel, officialPositionId);
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
        clone.setGender(getGender());
        clone.setDate_of_birth(getDate_of_birth());
        clone.setPosition(getPosition());
        clone.setDate_of_employment(getDate_of_employment());
        clone.setSalary_level(getSalary_level());
        clone.setWork_number(getWork_number());
        clone.setTelephone_number(getTelephone_number());
        clone.setArchival_status(getArchival_status());
        clone.setBankId(getBankId());
        clone.setOfficialPositionId(getOfficialPositionId());

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
        StringBundler sb = new StringBundler(29);

        sb.append("{workerId=");
        sb.append(getWorkerId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", lastname=");
        sb.append(getLastname());
        sb.append(", patronymic=");
        sb.append(getPatronymic());
        sb.append(", gender=");
        sb.append(getGender());
        sb.append(", date_of_birth=");
        sb.append(getDate_of_birth());
        sb.append(", position=");
        sb.append(getPosition());
        sb.append(", date_of_employment=");
        sb.append(getDate_of_employment());
        sb.append(", salary_level=");
        sb.append(getSalary_level());
        sb.append(", work_number=");
        sb.append(getWork_number());
        sb.append(", telephone_number=");
        sb.append(getTelephone_number());
        sb.append(", archival_status=");
        sb.append(getArchival_status());
        sb.append(", bankId=");
        sb.append(getBankId());
        sb.append(", officialPositionId=");
        sb.append(getOfficialPositionId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

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
        sb.append(
            "<column><column-name>gender</column-name><column-value><![CDATA[");
        sb.append(getGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_birth</column-name><column-value><![CDATA[");
        sb.append(getDate_of_birth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>position</column-name><column-value><![CDATA[");
        sb.append(getPosition());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_employment</column-name><column-value><![CDATA[");
        sb.append(getDate_of_employment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary_level</column-name><column-value><![CDATA[");
        sb.append(getSalary_level());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>work_number</column-name><column-value><![CDATA[");
        sb.append(getWork_number());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>telephone_number</column-name><column-value><![CDATA[");
        sb.append(getTelephone_number());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archival_status</column-name><column-value><![CDATA[");
        sb.append(getArchival_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankId</column-name><column-value><![CDATA[");
        sb.append(getBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>officialPositionId</column-name><column-value><![CDATA[");
        sb.append(getOfficialPositionId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
