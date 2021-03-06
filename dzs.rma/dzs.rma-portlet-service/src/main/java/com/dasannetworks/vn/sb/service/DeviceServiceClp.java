package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.InvokableService;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DeviceServiceClp implements DeviceService {
    private InvokableService _invokableService;
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName3;
    private String[] _methodParameterTypes3;

    public DeviceServiceClp(InvokableService invokableService) {
        _invokableService = invokableService;

        _methodName0 = "getBeanIdentifier";

        _methodParameterTypes0 = new String[] {  };

        _methodName1 = "setBeanIdentifier";

        _methodParameterTypes1 = new String[] { "java.lang.String" };

        _methodName3 = "getListBySerialNumbersAndPO";

        _methodParameterTypes3 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.Long", "java.lang.String", "java.lang.String", "int",
                "int"
            };
    }

    @Override
    public java.lang.String getBeanIdentifier() {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName0,
                    _methodParameterTypes0, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.lang.String) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        try {
            _invokableService.invokeMethod(_methodName1,
                _methodParameterTypes1,
                new Object[] { ClpSerializer.translateInput(beanIdentifier) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.dasannetworks.vn.tms.common.Filpagort<com.dasannetworks.vn.sb.model.Device> getListBySerialNumbersAndPO(
        java.lang.String serialNumbers, java.lang.String gponSerialNumbers,
        java.lang.String customerSerialNumbers, java.lang.Long purchaseOrderId,
        java.lang.String orderColumn, java.lang.String orderDirection,
        int begin, int end) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName3,
                    _methodParameterTypes3,
                    new Object[] {
                        ClpSerializer.translateInput(serialNumbers),
                        
                    ClpSerializer.translateInput(gponSerialNumbers),
                        
                    ClpSerializer.translateInput(customerSerialNumbers),
                        
                    ClpSerializer.translateInput(purchaseOrderId),
                        
                    ClpSerializer.translateInput(orderColumn),
                        
                    ClpSerializer.translateInput(orderDirection),
                        
                    begin,
                        
                    end
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (com.dasannetworks.vn.tms.common.Filpagort<com.dasannetworks.vn.sb.model.Device>) ClpSerializer.translateOutput(returnObj);
    }
}
