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
public class WorkerSoap implements Serializable {
    private long _workerId;
    private String _name;
    private String _lastname;
    private String _patronymic;

    public WorkerSoap() {
    }

    public static WorkerSoap toSoapModel(Worker model) {
        WorkerSoap soapModel = new WorkerSoap();

        soapModel.setWorkerId(model.getWorkerId());
        soapModel.setName(model.getName());
        soapModel.setLastname(model.getLastname());
        soapModel.setPatronymic(model.getPatronymic());

        return soapModel;
    }

    public static WorkerSoap[] toSoapModels(Worker[] models) {
        WorkerSoap[] soapModels = new WorkerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static WorkerSoap[][] toSoapModels(Worker[][] models) {
        WorkerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new WorkerSoap[models.length][models[0].length];
        } else {
            soapModels = new WorkerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static WorkerSoap[] toSoapModels(List<Worker> models) {
        List<WorkerSoap> soapModels = new ArrayList<WorkerSoap>(models.size());

        for (Worker model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new WorkerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _workerId;
    }

    public void setPrimaryKey(long pk) {
        setWorkerId(pk);
    }

    public long getWorkerId() {
        return _workerId;
    }

    public void setWorkerId(long workerId) {
        _workerId = workerId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String lastname) {
        _lastname = lastname;
    }

    public String getPatronymic() {
        return _patronymic;
    }

    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;
    }
}
