package com.dasannetworks.vn.sb.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for Device. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceServiceUtil
 * @see com.dasannetworks.vn.sb.service.base.DeviceServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.impl.DeviceServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface DeviceService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DeviceServiceUtil} to access the device remote service. Add custom service methods to {@link com.dasannetworks.vn.sb.service.impl.DeviceServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    @com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.dasannetworks.vn.tms.common.Filpagort<com.dasannetworks.vn.sb.model.Device> getListBySerialNumbersAndPO(
        java.lang.String serialNumbers, java.lang.String gponSerialNumbers,
        java.lang.String customerSerialNumbers, java.lang.Long purchaseOrderId,
        java.lang.String orderColumn, java.lang.String orderDirection,
        int begin, int end);
}
