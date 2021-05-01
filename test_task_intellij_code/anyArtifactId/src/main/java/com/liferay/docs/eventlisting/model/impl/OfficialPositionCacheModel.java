package com.liferay.docs.eventlisting.model.impl;

import com.liferay.docs.eventlisting.model.OfficialPosition;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OfficialPosition in entity cache.
 *
 * @author Joe Bloggs
 * @see OfficialPosition
 * @generated
 */
public class OfficialPositionCacheModel implements CacheModel<OfficialPosition>,
    Externalizable {
    public long officialPositionId;
    public String name;
    public boolean is_archived;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{officialPositionId=");
        sb.append(officialPositionId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", is_archived=");
        sb.append(is_archived);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public OfficialPosition toEntityModel() {
        OfficialPositionImpl officialPositionImpl = new OfficialPositionImpl();

        officialPositionImpl.setOfficialPositionId(officialPositionId);

        if (name == null) {
            officialPositionImpl.setName(StringPool.BLANK);
        } else {
            officialPositionImpl.setName(name);
        }

        officialPositionImpl.setIs_archived(is_archived);

        officialPositionImpl.resetOriginalValues();

        return officialPositionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        officialPositionId = objectInput.readLong();
        name = objectInput.readUTF();
        is_archived = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(officialPositionId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeBoolean(is_archived);
    }
}
