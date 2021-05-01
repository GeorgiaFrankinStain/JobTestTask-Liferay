package com.liferay.docs.eventlisting.model.impl;

import com.liferay.docs.eventlisting.model.Bank;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bank in entity cache.
 *
 * @author Joe Bloggs
 * @see Bank
 * @generated
 */
public class BankCacheModel implements CacheModel<Bank>, Externalizable {
    public long bankId;
    public String name;
    public String bic;
    public String address;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{bankId=");
        sb.append(bankId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", bic=");
        sb.append(bic);
        sb.append(", address=");
        sb.append(address);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Bank toEntityModel() {
        BankImpl bankImpl = new BankImpl();

        bankImpl.setBankId(bankId);

        if (name == null) {
            bankImpl.setName(StringPool.BLANK);
        } else {
            bankImpl.setName(name);
        }

        if (bic == null) {
            bankImpl.setBic(StringPool.BLANK);
        } else {
            bankImpl.setBic(bic);
        }

        if (address == null) {
            bankImpl.setAddress(StringPool.BLANK);
        } else {
            bankImpl.setAddress(address);
        }

        bankImpl.resetOriginalValues();

        return bankImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bankId = objectInput.readLong();
        name = objectInput.readUTF();
        bic = objectInput.readUTF();
        address = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(bankId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (bic == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bic);
        }

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }
    }
}
