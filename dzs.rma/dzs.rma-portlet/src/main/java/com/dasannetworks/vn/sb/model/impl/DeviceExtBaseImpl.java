package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.DeviceExt;
import com.dasannetworks.vn.sb.service.DeviceExtLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the DeviceExt service. Represents a row in the &quot;tms_DeviceExt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DeviceExtImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtImpl
 * @see com.dasannetworks.vn.sb.model.DeviceExt
 * @generated
 */
public abstract class DeviceExtBaseImpl extends DeviceExtModelImpl
    implements DeviceExt {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a device ext model instance should use the {@link DeviceExt} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DeviceExtLocalServiceUtil.addDeviceExt(this);
        } else {
            DeviceExtLocalServiceUtil.updateDeviceExt(this);
        }
    }
}
