import Wrappers.Bank.DataBank;
import Wrappers.Bank.DataBankClass;
import Wrappers.Bank.TextPresentationBank;
import Wrappers.OfficialPosition.DataOfficialPosition;
import Wrappers.OfficialPosition.DataOfficialPositionClass;
import Wrappers.Worker.DataWorker;
import Wrappers.Worker.DataWorkerClass;
import com.liferay.docs.eventlisting.NoSuchBankException;
import com.liferay.docs.eventlisting.NoSuchOfficialPositionException;
import com.liferay.docs.eventlisting.NoSuchWorkerException;
import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.BankLocalServiceUtil;
import com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil;
import com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ListEmployees extends MVCPortlet {

    private SimpleDateFormat formatFromWebForm = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat formatForInputTag = new SimpleDateFormat("yyyy-MM-dd");




    public void delete(ActionRequest request, ActionResponse response) {

    }


    public void findWorkerFromCriteries(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        FinderWorkerFromCriteries finder = new FinderWorkerFromCriteriesClass(request);
        ArrayList<Worker> listWorkers = finder.getWorkers();
        request.setAttribute("entries", listWorkers);
        response.setRenderParameter("mvcPath", "/views/list_employees.jsp");
    }



    public void addEntry(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        DataWorker dataWorker = new DataWorkerClass(request);
        if (dataWorker.isCreatingWorker()) {
            WorkerLocalServiceUtil.addWorker(dataWorker);
        } else {
            WorkerLocalServiceUtil.updateWorker(dataWorker);
        }
    }

    public void deleteEmployee(ActionRequest request, ActionResponse response) throws SystemException, NoSuchModelException {
        DataWorker dataWorker = new DataWorkerClass(request);
        WorkerLocalServiceUtil.deleteWorker(dataWorker);
    }

    public void addBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        DataBank dataBank = new DataBankClass(request);
        if (dataBank.isNew()) {
            BankLocalServiceUtil.addBank(dataBank);
        } else {
            BankLocalServiceUtil.updateBank(dataBank);
        }
    }

    public void deleteBank(ActionRequest request, ActionResponse response) throws SystemException, NoSuchBankException {
        DataBank dataBank = new DataBankClass(request);
        BankLocalServiceUtil.deleteBank(dataBank);
    }

    public void addOfficialPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        DataOfficialPosition dataOfficialPosition = new DataOfficialPositionClass(request);
        if (dataOfficialPosition.isNew()) {
            OfficialPositionLocalServiceUtil.addOfficialPosition(dataOfficialPosition);
        } else {
            OfficialPositionLocalServiceUtil.updateOfficialPosition(dataOfficialPosition);
        }
    }

    public void deleteOfficialPosition(ActionRequest request, ActionResponse response) throws SystemException, NoSuchBankException, NoSuchOfficialPositionException {
        DataOfficialPosition dataOfficialPosition = new DataOfficialPositionClass(request);
        OfficialPositionLocalServiceUtil.deleteOfficialPosition(dataOfficialPosition);
    }



    private interface FinderWorkerFromCriteries {
        ArrayList<Worker> getWorkers() throws SystemException;
    }


    private class FinderWorkerFromCriteriesClass implements FinderWorkerFromCriteries {
        String lastname = "";
        String name = "";
        String patronymic = "";
        Date start = null;
        Date end = null;
        private DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Worker.class);
        private Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
        ActionRequest request;

        public FinderWorkerFromCriteriesClass(ActionRequest request) {
            this.request = request;
            splitFoundName();
            extractionStartDate();
            extractionEndDate();
        }

        private void extractionStartDate() {
            Date date = ParamUtil.getDate(request, "dateStart", formatFromWebForm);
            String dateString = ParamUtil.getString(request, "dateStart");
            boolean isSettingDate = dateString != "";
            if (isSettingDate) {
                this.start = date;
            }
        }

        private void extractionEndDate() {
            Date date = ParamUtil.getDate(request, "dateEnd", formatFromWebForm);
            String dateString = ParamUtil.getString(request, "dateEnd");
            boolean isSettingDate = dateString != "";
            if (isSettingDate) {
                this.end = date;
            }
        }

        private void splitFoundName() {
            String foundName = ParamUtil.getString(request, "foundName");
            String[] parts = foundName.split(" ");
            lastname = parts[0];

            if (parts.length > 1) {
                name = parts[1];
            }
            if (parts.length > 2) {
                patronymic = parts[2];
            }
        }

        @Override
        public ArrayList<Worker> getWorkers() throws SystemException {
            addLastnameDisjunction();
            addNameDisjunction();
            addPatronymicDisjunction();
            addDateDisjunction();

            ArrayList<Worker> result = new ArrayList<Worker>();
            dynamicQuery.add(disjunction);
            result.addAll(WorkerLocalServiceUtil.dynamicQuery(dynamicQuery));
            return result;
        }

        private void addDateDisjunction() {
            if (end != null && start != null) {
                disjunction.add(RestrictionsFactoryUtil.between("date_of_birth", start, end));
                return;
            }

            Property property = PropertyFactoryUtil.forName("date_of_birth");
            if (end != null) {
                disjunction.add(property.le(end));
            }
            if (start != null) {
                disjunction.add(property.ge(start));
            }
        }

        private void addLastnameDisjunction() {
            if (lastname != null && lastname != "") {
                disjunction.add(RestrictionsFactoryUtil.ilike("lastname", lastname));
            }
        }

        private void addNameDisjunction() {
            if (name != null && name != "") {
                disjunction.add(RestrictionsFactoryUtil.ilike("name", name));
            }
        }

        private void addPatronymicDisjunction() {
            if (patronymic != null && patronymic != "") {
                disjunction.add(RestrictionsFactoryUtil.ilike("patronymic", patronymic));
            }
        }
    }
}
