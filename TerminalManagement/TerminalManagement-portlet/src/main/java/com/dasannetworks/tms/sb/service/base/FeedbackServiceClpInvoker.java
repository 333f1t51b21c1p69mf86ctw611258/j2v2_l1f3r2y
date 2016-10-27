package com.dasannetworks.tms.sb.service.base;

import com.dasannetworks.tms.sb.service.FeedbackServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FeedbackServiceClpInvoker {
    private String _methodName82;
    private String[] _methodParameterTypes82;
    private String _methodName83;
    private String[] _methodParameterTypes83;

    public FeedbackServiceClpInvoker() {
        _methodName82 = "getBeanIdentifier";

        _methodParameterTypes82 = new String[] {  };

        _methodName83 = "setBeanIdentifier";

        _methodParameterTypes83 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName82.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
            return FeedbackServiceUtil.getBeanIdentifier();
        }

        if (_methodName83.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
            FeedbackServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
