package com.dasannetworks.vn.sb.service.base;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceService;
import com.dasannetworks.vn.sb.service.persistence.ContactPersistence;
import com.dasannetworks.vn.sb.service.persistence.DevicePersistence;
import com.dasannetworks.vn.sb.service.persistence.PurchaseOrderPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the device remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.dasannetworks.vn.sb.service.impl.DeviceServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.impl.DeviceServiceImpl
 * @see com.dasannetworks.vn.sb.service.DeviceServiceUtil
 * @generated
 */
public abstract class DeviceServiceBaseImpl extends BaseServiceImpl
    implements DeviceService, IdentifiableBean {
    @BeanReference(type = com.dasannetworks.vn.sb.service.ContactLocalService.class)
    protected com.dasannetworks.vn.sb.service.ContactLocalService contactLocalService;
    @BeanReference(type = com.dasannetworks.vn.sb.service.ContactService.class)
    protected com.dasannetworks.vn.sb.service.ContactService contactService;
    @BeanReference(type = ContactPersistence.class)
    protected ContactPersistence contactPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.DeviceLocalService.class)
    protected com.dasannetworks.vn.sb.service.DeviceLocalService deviceLocalService;
    @BeanReference(type = com.dasannetworks.vn.sb.service.DeviceService.class)
    protected com.dasannetworks.vn.sb.service.DeviceService deviceService;
    @BeanReference(type = DevicePersistence.class)
    protected DevicePersistence devicePersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.PurchaseOrderLocalService.class)
    protected com.dasannetworks.vn.sb.service.PurchaseOrderLocalService purchaseOrderLocalService;
    @BeanReference(type = com.dasannetworks.vn.sb.service.PurchaseOrderService.class)
    protected com.dasannetworks.vn.sb.service.PurchaseOrderService purchaseOrderService;
    @BeanReference(type = PurchaseOrderPersistence.class)
    protected PurchaseOrderPersistence purchaseOrderPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private DeviceServiceClpInvoker _clpInvoker = new DeviceServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.dasannetworks.vn.sb.service.DeviceServiceUtil} to access the device remote service.
     */

    /**
     * Returns the contact local service.
     *
     * @return the contact local service
     */
    public com.dasannetworks.vn.sb.service.ContactLocalService getContactLocalService() {
        return contactLocalService;
    }

    /**
     * Sets the contact local service.
     *
     * @param contactLocalService the contact local service
     */
    public void setContactLocalService(
        com.dasannetworks.vn.sb.service.ContactLocalService contactLocalService) {
        this.contactLocalService = contactLocalService;
    }

    /**
     * Returns the contact remote service.
     *
     * @return the contact remote service
     */
    public com.dasannetworks.vn.sb.service.ContactService getContactService() {
        return contactService;
    }

    /**
     * Sets the contact remote service.
     *
     * @param contactService the contact remote service
     */
    public void setContactService(
        com.dasannetworks.vn.sb.service.ContactService contactService) {
        this.contactService = contactService;
    }

    /**
     * Returns the contact persistence.
     *
     * @return the contact persistence
     */
    public ContactPersistence getContactPersistence() {
        return contactPersistence;
    }

    /**
     * Sets the contact persistence.
     *
     * @param contactPersistence the contact persistence
     */
    public void setContactPersistence(ContactPersistence contactPersistence) {
        this.contactPersistence = contactPersistence;
    }

    /**
     * Returns the device local service.
     *
     * @return the device local service
     */
    public com.dasannetworks.vn.sb.service.DeviceLocalService getDeviceLocalService() {
        return deviceLocalService;
    }

    /**
     * Sets the device local service.
     *
     * @param deviceLocalService the device local service
     */
    public void setDeviceLocalService(
        com.dasannetworks.vn.sb.service.DeviceLocalService deviceLocalService) {
        this.deviceLocalService = deviceLocalService;
    }

    /**
     * Returns the device remote service.
     *
     * @return the device remote service
     */
    public com.dasannetworks.vn.sb.service.DeviceService getDeviceService() {
        return deviceService;
    }

    /**
     * Sets the device remote service.
     *
     * @param deviceService the device remote service
     */
    public void setDeviceService(
        com.dasannetworks.vn.sb.service.DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    /**
     * Returns the device persistence.
     *
     * @return the device persistence
     */
    public DevicePersistence getDevicePersistence() {
        return devicePersistence;
    }

    /**
     * Sets the device persistence.
     *
     * @param devicePersistence the device persistence
     */
    public void setDevicePersistence(DevicePersistence devicePersistence) {
        this.devicePersistence = devicePersistence;
    }

    /**
     * Returns the purchase order local service.
     *
     * @return the purchase order local service
     */
    public com.dasannetworks.vn.sb.service.PurchaseOrderLocalService getPurchaseOrderLocalService() {
        return purchaseOrderLocalService;
    }

    /**
     * Sets the purchase order local service.
     *
     * @param purchaseOrderLocalService the purchase order local service
     */
    public void setPurchaseOrderLocalService(
        com.dasannetworks.vn.sb.service.PurchaseOrderLocalService purchaseOrderLocalService) {
        this.purchaseOrderLocalService = purchaseOrderLocalService;
    }

    /**
     * Returns the purchase order remote service.
     *
     * @return the purchase order remote service
     */
    public com.dasannetworks.vn.sb.service.PurchaseOrderService getPurchaseOrderService() {
        return purchaseOrderService;
    }

    /**
     * Sets the purchase order remote service.
     *
     * @param purchaseOrderService the purchase order remote service
     */
    public void setPurchaseOrderService(
        com.dasannetworks.vn.sb.service.PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }

    /**
     * Returns the purchase order persistence.
     *
     * @return the purchase order persistence
     */
    public PurchaseOrderPersistence getPurchaseOrderPersistence() {
        return purchaseOrderPersistence;
    }

    /**
     * Sets the purchase order persistence.
     *
     * @param purchaseOrderPersistence the purchase order persistence
     */
    public void setPurchaseOrderPersistence(
        PurchaseOrderPersistence purchaseOrderPersistence) {
        this.purchaseOrderPersistence = purchaseOrderPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Device.class;
    }

    protected String getModelClassName() {
        return Device.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = devicePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
