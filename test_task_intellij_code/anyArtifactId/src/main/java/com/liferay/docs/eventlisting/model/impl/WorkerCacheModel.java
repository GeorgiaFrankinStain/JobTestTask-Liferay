package com.liferay.docs.eventlisting.model.impl;

import com.liferay.docs.eventlisting.model.Worker;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

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

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{workerId=");
        sb.append(workerId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", lastname=");
        sb.append(lastname);
        sb.append(", patronymic=");
        sb.append(patronymic);
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

        workerImpl.resetOriginalValues();

        return workerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        workerId = objectInput.readLong();
        name = objectInput.readUTF();
        lastname = objectInput.readUTF();
        patronymic = objectInput.readUTF();
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
    }
}
