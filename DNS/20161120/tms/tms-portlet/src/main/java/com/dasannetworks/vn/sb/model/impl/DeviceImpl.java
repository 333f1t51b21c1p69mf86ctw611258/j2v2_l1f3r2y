package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;
import com.dasannetworks.vn.sb.service.WarrantyFormLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.Date;

/**
 * The extended model implementation for the Device service. Represents a row in the &quot;tms_Device&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.dasannetworks.vn.sb.model.Device} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class DeviceImpl extends DeviceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a device model instance should use the {@link com.dasannetworks.vn.sb.model.Device} interface instead.
     */
	private WarrantyForm warrantyForm;
	private PurchaseOrder purchaseOrder;

	public Date getWarrantyEndDate() throws PortalException, SystemException {
		WarrantyForm warrantyForm = getWarrantyForm();
		if (warrantyForm == null) {
			warrantyForm = fetchWarrantyForm();
		}

		if (warrantyForm != null) {
			return warrantyForm.getWarrantyEndDate();
		}
		return null;
	}

	public String getPurchaseOrderNumber() throws SystemException, PortalException {
		PurchaseOrder purchaseOrder = fetchPurchaseOrder();
		if (purchaseOrder != null) {
			return purchaseOrder.getPurchaseOrderNumber();
		}

		return null;
	}

	public WarrantyForm getWarrantyForm() {
		return warrantyForm;
	}

	public void setWarrantyForm(WarrantyForm warrantyForm) {
		this.warrantyForm = warrantyForm;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public WarrantyForm fetchWarrantyForm() throws PortalException, SystemException {
		if (this.getWarrantyFormId() != null && this.getWarrantyFormId() > 0 && this.getWarrantyForm() == null) {
			this.setWarrantyForm(WarrantyFormLocalServiceUtil.getWarrantyForm(this.getWarrantyFormId()));
		}

		return getWarrantyForm();
	}

	public PurchaseOrder fetchPurchaseOrder() throws PortalException, SystemException {
		if (this.getPurchaseOrderId() != null && this.getPurchaseOrderId() > 0 && this.getPurchaseOrder() == null) {
			this.setPurchaseOrder(PurchaseOrderLocalServiceUtil.getPurchaseOrder(this.getPurchaseOrderId()));
		}

		return getPurchaseOrder();
	}
}
