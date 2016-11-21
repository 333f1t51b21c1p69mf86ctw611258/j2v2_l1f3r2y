package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.sb.service.WarrantyFormLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 *
 */
@Service
public class WarrantyFormService {
    public WarrantyForm create() throws SystemException {
        long warrantyFormId = CounterLocalServiceUtil.increment(WarrantyForm.class.getName());
        WarrantyForm warrantyForm = WarrantyFormLocalServiceUtil.createWarrantyForm(warrantyFormId);
        warrantyForm.setCreateDate(new Date());
        return warrantyForm;
    }

    public WarrantyForm get(Long warrantyFormId) throws SystemException, PortalException {
        return WarrantyFormLocalServiceUtil.getWarrantyForm(warrantyFormId);
    }

    public WarrantyForm updateWarrantyForm(WarrantyForm warrantyForm) throws SystemException {
        return WarrantyFormLocalServiceUtil.updateWarrantyForm(warrantyForm);
    }

    public WarrantyForm deleteWarrantyForm(Long warrantyFormId) throws SystemException, PortalException {
        return WarrantyFormLocalServiceUtil.deleteWarrantyForm(warrantyFormId);
    }
}
