package com.liferay.docs.eventlisting.model.impl;

import com.liferay.docs.eventlisting.model.Worker;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Worker in entity cache.
 *
 * @author Joe Bloggs
 * @see Worker
 * @generated
 */
public class WorkerCacheModel implements CacheModel<Worker>, Externalizable {
    public long workerId;
    public String name;
    public String lastname;
    public String patronymic;
    public boolean gender;
    public long date_of_birth;
    public String position;
    public long date_of_employment;
    public long salary_level;
    public String work_number;
    public String telephone_number;
    public boolean archival_status;
    public long bankId;
    public long officialPositionId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{workerId=");
        sb.append(workerId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", lastname=");
        sb.append(lastname);
        sb.append(", patronymic=");
        sb.append(patronymic);
        sb.append(", gender=");
        sb.append(gender);
        sb.append(", date_of_birth=");
        sb.append(date_of_birth);
        sb.append(", position=");
        sb.append(position);
        sb.append(", date_of_employment=");
        sb.append(date_of_employment);
        sb.append(", salary_level=");
        sb.append(salary_level);
        sb.append(", work_number=");
        sb.append(work_number);
        sb.append(", telephone_number=");
        sb.append(telephone_number);
        sb.append(", archival_status=");
        sb.append(archival_status);
        sb.append(", bankId=");
        sb.append(bankId);
        sb.append(", officialPositionId=");
        sb.append(officialPositionId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Worker toEntityModel() {
        WorkerImpl workerImpl = new WorkerImpl();

        workerImpl.setWorkerId(workerId);

        if (name == null) {
            workerImpl.setName(StringPool.BLANK);
        } else {
            workerImpl.setName(name);
        }

        if (lastname == null) {
            workerImpl.setLastname(StringPool.BLANK);
        } else {
            workerImpl.setLastname(lastname);
        }

        if (patronymic == null) {
            workerImpl.setPatronymic(StringPool.BLANK);
        } else {
            workerImpl.setPatronymic(patronymic);
        }

        workerImpl.setGender(gender);

        if (date_of_birth == Long.MIN_VALUE) {
            workerImpl.setDate_of_birth(null);
        } else {
            workerImpl.setDate_of_birth(new Date(date_of_birth));
        }

        if (position == null) {
            workerImpl.setPosition(StringPool.BLANK);
        } else {
            workerImpl.setPosition(position);
        }

        if (date_of_employment == Long.MIN_VALUE) {
            workerImpl.setDate_of_employment(null);
        } else {
            workerImpl.setDate_of_employment(new Date(date_of_employment));
        }

        workerImpl.setSalary_level(salary_level);

        if (work_number == null) {
            workerImpl.setWork_number(StringPool.BLANK);
        } else {
            workerImpl.setWork_number(work_number);
        }

        if (telephone_number == null) {
            workerImpl.setTelephone_number(StringPool.BLANK);
        } else {
            workerImpl.setTelephone_number(telephone_number);
        }

        workerImpl.setArchival_status(archival_status);
        workerImpl.setBankId(bankId);
        workerImpl.setOfficialPositionId(officialPositionId);

        workerImpl.resetOriginalValues();

        return workerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        workerId = objectInput.readLong();
        name = objectInput.readUTF();
        lastname = objectInput.readUTF();
        patronymic = objectInput.readUTF();
        gender = objectInput.readBoolean();
        date_of_birth = objectInput.readLong();
        position = objectInput.readUTF();
        date_of_employment = objectInput.readLong();
        salary_level = objectInput.readLong();
        work_number = objectInput.readUTF();
        telephone_number = objectInput.readUTF();
        archival_status = objectInput.readBoolean();
        bankId = objectInput.readLong();
        officialPositionId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(workerId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (lastname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastname);
        }

        if (patronymic == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(patronymic);
        }

        objectOutput.writeBoolean(gender);
        objectOutput.writeLong(date_of_birth);

        if (position == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(position);
        }

        objectOutput.writeLong(date_of_employment);
        objectOutput.writeLong(salary_level);

        if (work_number == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(work_number);
        }

        if (telephone_number == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(telephone_number);
        }

        objectOutput.writeBoolean(archival_status);
        objectOutput.writeLong(bankId);
        objectOutput.writeLong(officialPositionId);
    }
}
