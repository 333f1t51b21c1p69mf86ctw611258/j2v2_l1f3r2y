package com.dasannetworks.vn.sb.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Device service. Represents a row in the &quot;tms_Device&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceModel
 * @see com.dasannetworks.vn.sb.model.impl.DeviceImpl
 * @see com.dasannetworks.vn.sb.model.impl.DeviceModelImpl
 * @generated
 */
public interface Device extends DeviceModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.dasannetworks.vn.sb.model.impl.DeviceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.Date getWarrantyEndDate()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getPurchaseOrderNumber()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.WarrantyForm getWarrantyForm();

    public void setWarrantyForm(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm);

    public com.dasannetworks.vn.sb.model.PurchaseOrder getPurchaseOrder();

    public void setPurchaseOrder(
        com.dasannetworks.vn.sb.model.PurchaseOrder purchaseOrder);

    public com.dasannetworks.vn.sb.model.WarrantyForm fetchWarrantyForm()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.PurchaseOrder fetchPurchaseOrder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
