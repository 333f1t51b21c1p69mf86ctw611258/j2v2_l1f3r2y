package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException;
import com.dasannetworks.vn.sb.model.DeviceExtOrder;
import com.dasannetworks.vn.sb.model.impl.DeviceExtOrderImpl;
import com.dasannetworks.vn.sb.model.impl.DeviceExtOrderModelImpl;
import com.dasannetworks.vn.sb.service.persistence.DeviceExtOrderPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the device ext order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtOrderPersistence
 * @see DeviceExtOrderUtil
 * @generated
 */
public class DeviceExtOrderPersistenceImpl extends BasePersistenceImpl<DeviceExtOrder>
    implements DeviceExtOrderPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DeviceExtOrderUtil} to access the device ext order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DeviceExtOrderImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtOrderModelImpl.FINDER_CACHE_ENABLED,
            DeviceExtOrderImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtOrderModelImpl.FINDER_CACHE_ENABLED,
            DeviceExtOrderImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER = new FinderPath(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtOrderModelImpl.FINDER_CACHE_ENABLED,
            DeviceExtOrderImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByDeviceExtOrderNumber",
            new String[] { String.class.getName() },
            DeviceExtOrderModelImpl.DEVICEEXTORDERNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEEXTORDERNUMBER = new FinderPath(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByDeviceExtOrderNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_1 =
        "deviceExtOrder.deviceExtOrderNumber IS NULL";
    private static final String _FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_2 =
        "deviceExtOrder.deviceExtOrderNumber = ?";
    private static final String _FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_3 =
        "(deviceExtOrder.deviceExtOrderNumber IS NULL OR deviceExtOrder.deviceExtOrderNumber = '')";
    private static final String _SQL_SELECT_DEVICEEXTORDER = "SELECT deviceExtOrder FROM DeviceExtOrder deviceExtOrder";
    private static final String _SQL_SELECT_DEVICEEXTORDER_WHERE = "SELECT deviceExtOrder FROM DeviceExtOrder deviceExtOrder WHERE ";
    private static final String _SQL_COUNT_DEVICEEXTORDER = "SELECT COUNT(deviceExtOrder) FROM DeviceExtOrder deviceExtOrder";
    private static final String _SQL_COUNT_DEVICEEXTORDER_WHERE = "SELECT COUNT(deviceExtOrder) FROM DeviceExtOrder deviceExtOrder WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "deviceExtOrder.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DeviceExtOrder exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DeviceExtOrder exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DeviceExtOrderPersistenceImpl.class);
    private static DeviceExtOrder _nullDeviceExtOrder = new DeviceExtOrderImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DeviceExtOrder> toCacheModel() {
                return _nullDeviceExtOrderCacheModel;
            }
        };

    private static CacheModel<DeviceExtOrder> _nullDeviceExtOrderCacheModel = new CacheModel<DeviceExtOrder>() {
            @Override
            public DeviceExtOrder toEntityModel() {
                return _nullDeviceExtOrder;
            }
        };

    public DeviceExtOrderPersistenceImpl() {
        setModelClass(DeviceExtOrder.class);
    }

    /**
     * Returns the device ext order where deviceExtOrderNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException} if it could not be found.
     *
     * @param deviceExtOrderNumber the device ext order number
     * @return the matching device ext order
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a matching device ext order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder findByDeviceExtOrderNumber(
        String deviceExtOrderNumber)
        throws NoSuchDeviceExtOrderException, SystemException {
        DeviceExtOrder deviceExtOrder = fetchByDeviceExtOrderNumber(deviceExtOrderNumber);

        if (deviceExtOrder == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("deviceExtOrderNumber=");
            msg.append(deviceExtOrderNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceExtOrderException(msg.toString());
        }

        return deviceExtOrder;
    }

    /**
     * Returns the device ext order where deviceExtOrderNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param deviceExtOrderNumber the device ext order number
     * @return the matching device ext order, or <code>null</code> if a matching device ext order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder fetchByDeviceExtOrderNumber(
        String deviceExtOrderNumber) throws SystemException {
        return fetchByDeviceExtOrderNumber(deviceExtOrderNumber, true);
    }

    /**
     * Returns the device ext order where deviceExtOrderNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param deviceExtOrderNumber the device ext order number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device ext order, or <code>null</code> if a matching device ext order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder fetchByDeviceExtOrderNumber(
        String deviceExtOrderNumber, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { deviceExtOrderNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceExtOrder) {
            DeviceExtOrder deviceExtOrder = (DeviceExtOrder) result;

            if (!Validator.equals(deviceExtOrderNumber,
                        deviceExtOrder.getDeviceExtOrderNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEEXTORDER_WHERE);

            boolean bindDeviceExtOrderNumber = false;

            if (deviceExtOrderNumber == null) {
                query.append(_FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_1);
            } else if (deviceExtOrderNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_3);
            } else {
                bindDeviceExtOrderNumber = true;

                query.append(_FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDeviceExtOrderNumber) {
                    qPos.add(deviceExtOrderNumber);
                }

                List<DeviceExtOrder> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
                        finderArgs, list);
                } else {
                    DeviceExtOrder deviceExtOrder = list.get(0);

                    result = deviceExtOrder;

                    cacheResult(deviceExtOrder);

                    if ((deviceExtOrder.getDeviceExtOrderNumber() == null) ||
                            !deviceExtOrder.getDeviceExtOrderNumber()
                                               .equals(deviceExtOrderNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
                            finderArgs, deviceExtOrder);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (DeviceExtOrder) result;
        }
    }

    /**
     * Removes the device ext order where deviceExtOrderNumber = &#63; from the database.
     *
     * @param deviceExtOrderNumber the device ext order number
     * @return the device ext order that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder removeByDeviceExtOrderNumber(
        String deviceExtOrderNumber)
        throws NoSuchDeviceExtOrderException, SystemException {
        DeviceExtOrder deviceExtOrder = findByDeviceExtOrderNumber(deviceExtOrderNumber);

        return remove(deviceExtOrder);
    }

    /**
     * Returns the number of device ext orders where deviceExtOrderNumber = &#63;.
     *
     * @param deviceExtOrderNumber the device ext order number
     * @return the number of matching device ext orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByDeviceExtOrderNumber(String deviceExtOrderNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DEVICEEXTORDERNUMBER;

        Object[] finderArgs = new Object[] { deviceExtOrderNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICEEXTORDER_WHERE);

            boolean bindDeviceExtOrderNumber = false;

            if (deviceExtOrderNumber == null) {
                query.append(_FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_1);
            } else if (deviceExtOrderNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_3);
            } else {
                bindDeviceExtOrderNumber = true;

                query.append(_FINDER_COLUMN_DEVICEEXTORDERNUMBER_DEVICEEXTORDERNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDeviceExtOrderNumber) {
                    qPos.add(deviceExtOrderNumber);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the device ext order in the entity cache if it is enabled.
     *
     * @param deviceExtOrder the device ext order
     */
    @Override
    public void cacheResult(DeviceExtOrder deviceExtOrder) {
        EntityCacheUtil.putResult(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtOrderImpl.class, deviceExtOrder.getPrimaryKey(),
            deviceExtOrder);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
            new Object[] { deviceExtOrder.getDeviceExtOrderNumber() },
            deviceExtOrder);

        deviceExtOrder.resetOriginalValues();
    }

    /**
     * Caches the device ext orders in the entity cache if it is enabled.
     *
     * @param deviceExtOrders the device ext orders
     */
    @Override
    public void cacheResult(List<DeviceExtOrder> deviceExtOrders) {
        for (DeviceExtOrder deviceExtOrder : deviceExtOrders) {
            if (EntityCacheUtil.getResult(
                        DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceExtOrderImpl.class, deviceExtOrder.getPrimaryKey()) == null) {
                cacheResult(deviceExtOrder);
            } else {
                deviceExtOrder.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all device ext orders.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DeviceExtOrderImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DeviceExtOrderImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the device ext order.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DeviceExtOrder deviceExtOrder) {
        EntityCacheUtil.removeResult(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtOrderImpl.class, deviceExtOrder.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(deviceExtOrder);
    }

    @Override
    public void clearCache(List<DeviceExtOrder> deviceExtOrders) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DeviceExtOrder deviceExtOrder : deviceExtOrders) {
            EntityCacheUtil.removeResult(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
                DeviceExtOrderImpl.class, deviceExtOrder.getPrimaryKey());

            clearUniqueFindersCache(deviceExtOrder);
        }
    }

    protected void cacheUniqueFindersCache(DeviceExtOrder deviceExtOrder) {
        if (deviceExtOrder.isNew()) {
            Object[] args = new Object[] {
                    deviceExtOrder.getDeviceExtOrderNumber()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEVICEEXTORDERNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
                args, deviceExtOrder);
        } else {
            DeviceExtOrderModelImpl deviceExtOrderModelImpl = (DeviceExtOrderModelImpl) deviceExtOrder;

            if ((deviceExtOrderModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceExtOrder.getDeviceExtOrderNumber()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEVICEEXTORDERNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
                    args, deviceExtOrder);
            }
        }
    }

    protected void clearUniqueFindersCache(DeviceExtOrder deviceExtOrder) {
        DeviceExtOrderModelImpl deviceExtOrderModelImpl = (DeviceExtOrderModelImpl) deviceExtOrder;

        Object[] args = new Object[] { deviceExtOrder.getDeviceExtOrderNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEEXTORDERNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
            args);

        if ((deviceExtOrderModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    deviceExtOrderModelImpl.getOriginalDeviceExtOrderNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEEXTORDERNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEEXTORDERNUMBER,
                args);
        }
    }

    /**
     * Creates a new device ext order with the primary key. Does not add the device ext order to the database.
     *
     * @param deviceExtOrderId the primary key for the new device ext order
     * @return the new device ext order
     */
    @Override
    public DeviceExtOrder create(long deviceExtOrderId) {
        DeviceExtOrder deviceExtOrder = new DeviceExtOrderImpl();

        deviceExtOrder.setNew(true);
        deviceExtOrder.setPrimaryKey(deviceExtOrderId);

        return deviceExtOrder;
    }

    /**
     * Removes the device ext order with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param deviceExtOrderId the primary key of the device ext order
     * @return the device ext order that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a device ext order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder remove(long deviceExtOrderId)
        throws NoSuchDeviceExtOrderException, SystemException {
        return remove((Serializable) deviceExtOrderId);
    }

    /**
     * Removes the device ext order with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the device ext order
     * @return the device ext order that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a device ext order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder remove(Serializable primaryKey)
        throws NoSuchDeviceExtOrderException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DeviceExtOrder deviceExtOrder = (DeviceExtOrder) session.get(DeviceExtOrderImpl.class,
                    primaryKey);

            if (deviceExtOrder == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDeviceExtOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(deviceExtOrder);
        } catch (NoSuchDeviceExtOrderException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DeviceExtOrder removeImpl(DeviceExtOrder deviceExtOrder)
        throws SystemException {
        deviceExtOrder = toUnwrappedModel(deviceExtOrder);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(deviceExtOrder)) {
                deviceExtOrder = (DeviceExtOrder) session.get(DeviceExtOrderImpl.class,
                        deviceExtOrder.getPrimaryKeyObj());
            }

            if (deviceExtOrder != null) {
                session.delete(deviceExtOrder);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (deviceExtOrder != null) {
            clearCache(deviceExtOrder);
        }

        return deviceExtOrder;
    }

    @Override
    public DeviceExtOrder updateImpl(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder)
        throws SystemException {
        deviceExtOrder = toUnwrappedModel(deviceExtOrder);

        boolean isNew = deviceExtOrder.isNew();

        Session session = null;

        try {
            session = openSession();

            if (deviceExtOrder.isNew()) {
                session.save(deviceExtOrder);

                deviceExtOrder.setNew(false);
            } else {
                session.merge(deviceExtOrder);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !DeviceExtOrderModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtOrderImpl.class, deviceExtOrder.getPrimaryKey(),
            deviceExtOrder);

        clearUniqueFindersCache(deviceExtOrder);
        cacheUniqueFindersCache(deviceExtOrder);

        return deviceExtOrder;
    }

    protected DeviceExtOrder toUnwrappedModel(DeviceExtOrder deviceExtOrder) {
        if (deviceExtOrder instanceof DeviceExtOrderImpl) {
            return deviceExtOrder;
        }

        DeviceExtOrderImpl deviceExtOrderImpl = new DeviceExtOrderImpl();

        deviceExtOrderImpl.setNew(deviceExtOrder.isNew());
        deviceExtOrderImpl.setPrimaryKey(deviceExtOrder.getPrimaryKey());

        deviceExtOrderImpl.setDeviceExtOrderId(deviceExtOrder.getDeviceExtOrderId());
        deviceExtOrderImpl.setCompanyId(deviceExtOrder.getCompanyId());
        deviceExtOrderImpl.setUserId(deviceExtOrder.getUserId());
        deviceExtOrderImpl.setUserName(deviceExtOrder.getUserName());
        deviceExtOrderImpl.setCreateDate(deviceExtOrder.getCreateDate());
        deviceExtOrderImpl.setModifiedDate(deviceExtOrder.getModifiedDate());
        deviceExtOrderImpl.setDeviceExtOrderNumber(deviceExtOrder.getDeviceExtOrderNumber());
        deviceExtOrderImpl.setNote(deviceExtOrder.getNote());

        return deviceExtOrderImpl;
    }

    /**
     * Returns the device ext order with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the device ext order
     * @return the device ext order
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a device ext order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDeviceExtOrderException, SystemException {
        DeviceExtOrder deviceExtOrder = fetchByPrimaryKey(primaryKey);

        if (deviceExtOrder == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDeviceExtOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return deviceExtOrder;
    }

    /**
     * Returns the device ext order with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException} if it could not be found.
     *
     * @param deviceExtOrderId the primary key of the device ext order
     * @return the device ext order
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a device ext order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder findByPrimaryKey(long deviceExtOrderId)
        throws NoSuchDeviceExtOrderException, SystemException {
        return findByPrimaryKey((Serializable) deviceExtOrderId);
    }

    /**
     * Returns the device ext order with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the device ext order
     * @return the device ext order, or <code>null</code> if a device ext order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DeviceExtOrder deviceExtOrder = (DeviceExtOrder) EntityCacheUtil.getResult(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
                DeviceExtOrderImpl.class, primaryKey);

        if (deviceExtOrder == _nullDeviceExtOrder) {
            return null;
        }

        if (deviceExtOrder == null) {
            Session session = null;

            try {
                session = openSession();

                deviceExtOrder = (DeviceExtOrder) session.get(DeviceExtOrderImpl.class,
                        primaryKey);

                if (deviceExtOrder != null) {
                    cacheResult(deviceExtOrder);
                } else {
                    EntityCacheUtil.putResult(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceExtOrderImpl.class, primaryKey,
                        _nullDeviceExtOrder);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DeviceExtOrderModelImpl.ENTITY_CACHE_ENABLED,
                    DeviceExtOrderImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return deviceExtOrder;
    }

    /**
     * Returns the device ext order with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param deviceExtOrderId the primary key of the device ext order
     * @return the device ext order, or <code>null</code> if a device ext order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtOrder fetchByPrimaryKey(long deviceExtOrderId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) deviceExtOrderId);
    }

    /**
     * Returns all the device ext orders.
     *
     * @return the device ext orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtOrder> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device ext orders.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device ext orders
     * @param end the upper bound of the range of device ext orders (not inclusive)
     * @return the range of device ext orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtOrder> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the device ext orders.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device ext orders
     * @param end the upper bound of the range of device ext orders (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of device ext orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtOrder> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<DeviceExtOrder> list = (List<DeviceExtOrder>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEVICEEXTORDER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEVICEEXTORDER;

                if (pagination) {
                    sql = sql.concat(DeviceExtOrderModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DeviceExtOrder>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceExtOrder>(list);
                } else {
                    list = (List<DeviceExtOrder>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the device ext orders from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DeviceExtOrder deviceExtOrder : findAll()) {
            remove(deviceExtOrder);
        }
    }

    /**
     * Returns the number of device ext orders.
     *
     * @return the number of device ext orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_DEVICEEXTORDER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the device ext order persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.DeviceExtOrder")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DeviceExtOrder>> listenersList = new ArrayList<ModelListener<DeviceExtOrder>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DeviceExtOrder>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DeviceExtOrderImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
