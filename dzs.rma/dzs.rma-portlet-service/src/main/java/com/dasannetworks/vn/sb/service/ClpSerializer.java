package com.dasannetworks.vn.sb.service;

import com.dasannetworks.vn.sb.model.CustomerClp;
import com.dasannetworks.vn.sb.model.DeviceClp;
import com.dasannetworks.vn.sb.model.DeviceExtClp;
import com.dasannetworks.vn.sb.model.DeviceExtHisClp;
import com.dasannetworks.vn.sb.model.DeviceExtOrderClp;
import com.dasannetworks.vn.sb.model.DeviceHisClp;
import com.dasannetworks.vn.sb.model.PartnerClp;
import com.dasannetworks.vn.sb.model.PurchaseOrderClp;
import com.dasannetworks.vn.sb.model.RmaReplacementClp;
import com.dasannetworks.vn.sb.model.RmaRequestClp;
import com.dasannetworks.vn.sb.model.RmaRequestDeviceClp;
import com.dasannetworks.vn.sb.model.WarrantyFormClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "dzs.rma-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "dzs.rma-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "dzs.rma-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(CustomerClp.class.getName())) {
            return translateInputCustomer(oldModel);
        }

        if (oldModelClassName.equals(DeviceClp.class.getName())) {
            return translateInputDevice(oldModel);
        }

        if (oldModelClassName.equals(DeviceExtClp.class.getName())) {
            return translateInputDeviceExt(oldModel);
        }

        if (oldModelClassName.equals(DeviceExtHisClp.class.getName())) {
            return translateInputDeviceExtHis(oldModel);
        }

        if (oldModelClassName.equals(DeviceExtOrderClp.class.getName())) {
            return translateInputDeviceExtOrder(oldModel);
        }

        if (oldModelClassName.equals(DeviceHisClp.class.getName())) {
            return translateInputDeviceHis(oldModel);
        }

        if (oldModelClassName.equals(PartnerClp.class.getName())) {
            return translateInputPartner(oldModel);
        }

        if (oldModelClassName.equals(PurchaseOrderClp.class.getName())) {
            return translateInputPurchaseOrder(oldModel);
        }

        if (oldModelClassName.equals(RmaReplacementClp.class.getName())) {
            return translateInputRmaReplacement(oldModel);
        }

        if (oldModelClassName.equals(RmaRequestClp.class.getName())) {
            return translateInputRmaRequest(oldModel);
        }

        if (oldModelClassName.equals(RmaRequestDeviceClp.class.getName())) {
            return translateInputRmaRequestDevice(oldModel);
        }

        if (oldModelClassName.equals(WarrantyFormClp.class.getName())) {
            return translateInputWarrantyForm(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputCustomer(BaseModel<?> oldModel) {
        CustomerClp oldClpModel = (CustomerClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getCustomerRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputDevice(BaseModel<?> oldModel) {
        DeviceClp oldClpModel = (DeviceClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDeviceRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputDeviceExt(BaseModel<?> oldModel) {
        DeviceExtClp oldClpModel = (DeviceExtClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDeviceExtRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputDeviceExtHis(BaseModel<?> oldModel) {
        DeviceExtHisClp oldClpModel = (DeviceExtHisClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDeviceExtHisRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputDeviceExtOrder(BaseModel<?> oldModel) {
        DeviceExtOrderClp oldClpModel = (DeviceExtOrderClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDeviceExtOrderRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputDeviceHis(BaseModel<?> oldModel) {
        DeviceHisClp oldClpModel = (DeviceHisClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDeviceHisRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPartner(BaseModel<?> oldModel) {
        PartnerClp oldClpModel = (PartnerClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPartnerRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPurchaseOrder(BaseModel<?> oldModel) {
        PurchaseOrderClp oldClpModel = (PurchaseOrderClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPurchaseOrderRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRmaReplacement(BaseModel<?> oldModel) {
        RmaReplacementClp oldClpModel = (RmaReplacementClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRmaReplacementRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRmaRequest(BaseModel<?> oldModel) {
        RmaRequestClp oldClpModel = (RmaRequestClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRmaRequestRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRmaRequestDevice(BaseModel<?> oldModel) {
        RmaRequestDeviceClp oldClpModel = (RmaRequestDeviceClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRmaRequestDeviceRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputWarrantyForm(BaseModel<?> oldModel) {
        WarrantyFormClp oldClpModel = (WarrantyFormClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getWarrantyFormRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.CustomerImpl")) {
            return translateOutputCustomer(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.DeviceImpl")) {
            return translateOutputDevice(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.DeviceExtImpl")) {
            return translateOutputDeviceExt(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.DeviceExtHisImpl")) {
            return translateOutputDeviceExtHis(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.DeviceExtOrderImpl")) {
            return translateOutputDeviceExtOrder(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.DeviceHisImpl")) {
            return translateOutputDeviceHis(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.PartnerImpl")) {
            return translateOutputPartner(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.PurchaseOrderImpl")) {
            return translateOutputPurchaseOrder(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.RmaReplacementImpl")) {
            return translateOutputRmaReplacement(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.RmaRequestImpl")) {
            return translateOutputRmaRequest(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceImpl")) {
            return translateOutputRmaRequestDevice(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.dasannetworks.vn.sb.model.impl.WarrantyFormImpl")) {
            return translateOutputWarrantyForm(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("com.dasannetworks.vn.sb.NoSuchCustomerException")) {
            return new com.dasannetworks.vn.sb.NoSuchCustomerException();
        }

        if (className.equals("com.dasannetworks.vn.sb.NoSuchDeviceException")) {
            return new com.dasannetworks.vn.sb.NoSuchDeviceException();
        }

        if (className.equals("com.dasannetworks.vn.sb.NoSuchDeviceExtException")) {
            return new com.dasannetworks.vn.sb.NoSuchDeviceExtException();
        }

        if (className.equals(
                    "com.dasannetworks.vn.sb.NoSuchDeviceExtHisException")) {
            return new com.dasannetworks.vn.sb.NoSuchDeviceExtHisException();
        }

        if (className.equals(
                    "com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException")) {
            return new com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException();
        }

        if (className.equals("com.dasannetworks.vn.sb.NoSuchDeviceHisException")) {
            return new com.dasannetworks.vn.sb.NoSuchDeviceHisException();
        }

        if (className.equals("com.dasannetworks.vn.sb.NoSuchPartnerException")) {
            return new com.dasannetworks.vn.sb.NoSuchPartnerException();
        }

        if (className.equals(
                    "com.dasannetworks.vn.sb.NoSuchPurchaseOrderException")) {
            return new com.dasannetworks.vn.sb.NoSuchPurchaseOrderException();
        }

        if (className.equals(
                    "com.dasannetworks.vn.sb.NoSuchRmaReplacementException")) {
            return new com.dasannetworks.vn.sb.NoSuchRmaReplacementException();
        }

        if (className.equals(
                    "com.dasannetworks.vn.sb.NoSuchRmaRequestException")) {
            return new com.dasannetworks.vn.sb.NoSuchRmaRequestException();
        }

        if (className.equals(
                    "com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException")) {
            return new com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException();
        }

        if (className.equals(
                    "com.dasannetworks.vn.sb.NoSuchWarrantyFormException")) {
            return new com.dasannetworks.vn.sb.NoSuchWarrantyFormException();
        }

        return throwable;
    }

    public static Object translateOutputCustomer(BaseModel<?> oldModel) {
        CustomerClp newModel = new CustomerClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setCustomerRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputDevice(BaseModel<?> oldModel) {
        DeviceClp newModel = new DeviceClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDeviceRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputDeviceExt(BaseModel<?> oldModel) {
        DeviceExtClp newModel = new DeviceExtClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDeviceExtRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputDeviceExtHis(BaseModel<?> oldModel) {
        DeviceExtHisClp newModel = new DeviceExtHisClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDeviceExtHisRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputDeviceExtOrder(BaseModel<?> oldModel) {
        DeviceExtOrderClp newModel = new DeviceExtOrderClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDeviceExtOrderRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputDeviceHis(BaseModel<?> oldModel) {
        DeviceHisClp newModel = new DeviceHisClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDeviceHisRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPartner(BaseModel<?> oldModel) {
        PartnerClp newModel = new PartnerClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPartnerRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPurchaseOrder(BaseModel<?> oldModel) {
        PurchaseOrderClp newModel = new PurchaseOrderClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPurchaseOrderRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRmaReplacement(BaseModel<?> oldModel) {
        RmaReplacementClp newModel = new RmaReplacementClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRmaReplacementRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRmaRequest(BaseModel<?> oldModel) {
        RmaRequestClp newModel = new RmaRequestClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRmaRequestRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRmaRequestDevice(BaseModel<?> oldModel) {
        RmaRequestDeviceClp newModel = new RmaRequestDeviceClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRmaRequestDeviceRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputWarrantyForm(BaseModel<?> oldModel) {
        WarrantyFormClp newModel = new WarrantyFormClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setWarrantyFormRemoteModel(oldModel);

        return newModel;
    }
}
