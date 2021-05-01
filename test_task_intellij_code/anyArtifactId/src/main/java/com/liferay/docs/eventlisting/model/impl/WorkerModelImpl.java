package com.liferay.docs.eventlisting.model.impl;

import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.model.WorkerModel;

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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Worker service. Represents a row in the &quot;Event_Worker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.docs.eventlisting.model.WorkerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkerImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see WorkerImpl
 * @see com.liferay.docs.eventlisting.model.Worker
 * @see com.liferay.docs.eventlisting.model.WorkerModel
 * @generated
 */
public class WorkerModelImpl extends BaseModelImpl<Worker>
    implements WorkerModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a worker model instance should use the {@link com.liferay.docs.eventlisting.model.Worker} interface instead.
     */
    public static final String TABLE_NAME = "Event_Worker";
    public static final Object[][] TABLE_COLUMNS = {
            { "workerId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "lastname", Types.VARCHAR },
            { "patronymic", Types.VARCHAR },
            { "gender", Types.BOOLEAN },
            { "date_of_birth", Types.TIMESTAMP },
            { "position", Types.VARCHAR },
            { "date_of_employment", Types.TIMESTAMP },
            { "salary_level", Types.BIGINT },
            { "work_number", Types.VARCHAR },
            { "telephone_number", Types.VARCHAR },
            { "archival_status", Types.BOOLEAN },
            { "bankId", Types.BIGINT },
            { "officialPositionId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table Event_Worker (workerId LONG not null primary key,name VARCHAR(75) null,lastname VARCHAR(75) null,patronymic VARCHAR(75) null,gender BOOLEAN,date_of_birth DATE null,position VARCHAR(75) null,date_of_employment DATE null,salary_level LONG,work_number VARCHAR(75) null,telephone_number VARCHAR(75) null,archival_status BOOLEAN,bankId LONG,officialPositionId LONG)";
    public static final String TABLE_SQL_DROP = "drop table Event_Worker";
    public static final String ORDER_BY_JPQL = " ORDER BY worker.workerId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Event_Worker.workerId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.liferay.docs.eventlisting.model.Worker"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.liferay.docs.eventlisting.model.Worker"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.liferay.docs.eventlisting.model.Worker"),
            true);
    public static long BANKID_COLUMN_BITMASK = 1L;
    public static long OFFICIALPOSITIONID_COLUMN_BITMASK = 2L;
    public static long WORKERID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.liferay.docs.eventlisting.model.Worker"));
    private static ClassLoader _classLoader = Worker.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Worker.class };
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
    private long _originalBankId;
    private boolean _setOriginalBankId;
    private long _officialPositionId;
    private long _originalOfficialPositionId;
    private boolean _setOriginalOfficialPositionId;
    private long _columnBitmask;
    private Worker _escapedModel;

    public WorkerModelImpl() {
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
    public String getLastname() {
        if (_lastname == null) {
            return StringPool.BLANK;
        } else {
            return _lastname;
        }
    }

    @Override
    public void setLastname(String lastname) {
        _lastname = lastname;
    }

    @Override
    public String getPatronymic() {
        if (_patronymic == null) {
            return StringPool.BLANK;
        } else {
            return _patronymic;
        }
    }

    @Override
    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;
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
    }

    @Override
    public Date getDate_of_birth() {
        return _date_of_birth;
    }

    @Override
    public void setDate_of_birth(Date date_of_birth) {
        _date_of_birth = date_of_birth;
    }

    @Override
    public String getPosition() {
        if (_position == null) {
            return StringPool.BLANK;
        } else {
            return _position;
        }
    }

    @Override
    public void setPosition(String position) {
        _position = position;
    }

    @Override
    public Date getDate_of_employment() {
        return _date_of_employment;
    }

    @Override
    public void setDate_of_employment(Date date_of_employment) {
        _date_of_employment = date_of_employment;
    }

    @Override
    public long getSalary_level() {
        return _salary_level;
    }

    @Override
    public void setSalary_level(long salary_level) {
        _salary_level = salary_level;
    }

    @Override
    public String getWork_number() {
        if (_work_number == null) {
            return StringPool.BLANK;
        } else {
            return _work_number;
        }
    }

    @Override
    public void setWork_number(String work_number) {
        _work_number = work_number;
    }

    @Override
    public String getTelephone_number() {
        if (_telephone_number == null) {
            return StringPool.BLANK;
        } else {
            return _telephone_number;
        }
    }

    @Override
    public void setTelephone_number(String telephone_number) {
        _telephone_number = telephone_number;
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
    }

    @Override
    public long getBankId() {
        return _bankId;
    }

    @Override
    public void setBankId(long bankId) {
        _columnBitmask |= BANKID_COLUMN_BITMASK;

        if (!_setOriginalBankId) {
            _setOriginalBankId = true;

            _originalBankId = _bankId;
        }

        _bankId = bankId;
    }

    public long getOriginalBankId() {
        return _originalBankId;
    }

    @Override
    public long getOfficialPositionId() {
        return _officialPositionId;
    }

    @Override
    public void setOfficialPositionId(long officialPositionId) {
        _columnBitmask |= OFFICIALPOSITIONID_COLUMN_BITMASK;

        if (!_setOriginalOfficialPositionId) {
            _setOriginalOfficialPositionId = true;

            _originalOfficialPositionId = _officialPositionId;
        }

        _officialPositionId = officialPositionId;
    }

    public long getOriginalOfficialPositionId() {
        return _originalOfficialPositionId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Worker.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Worker toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Worker) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        WorkerImpl workerImpl = new WorkerImpl();

        workerImpl.setWorkerId(getWorkerId());
        workerImpl.setName(getName());
        workerImpl.setLastname(getLastname());
        workerImpl.setPatronymic(getPatronymic());
        workerImpl.setGender(getGender());
        workerImpl.setDate_of_birth(getDate_of_birth());
        workerImpl.setPosition(getPosition());
        workerImpl.setDate_of_employment(getDate_of_employment());
        workerImpl.setSalary_level(getSalary_level());
        workerImpl.setWork_number(getWork_number());
        workerImpl.setTelephone_number(getTelephone_number());
        workerImpl.setArchival_status(getArchival_status());
        workerImpl.setBankId(getBankId());
        workerImpl.setOfficialPositionId(getOfficialPositionId());

        workerImpl.resetOriginalValues();

        return workerImpl;
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

        if (!(obj instanceof Worker)) {
            return false;
        }

        Worker worker = (Worker) obj;

        long primaryKey = worker.getPrimaryKey();

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
        WorkerModelImpl workerModelImpl = this;

        workerModelImpl._originalBankId = workerModelImpl._bankId;

        workerModelImpl._setOriginalBankId = false;

        workerModelImpl._originalOfficialPositionId = workerModelImpl._officialPositionId;

        workerModelImpl._setOriginalOfficialPositionId = false;

        workerModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Worker> toCacheModel() {
        WorkerCacheModel workerCacheModel = new WorkerCacheModel();

        workerCacheModel.workerId = getWorkerId();

        workerCacheModel.name = getName();

        String name = workerCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            workerCacheModel.name = null;
        }

        workerCacheModel.lastname = getLastname();

        String lastname = workerCacheModel.lastname;

        if ((lastname != null) && (lastname.length() == 0)) {
            workerCacheModel.lastname = null;
        }

        workerCacheModel.patronymic = getPatronymic();

        String patronymic = workerCacheModel.patronymic;

        if ((patronymic != null) && (patronymic.length() == 0)) {
            workerCacheModel.patronymic = null;
        }

        workerCacheModel.gender = getGender();

        Date date_of_birth = getDate_of_birth();

        if (date_of_birth != null) {
            workerCacheModel.date_of_birth = date_of_birth.getTime();
        } else {
            workerCacheModel.date_of_birth = Long.MIN_VALUE;
        }

        workerCacheModel.position = getPosition();

        String position = workerCacheModel.position;

        if ((position != null) && (position.length() == 0)) {
            workerCacheModel.position = null;
        }

        Date date_of_employment = getDate_of_employment();

        if (date_of_employment != null) {
            workerCacheModel.date_of_employment = date_of_employment.getTime();
        } else {
            workerCacheModel.date_of_employment = Long.MIN_VALUE;
        }

        workerCacheModel.salary_level = getSalary_level();

        workerCacheModel.work_number = getWork_number();

        String work_number = workerCacheModel.work_number;

        if ((work_number != null) && (work_number.length() == 0)) {
            workerCacheModel.work_number = null;
        }

        workerCacheModel.telephone_number = getTelephone_number();

        String telephone_number = workerCacheModel.telephone_number;

        if ((telephone_number != null) && (telephone_number.length() == 0)) {
            workerCacheModel.telephone_number = null;
        }

        workerCacheModel.archival_status = getArchival_status();

        workerCacheModel.bankId = getBankId();

        workerCacheModel.officialPositionId = getOfficialPositionId();

        return workerCacheModel;
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
