package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchDeviceException;
import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.model.impl.DeviceImpl;
import com.dasannetworks.vn.sb.model.impl.DeviceModelImpl;
import com.dasannetworks.vn.sb.service.persistence.DevicePersistence;

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
 * The persistence implementation for the device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DevicePersistence
 * @see DeviceUtil
 * @generated
 */
public class DevicePersistenceImpl extends BasePersistenceImpl<Device>
    implements DevicePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DeviceUtil} to access the device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DeviceImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PURCHASEORDERID =
        new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPurchaseOrderId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID =
        new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPurchaseOrderId",
            new String[] { Long.class.getName() },
            DeviceModelImpl.PURCHASEORDERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PURCHASEORDERID = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPurchaseOrderId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PURCHASEORDERID_PURCHASEORDERID_2 =
        "device.purchaseOrderId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByModelName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByModelName",
            new String[] { String.class.getName() },
            DeviceModelImpl.MODELNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_MODELNAME = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByModelName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_1 = "device.modelName IS NULL";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_2 = "device.modelName = ?";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_3 = "(device.modelName IS NULL OR device.modelName = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_WARRANTYFORMID = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByWarrantyFormId",
            new String[] { Long.class.getName() },
            DeviceModelImpl.WARRANTYFORMID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_WARRANTYFORMID = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWarrantyFormId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_WARRANTYFORMID_WARRANTYFORMID_2 = "device.warrantyFormId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_SERIALNUMBER = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchBySerialNumber",
            new String[] { String.class.getName() },
            DeviceModelImpl.SERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERIALNUMBER = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_1 = "device.serialNumber IS NULL";
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_2 = "device.serialNumber = ?";
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_3 = "(device.serialNumber IS NULL OR device.serialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_GPONSERIALNUMBER = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByGponSerialNumber",
            new String[] { String.class.getName() },
            DeviceModelImpl.GPONSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GPONSERIALNUMBER = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByGponSerialNumber", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_1 =
        "device.gponSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_2 =
        "device.gponSerialNumber = ?";
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_3 =
        "(device.gponSerialNumber IS NULL OR device.gponSerialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByCustomerSerialNumber",
            new String[] { String.class.getName() },
            DeviceModelImpl.CUSTOMERSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCustomerSerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_1 =
        "device.customerSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_2 =
        "device.customerSerialNumber = ?";
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_3 =
        "(device.customerSerialNumber IS NULL OR device.customerSerialNumber = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { Integer.class.getName() },
            DeviceModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "device.status = ?";
    private static final String _SQL_SELECT_DEVICE = "SELECT device FROM Device device";
    private static final String _SQL_SELECT_DEVICE_WHERE = "SELECT device FROM Device device WHERE ";
    private static final String _SQL_COUNT_DEVICE = "SELECT COUNT(device) FROM Device device";
    private static final String _SQL_COUNT_DEVICE_WHERE = "SELECT COUNT(device) FROM Device device WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "device.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Device exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Device exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DevicePersistenceImpl.class);
    private static Device _nullDevice = new DeviceImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Device> toCacheModel() {
                return _nullDeviceCacheModel;
            }
        };

    private static CacheModel<Device> _nullDeviceCacheModel = new CacheModel<Device>() {
            @Override
            public Device toEntityModel() {
                return _nullDevice;
            }
        };

    public DevicePersistenceImpl() {
        setModelClass(Device.class);
    }

    /**
     * Returns all the devices where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @return the matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByPurchaseOrderId(Long purchaseOrderId)
        throws SystemException {
        return findByPurchaseOrderId(purchaseOrderId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the devices where purchaseOrderId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param purchaseOrderId the purchase order ID
     * @param start the lower bound of the range of devices
     * @param end the upper bound of the range of devices (not inclusive)
     * @return the range of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByPurchaseOrderId(Long purchaseOrderId, int start,
        int end) throws SystemException {
        return findByPurchaseOrderId(purchaseOrderId, start, end, null);
    }

    /**
     * Returns an ordered range of all the devices where purchaseOrderId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param purchaseOrderId the purchase order ID
     * @param start the lower bound of the range of devices
     * @param end the upper bound of the range of devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByPurchaseOrderId(Long purchaseOrderId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID;
            finderArgs = new Object[] { purchaseOrderId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PURCHASEORDERID;
            finderArgs = new Object[] {
                    purchaseOrderId,
                    
                    start, end, orderByComparator
                };
        }

        List<Device> list = (List<Device>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Device device : list) {
                if (!Validator.equals(purchaseOrderId,
                            device.getPurchaseOrderId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_DEVICE_WHERE);

            query.append(_FINDER_COLUMN_PURCHASEORDERID_PURCHASEORDERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(purchaseOrderId.longValue());

                if (!pagination) {
                    list = (List<Device>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Device>(list);
                } else {
                    list = (List<Device>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first device in the ordered set where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByPurchaseOrderId_First(Long purchaseOrderId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByPurchaseOrderId_First(purchaseOrderId,
                orderByComparator);

        if (device != null) {
            return device;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("purchaseOrderId=");
        msg.append(purchaseOrderId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceException(msg.toString());
    }

    /**
     * Returns the first device in the ordered set where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByPurchaseOrderId_First(Long purchaseOrderId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Device> list = findByPurchaseOrderId(purchaseOrderId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device in the ordered set where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByPurchaseOrderId_Last(Long purchaseOrderId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByPurchaseOrderId_Last(purchaseOrderId,
                orderByComparator);

        if (device != null) {
            return device;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("purchaseOrderId=");
        msg.append(purchaseOrderId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceException(msg.toString());
    }

    /**
     * Returns the last device in the ordered set where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByPurchaseOrderId_Last(Long purchaseOrderId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPurchaseOrderId(purchaseOrderId);

        if (count == 0) {
            return null;
        }

        List<Device> list = findByPurchaseOrderId(purchaseOrderId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the devices before and after the current device in the ordered set where purchaseOrderId = &#63;.
     *
     * @param deviceId the primary key of the current device
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device[] findByPurchaseOrderId_PrevAndNext(long deviceId,
        Long purchaseOrderId, OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = findByPrimaryKey(deviceId);

        Session session = null;

        try {
            session = openSession();

            Device[] array = new DeviceImpl[3];

            array[0] = getByPurchaseOrderId_PrevAndNext(session, device,
                    purchaseOrderId, orderByComparator, true);

            array[1] = device;

            array[2] = getByPurchaseOrderId_PrevAndNext(session, device,
                    purchaseOrderId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Device getByPurchaseOrderId_PrevAndNext(Session session,
        Device device, Long purchaseOrderId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICE_WHERE);

        query.append(_FINDER_COLUMN_PURCHASEORDERID_PURCHASEORDERID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(DeviceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(purchaseOrderId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(device);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Device> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the devices where purchaseOrderId = &#63; from the database.
     *
     * @param purchaseOrderId the purchase order ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPurchaseOrderId(Long purchaseOrderId)
        throws SystemException {
        for (Device device : findByPurchaseOrderId(purchaseOrderId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(device);
        }
    }

    /**
     * Returns the number of devices where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @return the number of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPurchaseOrderId(Long purchaseOrderId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PURCHASEORDERID;

        Object[] finderArgs = new Object[] { purchaseOrderId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_WHERE);

            query.append(_FINDER_COLUMN_PURCHASEORDERID_PURCHASEORDERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(purchaseOrderId.longValue());

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
     * Returns all the devices where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByModelName(String modelName)
        throws SystemException {
        return findByModelName(modelName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the devices where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of devices
     * @param end the upper bound of the range of devices (not inclusive)
     * @return the range of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByModelName(String modelName, int start, int end)
        throws SystemException {
        return findByModelName(modelName, start, end, null);
    }

    /**
     * Returns an ordered range of all the devices where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of devices
     * @param end the upper bound of the range of devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByModelName(String modelName, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME;
            finderArgs = new Object[] { modelName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MODELNAME;
            finderArgs = new Object[] { modelName, start, end, orderByComparator };
        }

        List<Device> list = (List<Device>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Device device : list) {
                if (!Validator.equals(modelName, device.getModelName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_DEVICE_WHERE);

            boolean bindModelName = false;

            if (modelName == null) {
                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_1);
            } else if (modelName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_3);
            } else {
                bindModelName = true;

                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindModelName) {
                    qPos.add(modelName);
                }

                if (!pagination) {
                    list = (List<Device>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Device>(list);
                } else {
                    list = (List<Device>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first device in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByModelName_First(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByModelName_First(modelName, orderByComparator);

        if (device != null) {
            return device;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceException(msg.toString());
    }

    /**
     * Returns the first device in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByModelName_First(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Device> list = findByModelName(modelName, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByModelName_Last(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByModelName_Last(modelName, orderByComparator);

        if (device != null) {
            return device;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceException(msg.toString());
    }

    /**
     * Returns the last device in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByModelName_Last(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByModelName(modelName);

        if (count == 0) {
            return null;
        }

        List<Device> list = findByModelName(modelName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the devices before and after the current device in the ordered set where modelName = &#63;.
     *
     * @param deviceId the primary key of the current device
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device[] findByModelName_PrevAndNext(long deviceId,
        String modelName, OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = findByPrimaryKey(deviceId);

        Session session = null;

        try {
            session = openSession();

            Device[] array = new DeviceImpl[3];

            array[0] = getByModelName_PrevAndNext(session, device, modelName,
                    orderByComparator, true);

            array[1] = device;

            array[2] = getByModelName_PrevAndNext(session, device, modelName,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Device getByModelName_PrevAndNext(Session session, Device device,
        String modelName, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICE_WHERE);

        boolean bindModelName = false;

        if (modelName == null) {
            query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_1);
        } else if (modelName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_3);
        } else {
            bindModelName = true;

            query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(DeviceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindModelName) {
            qPos.add(modelName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(device);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Device> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the devices where modelName = &#63; from the database.
     *
     * @param modelName the model name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByModelName(String modelName) throws SystemException {
        for (Device device : findByModelName(modelName, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(device);
        }
    }

    /**
     * Returns the number of devices where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the number of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByModelName(String modelName) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_MODELNAME;

        Object[] finderArgs = new Object[] { modelName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_WHERE);

            boolean bindModelName = false;

            if (modelName == null) {
                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_1);
            } else if (modelName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_3);
            } else {
                bindModelName = true;

                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindModelName) {
                    qPos.add(modelName);
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
     * Returns the device where warrantyFormId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
     *
     * @param warrantyFormId the warranty form ID
     * @return the matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByWarrantyFormId(Long warrantyFormId)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByWarrantyFormId(warrantyFormId);

        if (device == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("warrantyFormId=");
            msg.append(warrantyFormId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceException(msg.toString());
        }

        return device;
    }

    /**
     * Returns the device where warrantyFormId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param warrantyFormId the warranty form ID
     * @return the matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByWarrantyFormId(Long warrantyFormId)
        throws SystemException {
        return fetchByWarrantyFormId(warrantyFormId, true);
    }

    /**
     * Returns the device where warrantyFormId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param warrantyFormId the warranty form ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByWarrantyFormId(Long warrantyFormId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { warrantyFormId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID,
                    finderArgs, this);
        }

        if (result instanceof Device) {
            Device device = (Device) result;

            if (!Validator.equals(warrantyFormId, device.getWarrantyFormId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICE_WHERE);

            query.append(_FINDER_COLUMN_WARRANTYFORMID_WARRANTYFORMID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(warrantyFormId.longValue());

                List<Device> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID,
                        finderArgs, list);
                } else {
                    Device device = list.get(0);

                    result = device;

                    cacheResult(device);

                    if ((device.getWarrantyFormId() != warrantyFormId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID,
                            finderArgs, device);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Device) result;
        }
    }

    /**
     * Removes the device where warrantyFormId = &#63; from the database.
     *
     * @param warrantyFormId the warranty form ID
     * @return the device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device removeByWarrantyFormId(Long warrantyFormId)
        throws NoSuchDeviceException, SystemException {
        Device device = findByWarrantyFormId(warrantyFormId);

        return remove(device);
    }

    /**
     * Returns the number of devices where warrantyFormId = &#63;.
     *
     * @param warrantyFormId the warranty form ID
     * @return the number of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByWarrantyFormId(Long warrantyFormId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_WARRANTYFORMID;

        Object[] finderArgs = new Object[] { warrantyFormId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_WHERE);

            query.append(_FINDER_COLUMN_WARRANTYFORMID_WARRANTYFORMID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(warrantyFormId.longValue());

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
     * Returns the device where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
     *
     * @param serialNumber the serial number
     * @return the matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findBySerialNumber(String serialNumber)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchBySerialNumber(serialNumber);

        if (device == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("serialNumber=");
            msg.append(serialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceException(msg.toString());
        }

        return device;
    }

    /**
     * Returns the device where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param serialNumber the serial number
     * @return the matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchBySerialNumber(String serialNumber)
        throws SystemException {
        return fetchBySerialNumber(serialNumber, true);
    }

    /**
     * Returns the device where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param serialNumber the serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchBySerialNumber(String serialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { serialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof Device) {
            Device device = (Device) result;

            if (!Validator.equals(serialNumber, device.getSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICE_WHERE);

            boolean bindSerialNumber = false;

            if (serialNumber == null) {
                query.append(_FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_1);
            } else if (serialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_3);
            } else {
                bindSerialNumber = true;

                query.append(_FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindSerialNumber) {
                    qPos.add(serialNumber);
                }

                List<Device> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                        finderArgs, list);
                } else {
                    Device device = list.get(0);

                    result = device;

                    cacheResult(device);

                    if ((device.getSerialNumber() == null) ||
                            !device.getSerialNumber().equals(serialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                            finderArgs, device);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Device) result;
        }
    }

    /**
     * Removes the device where serialNumber = &#63; from the database.
     *
     * @param serialNumber the serial number
     * @return the device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device removeBySerialNumber(String serialNumber)
        throws NoSuchDeviceException, SystemException {
        Device device = findBySerialNumber(serialNumber);

        return remove(device);
    }

    /**
     * Returns the number of devices where serialNumber = &#63;.
     *
     * @param serialNumber the serial number
     * @return the number of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBySerialNumber(String serialNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SERIALNUMBER;

        Object[] finderArgs = new Object[] { serialNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_WHERE);

            boolean bindSerialNumber = false;

            if (serialNumber == null) {
                query.append(_FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_1);
            } else if (serialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_3);
            } else {
                bindSerialNumber = true;

                query.append(_FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindSerialNumber) {
                    qPos.add(serialNumber);
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
     * Returns the device where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByGponSerialNumber(String gponSerialNumber)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByGponSerialNumber(gponSerialNumber);

        if (device == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("gponSerialNumber=");
            msg.append(gponSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceException(msg.toString());
        }

        return device;
    }

    /**
     * Returns the device where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByGponSerialNumber(String gponSerialNumber)
        throws SystemException {
        return fetchByGponSerialNumber(gponSerialNumber, true);
    }

    /**
     * Returns the device where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param gponSerialNumber the gpon serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByGponSerialNumber(String gponSerialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { gponSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof Device) {
            Device device = (Device) result;

            if (!Validator.equals(gponSerialNumber, device.getGponSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICE_WHERE);

            boolean bindGponSerialNumber = false;

            if (gponSerialNumber == null) {
                query.append(_FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_1);
            } else if (gponSerialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_3);
            } else {
                bindGponSerialNumber = true;

                query.append(_FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindGponSerialNumber) {
                    qPos.add(gponSerialNumber);
                }

                List<Device> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                        finderArgs, list);
                } else {
                    Device device = list.get(0);

                    result = device;

                    cacheResult(device);

                    if ((device.getGponSerialNumber() == null) ||
                            !device.getGponSerialNumber()
                                       .equals(gponSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                            finderArgs, device);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Device) result;
        }
    }

    /**
     * Removes the device where gponSerialNumber = &#63; from the database.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device removeByGponSerialNumber(String gponSerialNumber)
        throws NoSuchDeviceException, SystemException {
        Device device = findByGponSerialNumber(gponSerialNumber);

        return remove(device);
    }

    /**
     * Returns the number of devices where gponSerialNumber = &#63;.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the number of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGponSerialNumber(String gponSerialNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GPONSERIALNUMBER;

        Object[] finderArgs = new Object[] { gponSerialNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_WHERE);

            boolean bindGponSerialNumber = false;

            if (gponSerialNumber == null) {
                query.append(_FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_1);
            } else if (gponSerialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_3);
            } else {
                bindGponSerialNumber = true;

                query.append(_FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindGponSerialNumber) {
                    qPos.add(gponSerialNumber);
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
     * Returns the device where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
     *
     * @param customerSerialNumber the customer serial number
     * @return the matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByCustomerSerialNumber(String customerSerialNumber)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByCustomerSerialNumber(customerSerialNumber);

        if (device == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("customerSerialNumber=");
            msg.append(customerSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceException(msg.toString());
        }

        return device;
    }

    /**
     * Returns the device where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param customerSerialNumber the customer serial number
     * @return the matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByCustomerSerialNumber(String customerSerialNumber)
        throws SystemException {
        return fetchByCustomerSerialNumber(customerSerialNumber, true);
    }

    /**
     * Returns the device where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param customerSerialNumber the customer serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByCustomerSerialNumber(String customerSerialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { customerSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof Device) {
            Device device = (Device) result;

            if (!Validator.equals(customerSerialNumber,
                        device.getCustomerSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICE_WHERE);

            boolean bindCustomerSerialNumber = false;

            if (customerSerialNumber == null) {
                query.append(_FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_1);
            } else if (customerSerialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_3);
            } else {
                bindCustomerSerialNumber = true;

                query.append(_FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCustomerSerialNumber) {
                    qPos.add(customerSerialNumber);
                }

                List<Device> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                        finderArgs, list);
                } else {
                    Device device = list.get(0);

                    result = device;

                    cacheResult(device);

                    if ((device.getCustomerSerialNumber() == null) ||
                            !device.getCustomerSerialNumber()
                                       .equals(customerSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                            finderArgs, device);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Device) result;
        }
    }

    /**
     * Removes the device where customerSerialNumber = &#63; from the database.
     *
     * @param customerSerialNumber the customer serial number
     * @return the device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device removeByCustomerSerialNumber(String customerSerialNumber)
        throws NoSuchDeviceException, SystemException {
        Device device = findByCustomerSerialNumber(customerSerialNumber);

        return remove(device);
    }

    /**
     * Returns the number of devices where customerSerialNumber = &#63;.
     *
     * @param customerSerialNumber the customer serial number
     * @return the number of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCustomerSerialNumber(String customerSerialNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER;

        Object[] finderArgs = new Object[] { customerSerialNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_WHERE);

            boolean bindCustomerSerialNumber = false;

            if (customerSerialNumber == null) {
                query.append(_FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_1);
            } else if (customerSerialNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_3);
            } else {
                bindCustomerSerialNumber = true;

                query.append(_FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCustomerSerialNumber) {
                    qPos.add(customerSerialNumber);
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
     * Returns all the devices where status = &#63;.
     *
     * @param status the status
     * @return the matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByStatus(int status) throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the devices where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of devices
     * @param end the upper bound of the range of devices (not inclusive)
     * @return the range of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByStatus(int status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the devices where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of devices
     * @param end the upper bound of the range of devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findByStatus(int status, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
            finderArgs = new Object[] { status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
            finderArgs = new Object[] { status, start, end, orderByComparator };
        }

        List<Device> list = (List<Device>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Device device : list) {
                if ((status != device.getStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_DEVICE_WHERE);

            query.append(_FINDER_COLUMN_STATUS_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(status);

                if (!pagination) {
                    list = (List<Device>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Device>(list);
                } else {
                    list = (List<Device>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first device in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByStatus_First(int status,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByStatus_First(status, orderByComparator);

        if (device != null) {
            return device;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceException(msg.toString());
    }

    /**
     * Returns the first device in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByStatus_First(int status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Device> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByStatus_Last(int status,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByStatus_Last(status, orderByComparator);

        if (device != null) {
            return device;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceException(msg.toString());
    }

    /**
     * Returns the last device in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device, or <code>null</code> if a matching device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByStatus_Last(int status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<Device> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the devices before and after the current device in the ordered set where status = &#63;.
     *
     * @param deviceId the primary key of the current device
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device[] findByStatus_PrevAndNext(long deviceId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceException, SystemException {
        Device device = findByPrimaryKey(deviceId);

        Session session = null;

        try {
            session = openSession();

            Device[] array = new DeviceImpl[3];

            array[0] = getByStatus_PrevAndNext(session, device, status,
                    orderByComparator, true);

            array[1] = device;

            array[2] = getByStatus_PrevAndNext(session, device, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Device getByStatus_PrevAndNext(Session session, Device device,
        int status, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICE_WHERE);

        query.append(_FINDER_COLUMN_STATUS_STATUS_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(DeviceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(device);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Device> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the devices where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(int status) throws SystemException {
        for (Device device : findByStatus(status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(device);
        }
    }

    /**
     * Returns the number of devices where status = &#63;.
     *
     * @param status the status
     * @return the number of matching devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByStatus(int status) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

        Object[] finderArgs = new Object[] { status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_WHERE);

            query.append(_FINDER_COLUMN_STATUS_STATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(status);

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
     * Caches the device in the entity cache if it is enabled.
     *
     * @param device the device
     */
    @Override
    public void cacheResult(Device device) {
        EntityCacheUtil.putResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceImpl.class, device.getPrimaryKey(), device);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID,
            new Object[] { device.getWarrantyFormId() }, device);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
            new Object[] { device.getSerialNumber() }, device);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
            new Object[] { device.getGponSerialNumber() }, device);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
            new Object[] { device.getCustomerSerialNumber() }, device);

        device.resetOriginalValues();
    }

    /**
     * Caches the devices in the entity cache if it is enabled.
     *
     * @param devices the devices
     */
    @Override
    public void cacheResult(List<Device> devices) {
        for (Device device : devices) {
            if (EntityCacheUtil.getResult(
                        DeviceModelImpl.ENTITY_CACHE_ENABLED, DeviceImpl.class,
                        device.getPrimaryKey()) == null) {
                cacheResult(device);
            } else {
                device.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all devices.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DeviceImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DeviceImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the device.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Device device) {
        EntityCacheUtil.removeResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceImpl.class, device.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(device);
    }

    @Override
    public void clearCache(List<Device> devices) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Device device : devices) {
            EntityCacheUtil.removeResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
                DeviceImpl.class, device.getPrimaryKey());

            clearUniqueFindersCache(device);
        }
    }

    protected void cacheUniqueFindersCache(Device device) {
        if (device.isNew()) {
            Object[] args = new Object[] { device.getWarrantyFormId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_WARRANTYFORMID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID,
                args, device);

            args = new Object[] { device.getSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args,
                device);

            args = new Object[] { device.getGponSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                args, device);

            args = new Object[] { device.getCustomerSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                args, device);
        } else {
            DeviceModelImpl deviceModelImpl = (DeviceModelImpl) device;

            if ((deviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_WARRANTYFORMID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { device.getWarrantyFormId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_WARRANTYFORMID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID,
                    args, device);
            }

            if ((deviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_SERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { device.getSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    args, device);
            }

            if ((deviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_GPONSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { device.getGponSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    args, device);
            }

            if ((deviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { device.getCustomerSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    args, device);
            }
        }
    }

    protected void clearUniqueFindersCache(Device device) {
        DeviceModelImpl deviceModelImpl = (DeviceModelImpl) device;

        Object[] args = new Object[] { device.getWarrantyFormId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WARRANTYFORMID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID, args);

        if ((deviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_WARRANTYFORMID.getColumnBitmask()) != 0) {
            args = new Object[] { deviceModelImpl.getOriginalWarrantyFormId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WARRANTYFORMID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_WARRANTYFORMID,
                args);
        }

        args = new Object[] { device.getSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args);

        if ((deviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_SERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] { deviceModelImpl.getOriginalSerialNumber() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args);
        }

        args = new Object[] { device.getGponSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER, args);

        if ((deviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_GPONSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] { deviceModelImpl.getOriginalGponSerialNumber() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                args);
        }

        args = new Object[] { device.getCustomerSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
            args);

        if ((deviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    deviceModelImpl.getOriginalCustomerSerialNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                args);
        }
    }

    /**
     * Creates a new device with the primary key. Does not add the device to the database.
     *
     * @param deviceId the primary key for the new device
     * @return the new device
     */
    @Override
    public Device create(long deviceId) {
        Device device = new DeviceImpl();

        device.setNew(true);
        device.setPrimaryKey(deviceId);

        return device;
    }

    /**
     * Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param deviceId the primary key of the device
     * @return the device that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device remove(long deviceId)
        throws NoSuchDeviceException, SystemException {
        return remove((Serializable) deviceId);
    }

    /**
     * Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the device
     * @return the device that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device remove(Serializable primaryKey)
        throws NoSuchDeviceException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Device device = (Device) session.get(DeviceImpl.class, primaryKey);

            if (device == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(device);
        } catch (NoSuchDeviceException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Device removeImpl(Device device) throws SystemException {
        device = toUnwrappedModel(device);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(device)) {
                device = (Device) session.get(DeviceImpl.class,
                        device.getPrimaryKeyObj());
            }

            if (device != null) {
                session.delete(device);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (device != null) {
            clearCache(device);
        }

        return device;
    }

    @Override
    public Device updateImpl(com.dasannetworks.vn.sb.model.Device device)
        throws SystemException {
        device = toUnwrappedModel(device);

        boolean isNew = device.isNew();

        DeviceModelImpl deviceModelImpl = (DeviceModelImpl) device;

        Session session = null;

        try {
            session = openSession();

            if (device.isNew()) {
                session.save(device);

                device.setNew(false);
            } else {
                session.merge(device);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !DeviceModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((deviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceModelImpl.getOriginalPurchaseOrderId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURCHASEORDERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID,
                    args);

                args = new Object[] { deviceModelImpl.getPurchaseOrderId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURCHASEORDERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID,
                    args);
            }

            if ((deviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceModelImpl.getOriginalModelName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);

                args = new Object[] { deviceModelImpl.getModelName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);
            }

            if ((deviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceModelImpl.getOriginalStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { deviceModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
            DeviceImpl.class, device.getPrimaryKey(), device);

        clearUniqueFindersCache(device);
        cacheUniqueFindersCache(device);

        return device;
    }

    protected Device toUnwrappedModel(Device device) {
        if (device instanceof DeviceImpl) {
            return device;
        }

        DeviceImpl deviceImpl = new DeviceImpl();

        deviceImpl.setNew(device.isNew());
        deviceImpl.setPrimaryKey(device.getPrimaryKey());

        deviceImpl.setDeviceId(device.getDeviceId());
        deviceImpl.setGroupId(device.getGroupId());
        deviceImpl.setCompanyId(device.getCompanyId());
        deviceImpl.setUserId(device.getUserId());
        deviceImpl.setUserName(device.getUserName());
        deviceImpl.setCreateDate(device.getCreateDate());
        deviceImpl.setModifiedDate(device.getModifiedDate());
        deviceImpl.setModelName(device.getModelName());
        deviceImpl.setSerialNumber(device.getSerialNumber());
        deviceImpl.setGponSerialNumber(device.getGponSerialNumber());
        deviceImpl.setBoxSerialNumber(device.getBoxSerialNumber());
        deviceImpl.setCustomerSerialNumber(device.getCustomerSerialNumber());
        deviceImpl.setManufacturerSerialNumber(device.getManufacturerSerialNumber());
        deviceImpl.setHardwareRevision(device.getHardwareRevision());
        deviceImpl.setSoftwareRevision(device.getSoftwareRevision());
        deviceImpl.setMacAddress(device.getMacAddress());
        deviceImpl.setPartNumber(device.getPartNumber());
        deviceImpl.setSpecification(device.getSpecification());
        deviceImpl.setFactoryOut(device.getFactoryOut());
        deviceImpl.setPurchaseOrderId(device.getPurchaseOrderId());
        deviceImpl.setWarrantyFormId(device.getWarrantyFormId());
        deviceImpl.setStatus(device.getStatus());

        return deviceImpl;
    }

    /**
     * Returns the device with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the device
     * @return the device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDeviceException, SystemException {
        Device device = fetchByPrimaryKey(primaryKey);

        if (device == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return device;
    }

    /**
     * Returns the device with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
     *
     * @param deviceId the primary key of the device
     * @return the device
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device findByPrimaryKey(long deviceId)
        throws NoSuchDeviceException, SystemException {
        return findByPrimaryKey((Serializable) deviceId);
    }

    /**
     * Returns the device with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the device
     * @return the device, or <code>null</code> if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Device device = (Device) EntityCacheUtil.getResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
                DeviceImpl.class, primaryKey);

        if (device == _nullDevice) {
            return null;
        }

        if (device == null) {
            Session session = null;

            try {
                session = openSession();

                device = (Device) session.get(DeviceImpl.class, primaryKey);

                if (device != null) {
                    cacheResult(device);
                } else {
                    EntityCacheUtil.putResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceImpl.class, primaryKey, _nullDevice);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
                    DeviceImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return device;
    }

    /**
     * Returns the device with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param deviceId the primary key of the device
     * @return the device, or <code>null</code> if a device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device fetchByPrimaryKey(long deviceId) throws SystemException {
        return fetchByPrimaryKey((Serializable) deviceId);
    }

    /**
     * Returns all the devices.
     *
     * @return the devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Device> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the devices.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of devices
     * @param end the upper bound of the range of devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device> findAll(int start, int end,
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

        List<Device> list = (List<Device>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEVICE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEVICE;

                if (pagination) {
                    sql = sql.concat(DeviceModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Device>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Device>(list);
                } else {
                    list = (List<Device>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the devices from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Device device : findAll()) {
            remove(device);
        }
    }

    /**
     * Returns the number of devices.
     *
     * @return the number of devices
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

                Query q = session.createQuery(_SQL_COUNT_DEVICE);

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
     * Initializes the device persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.Device")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Device>> listenersList = new ArrayList<ModelListener<Device>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Device>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DeviceImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
