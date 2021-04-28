import com.liferay.docs.eventlisting.model.Worker;
import com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil;
import com.liferay.docs.eventlisting.service.impl.WorkerLocalServiceImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListEmployees extends MVCPortlet {
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException, IOException {

        ArrayList<Worker> listWorker = null;
        try {
            listWorker = WorkerLocalServiceUtil.findAll();
        } catch (SystemException e) {
            e.printStackTrace();
        }
        
        renderRequest.setAttribute("entries", listWorker);

        super.render(renderRequest, renderResponse);
    }

    public void delete(ActionRequest request, ActionResponse response) {

    }
    public void addEntry(ActionRequest request, ActionResponse response) throws SystemException, PortalException {

        String userName = ParamUtil.getString(request, "name");
        String lastname = ParamUtil.getString(request, "lastname");
        String patronymic = ParamUtil.getString(request, "patronymic");
        WorkerLocalServiceUtil.addWorker(userName, lastname, patronymic);
        /*try {
            PortletPreferences prefs = request.getPreferences();

            String[] guestbookEntries = prefs.getValues("guestbook-entries",
                    new String[1]);

            ArrayList<String> entries = new ArrayList<String>();

            if (guestbookEntries != null) {

                entries = new ArrayList<String>(Arrays.asList(prefs.getValues(
                        "guestbook-entries", new String[1])));

            }

            String userName = ParamUtil.getString(request, "name");
            String message = ParamUtil.getString(request, "lastname");
            String entry = userName + "^" + message;

            entries.add(entry);

            String[] array = entries.toArray(new String[entries.size()]);

            prefs.setValues("guestbook-entries", array);

            try {
                prefs.store();
            } catch (IOException ex) {

                Logger.getLogger(ListEmployees.class.getName()).log(
                        Level.SEVERE, null, ex);

            } catch (ValidatorException ex) {

                Logger.getLogger(ListEmployees.class.getName()).log(
                        Level.SEVERE, null, ex);
            }

        } catch (ReadOnlyException ex) {

            Logger.getLogger(ListEmployees.class.getName()).log(
                    Level.SEVERE, null, ex);

        }*/

    }
}
