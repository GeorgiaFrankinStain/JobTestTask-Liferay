package com.liferay.docs.eventlisting.model;

import com.liferay.docs.eventlisting.service.BankLocalServiceUtil;
import com.liferay.docs.eventlisting.service.ClpSerializer;

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


public class BankClp extends BaseModelImpl<Bank> implements Bank {
    private long _bankId;
    private String _name;
    private String _bic;
    private String _address;
    private BaseModel<?> _bankRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.docs.eventlisting.service.ClpSerializer.class;

    public BankClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Bank.class;
    }

    @Override
    public String getModelClassName() {
        return Bank.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _bankId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBankId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bankId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bankId", getBankId());
        attributes.put("name", getName());
        attributes.put("bic", getBic());
        attributes.put("address", getAddress());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bankId = (Long) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String bic = (String) attributes.get("bic");

        if (bic != null) {
            setBic(bic);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }
    }

    @Override
    public long getBankId() {
        return _bankId;
    }

    @Override
    public void setBankId(long bankId) {
        _bankId = bankId;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setBankId", long.class);

                method.invoke(_bankRemoteModel, bankId);
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

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_bankRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBic() {
        return _bic;
    }

    @Override
    public void setBic(String bic) {
        _bic = bic;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setBic", String.class);

                method.invoke(_bankRemoteModel, bic);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAddress() {
        return _address;
    }

    @Override
    public void setAddress(String address) {
        _address = address;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_bankRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBankRemoteModel() {
        return _bankRemoteModel;
    }

    public void setBankRemoteModel(BaseModel<?> bankRemoteModel) {
        _bankRemoteModel = bankRemoteModel;
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

        Class<?> remoteModelClass = _bankRemoteModel.getClass();

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

        Object returnValue = method.invoke(_bankRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BankLocalServiceUtil.addBank(this);
        } else {
            BankLocalServiceUtil.updateBank(this);
        }
    }

    @Override
    public Bank toEscapedModel() {
        return (Bank) ProxyUtil.newProxyInstance(Bank.class.getClassLoader(),
            new Class[] { Bank.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BankClp clone = new BankClp();

        clone.setBankId(getBankId());
        clone.setName(getName());
        clone.setBic(getBic());
        clone.setAddress(getAddress());

        return clone;
    }

    @Override
    public int compareTo(Bank bank) {
        long primaryKey = bank.getPrimaryKey();

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

        if (!(obj instanceof BankClp)) {
            return false;
        }

        BankClp bank = (BankClp) obj;

        long primaryKey = bank.getPrimaryKey();

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

        sb.append("{bankId=");
        sb.append(getBankId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", bic=");
        sb.append(getBic());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.liferay.docs.eventlisting.model.Bank");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bankId</column-name><column-value><![CDATA[");
        sb.append(getBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bic</column-name><column-value><![CDATA[");
        sb.append(getBic());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
