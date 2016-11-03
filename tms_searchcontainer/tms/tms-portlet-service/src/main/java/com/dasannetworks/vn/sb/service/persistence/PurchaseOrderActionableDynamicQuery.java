package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PurchaseOrderActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PurchaseOrderActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PurchaseOrderLocalServiceUtil.getService());
        setClass(PurchaseOrder.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("purchaseOrderId");
    }
}
