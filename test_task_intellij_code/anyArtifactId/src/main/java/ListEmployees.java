import Wrappers.Bank.DataBank;
import Wrappers.Bank.DataBankClass;
import Wrappers.OfficialPosition.DataOfficialPosition;
import Wrappers.OfficialPosition.DataOfficialPositionClass;
import Wrappers.Worker.DataWorker;
import Wrappers.Worker.DataWorkerClass;
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

    public void delete(ActionRequest request, ActionResponse response) {

    }
    public void addEntry(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        DataWorker dataWorker = new DataWorkerClass(request);
        if (dataWorker.isCreatingWorker()) {
            WorkerLocalServiceUtil.addWorker(dataWorker);
        } else {
            WorkerLocalServiceUtil.updateWorker(dataWorker);
        }
    }
    public void addBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        DataBank dataBank = new DataBankClass(request);
        if (dataBank.isNew()) {
            BankLocalServiceUtil.addBank(dataBank);
        } else {
            BankLocalServiceUtil.updateBank(dataBank);
        }
    }
    public void addOfficialPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        DataOfficialPosition dataOfficialPosition = new DataOfficialPositionClass(request);
        if (dataOfficialPosition.isNew()) {
            OfficialPositionLocalServiceUtil.addOfficialPosition(dataOfficialPosition);
        } else {
            OfficialPositionLocalServiceUtil.updateOfficialPosition(dataOfficialPosition);
        }
    }
}
