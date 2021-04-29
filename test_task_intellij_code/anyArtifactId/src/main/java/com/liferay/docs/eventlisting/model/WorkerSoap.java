package com.liferay.docs.eventlisting.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
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
    private boolean _gender;
    private Date _date_of_birth;
    private String _position;
    private Date _date_of_employment;
    private long _salary_level;
    private String _work_number;
    private String _telephone_number;
    private boolean _archival_status;
    private long _bankId;
    private long _officialPositionId;

    public WorkerSoap() {
    }

    public static WorkerSoap toSoapModel(Worker model) {
        WorkerSoap soapModel = new WorkerSoap();

        soapModel.setWorkerId(model.getWorkerId());
        soapModel.setName(model.getName());
        soapModel.setLastname(model.getLastname());
        soapModel.setPatronymic(model.getPatronymic());
        soapModel.setGender(model.getGender());
        soapModel.setDate_of_birth(model.getDate_of_birth());
        soapModel.setPosition(model.getPosition());
        soapModel.setDate_of_employment(model.getDate_of_employment());
        soapModel.setSalary_level(model.getSalary_level());
        soapModel.setWork_number(model.getWork_number());
        soapModel.setTelephone_number(model.getTelephone_number());
        soapModel.setArchival_status(model.getArchival_status());
        soapModel.setBankId(model.getBankId());
        soapModel.setOfficialPositionId(model.getOfficialPositionId());

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

    public boolean getGender() {
        return _gender;
    }

    public boolean isGender() {
        return _gender;
    }

    public void setGender(boolean gender) {
        _gender = gender;
    }

    public Date getDate_of_birth() {
        return _date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        _date_of_birth = date_of_birth;
    }

    public String getPosition() {
        return _position;
    }

    public void setPosition(String position) {
        _position = position;
    }

    public Date getDate_of_employment() {
        return _date_of_employment;
    }

    public void setDate_of_employment(Date date_of_employment) {
        _date_of_employment = date_of_employment;
    }

    public long getSalary_level() {
        return _salary_level;
    }

    public void setSalary_level(long salary_level) {
        _salary_level = salary_level;
    }

    public String getWork_number() {
        return _work_number;
    }

    public void setWork_number(String work_number) {
        _work_number = work_number;
    }

    public String getTelephone_number() {
        return _telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        _telephone_number = telephone_number;
    }

    public boolean getArchival_status() {
        return _archival_status;
    }

    public boolean isArchival_status() {
        return _archival_status;
    }

    public void setArchival_status(boolean archival_status) {
        _archival_status = archival_status;
    }

    public long getBankId() {
        return _bankId;
    }

    public void setBankId(long bankId) {
        _bankId = bankId;
    }

    public long getOfficialPositionId() {
        return _officialPositionId;
    }

    public void setOfficialPositionId(long officialPositionId) {
        _officialPositionId = officialPositionId;
    }
}
