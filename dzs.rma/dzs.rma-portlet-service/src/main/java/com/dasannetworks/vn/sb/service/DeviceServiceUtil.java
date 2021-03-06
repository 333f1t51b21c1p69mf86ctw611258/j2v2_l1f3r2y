package com.dasannetworks.vn.sb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Device. This utility wraps
 * {@link com.dasannetworks.vn.sb.service.impl.DeviceServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceService
 * @see com.dasannetworks.vn.sb.service.base.DeviceServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.impl.DeviceServiceImpl
 * @generated
 */
public class DeviceServiceUtil {
    private static DeviceService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.dasannetworks.vn.sb.service.impl.DeviceServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.dasannetworks.vn.tms.common.Filpagort<com.dasannetworks.vn.sb.model.Device> getListBySerialNumbersAndPO(
        java.lang.String serialNumbers, java.lang.String gponSerialNumbers,
        java.lang.String customerSerialNumbers, java.lang.Long purchaseOrderId,
        java.lang.String orderColumn, java.lang.String orderDirection,
        int begin, int end) {
        return getService()
                   .getListBySerialNumbersAndPO(serialNumbers,
            gponSerialNumbers, customerSerialNumbers, purchaseOrderId,
            orderColumn, orderDirection, begin, end);
    }

    public static void clearService() {
        _service = null;
    }

    public static DeviceService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    DeviceService.class.getName());

            if (invokableService instanceof DeviceService) {
                _service = (DeviceService) invokableService;
            } else {
                _service = new DeviceServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(DeviceServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(DeviceService service) {
    }
}
