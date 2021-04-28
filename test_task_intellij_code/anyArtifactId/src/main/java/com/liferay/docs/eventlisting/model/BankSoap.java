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
public class BankSoap implements Serializable {
    private long _bankId;
    private String _name;
    private String _bic;
    private String _address;

    public BankSoap() {
    }

    public static BankSoap toSoapModel(Bank model) {
        BankSoap soapModel = new BankSoap();

        soapModel.setBankId(model.getBankId());
        soapModel.setName(model.getName());
        soapModel.setBic(model.getBic());
        soapModel.setAddress(model.getAddress());

        return soapModel;
    }

    public static BankSoap[] toSoapModels(Bank[] models) {
        BankSoap[] soapModels = new BankSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BankSoap[][] toSoapModels(Bank[][] models) {
        BankSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BankSoap[models.length][models[0].length];
        } else {
            soapModels = new BankSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BankSoap[] toSoapModels(List<Bank> models) {
        List<BankSoap> soapModels = new ArrayList<BankSoap>(models.size());

        for (Bank model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BankSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bankId;
    }

    public void setPrimaryKey(long pk) {
        setBankId(pk);
    }

    public long getBankId() {
        return _bankId;
    }

    public void setBankId(long bankId) {
        _bankId = bankId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getBic() {
        return _bic;
    }

    public void setBic(String bic) {
        _bic = bic;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }
}
