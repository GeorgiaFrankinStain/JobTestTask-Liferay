package com.liferay.docs.eventlisting.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Joe Bloggs
 * @generated
 */
public class OfficialPositionSoap implements Serializable {
    private long _officialPositionId;
    private String _name;
    private boolean _is_archived;

    public OfficialPositionSoap() {
    }

    public static OfficialPositionSoap toSoapModel(OfficialPosition model) {
        OfficialPositionSoap soapModel = new OfficialPositionSoap();

        soapModel.setOfficialPositionId(model.getOfficialPositionId());
        soapModel.setName(model.getName());
        soapModel.setIs_archived(model.getIs_archived());

        return soapModel;
    }

    public static OfficialPositionSoap[] toSoapModels(OfficialPosition[] models) {
        OfficialPositionSoap[] soapModels = new OfficialPositionSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static OfficialPositionSoap[][] toSoapModels(
        OfficialPosition[][] models) {
        OfficialPositionSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new OfficialPositionSoap[models.length][models[0].length];
        } else {
            soapModels = new OfficialPositionSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static OfficialPositionSoap[] toSoapModels(
        List<OfficialPosition> models) {
        List<OfficialPositionSoap> soapModels = new ArrayList<OfficialPositionSoap>(models.size());

        for (OfficialPosition model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new OfficialPositionSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _officialPositionId;
    }

    public void setPrimaryKey(long pk) {
        setOfficialPositionId(pk);
    }

    public long getOfficialPositionId() {
        return _officialPositionId;
    }

    public void setOfficialPositionId(long officialPositionId) {
        _officialPositionId = officialPositionId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public boolean getIs_archived() {
        return _is_archived;
    }

    public boolean isIs_archived() {
        return _is_archived;
    }

    public void setIs_archived(boolean is_archived) {
        _is_archived = is_archived;
    }
}
