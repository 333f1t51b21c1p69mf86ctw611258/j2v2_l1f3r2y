package com.dasannetworks.vn.sb.service.base;

import com.dasannetworks.vn.sb.service.DeviceServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DeviceServiceClpInvoker {
    private String _methodName64;
    private String[] _methodParameterTypes64;
    private String _methodName65;
    private String[] _methodParameterTypes65;
    private String _methodName70;
    private String[] _methodParameterTypes70;

    public DeviceServiceClpInvoker() {
        _methodName64 = "getBeanIdentifier";

        _methodParameterTypes64 = new String[] {  };

        _methodName65 = "setBeanIdentifier";

        _methodParameterTypes65 = new String[] { "java.lang.String" };

        _methodName70 = "getListBySerialNumbersAndPO";

        _methodParameterTypes70 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.Long", "java.lang.String", "java.lang.String", "int",
                "int"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName64.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
            return DeviceServiceUtil.getBeanIdentifier();
        }

        if (_methodName65.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
            DeviceServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName70.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
            return DeviceServiceUtil.getListBySerialNumbersAndPO((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.lang.Long) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                ((Integer) arguments[6]).intValue(),
                ((Integer) arguments[7]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
