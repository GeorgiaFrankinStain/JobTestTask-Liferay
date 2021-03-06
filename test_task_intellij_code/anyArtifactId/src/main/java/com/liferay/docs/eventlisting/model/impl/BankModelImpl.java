package com.liferay.docs.eventlisting.model.impl;

import com.liferay.docs.eventlisting.model.Bank;
import com.liferay.docs.eventlisting.model.BankModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Bank service. Represents a row in the &quot;Event_Bank&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.docs.eventlisting.model.BankModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BankImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see BankImpl
 * @see com.liferay.docs.eventlisting.model.Bank
 * @see com.liferay.docs.eventlisting.model.BankModel
 * @generated
 */
public class BankModelImpl extends BaseModelImpl<Bank> implements BankModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a bank model instance should use the {@link com.liferay.docs.eventlisting.model.Bank} interface instead.
     */
    public static final String TABLE_NAME = "Event_Bank";
    public static final Object[][] TABLE_COLUMNS = {
            { "bankId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "bic", Types.VARCHAR },
            { "address", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Event_Bank (bankId LONG not null primary key,name VARCHAR(75) null,bic VARCHAR(75) null,address VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table Event_Bank";
    public static final String ORDER_BY_JPQL = " ORDER BY bank.bankId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Event_Bank.bankId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.liferay.docs.eventlisting.model.Bank"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.liferay.docs.eventlisting.model.Bank"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.liferay.docs.eventlisting.model.Bank"));
    private static ClassLoader _classLoader = Bank.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Bank.class };
    private long _bankId;
    private String _name;
    private String _bic;
    private String _address;
    private Bank _escapedModel;

    public BankModelImpl() {
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
    public Class<?> getModelClass() {
        return Bank.class;
    }

    @Override
    public String getModelClassName() {
        return Bank.class.getName();
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
    }

    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public String getBic() {
        if (_bic == null) {
            return StringPool.BLANK;
        } else {
            return _bic;
        }
    }

    @Override
    public void setBic(String bic) {
        _bic = bic;
    }

    @Override
    public String getAddress() {
        if (_address == null) {
            return StringPool.BLANK;
        } else {
            return _address;
        }
    }

    @Override
    public void setAddress(String address) {
        _address = address;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Bank.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Bank toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Bank) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        BankImpl bankImpl = new BankImpl();

        bankImpl.setBankId(getBankId());
        bankImpl.setName(getName());
        bankImpl.setBic(getBic());
        bankImpl.setAddress(getAddress());

        bankImpl.resetOriginalValues();

        return bankImpl;
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

        if (!(obj instanceof Bank)) {
            return false;
        }

        Bank bank = (Bank) obj;

        long primaryKey = bank.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Bank> toCacheModel() {
        BankCacheModel bankCacheModel = new BankCacheModel();

        bankCacheModel.bankId = getBankId();

        bankCacheModel.name = getName();

        String name = bankCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            bankCacheModel.name = null;
        }

        bankCacheModel.bic = getBic();

        String bic = bankCacheModel.bic;

        if ((bic != null) && (bic.length() == 0)) {
            bankCacheModel.bic = null;
        }

        bankCacheModel.address = getAddress();

        String address = bankCacheModel.address;

        if ((address != null) && (address.length() == 0)) {
            bankCacheModel.address = null;
        }

        return bankCacheModel;
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
