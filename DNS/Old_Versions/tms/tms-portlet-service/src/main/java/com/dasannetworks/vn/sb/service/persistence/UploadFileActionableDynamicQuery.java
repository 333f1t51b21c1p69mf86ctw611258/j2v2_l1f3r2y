package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.UploadFile;
import com.dasannetworks.vn.sb.service.UploadFileLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UploadFileActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UploadFileActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UploadFileLocalServiceUtil.getService());
        setClass(UploadFile.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("uploadFileId");
    }
}
