package com.dasannetworks.vn.sb.service.base;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalService;
import com.dasannetworks.vn.sb.service.persistence.CustomerPersistence;
import com.dasannetworks.vn.sb.service.persistence.DeviceExtHisPersistence;
import com.dasannetworks.vn.sb.service.persistence.DeviceExtOrderPersistence;
import com.dasannetworks.vn.sb.service.persistence.DeviceExtPersistence;
import com.dasannetworks.vn.sb.service.persistence.DeviceFinder;
import com.dasannetworks.vn.sb.service.persistence.DeviceHisPersistence;
import com.dasannetworks.vn.sb.service.persistence.DevicePersistence;
import com.dasannetworks.vn.sb.service.persistence.PartnerPersistence;
import com.dasannetworks.vn.sb.service.persistence.PurchaseOrderPersistence;
import com.dasannetworks.vn.sb.service.persistence.RmaReplacementPersistence;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePersistence;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestPersistence;
import com.dasannetworks.vn.sb.service.persistence.WarrantyFormPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the device local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.dasannetworks.vn.sb.service.impl.DeviceLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.impl.DeviceLocalServiceImpl
 * @see com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil
 * @generated
 */
public abstract class DeviceLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements DeviceLocalService, IdentifiableBean {
    @BeanReference(type = com.dasannetworks.vn.sb.service.CustomerLocalService.class)
    protected com.dasannetworks.vn.sb.service.CustomerLocalService customerLocalService;
    @BeanReference(type = CustomerPersistence.class)
    protected CustomerPersistence customerPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.DeviceLocalService.class)
    protected com.dasannetworks.vn.sb.service.DeviceLocalService deviceLocalService;
    @BeanReference(type = com.dasannetworks.vn.sb.service.DeviceService.class)
    protected com.dasannetworks.vn.sb.service.DeviceService deviceService;
    @BeanReference(type = DevicePersistence.class)
    protected DevicePersistence devicePersistence;
    @BeanReference(type = DeviceFinder.class)
    protected DeviceFinder deviceFinder;
    @BeanReference(type = com.dasannetworks.vn.sb.service.DeviceExtLocalService.class)
    protected com.dasannetworks.vn.sb.service.DeviceExtLocalService deviceExtLocalService;
    @BeanReference(type = DeviceExtPersistence.class)
    protected DeviceExtPersistence deviceExtPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.DeviceExtHisLocalService.class)
    protected com.dasannetworks.vn.sb.service.DeviceExtHisLocalService deviceExtHisLocalService;
    @BeanReference(type = DeviceExtHisPersistence.class)
    protected DeviceExtHisPersistence deviceExtHisPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.DeviceExtOrderLocalService.class)
    protected com.dasannetworks.vn.sb.service.DeviceExtOrderLocalService deviceExtOrderLocalService;
    @BeanReference(type = DeviceExtOrderPersistence.class)
    protected DeviceExtOrderPersistence deviceExtOrderPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.DeviceHisLocalService.class)
    protected com.dasannetworks.vn.sb.service.DeviceHisLocalService deviceHisLocalService;
    @BeanReference(type = DeviceHisPersistence.class)
    protected DeviceHisPersistence deviceHisPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.PartnerLocalService.class)
    protected com.dasannetworks.vn.sb.service.PartnerLocalService partnerLocalService;
    @BeanReference(type = PartnerPersistence.class)
    protected PartnerPersistence partnerPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.PurchaseOrderLocalService.class)
    protected com.dasannetworks.vn.sb.service.PurchaseOrderLocalService purchaseOrderLocalService;
    @BeanReference(type = PurchaseOrderPersistence.class)
    protected PurchaseOrderPersistence purchaseOrderPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.RmaReplacementLocalService.class)
    protected com.dasannetworks.vn.sb.service.RmaReplacementLocalService rmaReplacementLocalService;
    @BeanReference(type = RmaReplacementPersistence.class)
    protected RmaReplacementPersistence rmaReplacementPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.RmaRequestLocalService.class)
    protected com.dasannetworks.vn.sb.service.RmaRequestLocalService rmaRequestLocalService;
    @BeanReference(type = RmaRequestPersistence.class)
    protected RmaRequestPersistence rmaRequestPersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalService.class)
    protected com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalService rmaRequestDeviceLocalService;
    @BeanReference(type = RmaRequestDevicePersistence.class)
    protected RmaRequestDevicePersistence rmaRequestDevicePersistence;
    @BeanReference(type = com.dasannetworks.vn.sb.service.WarrantyFormLocalService.class)
    protected com.dasannetworks.vn.sb.service.WarrantyFormLocalService warrantyFormLocalService;
    @BeanReference(type = WarrantyFormPersistence.class)
    protected WarrantyFormPersistence warrantyFormPersistence;
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
    private DeviceLocalServiceClpInvoker _clpInvoker = new DeviceLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil} to access the device local service.
     */

    /**
     * Adds the device to the database. Also notifies the appropriate model listeners.
     *
     * @param device the device
     * @return the device that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Device addDevice(Device device) throws SystemException {
        device.setNew(true);

        return devicePersistence.update(device);
    }

    /**
     * Creates a new device with the primary key. Does not add the device to the database.
     *
     * @param deviceId the primary key for the new device
     * @return the new device
     */
    @Override
    public Device createDevice(long deviceId) {
        return devicePersistence.create(deviceId);
    }

    /**
     * Deletes the device with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param deviceId the primary key of the device
     * @return the device that was removed
     * @throws PortalException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Device deleteDevice(long deviceId)
        throws PortalException, SystemException {
        return devicePersistence.remove(deviceId);
    }

    /**
     * Deletes the device from the database. Also notifies the appropriate model listeners.
     *
     * @param device the device
     * @return the device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Device deleteDevice(Device device) throws SystemException {
        return devicePersistence.remove(device);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Device.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return devicePersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return devicePersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return devicePersistence.findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return devicePersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return devicePersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Device fetchDevice(long deviceId) throws SystemException {
        return devicePersistence.fetchByPrimaryKey(deviceId);
    }

    /**
     * Returns the device with the primary key.
     *
     * @param deviceId the primary key of the device
     * @return the device
     * @throws PortalException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device getDevice(long deviceId)
        throws PortalException, SystemException {
        return devicePersistence.findByPrimaryKey(deviceId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return devicePersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the devices.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of devices
     * @param end the upper bound of the range of devices (not inclusive)
     * @return the range of devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> getDevices(int start, int end)
        throws SystemException {
        return devicePersistence.findAll(start, end);
    }

    /**
     * Returns the number of devices.
     *
     * @return the number of devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getDevicesCount() throws SystemException {
        return devicePersistence.countAll();
    }

    /**
     * Updates the device in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param device the device
     * @return the device that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Device updateDevice(Device device) throws SystemException {
        return devicePersistence.update(device);
    }

    /**
     * Returns the customer local service.
     *
     * @return the customer local service
     */
    public com.dasannetworks.vn.sb.service.CustomerLocalService getCustomerLocalService() {
        return customerLocalService;
    }

    /**
     * Sets the customer local service.
     *
     * @param customerLocalService the customer local service
     */
    public void setCustomerLocalService(
        com.dasannetworks.vn.sb.service.CustomerLocalService customerLocalService) {
        this.customerLocalService = customerLocalService;
    }

    /**
     * Returns the customer persistence.
     *
     * @return the customer persistence
     */
    public CustomerPersistence getCustomerPersistence() {
        return customerPersistence;
    }

    /**
     * Sets the customer persistence.
     *
     * @param customerPersistence the customer persistence
     */
    public void setCustomerPersistence(CustomerPersistence customerPersistence) {
        this.customerPersistence = customerPersistence;
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
     * Returns the device finder.
     *
     * @return the device finder
     */
    public DeviceFinder getDeviceFinder() {
        return deviceFinder;
    }

    /**
     * Sets the device finder.
     *
     * @param deviceFinder the device finder
     */
    public void setDeviceFinder(DeviceFinder deviceFinder) {
        this.deviceFinder = deviceFinder;
    }

    /**
     * Returns the device ext local service.
     *
     * @return the device ext local service
     */
    public com.dasannetworks.vn.sb.service.DeviceExtLocalService getDeviceExtLocalService() {
        return deviceExtLocalService;
    }

    /**
     * Sets the device ext local service.
     *
     * @param deviceExtLocalService the device ext local service
     */
    public void setDeviceExtLocalService(
        com.dasannetworks.vn.sb.service.DeviceExtLocalService deviceExtLocalService) {
        this.deviceExtLocalService = deviceExtLocalService;
    }

    /**
     * Returns the device ext persistence.
     *
     * @return the device ext persistence
     */
    public DeviceExtPersistence getDeviceExtPersistence() {
        return deviceExtPersistence;
    }

    /**
     * Sets the device ext persistence.
     *
     * @param deviceExtPersistence the device ext persistence
     */
    public void setDeviceExtPersistence(
        DeviceExtPersistence deviceExtPersistence) {
        this.deviceExtPersistence = deviceExtPersistence;
    }

    /**
     * Returns the device ext his local service.
     *
     * @return the device ext his local service
     */
    public com.dasannetworks.vn.sb.service.DeviceExtHisLocalService getDeviceExtHisLocalService() {
        return deviceExtHisLocalService;
    }

    /**
     * Sets the device ext his local service.
     *
     * @param deviceExtHisLocalService the device ext his local service
     */
    public void setDeviceExtHisLocalService(
        com.dasannetworks.vn.sb.service.DeviceExtHisLocalService deviceExtHisLocalService) {
        this.deviceExtHisLocalService = deviceExtHisLocalService;
    }

    /**
     * Returns the device ext his persistence.
     *
     * @return the device ext his persistence
     */
    public DeviceExtHisPersistence getDeviceExtHisPersistence() {
        return deviceExtHisPersistence;
    }

    /**
     * Sets the device ext his persistence.
     *
     * @param deviceExtHisPersistence the device ext his persistence
     */
    public void setDeviceExtHisPersistence(
        DeviceExtHisPersistence deviceExtHisPersistence) {
        this.deviceExtHisPersistence = deviceExtHisPersistence;
    }

    /**
     * Returns the device ext order local service.
     *
     * @return the device ext order local service
     */
    public com.dasannetworks.vn.sb.service.DeviceExtOrderLocalService getDeviceExtOrderLocalService() {
        return deviceExtOrderLocalService;
    }

    /**
     * Sets the device ext order local service.
     *
     * @param deviceExtOrderLocalService the device ext order local service
     */
    public void setDeviceExtOrderLocalService(
        com.dasannetworks.vn.sb.service.DeviceExtOrderLocalService deviceExtOrderLocalService) {
        this.deviceExtOrderLocalService = deviceExtOrderLocalService;
    }

    /**
     * Returns the device ext order persistence.
     *
     * @return the device ext order persistence
     */
    public DeviceExtOrderPersistence getDeviceExtOrderPersistence() {
        return deviceExtOrderPersistence;
    }

    /**
     * Sets the device ext order persistence.
     *
     * @param deviceExtOrderPersistence the device ext order persistence
     */
    public void setDeviceExtOrderPersistence(
        DeviceExtOrderPersistence deviceExtOrderPersistence) {
        this.deviceExtOrderPersistence = deviceExtOrderPersistence;
    }

    /**
     * Returns the device his local service.
     *
     * @return the device his local service
     */
    public com.dasannetworks.vn.sb.service.DeviceHisLocalService getDeviceHisLocalService() {
        return deviceHisLocalService;
    }

    /**
     * Sets the device his local service.
     *
     * @param deviceHisLocalService the device his local service
     */
    public void setDeviceHisLocalService(
        com.dasannetworks.vn.sb.service.DeviceHisLocalService deviceHisLocalService) {
        this.deviceHisLocalService = deviceHisLocalService;
    }

    /**
     * Returns the device his persistence.
     *
     * @return the device his persistence
     */
    public DeviceHisPersistence getDeviceHisPersistence() {
        return deviceHisPersistence;
    }

    /**
     * Sets the device his persistence.
     *
     * @param deviceHisPersistence the device his persistence
     */
    public void setDeviceHisPersistence(
        DeviceHisPersistence deviceHisPersistence) {
        this.deviceHisPersistence = deviceHisPersistence;
    }

    /**
     * Returns the partner local service.
     *
     * @return the partner local service
     */
    public com.dasannetworks.vn.sb.service.PartnerLocalService getPartnerLocalService() {
        return partnerLocalService;
    }

    /**
     * Sets the partner local service.
     *
     * @param partnerLocalService the partner local service
     */
    public void setPartnerLocalService(
        com.dasannetworks.vn.sb.service.PartnerLocalService partnerLocalService) {
        this.partnerLocalService = partnerLocalService;
    }

    /**
     * Returns the partner persistence.
     *
     * @return the partner persistence
     */
    public PartnerPersistence getPartnerPersistence() {
        return partnerPersistence;
    }

    /**
     * Sets the partner persistence.
     *
     * @param partnerPersistence the partner persistence
     */
    public void setPartnerPersistence(PartnerPersistence partnerPersistence) {
        this.partnerPersistence = partnerPersistence;
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
     * Returns the rma replacement local service.
     *
     * @return the rma replacement local service
     */
    public com.dasannetworks.vn.sb.service.RmaReplacementLocalService getRmaReplacementLocalService() {
        return rmaReplacementLocalService;
    }

    /**
     * Sets the rma replacement local service.
     *
     * @param rmaReplacementLocalService the rma replacement local service
     */
    public void setRmaReplacementLocalService(
        com.dasannetworks.vn.sb.service.RmaReplacementLocalService rmaReplacementLocalService) {
        this.rmaReplacementLocalService = rmaReplacementLocalService;
    }

    /**
     * Returns the rma replacement persistence.
     *
     * @return the rma replacement persistence
     */
    public RmaReplacementPersistence getRmaReplacementPersistence() {
        return rmaReplacementPersistence;
    }

    /**
     * Sets the rma replacement persistence.
     *
     * @param rmaReplacementPersistence the rma replacement persistence
     */
    public void setRmaReplacementPersistence(
        RmaReplacementPersistence rmaReplacementPersistence) {
        this.rmaReplacementPersistence = rmaReplacementPersistence;
    }

    /**
     * Returns the rma request local service.
     *
     * @return the rma request local service
     */
    public com.dasannetworks.vn.sb.service.RmaRequestLocalService getRmaRequestLocalService() {
        return rmaRequestLocalService;
    }

    /**
     * Sets the rma request local service.
     *
     * @param rmaRequestLocalService the rma request local service
     */
    public void setRmaRequestLocalService(
        com.dasannetworks.vn.sb.service.RmaRequestLocalService rmaRequestLocalService) {
        this.rmaRequestLocalService = rmaRequestLocalService;
    }

    /**
     * Returns the rma request persistence.
     *
     * @return the rma request persistence
     */
    public RmaRequestPersistence getRmaRequestPersistence() {
        return rmaRequestPersistence;
    }

    /**
     * Sets the rma request persistence.
     *
     * @param rmaRequestPersistence the rma request persistence
     */
    public void setRmaRequestPersistence(
        RmaRequestPersistence rmaRequestPersistence) {
        this.rmaRequestPersistence = rmaRequestPersistence;
    }

    /**
     * Returns the rma request device local service.
     *
     * @return the rma request device local service
     */
    public com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalService getRmaRequestDeviceLocalService() {
        return rmaRequestDeviceLocalService;
    }

    /**
     * Sets the rma request device local service.
     *
     * @param rmaRequestDeviceLocalService the rma request device local service
     */
    public void setRmaRequestDeviceLocalService(
        com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalService rmaRequestDeviceLocalService) {
        this.rmaRequestDeviceLocalService = rmaRequestDeviceLocalService;
    }

    /**
     * Returns the rma request device persistence.
     *
     * @return the rma request device persistence
     */
    public RmaRequestDevicePersistence getRmaRequestDevicePersistence() {
        return rmaRequestDevicePersistence;
    }

    /**
     * Sets the rma request device persistence.
     *
     * @param rmaRequestDevicePersistence the rma request device persistence
     */
    public void setRmaRequestDevicePersistence(
        RmaRequestDevicePersistence rmaRequestDevicePersistence) {
        this.rmaRequestDevicePersistence = rmaRequestDevicePersistence;
    }

    /**
     * Returns the warranty form local service.
     *
     * @return the warranty form local service
     */
    public com.dasannetworks.vn.sb.service.WarrantyFormLocalService getWarrantyFormLocalService() {
        return warrantyFormLocalService;
    }

    /**
     * Sets the warranty form local service.
     *
     * @param warrantyFormLocalService the warranty form local service
     */
    public void setWarrantyFormLocalService(
        com.dasannetworks.vn.sb.service.WarrantyFormLocalService warrantyFormLocalService) {
        this.warrantyFormLocalService = warrantyFormLocalService;
    }

    /**
     * Returns the warranty form persistence.
     *
     * @return the warranty form persistence
     */
    public WarrantyFormPersistence getWarrantyFormPersistence() {
        return warrantyFormPersistence;
    }

    /**
     * Sets the warranty form persistence.
     *
     * @param warrantyFormPersistence the warranty form persistence
     */
    public void setWarrantyFormPersistence(
        WarrantyFormPersistence warrantyFormPersistence) {
        this.warrantyFormPersistence = warrantyFormPersistence;
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

        PersistedModelLocalServiceRegistryUtil.register("com.dasannetworks.vn.sb.model.Device",
            deviceLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.dasannetworks.vn.sb.model.Device");
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
