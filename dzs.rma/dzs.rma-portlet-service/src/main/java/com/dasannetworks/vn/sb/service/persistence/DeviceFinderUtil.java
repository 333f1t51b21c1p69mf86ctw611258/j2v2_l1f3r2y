package com.dasannetworks.vn.sb.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class DeviceFinderUtil {
    private static DeviceFinder _finder;

    public static java.util.List<com.dasannetworks.vn.sb.model.Device> getListBySerialNumberAndPO(
        java.util.List<java.lang.String> serialNumbers,
        java.util.List<java.lang.String> gponSerialNumbers,
        java.util.List<java.lang.String> customerSerialNumbers,
        java.lang.Long purchaseOrderId, java.lang.String orderColumn,
        java.lang.String orderDirection, int begin, int end) {
        return getFinder()
                   .getListBySerialNumberAndPO(serialNumbers,
            gponSerialNumbers, customerSerialNumbers, purchaseOrderId,
            orderColumn, orderDirection, begin, end);
    }

    public static long getListBySerialNumberAndPO_GetTotalCount(
        java.util.List<java.lang.String> serialNumbers,
        java.util.List<java.lang.String> gponSerialNumbers,
        java.util.List<java.lang.String> customerSerialNumbers,
        java.lang.Long purchaseOrderId) {
        return getFinder()
                   .getListBySerialNumberAndPO_GetTotalCount(serialNumbers,
            gponSerialNumbers, customerSerialNumbers, purchaseOrderId);
    }

    public static DeviceFinder getFinder() {
        if (_finder == null) {
            _finder = (DeviceFinder) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    DeviceFinder.class.getName());

            ReferenceRegistry.registerReference(DeviceFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(DeviceFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(DeviceFinderUtil.class, "_finder");
    }
}
