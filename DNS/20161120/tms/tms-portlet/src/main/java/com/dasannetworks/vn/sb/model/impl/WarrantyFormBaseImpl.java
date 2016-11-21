package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.sb.service.WarrantyFormLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the WarrantyForm service. Represents a row in the &quot;tms_WarrantyForm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WarrantyFormImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyFormImpl
 * @see com.dasannetworks.vn.sb.model.WarrantyForm
 * @generated
 */
public abstract class WarrantyFormBaseImpl extends WarrantyFormModelImpl
    implements WarrantyForm {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a warranty form model instance should use the {@link WarrantyForm} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            WarrantyFormLocalServiceUtil.addWarrantyForm(this);
        } else {
            WarrantyFormLocalServiceUtil.updateWarrantyForm(this);
        }
    }
}