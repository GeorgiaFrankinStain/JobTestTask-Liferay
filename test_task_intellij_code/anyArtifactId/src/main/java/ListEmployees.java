import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.BankLocalServiceUtil;
import com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil;
import com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil;
import com.liferay.docs.eventlisting.service.impl.WorkerLocalServiceImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListEmployees extends MVCPortlet {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public void delete(ActionRequest request, ActionResponse response) {

    }
    public void addEntry(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        String name = ParamUtil.getString(request, "name");
        String lastname = ParamUtil.getString(request, "lastname");
        String patronymic = ParamUtil.getString(request, "patronymic");
        boolean isMan = ParamUtil.getBoolean(request, "is_man");
        Date dateBirth = ParamUtil.getDate(request, "date_of_birth", dateFormat);
        String position = ParamUtil.getString(request, "position");
        Date dateEmployment = ParamUtil.getDate(request, "date_of_employment", dateFormat);
        long salaryLevel = ParamUtil.getLong(request, "salary_level");
        String workNumber = ParamUtil.getString(request, "work_number");
        String telephoneNumber = ParamUtil.getString(request, "telephone_number");
        long bankOrganization = ParamUtil.getLong(request, "bankId");
        long officialPositionId = ParamUtil.getLong(request, "officialPositionId");
        boolean isArchived = ParamUtil.getBoolean(request, "archival_status");

        WorkerLocalServiceUtil.addWorker(name, lastname, patronymic, isMan, dateBirth, position, dateEmployment,
                salaryLevel, workNumber, telephoneNumber, bankOrganization, officialPositionId, isArchived);
    }
    public void addBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        String name = ParamUtil.getString(request, "name");
        String bic = ParamUtil.getString(request, "bic");
        String address = ParamUtil.getString(request, "address");
        BankLocalServiceUtil.addBank(name, bic, address);
    }
    public void addOfficialPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        String name = ParamUtil.getString(request, "name");
        boolean isArchived = ParamUtil.getBoolean(request, "is_archived");
        OfficialPositionLocalServiceUtil.addOfficialPosition(name, isArchived);
    }
}
