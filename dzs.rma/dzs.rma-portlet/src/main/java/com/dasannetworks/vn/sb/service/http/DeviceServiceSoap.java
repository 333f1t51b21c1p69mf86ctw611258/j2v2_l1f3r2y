package com.dasannetworks.vn.sb.service.http;

import com.dasannetworks.vn.sb.service.DeviceServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.dasannetworks.vn.sb.service.DeviceServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.dasannetworks.vn.sb.model.DeviceSoap}.
 * If the method in the service utility returns a
 * {@link com.dasannetworks.vn.sb.model.Device}, that is translated to a
 * {@link com.dasannetworks.vn.sb.model.DeviceSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceServiceHttp
 * @see com.dasannetworks.vn.sb.model.DeviceSoap
 * @see com.dasannetworks.vn.sb.service.DeviceServiceUtil
 * @generated
 */
public class DeviceServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(DeviceServiceSoap.class);

    public static com.dasannetworks.vn.tms.common.Filpagort<com.dasannetworks.vn.sb.model.Device> getListBySerialNumbersAndPO(
        java.lang.String serialNumbers, java.lang.String gponSerialNumbers,
        java.lang.String customerSerialNumbers, java.lang.Long purchaseOrderId,
        java.lang.String orderColumn, java.lang.String orderDirection,
        int begin, int end) throws RemoteException {
        try {
            com.dasannetworks.vn.tms.common.Filpagort<com.dasannetworks.vn.sb.model.Device> returnValue =
                DeviceServiceUtil.getListBySerialNumbersAndPO(serialNumbers,
                    gponSerialNumbers, customerSerialNumbers, purchaseOrderId,
                    orderColumn, orderDirection, begin, end);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
