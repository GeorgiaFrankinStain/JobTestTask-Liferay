package com.liferay.docs.eventlisting.service.impl;

import com.liferay.docs.eventlisting.model.Event;
import com.liferay.docs.eventlisting.service.EventLocalServiceUtil;
import com.liferay.docs.eventlisting.service.base.EventLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.model.User;
import org.omg.CORBA.SystemException;
import org.omg.IOP.ServiceContext;

import java.util.Calendar;
import java.util.Date;

/**
 * The implementation of the event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.eventlisting.service.EventLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.eventlisting.service.base.EventLocalServiceBaseImpl
 * @see com.liferay.docs.eventlisting.service.EventLocalServiceUtil
 */
public class EventLocalServiceImpl extends EventLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.eventlisting.service.EventLocalServiceUtil} to access the event local service.
     */
    public Event addEvent(
            long userId, long groupId, String name, String description,
            int month, int day, int year, int hour, int minute, long locationId,
            ServiceContext serviceContext)
            throws PortalException, SystemException, com.liferay.portal.kernel.exception.SystemException {

        User user = userPersistence.findByPrimaryKey(userId);

        Date now = new Date();

        long eventId = counterLocalService.increment(Event.class.getName());

        Event event = eventPersistence.create(eventId);

        event.setName(name);
        event.setDescription(description);

        Calendar dateCal = CalendarFactoryUtil.getCalendar(
                user.getTimeZone());
        dateCal.set(year, month, day, hour, minute);
        Date date = dateCal.getTime();
        event.setDate(date);

        event.setLocationId(locationId);

        event.setGroupId(groupId);
        event.setCompanyId(user.getCompanyId());
        event.setUserId(user.getUserId());

        super.addEvent(event);

        // Resources

        resourceLocalService.addResources(
                event.getCompanyId(), event.getGroupId(), event.getUserId(),
                Event.class.getName(), event.getEventId(), false,
                true, true);

        return event;
    }

}
