package com.liferay.docs.eventlisting.service.impl;

import Wrappers.OfficialPosition.DataOfficialPosition;
import com.liferay.docs.eventlisting.NoSuchOfficialPositionException;
import com.liferay.docs.eventlisting.model.OfficialPosition;
import com.liferay.docs.eventlisting.service.base.OfficialPositionLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;

/**
 * The implementation of the official position local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.eventlisting.service.OfficialPositionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.eventlisting.service.base.OfficialPositionLocalServiceBaseImpl
 * @see com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil
 */
public class OfficialPositionLocalServiceImpl
        extends OfficialPositionLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil} to access the official position local service.
     */

    public OfficialPosition addOfficialPosition(DataOfficialPosition dataOfficialPosition) throws SystemException {
        OfficialPosition officialPosition = dataOfficialPosition.getCreateOfficialPosition(counterLocalService, officialPositionPersistence);

        super.addOfficialPosition(officialPosition);

        return officialPosition;
    }

    public OfficialPosition updateOfficialPosition(DataOfficialPosition dataOfficialPosition) throws SystemException, NoSuchOfficialPositionException {
        OfficialPosition officialPosition = dataOfficialPosition.getUpdateOfficialPosition(officialPositionPersistence);
        super.updateOfficialPosition(officialPosition);
        return officialPosition;
    }


    public ArrayList<OfficialPosition> findAll() throws SystemException {
        ArrayList<OfficialPosition> result = new ArrayList<OfficialPosition>();
        result.addAll(officialPositionPersistence.findAll());
        return result;
    }

    public OfficialPosition findById(long OfficialPositionId) throws NoSuchOfficialPositionException, SystemException {
        return officialPositionPersistence.findByPrimaryKey(OfficialPositionId);
    }
}
