package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchDeviceHisException;
import com.dasannetworks.vn.sb.model.DeviceHis;
import com.dasannetworks.vn.sb.model.impl.DeviceHisImpl;
import com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl;
import com.dasannetworks.vn.sb.service.persistence.DeviceHisPersistence;

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
 * The persistence implementation for the device his service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceHisPersistence
 * @see DeviceHisUtil
 * @generated
 */
public class DeviceHisPersistenceImpl extends BasePersistenceImpl<DeviceHis>
    implements DeviceHisPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DeviceHisUtil} to access the device his persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DeviceHisImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PURCHASEORDERID =
        new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPurchaseOrderId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID =
        new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPurchaseOrderId",
            new String[] { Long.class.getName() },
            DeviceHisModelImpl.PURCHASEORDERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PURCHASEORDERID = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPurchaseOrderId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PURCHASEORDERID_PURCHASEORDERID_2 =
        "deviceHis.purchaseOrderId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByModelName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByModelName",
            new String[] { String.class.getName() },
            DeviceHisModelImpl.MODELNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_MODELNAME = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByModelName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_1 = "deviceHis.modelName IS NULL";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_2 = "deviceHis.modelName = ?";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_3 = "(deviceHis.modelName IS NULL OR deviceHis.modelName = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WARRANTYFORMID =
        new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWarrantyFormId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WARRANTYFORMID =
        new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWarrantyFormId",
            new String[] { Long.class.getName() },
            DeviceHisModelImpl.WARRANTYFORMID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_WARRANTYFORMID = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWarrantyFormId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_WARRANTYFORMID_WARRANTYFORMID_2 = "deviceHis.warrantyFormId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_SERIALNUMBER = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchBySerialNumber",
            new String[] { String.class.getName() },
            DeviceHisModelImpl.SERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERIALNUMBER = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_1 = "deviceHis.serialNumber IS NULL";
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_2 = "deviceHis.serialNumber = ?";
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_3 = "(deviceHis.serialNumber IS NULL OR deviceHis.serialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_GPONSERIALNUMBER = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByGponSerialNumber",
            new String[] { String.class.getName() },
            DeviceHisModelImpl.GPONSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GPONSERIALNUMBER = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByGponSerialNumber", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_1 =
        "deviceHis.gponSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_2 =
        "deviceHis.gponSerialNumber = ?";
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_3 =
        "(deviceHis.gponSerialNumber IS NULL OR deviceHis.gponSerialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByCustomerSerialNumber",
            new String[] { String.class.getName() },
            DeviceHisModelImpl.CUSTOMERSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCustomerSerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_1 =
        "deviceHis.customerSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_2 =
        "deviceHis.customerSerialNumber = ?";
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_3 =
        "(deviceHis.customerSerialNumber IS NULL OR deviceHis.customerSerialNumber = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, DeviceHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { Integer.class.getName() },
            DeviceHisModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "deviceHis.status = ?";
    private static final String _SQL_SELECT_DEVICEHIS = "SELECT deviceHis FROM DeviceHis deviceHis";
    private static final String _SQL_SELECT_DEVICEHIS_WHERE = "SELECT deviceHis FROM DeviceHis deviceHis WHERE ";
    private static final String _SQL_COUNT_DEVICEHIS = "SELECT COUNT(deviceHis) FROM DeviceHis deviceHis";
    private static final String _SQL_COUNT_DEVICEHIS_WHERE = "SELECT COUNT(deviceHis) FROM DeviceHis deviceHis WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "deviceHis.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DeviceHis exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DeviceHis exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DeviceHisPersistenceImpl.class);
    private static DeviceHis _nullDeviceHis = new DeviceHisImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DeviceHis> toCacheModel() {
                return _nullDeviceHisCacheModel;
            }
        };

    private static CacheModel<DeviceHis> _nullDeviceHisCacheModel = new CacheModel<DeviceHis>() {
            @Override
            public DeviceHis toEntityModel() {
                return _nullDeviceHis;
            }
        };

    public DeviceHisPersistenceImpl() {
        setModelClass(DeviceHis.class);
    }

    /**
     * Returns all the device hises where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @return the matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByPurchaseOrderId(Long purchaseOrderId)
        throws SystemException {
        return findByPurchaseOrderId(purchaseOrderId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device hises where purchaseOrderId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param purchaseOrderId the purchase order ID
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @return the range of matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByPurchaseOrderId(Long purchaseOrderId,
        int start, int end) throws SystemException {
        return findByPurchaseOrderId(purchaseOrderId, start, end, null);
    }

    /**
     * Returns an ordered range of all the device hises where purchaseOrderId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param purchaseOrderId the purchase order ID
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByPurchaseOrderId(Long purchaseOrderId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
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

        List<DeviceHis> list = (List<DeviceHis>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceHis deviceHis : list) {
                if (!Validator.equals(purchaseOrderId,
                            deviceHis.getPurchaseOrderId())) {
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

            query.append(_SQL_SELECT_DEVICEHIS_WHERE);

            query.append(_FINDER_COLUMN_PURCHASEORDERID_PURCHASEORDERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceHisModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(purchaseOrderId.longValue());

                if (!pagination) {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceHis>(list);
                } else {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
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
     * Returns the first device his in the ordered set where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByPurchaseOrderId_First(Long purchaseOrderId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByPurchaseOrderId_First(purchaseOrderId,
                orderByComparator);

        if (deviceHis != null) {
            return deviceHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("purchaseOrderId=");
        msg.append(purchaseOrderId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceHisException(msg.toString());
    }

    /**
     * Returns the first device his in the ordered set where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByPurchaseOrderId_First(Long purchaseOrderId,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceHis> list = findByPurchaseOrderId(purchaseOrderId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device his in the ordered set where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByPurchaseOrderId_Last(Long purchaseOrderId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByPurchaseOrderId_Last(purchaseOrderId,
                orderByComparator);

        if (deviceHis != null) {
            return deviceHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("purchaseOrderId=");
        msg.append(purchaseOrderId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceHisException(msg.toString());
    }

    /**
     * Returns the last device his in the ordered set where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByPurchaseOrderId_Last(Long purchaseOrderId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPurchaseOrderId(purchaseOrderId);

        if (count == 0) {
            return null;
        }

        List<DeviceHis> list = findByPurchaseOrderId(purchaseOrderId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device hises before and after the current device his in the ordered set where purchaseOrderId = &#63;.
     *
     * @param deviceId the primary key of the current device his
     * @param purchaseOrderId the purchase order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis[] findByPurchaseOrderId_PrevAndNext(long deviceId,
        Long purchaseOrderId, OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = findByPrimaryKey(deviceId);

        Session session = null;

        try {
            session = openSession();

            DeviceHis[] array = new DeviceHisImpl[3];

            array[0] = getByPurchaseOrderId_PrevAndNext(session, deviceHis,
                    purchaseOrderId, orderByComparator, true);

            array[1] = deviceHis;

            array[2] = getByPurchaseOrderId_PrevAndNext(session, deviceHis,
                    purchaseOrderId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceHis getByPurchaseOrderId_PrevAndNext(Session session,
        DeviceHis deviceHis, Long purchaseOrderId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEHIS_WHERE);

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
            query.append(DeviceHisModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(purchaseOrderId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(deviceHis);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceHis> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device hises where purchaseOrderId = &#63; from the database.
     *
     * @param purchaseOrderId the purchase order ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPurchaseOrderId(Long purchaseOrderId)
        throws SystemException {
        for (DeviceHis deviceHis : findByPurchaseOrderId(purchaseOrderId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceHis);
        }
    }

    /**
     * Returns the number of device hises where purchaseOrderId = &#63;.
     *
     * @param purchaseOrderId the purchase order ID
     * @return the number of matching device hises
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

            query.append(_SQL_COUNT_DEVICEHIS_WHERE);

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
     * Returns all the device hises where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByModelName(String modelName)
        throws SystemException {
        return findByModelName(modelName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the device hises where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @return the range of matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByModelName(String modelName, int start, int end)
        throws SystemException {
        return findByModelName(modelName, start, end, null);
    }

    /**
     * Returns an ordered range of all the device hises where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByModelName(String modelName, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
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

        List<DeviceHis> list = (List<DeviceHis>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceHis deviceHis : list) {
                if (!Validator.equals(modelName, deviceHis.getModelName())) {
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

            query.append(_SQL_SELECT_DEVICEHIS_WHERE);

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
                query.append(DeviceHisModelImpl.ORDER_BY_JPQL);
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
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceHis>(list);
                } else {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
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
     * Returns the first device his in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByModelName_First(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByModelName_First(modelName,
                orderByComparator);

        if (deviceHis != null) {
            return deviceHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceHisException(msg.toString());
    }

    /**
     * Returns the first device his in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByModelName_First(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceHis> list = findByModelName(modelName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device his in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByModelName_Last(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByModelName_Last(modelName, orderByComparator);

        if (deviceHis != null) {
            return deviceHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceHisException(msg.toString());
    }

    /**
     * Returns the last device his in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByModelName_Last(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByModelName(modelName);

        if (count == 0) {
            return null;
        }

        List<DeviceHis> list = findByModelName(modelName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device hises before and after the current device his in the ordered set where modelName = &#63;.
     *
     * @param deviceId the primary key of the current device his
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis[] findByModelName_PrevAndNext(long deviceId,
        String modelName, OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = findByPrimaryKey(deviceId);

        Session session = null;

        try {
            session = openSession();

            DeviceHis[] array = new DeviceHisImpl[3];

            array[0] = getByModelName_PrevAndNext(session, deviceHis,
                    modelName, orderByComparator, true);

            array[1] = deviceHis;

            array[2] = getByModelName_PrevAndNext(session, deviceHis,
                    modelName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceHis getByModelName_PrevAndNext(Session session,
        DeviceHis deviceHis, String modelName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEHIS_WHERE);

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
            query.append(DeviceHisModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(deviceHis);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceHis> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device hises where modelName = &#63; from the database.
     *
     * @param modelName the model name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByModelName(String modelName) throws SystemException {
        for (DeviceHis deviceHis : findByModelName(modelName,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceHis);
        }
    }

    /**
     * Returns the number of device hises where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the number of matching device hises
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

            query.append(_SQL_COUNT_DEVICEHIS_WHERE);

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
     * Returns all the device hises where warrantyFormId = &#63;.
     *
     * @param warrantyFormId the warranty form ID
     * @return the matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByWarrantyFormId(Long warrantyFormId)
        throws SystemException {
        return findByWarrantyFormId(warrantyFormId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device hises where warrantyFormId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param warrantyFormId the warranty form ID
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @return the range of matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByWarrantyFormId(Long warrantyFormId, int start,
        int end) throws SystemException {
        return findByWarrantyFormId(warrantyFormId, start, end, null);
    }

    /**
     * Returns an ordered range of all the device hises where warrantyFormId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param warrantyFormId the warranty form ID
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByWarrantyFormId(Long warrantyFormId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WARRANTYFORMID;
            finderArgs = new Object[] { warrantyFormId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WARRANTYFORMID;
            finderArgs = new Object[] {
                    warrantyFormId,
                    
                    start, end, orderByComparator
                };
        }

        List<DeviceHis> list = (List<DeviceHis>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceHis deviceHis : list) {
                if (!Validator.equals(warrantyFormId,
                            deviceHis.getWarrantyFormId())) {
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

            query.append(_SQL_SELECT_DEVICEHIS_WHERE);

            query.append(_FINDER_COLUMN_WARRANTYFORMID_WARRANTYFORMID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceHisModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(warrantyFormId.longValue());

                if (!pagination) {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceHis>(list);
                } else {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
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
     * Returns the first device his in the ordered set where warrantyFormId = &#63;.
     *
     * @param warrantyFormId the warranty form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByWarrantyFormId_First(Long warrantyFormId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByWarrantyFormId_First(warrantyFormId,
                orderByComparator);

        if (deviceHis != null) {
            return deviceHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("warrantyFormId=");
        msg.append(warrantyFormId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceHisException(msg.toString());
    }

    /**
     * Returns the first device his in the ordered set where warrantyFormId = &#63;.
     *
     * @param warrantyFormId the warranty form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByWarrantyFormId_First(Long warrantyFormId,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceHis> list = findByWarrantyFormId(warrantyFormId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device his in the ordered set where warrantyFormId = &#63;.
     *
     * @param warrantyFormId the warranty form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByWarrantyFormId_Last(Long warrantyFormId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByWarrantyFormId_Last(warrantyFormId,
                orderByComparator);

        if (deviceHis != null) {
            return deviceHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("warrantyFormId=");
        msg.append(warrantyFormId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceHisException(msg.toString());
    }

    /**
     * Returns the last device his in the ordered set where warrantyFormId = &#63;.
     *
     * @param warrantyFormId the warranty form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByWarrantyFormId_Last(Long warrantyFormId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByWarrantyFormId(warrantyFormId);

        if (count == 0) {
            return null;
        }

        List<DeviceHis> list = findByWarrantyFormId(warrantyFormId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device hises before and after the current device his in the ordered set where warrantyFormId = &#63;.
     *
     * @param deviceId the primary key of the current device his
     * @param warrantyFormId the warranty form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis[] findByWarrantyFormId_PrevAndNext(long deviceId,
        Long warrantyFormId, OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = findByPrimaryKey(deviceId);

        Session session = null;

        try {
            session = openSession();

            DeviceHis[] array = new DeviceHisImpl[3];

            array[0] = getByWarrantyFormId_PrevAndNext(session, deviceHis,
                    warrantyFormId, orderByComparator, true);

            array[1] = deviceHis;

            array[2] = getByWarrantyFormId_PrevAndNext(session, deviceHis,
                    warrantyFormId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceHis getByWarrantyFormId_PrevAndNext(Session session,
        DeviceHis deviceHis, Long warrantyFormId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEHIS_WHERE);

        query.append(_FINDER_COLUMN_WARRANTYFORMID_WARRANTYFORMID_2);

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
            query.append(DeviceHisModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(warrantyFormId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(deviceHis);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceHis> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device hises where warrantyFormId = &#63; from the database.
     *
     * @param warrantyFormId the warranty form ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByWarrantyFormId(Long warrantyFormId)
        throws SystemException {
        for (DeviceHis deviceHis : findByWarrantyFormId(warrantyFormId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceHis);
        }
    }

    /**
     * Returns the number of device hises where warrantyFormId = &#63;.
     *
     * @param warrantyFormId the warranty form ID
     * @return the number of matching device hises
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

            query.append(_SQL_COUNT_DEVICEHIS_WHERE);

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
     * Returns the device his where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
     *
     * @param serialNumber the serial number
     * @return the matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findBySerialNumber(String serialNumber)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchBySerialNumber(serialNumber);

        if (deviceHis == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("serialNumber=");
            msg.append(serialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceHisException(msg.toString());
        }

        return deviceHis;
    }

    /**
     * Returns the device his where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param serialNumber the serial number
     * @return the matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchBySerialNumber(String serialNumber)
        throws SystemException {
        return fetchBySerialNumber(serialNumber, true);
    }

    /**
     * Returns the device his where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param serialNumber the serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchBySerialNumber(String serialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { serialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceHis) {
            DeviceHis deviceHis = (DeviceHis) result;

            if (!Validator.equals(serialNumber, deviceHis.getSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEHIS_WHERE);

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

                List<DeviceHis> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceHis deviceHis = list.get(0);

                    result = deviceHis;

                    cacheResult(deviceHis);

                    if ((deviceHis.getSerialNumber() == null) ||
                            !deviceHis.getSerialNumber().equals(serialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                            finderArgs, deviceHis);
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
            return (DeviceHis) result;
        }
    }

    /**
     * Removes the device his where serialNumber = &#63; from the database.
     *
     * @param serialNumber the serial number
     * @return the device his that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis removeBySerialNumber(String serialNumber)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = findBySerialNumber(serialNumber);

        return remove(deviceHis);
    }

    /**
     * Returns the number of device hises where serialNumber = &#63;.
     *
     * @param serialNumber the serial number
     * @return the number of matching device hises
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

            query.append(_SQL_COUNT_DEVICEHIS_WHERE);

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
     * Returns the device his where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByGponSerialNumber(String gponSerialNumber)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByGponSerialNumber(gponSerialNumber);

        if (deviceHis == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("gponSerialNumber=");
            msg.append(gponSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceHisException(msg.toString());
        }

        return deviceHis;
    }

    /**
     * Returns the device his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByGponSerialNumber(String gponSerialNumber)
        throws SystemException {
        return fetchByGponSerialNumber(gponSerialNumber, true);
    }

    /**
     * Returns the device his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param gponSerialNumber the gpon serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByGponSerialNumber(String gponSerialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { gponSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceHis) {
            DeviceHis deviceHis = (DeviceHis) result;

            if (!Validator.equals(gponSerialNumber,
                        deviceHis.getGponSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEHIS_WHERE);

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

                List<DeviceHis> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceHis deviceHis = list.get(0);

                    result = deviceHis;

                    cacheResult(deviceHis);

                    if ((deviceHis.getGponSerialNumber() == null) ||
                            !deviceHis.getGponSerialNumber()
                                          .equals(gponSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                            finderArgs, deviceHis);
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
            return (DeviceHis) result;
        }
    }

    /**
     * Removes the device his where gponSerialNumber = &#63; from the database.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the device his that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis removeByGponSerialNumber(String gponSerialNumber)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = findByGponSerialNumber(gponSerialNumber);

        return remove(deviceHis);
    }

    /**
     * Returns the number of device hises where gponSerialNumber = &#63;.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the number of matching device hises
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

            query.append(_SQL_COUNT_DEVICEHIS_WHERE);

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
     * Returns the device his where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
     *
     * @param customerSerialNumber the customer serial number
     * @return the matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByCustomerSerialNumber(String customerSerialNumber)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByCustomerSerialNumber(customerSerialNumber);

        if (deviceHis == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("customerSerialNumber=");
            msg.append(customerSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceHisException(msg.toString());
        }

        return deviceHis;
    }

    /**
     * Returns the device his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param customerSerialNumber the customer serial number
     * @return the matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByCustomerSerialNumber(String customerSerialNumber)
        throws SystemException {
        return fetchByCustomerSerialNumber(customerSerialNumber, true);
    }

    /**
     * Returns the device his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param customerSerialNumber the customer serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByCustomerSerialNumber(String customerSerialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { customerSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceHis) {
            DeviceHis deviceHis = (DeviceHis) result;

            if (!Validator.equals(customerSerialNumber,
                        deviceHis.getCustomerSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEHIS_WHERE);

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

                List<DeviceHis> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceHis deviceHis = list.get(0);

                    result = deviceHis;

                    cacheResult(deviceHis);

                    if ((deviceHis.getCustomerSerialNumber() == null) ||
                            !deviceHis.getCustomerSerialNumber()
                                          .equals(customerSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                            finderArgs, deviceHis);
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
            return (DeviceHis) result;
        }
    }

    /**
     * Removes the device his where customerSerialNumber = &#63; from the database.
     *
     * @param customerSerialNumber the customer serial number
     * @return the device his that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis removeByCustomerSerialNumber(String customerSerialNumber)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = findByCustomerSerialNumber(customerSerialNumber);

        return remove(deviceHis);
    }

    /**
     * Returns the number of device hises where customerSerialNumber = &#63;.
     *
     * @param customerSerialNumber the customer serial number
     * @return the number of matching device hises
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

            query.append(_SQL_COUNT_DEVICEHIS_WHERE);

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
     * Returns all the device hises where status = &#63;.
     *
     * @param status the status
     * @return the matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByStatus(int status) throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device hises where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @return the range of matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByStatus(int status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the device hises where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findByStatus(int status, int start, int end,
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

        List<DeviceHis> list = (List<DeviceHis>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceHis deviceHis : list) {
                if ((status != deviceHis.getStatus())) {
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

            query.append(_SQL_SELECT_DEVICEHIS_WHERE);

            query.append(_FINDER_COLUMN_STATUS_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceHisModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(status);

                if (!pagination) {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceHis>(list);
                } else {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
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
     * Returns the first device his in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByStatus_First(int status,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByStatus_First(status, orderByComparator);

        if (deviceHis != null) {
            return deviceHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceHisException(msg.toString());
    }

    /**
     * Returns the first device his in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByStatus_First(int status,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceHis> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device his in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByStatus_Last(int status,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByStatus_Last(status, orderByComparator);

        if (deviceHis != null) {
            return deviceHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceHisException(msg.toString());
    }

    /**
     * Returns the last device his in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device his, or <code>null</code> if a matching device his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByStatus_Last(int status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<DeviceHis> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device hises before and after the current device his in the ordered set where status = &#63;.
     *
     * @param deviceId the primary key of the current device his
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis[] findByStatus_PrevAndNext(long deviceId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = findByPrimaryKey(deviceId);

        Session session = null;

        try {
            session = openSession();

            DeviceHis[] array = new DeviceHisImpl[3];

            array[0] = getByStatus_PrevAndNext(session, deviceHis, status,
                    orderByComparator, true);

            array[1] = deviceHis;

            array[2] = getByStatus_PrevAndNext(session, deviceHis, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceHis getByStatus_PrevAndNext(Session session,
        DeviceHis deviceHis, int status, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEHIS_WHERE);

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
            query.append(DeviceHisModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(deviceHis);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceHis> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device hises where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(int status) throws SystemException {
        for (DeviceHis deviceHis : findByStatus(status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(deviceHis);
        }
    }

    /**
     * Returns the number of device hises where status = &#63;.
     *
     * @param status the status
     * @return the number of matching device hises
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

            query.append(_SQL_COUNT_DEVICEHIS_WHERE);

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
     * Caches the device his in the entity cache if it is enabled.
     *
     * @param deviceHis the device his
     */
    @Override
    public void cacheResult(DeviceHis deviceHis) {
        EntityCacheUtil.putResult(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisImpl.class, deviceHis.getPrimaryKey(), deviceHis);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
            new Object[] { deviceHis.getSerialNumber() }, deviceHis);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
            new Object[] { deviceHis.getGponSerialNumber() }, deviceHis);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
            new Object[] { deviceHis.getCustomerSerialNumber() }, deviceHis);

        deviceHis.resetOriginalValues();
    }

    /**
     * Caches the device hises in the entity cache if it is enabled.
     *
     * @param deviceHises the device hises
     */
    @Override
    public void cacheResult(List<DeviceHis> deviceHises) {
        for (DeviceHis deviceHis : deviceHises) {
            if (EntityCacheUtil.getResult(
                        DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceHisImpl.class, deviceHis.getPrimaryKey()) == null) {
                cacheResult(deviceHis);
            } else {
                deviceHis.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all device hises.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DeviceHisImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DeviceHisImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the device his.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DeviceHis deviceHis) {
        EntityCacheUtil.removeResult(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisImpl.class, deviceHis.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(deviceHis);
    }

    @Override
    public void clearCache(List<DeviceHis> deviceHises) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DeviceHis deviceHis : deviceHises) {
            EntityCacheUtil.removeResult(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
                DeviceHisImpl.class, deviceHis.getPrimaryKey());

            clearUniqueFindersCache(deviceHis);
        }
    }

    protected void cacheUniqueFindersCache(DeviceHis deviceHis) {
        if (deviceHis.isNew()) {
            Object[] args = new Object[] { deviceHis.getSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args,
                deviceHis);

            args = new Object[] { deviceHis.getGponSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                args, deviceHis);

            args = new Object[] { deviceHis.getCustomerSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                args, deviceHis);
        } else {
            DeviceHisModelImpl deviceHisModelImpl = (DeviceHisModelImpl) deviceHis;

            if ((deviceHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_SERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceHis.getSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    args, deviceHis);
            }

            if ((deviceHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_GPONSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceHis.getGponSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    args, deviceHis);
            }

            if ((deviceHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceHis.getCustomerSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    args, deviceHis);
            }
        }
    }

    protected void clearUniqueFindersCache(DeviceHis deviceHis) {
        DeviceHisModelImpl deviceHisModelImpl = (DeviceHisModelImpl) deviceHis;

        Object[] args = new Object[] { deviceHis.getSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args);

        if ((deviceHisModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_SERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] { deviceHisModelImpl.getOriginalSerialNumber() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args);
        }

        args = new Object[] { deviceHis.getGponSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER, args);

        if ((deviceHisModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_GPONSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] { deviceHisModelImpl.getOriginalGponSerialNumber() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                args);
        }

        args = new Object[] { deviceHis.getCustomerSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
            args);

        if ((deviceHisModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    deviceHisModelImpl.getOriginalCustomerSerialNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                args);
        }
    }

    /**
     * Creates a new device his with the primary key. Does not add the device his to the database.
     *
     * @param deviceId the primary key for the new device his
     * @return the new device his
     */
    @Override
    public DeviceHis create(long deviceId) {
        DeviceHis deviceHis = new DeviceHisImpl();

        deviceHis.setNew(true);
        deviceHis.setPrimaryKey(deviceId);

        return deviceHis;
    }

    /**
     * Removes the device his with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param deviceId the primary key of the device his
     * @return the device his that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis remove(long deviceId)
        throws NoSuchDeviceHisException, SystemException {
        return remove((Serializable) deviceId);
    }

    /**
     * Removes the device his with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the device his
     * @return the device his that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis remove(Serializable primaryKey)
        throws NoSuchDeviceHisException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DeviceHis deviceHis = (DeviceHis) session.get(DeviceHisImpl.class,
                    primaryKey);

            if (deviceHis == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDeviceHisException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(deviceHis);
        } catch (NoSuchDeviceHisException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DeviceHis removeImpl(DeviceHis deviceHis)
        throws SystemException {
        deviceHis = toUnwrappedModel(deviceHis);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(deviceHis)) {
                deviceHis = (DeviceHis) session.get(DeviceHisImpl.class,
                        deviceHis.getPrimaryKeyObj());
            }

            if (deviceHis != null) {
                session.delete(deviceHis);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (deviceHis != null) {
            clearCache(deviceHis);
        }

        return deviceHis;
    }

    @Override
    public DeviceHis updateImpl(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws SystemException {
        deviceHis = toUnwrappedModel(deviceHis);

        boolean isNew = deviceHis.isNew();

        DeviceHisModelImpl deviceHisModelImpl = (DeviceHisModelImpl) deviceHis;

        Session session = null;

        try {
            session = openSession();

            if (deviceHis.isNew()) {
                session.save(deviceHis);

                deviceHis.setNew(false);
            } else {
                session.merge(deviceHis);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !DeviceHisModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((deviceHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceHisModelImpl.getOriginalPurchaseOrderId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURCHASEORDERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID,
                    args);

                args = new Object[] { deviceHisModelImpl.getPurchaseOrderId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURCHASEORDERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASEORDERID,
                    args);
            }

            if ((deviceHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceHisModelImpl.getOriginalModelName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);

                args = new Object[] { deviceHisModelImpl.getModelName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);
            }

            if ((deviceHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WARRANTYFORMID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceHisModelImpl.getOriginalWarrantyFormId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WARRANTYFORMID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WARRANTYFORMID,
                    args);

                args = new Object[] { deviceHisModelImpl.getWarrantyFormId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WARRANTYFORMID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WARRANTYFORMID,
                    args);
            }

            if ((deviceHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceHisModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { deviceHisModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceHisImpl.class, deviceHis.getPrimaryKey(), deviceHis);

        clearUniqueFindersCache(deviceHis);
        cacheUniqueFindersCache(deviceHis);

        return deviceHis;
    }

    protected DeviceHis toUnwrappedModel(DeviceHis deviceHis) {
        if (deviceHis instanceof DeviceHisImpl) {
            return deviceHis;
        }

        DeviceHisImpl deviceHisImpl = new DeviceHisImpl();

        deviceHisImpl.setNew(deviceHis.isNew());
        deviceHisImpl.setPrimaryKey(deviceHis.getPrimaryKey());

        deviceHisImpl.setDeviceId(deviceHis.getDeviceId());
        deviceHisImpl.setGroupId(deviceHis.getGroupId());
        deviceHisImpl.setCompanyId(deviceHis.getCompanyId());
        deviceHisImpl.setUserId(deviceHis.getUserId());
        deviceHisImpl.setUserName(deviceHis.getUserName());
        deviceHisImpl.setCreateDate(deviceHis.getCreateDate());
        deviceHisImpl.setModifiedDate(deviceHis.getModifiedDate());
        deviceHisImpl.setModelName(deviceHis.getModelName());
        deviceHisImpl.setSerialNumber(deviceHis.getSerialNumber());
        deviceHisImpl.setGponSerialNumber(deviceHis.getGponSerialNumber());
        deviceHisImpl.setBoxSerialNumber(deviceHis.getBoxSerialNumber());
        deviceHisImpl.setCustomerSerialNumber(deviceHis.getCustomerSerialNumber());
        deviceHisImpl.setManufacturerSerialNumber(deviceHis.getManufacturerSerialNumber());
        deviceHisImpl.setHardwareRevision(deviceHis.getHardwareRevision());
        deviceHisImpl.setSoftwareRevision(deviceHis.getSoftwareRevision());
        deviceHisImpl.setMacAddress(deviceHis.getMacAddress());
        deviceHisImpl.setPartNumber(deviceHis.getPartNumber());
        deviceHisImpl.setSpecification(deviceHis.getSpecification());
        deviceHisImpl.setFactoryOut(deviceHis.getFactoryOut());
        deviceHisImpl.setPurchaseOrderId(deviceHis.getPurchaseOrderId());
        deviceHisImpl.setWarrantyFormId(deviceHis.getWarrantyFormId());
        deviceHisImpl.setStatus(deviceHis.getStatus());

        return deviceHisImpl;
    }

    /**
     * Returns the device his with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the device his
     * @return the device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDeviceHisException, SystemException {
        DeviceHis deviceHis = fetchByPrimaryKey(primaryKey);

        if (deviceHis == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDeviceHisException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return deviceHis;
    }

    /**
     * Returns the device his with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
     *
     * @param deviceId the primary key of the device his
     * @return the device his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis findByPrimaryKey(long deviceId)
        throws NoSuchDeviceHisException, SystemException {
        return findByPrimaryKey((Serializable) deviceId);
    }

    /**
     * Returns the device his with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the device his
     * @return the device his, or <code>null</code> if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DeviceHis deviceHis = (DeviceHis) EntityCacheUtil.getResult(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
                DeviceHisImpl.class, primaryKey);

        if (deviceHis == _nullDeviceHis) {
            return null;
        }

        if (deviceHis == null) {
            Session session = null;

            try {
                session = openSession();

                deviceHis = (DeviceHis) session.get(DeviceHisImpl.class,
                        primaryKey);

                if (deviceHis != null) {
                    cacheResult(deviceHis);
                } else {
                    EntityCacheUtil.putResult(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceHisImpl.class, primaryKey, _nullDeviceHis);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DeviceHisModelImpl.ENTITY_CACHE_ENABLED,
                    DeviceHisImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return deviceHis;
    }

    /**
     * Returns the device his with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param deviceId the primary key of the device his
     * @return the device his, or <code>null</code> if a device his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceHis fetchByPrimaryKey(long deviceId) throws SystemException {
        return fetchByPrimaryKey((Serializable) deviceId);
    }

    /**
     * Returns all the device hises.
     *
     * @return the device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device hises.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @return the range of device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the device hises.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device hises
     * @param end the upper bound of the range of device hises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of device hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceHis> findAll(int start, int end,
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

        List<DeviceHis> list = (List<DeviceHis>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEVICEHIS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEVICEHIS;

                if (pagination) {
                    sql = sql.concat(DeviceHisModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceHis>(list);
                } else {
                    list = (List<DeviceHis>) QueryUtil.list(q, getDialect(),
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
     * Removes all the device hises from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DeviceHis deviceHis : findAll()) {
            remove(deviceHis);
        }
    }

    /**
     * Returns the number of device hises.
     *
     * @return the number of device hises
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

                Query q = session.createQuery(_SQL_COUNT_DEVICEHIS);

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
     * Initializes the device his persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.DeviceHis")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DeviceHis>> listenersList = new ArrayList<ModelListener<DeviceHis>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DeviceHis>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DeviceHisImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
