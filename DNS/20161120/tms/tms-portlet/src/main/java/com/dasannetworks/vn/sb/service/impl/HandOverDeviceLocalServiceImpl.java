package com.dasannetworks.vn.sb.service.impl;

import com.dasannetworks.vn.sb.NoSuchHandOverDeviceException;
import com.dasannetworks.vn.sb.model.HandOverDevice;
import com.dasannetworks.vn.sb.service.base.HandOverDeviceLocalServiceBaseImpl;
import com.dasannetworks.vn.sb.service.persistence.HandOverDeviceUtil;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;
import com.dasannetworks.vn.sb.service.base.HandOverDeviceLocalServiceBaseImpl;

/**
 * The implementation of the hand over device local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.dasannetworks.vn.sb.service.HandOverDeviceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.base.HandOverDeviceLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.HandOverDeviceLocalServiceUtil
 */
public class HandOverDeviceLocalServiceImpl
    extends HandOverDeviceLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.dasannetworks.vn.sb.service.HandOverDeviceLocalServiceUtil} to access the hand over device local service.
     */

    public List<HandOverDevice> findByHandOverFormId(long handOverFormId) throws SystemException {
        return HandOverDeviceUtil.findByHandOverFormId(handOverFormId);
    }
}
