package com.dasannetworks.vn.sb.service.base;

import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalService;
import com.dasannetworks.vn.sb.service.persistence.ContactPersistence;
import com.dasannetworks.vn.sb.service.persistence.DevicePersistence;
import com.dasannetworks.vn.sb.service.persistence.PurchaseOrderPersistence;

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
 * Provides the base implementation for the purchase order local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.dasannetworks.vn.sb.service.impl.PurchaseOrderLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.impl.PurchaseOrderLocalServiceImpl
 * @see com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil
 * @generated
 */
public abstract class PurchaseOrderLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements PurchaseOrderLocalService,
        IdentifiableBean {
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
    private PurchaseOrderLocalServiceClpInvoker _clpInvoker = new PurchaseOrderLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil} to access the purchase order local service.
     */

    /**
     * Adds the purchase order to the database. Also notifies the appropriate model listeners.
     *
     * @param purchaseOrder the purchase order
     * @return the purchase order that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public PurchaseOrder addPurchaseOrder(PurchaseOrder purchaseOrder)
        throws SystemException {
        purchaseOrder.setNew(true);

        return purchaseOrderPersistence.update(purchaseOrder);
    }

    /**
     * Creates a new purchase order with the primary key. Does not add the purchase order to the database.
     *
     * @param purchaseOrderId the primary key for the new purchase order
     * @return the new purchase order
     */
    @Override
    public PurchaseOrder createPurchaseOrder(long purchaseOrderId) {
        return purchaseOrderPersistence.create(purchaseOrderId);
    }

    /**
     * Deletes the purchase order with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param purchaseOrderId the primary key of the purchase order
     * @return the purchase order that was removed
     * @throws PortalException if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public PurchaseOrder deletePurchaseOrder(long purchaseOrderId)
        throws PortalException, SystemException {
        return purchaseOrderPersistence.remove(purchaseOrderId);
    }

    /**
     * Deletes the purchase order from the database. Also notifies the appropriate model listeners.
     *
     * @param purchaseOrder the purchase order
     * @return the purchase order that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public PurchaseOrder deletePurchaseOrder(PurchaseOrder purchaseOrder)
        throws SystemException {
        return purchaseOrderPersistence.remove(purchaseOrder);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(PurchaseOrder.class,
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
        return purchaseOrderPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return purchaseOrderPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return purchaseOrderPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
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
        return purchaseOrderPersistence.countWithDynamicQuery(dynamicQuery);
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
        return purchaseOrderPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public PurchaseOrder fetchPurchaseOrder(long purchaseOrderId)
        throws SystemException {
        return purchaseOrderPersistence.fetchByPrimaryKey(purchaseOrderId);
    }

    /**
     * Returns the purchase order with the primary key.
     *
     * @param purchaseOrderId the primary key of the purchase order
     * @return the purchase order
     * @throws PortalException if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder getPurchaseOrder(long purchaseOrderId)
        throws PortalException, SystemException {
        return purchaseOrderPersistence.findByPrimaryKey(purchaseOrderId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return purchaseOrderPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the purchase orders.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of purchase orders
     * @param end the upper bound of the range of purchase orders (not inclusive)
     * @return the range of purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseOrder> getPurchaseOrders(int start, int end)
        throws SystemException {
        return purchaseOrderPersistence.findAll(start, end);
    }

    /**
     * Returns the number of purchase orders.
     *
     * @return the number of purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getPurchaseOrdersCount() throws SystemException {
        return purchaseOrderPersistence.countAll();
    }

    /**
     * Updates the purchase order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param purchaseOrder the purchase order
     * @return the purchase order that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public PurchaseOrder updatePurchaseOrder(PurchaseOrder purchaseOrder)
        throws SystemException {
        return purchaseOrderPersistence.update(purchaseOrder);
    }

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

        PersistedModelLocalServiceRegistryUtil.register("com.dasannetworks.vn.sb.model.PurchaseOrder",
            purchaseOrderLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.dasannetworks.vn.sb.model.PurchaseOrder");
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
        return PurchaseOrder.class;
    }

    protected String getModelClassName() {
        return PurchaseOrder.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = purchaseOrderPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
