package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.RmaRequestDevice;
import com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the RmaRequestDevice service. Represents a row in the &quot;tms_RmaRequestDevice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RmaRequestDeviceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestDeviceImpl
 * @see com.dasannetworks.vn.sb.model.RmaRequestDevice
 * @generated
 */
public abstract class RmaRequestDeviceBaseImpl extends RmaRequestDeviceModelImpl
    implements RmaRequestDevice {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a rma request device model instance should use the {@link RmaRequestDevice} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RmaRequestDeviceLocalServiceUtil.addRmaRequestDevice(this);
        } else {
            RmaRequestDeviceLocalServiceUtil.updateRmaRequestDevice(this);
        }
    }
}
