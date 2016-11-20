package com.dasannetworks.vn.sb.service.impl;

import com.dasannetworks.vn.sb.model.RmaRequestDevice;
import com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.base.RmaRequestDeviceLocalServiceBaseImpl;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestDeviceUtil;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestUtil;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

/**
 * The implementation of the rma request device local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.base.RmaRequestDeviceLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalServiceUtil
 */
public class RmaRequestDeviceLocalServiceImpl
    extends RmaRequestDeviceLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalServiceUtil} to access the rma request device local service.
     */

    public List<RmaRequestDevice> findByRmaRequestId(Long rmaRequestId) throws SystemException {
        return RmaRequestDeviceUtil.findByRmaRequestId(rmaRequestId);
    }
}
