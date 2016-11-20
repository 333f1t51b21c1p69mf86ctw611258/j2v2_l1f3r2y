package com.dasannetworks.vn.sb.service.impl;

import com.dasannetworks.vn.sb.NoSuchPurchaseOrderException;
import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.service.base.PurchaseOrderLocalServiceBaseImpl;
import com.dasannetworks.vn.sb.service.persistence.PurchaseOrderUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.dasannetworks.vn.sb.service.base.PurchaseOrderLocalServiceBaseImpl;

/**
 * The implementation of the purchase order local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.dasannetworks.vn.sb.service.PurchaseOrderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.base.PurchaseOrderLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil
 */
public class PurchaseOrderLocalServiceImpl
    extends PurchaseOrderLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil} to access the purchase order local service.
     */

    public PurchaseOrder getByPurchaseOrderNumber(String purchaseOrderNumber) throws SystemException, NoSuchPurchaseOrderException {
        return PurchaseOrderUtil.findByPurchaseOrderNumber(purchaseOrderNumber);
    }
}
