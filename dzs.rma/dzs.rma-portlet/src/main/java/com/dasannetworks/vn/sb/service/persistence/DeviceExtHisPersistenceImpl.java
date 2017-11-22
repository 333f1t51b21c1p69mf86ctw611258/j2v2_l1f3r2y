package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchDeviceExtHisException;
import com.dasannetworks.vn.sb.model.DeviceExtHis;
import com.dasannetworks.vn.sb.model.impl.DeviceExtHisImpl;
import com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl;
import com.dasannetworks.vn.sb.service.persistence.DeviceExtHisPersistence;

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
 * The persistence implementation for the device ext his service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtHisPersistence
 * @see DeviceExtHisUtil
 * @generated
 */
public class DeviceExtHisPersistenceImpl extends BasePersistenceImpl<DeviceExtHis>
    implements DeviceExtHisPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DeviceExtHisUtil} to access the device ext his persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DeviceExtHisImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEEXTORDERID =
        new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeviceExtOrderId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID =
        new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByDeviceExtOrderId", new String[] { Long.class.getName() },
            DeviceExtHisModelImpl.DEVICEEXTORDERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEEXTORDERID = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByDeviceExtOrderId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_DEVICEEXTORDERID_DEVICEEXTORDERID_2 =
        "deviceExtHis.deviceExtOrderId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByModelName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByModelName",
            new String[] { String.class.getName() },
            DeviceExtHisModelImpl.MODELNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_MODELNAME = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByModelName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_1 = "deviceExtHis.modelName IS NULL";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_2 = "deviceExtHis.modelName = ?";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_3 = "(deviceExtHis.modelName IS NULL OR deviceExtHis.modelName = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_SERIALNUMBER = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchBySerialNumber",
            new String[] { String.class.getName() },
            DeviceExtHisModelImpl.SERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERIALNUMBER = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_1 = "deviceExtHis.serialNumber IS NULL";
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_2 = "deviceExtHis.serialNumber = ?";
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_3 = "(deviceExtHis.serialNumber IS NULL OR deviceExtHis.serialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_GPONSERIALNUMBER = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByGponSerialNumber",
            new String[] { String.class.getName() },
            DeviceExtHisModelImpl.GPONSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GPONSERIALNUMBER = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByGponSerialNumber", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_1 =
        "deviceExtHis.gponSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_2 =
        "deviceExtHis.gponSerialNumber = ?";
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_3 =
        "(deviceExtHis.gponSerialNumber IS NULL OR deviceExtHis.gponSerialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, DeviceExtHisImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByCustomerSerialNumber",
            new String[] { String.class.getName() },
            DeviceExtHisModelImpl.CUSTOMERSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER = new FinderPath(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCustomerSerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_1 =
        "deviceExtHis.customerSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_2 =
        "deviceExtHis.customerSerialNumber = ?";
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_3 =
        "(deviceExtHis.customerSerialNumber IS NULL OR deviceExtHis.customerSerialNumber = '')";
    private static final String _SQL_SELECT_DEVICEEXTHIS = "SELECT deviceExtHis FROM DeviceExtHis deviceExtHis";
    private static final String _SQL_SELECT_DEVICEEXTHIS_WHERE = "SELECT deviceExtHis FROM DeviceExtHis deviceExtHis WHERE ";
    private static final String _SQL_COUNT_DEVICEEXTHIS = "SELECT COUNT(deviceExtHis) FROM DeviceExtHis deviceExtHis";
    private static final String _SQL_COUNT_DEVICEEXTHIS_WHERE = "SELECT COUNT(deviceExtHis) FROM DeviceExtHis deviceExtHis WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "deviceExtHis.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DeviceExtHis exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DeviceExtHis exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DeviceExtHisPersistenceImpl.class);
    private static DeviceExtHis _nullDeviceExtHis = new DeviceExtHisImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DeviceExtHis> toCacheModel() {
                return _nullDeviceExtHisCacheModel;
            }
        };

    private static CacheModel<DeviceExtHis> _nullDeviceExtHisCacheModel = new CacheModel<DeviceExtHis>() {
            @Override
            public DeviceExtHis toEntityModel() {
                return _nullDeviceExtHis;
            }
        };

    public DeviceExtHisPersistenceImpl() {
        setModelClass(DeviceExtHis.class);
    }

    /**
     * Returns all the device ext hises where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @return the matching device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findByDeviceExtOrderId(Long deviceExtOrderId)
        throws SystemException {
        return findByDeviceExtOrderId(deviceExtOrderId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device ext hises where deviceExtOrderId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceExtOrderId the device ext order ID
     * @param start the lower bound of the range of device ext hises
     * @param end the upper bound of the range of device ext hises (not inclusive)
     * @return the range of matching device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findByDeviceExtOrderId(Long deviceExtOrderId,
        int start, int end) throws SystemException {
        return findByDeviceExtOrderId(deviceExtOrderId, start, end, null);
    }

    /**
     * Returns an ordered range of all the device ext hises where deviceExtOrderId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceExtOrderId the device ext order ID
     * @param start the lower bound of the range of device ext hises
     * @param end the upper bound of the range of device ext hises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findByDeviceExtOrderId(Long deviceExtOrderId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID;
            finderArgs = new Object[] { deviceExtOrderId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEEXTORDERID;
            finderArgs = new Object[] {
                    deviceExtOrderId,
                    
                    start, end, orderByComparator
                };
        }

        List<DeviceExtHis> list = (List<DeviceExtHis>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceExtHis deviceExtHis : list) {
                if (!Validator.equals(deviceExtOrderId,
                            deviceExtHis.getDeviceExtOrderId())) {
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

            query.append(_SQL_SELECT_DEVICEEXTHIS_WHERE);

            query.append(_FINDER_COLUMN_DEVICEEXTORDERID_DEVICEEXTORDERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceExtHisModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceExtOrderId.longValue());

                if (!pagination) {
                    list = (List<DeviceExtHis>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceExtHis>(list);
                } else {
                    list = (List<DeviceExtHis>) QueryUtil.list(q, getDialect(),
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
     * Returns the first device ext his in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findByDeviceExtOrderId_First(Long deviceExtOrderId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = fetchByDeviceExtOrderId_First(deviceExtOrderId,
                orderByComparator);

        if (deviceExtHis != null) {
            return deviceExtHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceExtOrderId=");
        msg.append(deviceExtOrderId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceExtHisException(msg.toString());
    }

    /**
     * Returns the first device ext his in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByDeviceExtOrderId_First(Long deviceExtOrderId,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceExtHis> list = findByDeviceExtOrderId(deviceExtOrderId, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device ext his in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findByDeviceExtOrderId_Last(Long deviceExtOrderId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = fetchByDeviceExtOrderId_Last(deviceExtOrderId,
                orderByComparator);

        if (deviceExtHis != null) {
            return deviceExtHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceExtOrderId=");
        msg.append(deviceExtOrderId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceExtHisException(msg.toString());
    }

    /**
     * Returns the last device ext his in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByDeviceExtOrderId_Last(Long deviceExtOrderId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByDeviceExtOrderId(deviceExtOrderId);

        if (count == 0) {
            return null;
        }

        List<DeviceExtHis> list = findByDeviceExtOrderId(deviceExtOrderId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device ext hises before and after the current device ext his in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtId the primary key of the current device ext his
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis[] findByDeviceExtOrderId_PrevAndNext(long deviceExtId,
        Long deviceExtOrderId, OrderByComparator orderByComparator)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = findByPrimaryKey(deviceExtId);

        Session session = null;

        try {
            session = openSession();

            DeviceExtHis[] array = new DeviceExtHisImpl[3];

            array[0] = getByDeviceExtOrderId_PrevAndNext(session, deviceExtHis,
                    deviceExtOrderId, orderByComparator, true);

            array[1] = deviceExtHis;

            array[2] = getByDeviceExtOrderId_PrevAndNext(session, deviceExtHis,
                    deviceExtOrderId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceExtHis getByDeviceExtOrderId_PrevAndNext(Session session,
        DeviceExtHis deviceExtHis, Long deviceExtOrderId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEEXTHIS_WHERE);

        query.append(_FINDER_COLUMN_DEVICEEXTORDERID_DEVICEEXTORDERID_2);

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
            query.append(DeviceExtHisModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(deviceExtOrderId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(deviceExtHis);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceExtHis> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device ext hises where deviceExtOrderId = &#63; from the database.
     *
     * @param deviceExtOrderId the device ext order ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByDeviceExtOrderId(Long deviceExtOrderId)
        throws SystemException {
        for (DeviceExtHis deviceExtHis : findByDeviceExtOrderId(
                deviceExtOrderId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceExtHis);
        }
    }

    /**
     * Returns the number of device ext hises where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @return the number of matching device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByDeviceExtOrderId(Long deviceExtOrderId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DEVICEEXTORDERID;

        Object[] finderArgs = new Object[] { deviceExtOrderId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICEEXTHIS_WHERE);

            query.append(_FINDER_COLUMN_DEVICEEXTORDERID_DEVICEEXTORDERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceExtOrderId.longValue());

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
     * Returns all the device ext hises where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the matching device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findByModelName(String modelName)
        throws SystemException {
        return findByModelName(modelName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the device ext hises where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of device ext hises
     * @param end the upper bound of the range of device ext hises (not inclusive)
     * @return the range of matching device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findByModelName(String modelName, int start,
        int end) throws SystemException {
        return findByModelName(modelName, start, end, null);
    }

    /**
     * Returns an ordered range of all the device ext hises where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of device ext hises
     * @param end the upper bound of the range of device ext hises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findByModelName(String modelName, int start,
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

        List<DeviceExtHis> list = (List<DeviceExtHis>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceExtHis deviceExtHis : list) {
                if (!Validator.equals(modelName, deviceExtHis.getModelName())) {
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

            query.append(_SQL_SELECT_DEVICEEXTHIS_WHERE);

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
                query.append(DeviceExtHisModelImpl.ORDER_BY_JPQL);
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
                    list = (List<DeviceExtHis>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceExtHis>(list);
                } else {
                    list = (List<DeviceExtHis>) QueryUtil.list(q, getDialect(),
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
     * Returns the first device ext his in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findByModelName_First(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = fetchByModelName_First(modelName,
                orderByComparator);

        if (deviceExtHis != null) {
            return deviceExtHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceExtHisException(msg.toString());
    }

    /**
     * Returns the first device ext his in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByModelName_First(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceExtHis> list = findByModelName(modelName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device ext his in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findByModelName_Last(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = fetchByModelName_Last(modelName,
                orderByComparator);

        if (deviceExtHis != null) {
            return deviceExtHis;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceExtHisException(msg.toString());
    }

    /**
     * Returns the last device ext his in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByModelName_Last(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByModelName(modelName);

        if (count == 0) {
            return null;
        }

        List<DeviceExtHis> list = findByModelName(modelName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device ext hises before and after the current device ext his in the ordered set where modelName = &#63;.
     *
     * @param deviceExtId the primary key of the current device ext his
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis[] findByModelName_PrevAndNext(long deviceExtId,
        String modelName, OrderByComparator orderByComparator)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = findByPrimaryKey(deviceExtId);

        Session session = null;

        try {
            session = openSession();

            DeviceExtHis[] array = new DeviceExtHisImpl[3];

            array[0] = getByModelName_PrevAndNext(session, deviceExtHis,
                    modelName, orderByComparator, true);

            array[1] = deviceExtHis;

            array[2] = getByModelName_PrevAndNext(session, deviceExtHis,
                    modelName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceExtHis getByModelName_PrevAndNext(Session session,
        DeviceExtHis deviceExtHis, String modelName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEEXTHIS_WHERE);

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
            query.append(DeviceExtHisModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(deviceExtHis);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceExtHis> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device ext hises where modelName = &#63; from the database.
     *
     * @param modelName the model name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByModelName(String modelName) throws SystemException {
        for (DeviceExtHis deviceExtHis : findByModelName(modelName,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceExtHis);
        }
    }

    /**
     * Returns the number of device ext hises where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the number of matching device ext hises
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

            query.append(_SQL_COUNT_DEVICEEXTHIS_WHERE);

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
     * Returns the device ext his where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtHisException} if it could not be found.
     *
     * @param serialNumber the serial number
     * @return the matching device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findBySerialNumber(String serialNumber)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = fetchBySerialNumber(serialNumber);

        if (deviceExtHis == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("serialNumber=");
            msg.append(serialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceExtHisException(msg.toString());
        }

        return deviceExtHis;
    }

    /**
     * Returns the device ext his where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param serialNumber the serial number
     * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchBySerialNumber(String serialNumber)
        throws SystemException {
        return fetchBySerialNumber(serialNumber, true);
    }

    /**
     * Returns the device ext his where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param serialNumber the serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchBySerialNumber(String serialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { serialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceExtHis) {
            DeviceExtHis deviceExtHis = (DeviceExtHis) result;

            if (!Validator.equals(serialNumber, deviceExtHis.getSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEEXTHIS_WHERE);

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

                List<DeviceExtHis> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceExtHis deviceExtHis = list.get(0);

                    result = deviceExtHis;

                    cacheResult(deviceExtHis);

                    if ((deviceExtHis.getSerialNumber() == null) ||
                            !deviceExtHis.getSerialNumber().equals(serialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                            finderArgs, deviceExtHis);
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
            return (DeviceExtHis) result;
        }
    }

    /**
     * Removes the device ext his where serialNumber = &#63; from the database.
     *
     * @param serialNumber the serial number
     * @return the device ext his that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis removeBySerialNumber(String serialNumber)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = findBySerialNumber(serialNumber);

        return remove(deviceExtHis);
    }

    /**
     * Returns the number of device ext hises where serialNumber = &#63;.
     *
     * @param serialNumber the serial number
     * @return the number of matching device ext hises
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

            query.append(_SQL_COUNT_DEVICEEXTHIS_WHERE);

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
     * Returns the device ext his where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtHisException} if it could not be found.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the matching device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findByGponSerialNumber(String gponSerialNumber)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = fetchByGponSerialNumber(gponSerialNumber);

        if (deviceExtHis == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("gponSerialNumber=");
            msg.append(gponSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceExtHisException(msg.toString());
        }

        return deviceExtHis;
    }

    /**
     * Returns the device ext his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByGponSerialNumber(String gponSerialNumber)
        throws SystemException {
        return fetchByGponSerialNumber(gponSerialNumber, true);
    }

    /**
     * Returns the device ext his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param gponSerialNumber the gpon serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByGponSerialNumber(String gponSerialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { gponSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceExtHis) {
            DeviceExtHis deviceExtHis = (DeviceExtHis) result;

            if (!Validator.equals(gponSerialNumber,
                        deviceExtHis.getGponSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEEXTHIS_WHERE);

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

                List<DeviceExtHis> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceExtHis deviceExtHis = list.get(0);

                    result = deviceExtHis;

                    cacheResult(deviceExtHis);

                    if ((deviceExtHis.getGponSerialNumber() == null) ||
                            !deviceExtHis.getGponSerialNumber()
                                             .equals(gponSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                            finderArgs, deviceExtHis);
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
            return (DeviceExtHis) result;
        }
    }

    /**
     * Removes the device ext his where gponSerialNumber = &#63; from the database.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the device ext his that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis removeByGponSerialNumber(String gponSerialNumber)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = findByGponSerialNumber(gponSerialNumber);

        return remove(deviceExtHis);
    }

    /**
     * Returns the number of device ext hises where gponSerialNumber = &#63;.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the number of matching device ext hises
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

            query.append(_SQL_COUNT_DEVICEEXTHIS_WHERE);

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
     * Returns the device ext his where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtHisException} if it could not be found.
     *
     * @param customerSerialNumber the customer serial number
     * @return the matching device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findByCustomerSerialNumber(String customerSerialNumber)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = fetchByCustomerSerialNumber(customerSerialNumber);

        if (deviceExtHis == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("customerSerialNumber=");
            msg.append(customerSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceExtHisException(msg.toString());
        }

        return deviceExtHis;
    }

    /**
     * Returns the device ext his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param customerSerialNumber the customer serial number
     * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByCustomerSerialNumber(String customerSerialNumber)
        throws SystemException {
        return fetchByCustomerSerialNumber(customerSerialNumber, true);
    }

    /**
     * Returns the device ext his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param customerSerialNumber the customer serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByCustomerSerialNumber(
        String customerSerialNumber, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { customerSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceExtHis) {
            DeviceExtHis deviceExtHis = (DeviceExtHis) result;

            if (!Validator.equals(customerSerialNumber,
                        deviceExtHis.getCustomerSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEEXTHIS_WHERE);

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

                List<DeviceExtHis> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceExtHis deviceExtHis = list.get(0);

                    result = deviceExtHis;

                    cacheResult(deviceExtHis);

                    if ((deviceExtHis.getCustomerSerialNumber() == null) ||
                            !deviceExtHis.getCustomerSerialNumber()
                                             .equals(customerSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                            finderArgs, deviceExtHis);
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
            return (DeviceExtHis) result;
        }
    }

    /**
     * Removes the device ext his where customerSerialNumber = &#63; from the database.
     *
     * @param customerSerialNumber the customer serial number
     * @return the device ext his that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis removeByCustomerSerialNumber(
        String customerSerialNumber)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = findByCustomerSerialNumber(customerSerialNumber);

        return remove(deviceExtHis);
    }

    /**
     * Returns the number of device ext hises where customerSerialNumber = &#63;.
     *
     * @param customerSerialNumber the customer serial number
     * @return the number of matching device ext hises
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

            query.append(_SQL_COUNT_DEVICEEXTHIS_WHERE);

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
     * Caches the device ext his in the entity cache if it is enabled.
     *
     * @param deviceExtHis the device ext his
     */
    @Override
    public void cacheResult(DeviceExtHis deviceExtHis) {
        EntityCacheUtil.putResult(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisImpl.class, deviceExtHis.getPrimaryKey(), deviceExtHis);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
            new Object[] { deviceExtHis.getSerialNumber() }, deviceExtHis);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
            new Object[] { deviceExtHis.getGponSerialNumber() }, deviceExtHis);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
            new Object[] { deviceExtHis.getCustomerSerialNumber() },
            deviceExtHis);

        deviceExtHis.resetOriginalValues();
    }

    /**
     * Caches the device ext hises in the entity cache if it is enabled.
     *
     * @param deviceExtHises the device ext hises
     */
    @Override
    public void cacheResult(List<DeviceExtHis> deviceExtHises) {
        for (DeviceExtHis deviceExtHis : deviceExtHises) {
            if (EntityCacheUtil.getResult(
                        DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceExtHisImpl.class, deviceExtHis.getPrimaryKey()) == null) {
                cacheResult(deviceExtHis);
            } else {
                deviceExtHis.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all device ext hises.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DeviceExtHisImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DeviceExtHisImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the device ext his.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DeviceExtHis deviceExtHis) {
        EntityCacheUtil.removeResult(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisImpl.class, deviceExtHis.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(deviceExtHis);
    }

    @Override
    public void clearCache(List<DeviceExtHis> deviceExtHises) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DeviceExtHis deviceExtHis : deviceExtHises) {
            EntityCacheUtil.removeResult(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
                DeviceExtHisImpl.class, deviceExtHis.getPrimaryKey());

            clearUniqueFindersCache(deviceExtHis);
        }
    }

    protected void cacheUniqueFindersCache(DeviceExtHis deviceExtHis) {
        if (deviceExtHis.isNew()) {
            Object[] args = new Object[] { deviceExtHis.getSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args,
                deviceExtHis);

            args = new Object[] { deviceExtHis.getGponSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                args, deviceExtHis);

            args = new Object[] { deviceExtHis.getCustomerSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                args, deviceExtHis);
        } else {
            DeviceExtHisModelImpl deviceExtHisModelImpl = (DeviceExtHisModelImpl) deviceExtHis;

            if ((deviceExtHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_SERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceExtHis.getSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    args, deviceExtHis);
            }

            if ((deviceExtHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_GPONSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceExtHis.getGponSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    args, deviceExtHis);
            }

            if ((deviceExtHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceExtHis.getCustomerSerialNumber()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    args, deviceExtHis);
            }
        }
    }

    protected void clearUniqueFindersCache(DeviceExtHis deviceExtHis) {
        DeviceExtHisModelImpl deviceExtHisModelImpl = (DeviceExtHisModelImpl) deviceExtHis;

        Object[] args = new Object[] { deviceExtHis.getSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args);

        if ((deviceExtHisModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_SERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] { deviceExtHisModelImpl.getOriginalSerialNumber() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args);
        }

        args = new Object[] { deviceExtHis.getGponSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER, args);

        if ((deviceExtHisModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_GPONSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    deviceExtHisModelImpl.getOriginalGponSerialNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                args);
        }

        args = new Object[] { deviceExtHis.getCustomerSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
            args);

        if ((deviceExtHisModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    deviceExtHisModelImpl.getOriginalCustomerSerialNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                args);
        }
    }

    /**
     * Creates a new device ext his with the primary key. Does not add the device ext his to the database.
     *
     * @param deviceExtId the primary key for the new device ext his
     * @return the new device ext his
     */
    @Override
    public DeviceExtHis create(long deviceExtId) {
        DeviceExtHis deviceExtHis = new DeviceExtHisImpl();

        deviceExtHis.setNew(true);
        deviceExtHis.setPrimaryKey(deviceExtId);

        return deviceExtHis;
    }

    /**
     * Removes the device ext his with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param deviceExtId the primary key of the device ext his
     * @return the device ext his that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis remove(long deviceExtId)
        throws NoSuchDeviceExtHisException, SystemException {
        return remove((Serializable) deviceExtId);
    }

    /**
     * Removes the device ext his with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the device ext his
     * @return the device ext his that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis remove(Serializable primaryKey)
        throws NoSuchDeviceExtHisException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DeviceExtHis deviceExtHis = (DeviceExtHis) session.get(DeviceExtHisImpl.class,
                    primaryKey);

            if (deviceExtHis == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDeviceExtHisException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(deviceExtHis);
        } catch (NoSuchDeviceExtHisException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DeviceExtHis removeImpl(DeviceExtHis deviceExtHis)
        throws SystemException {
        deviceExtHis = toUnwrappedModel(deviceExtHis);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(deviceExtHis)) {
                deviceExtHis = (DeviceExtHis) session.get(DeviceExtHisImpl.class,
                        deviceExtHis.getPrimaryKeyObj());
            }

            if (deviceExtHis != null) {
                session.delete(deviceExtHis);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (deviceExtHis != null) {
            clearCache(deviceExtHis);
        }

        return deviceExtHis;
    }

    @Override
    public DeviceExtHis updateImpl(
        com.dasannetworks.vn.sb.model.DeviceExtHis deviceExtHis)
        throws SystemException {
        deviceExtHis = toUnwrappedModel(deviceExtHis);

        boolean isNew = deviceExtHis.isNew();

        DeviceExtHisModelImpl deviceExtHisModelImpl = (DeviceExtHisModelImpl) deviceExtHis;

        Session session = null;

        try {
            session = openSession();

            if (deviceExtHis.isNew()) {
                session.save(deviceExtHis);

                deviceExtHis.setNew(false);
            } else {
                session.merge(deviceExtHis);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !DeviceExtHisModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((deviceExtHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceExtHisModelImpl.getOriginalDeviceExtOrderId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEEXTORDERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID,
                    args);

                args = new Object[] { deviceExtHisModelImpl.getDeviceExtOrderId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEEXTORDERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID,
                    args);
            }

            if ((deviceExtHisModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceExtHisModelImpl.getOriginalModelName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);

                args = new Object[] { deviceExtHisModelImpl.getModelName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);
            }
        }

        EntityCacheUtil.putResult(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtHisImpl.class, deviceExtHis.getPrimaryKey(), deviceExtHis);

        clearUniqueFindersCache(deviceExtHis);
        cacheUniqueFindersCache(deviceExtHis);

        return deviceExtHis;
    }

    protected DeviceExtHis toUnwrappedModel(DeviceExtHis deviceExtHis) {
        if (deviceExtHis instanceof DeviceExtHisImpl) {
            return deviceExtHis;
        }

        DeviceExtHisImpl deviceExtHisImpl = new DeviceExtHisImpl();

        deviceExtHisImpl.setNew(deviceExtHis.isNew());
        deviceExtHisImpl.setPrimaryKey(deviceExtHis.getPrimaryKey());

        deviceExtHisImpl.setDeviceExtId(deviceExtHis.getDeviceExtId());
        deviceExtHisImpl.setGroupId(deviceExtHis.getGroupId());
        deviceExtHisImpl.setCompanyId(deviceExtHis.getCompanyId());
        deviceExtHisImpl.setUserId(deviceExtHis.getUserId());
        deviceExtHisImpl.setUserName(deviceExtHis.getUserName());
        deviceExtHisImpl.setCreateDate(deviceExtHis.getCreateDate());
        deviceExtHisImpl.setModifiedDate(deviceExtHis.getModifiedDate());
        deviceExtHisImpl.setModelName(deviceExtHis.getModelName());
        deviceExtHisImpl.setSerialNumber(deviceExtHis.getSerialNumber());
        deviceExtHisImpl.setGponSerialNumber(deviceExtHis.getGponSerialNumber());
        deviceExtHisImpl.setBoxSerialNumber(deviceExtHis.getBoxSerialNumber());
        deviceExtHisImpl.setCustomerSerialNumber(deviceExtHis.getCustomerSerialNumber());
        deviceExtHisImpl.setManufacturerSerialNumber(deviceExtHis.getManufacturerSerialNumber());
        deviceExtHisImpl.setHardwareRevision(deviceExtHis.getHardwareRevision());
        deviceExtHisImpl.setSoftwareRevision(deviceExtHis.getSoftwareRevision());
        deviceExtHisImpl.setMacAddress(deviceExtHis.getMacAddress());
        deviceExtHisImpl.setPartNumber(deviceExtHis.getPartNumber());
        deviceExtHisImpl.setSpecification(deviceExtHis.getSpecification());
        deviceExtHisImpl.setFactoryOut(deviceExtHis.getFactoryOut());
        deviceExtHisImpl.setStatus(deviceExtHis.getStatus());
        deviceExtHisImpl.setOstStatusChangedDate(deviceExtHis.getOstStatusChangedDate());
        deviceExtHisImpl.setDeviceExtOrderId(deviceExtHis.getDeviceExtOrderId());

        return deviceExtHisImpl;
    }

    /**
     * Returns the device ext his with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the device ext his
     * @return the device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDeviceExtHisException, SystemException {
        DeviceExtHis deviceExtHis = fetchByPrimaryKey(primaryKey);

        if (deviceExtHis == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDeviceExtHisException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return deviceExtHis;
    }

    /**
     * Returns the device ext his with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtHisException} if it could not be found.
     *
     * @param deviceExtId the primary key of the device ext his
     * @return the device ext his
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis findByPrimaryKey(long deviceExtId)
        throws NoSuchDeviceExtHisException, SystemException {
        return findByPrimaryKey((Serializable) deviceExtId);
    }

    /**
     * Returns the device ext his with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the device ext his
     * @return the device ext his, or <code>null</code> if a device ext his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DeviceExtHis deviceExtHis = (DeviceExtHis) EntityCacheUtil.getResult(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
                DeviceExtHisImpl.class, primaryKey);

        if (deviceExtHis == _nullDeviceExtHis) {
            return null;
        }

        if (deviceExtHis == null) {
            Session session = null;

            try {
                session = openSession();

                deviceExtHis = (DeviceExtHis) session.get(DeviceExtHisImpl.class,
                        primaryKey);

                if (deviceExtHis != null) {
                    cacheResult(deviceExtHis);
                } else {
                    EntityCacheUtil.putResult(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceExtHisImpl.class, primaryKey, _nullDeviceExtHis);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DeviceExtHisModelImpl.ENTITY_CACHE_ENABLED,
                    DeviceExtHisImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return deviceExtHis;
    }

    /**
     * Returns the device ext his with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param deviceExtId the primary key of the device ext his
     * @return the device ext his, or <code>null</code> if a device ext his with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExtHis fetchByPrimaryKey(long deviceExtId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) deviceExtId);
    }

    /**
     * Returns all the device ext hises.
     *
     * @return the device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device ext hises.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device ext hises
     * @param end the upper bound of the range of device ext hises (not inclusive)
     * @return the range of device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the device ext hises.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device ext hises
     * @param end the upper bound of the range of device ext hises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of device ext hises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExtHis> findAll(int start, int end,
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

        List<DeviceExtHis> list = (List<DeviceExtHis>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEVICEEXTHIS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEVICEEXTHIS;

                if (pagination) {
                    sql = sql.concat(DeviceExtHisModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DeviceExtHis>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceExtHis>(list);
                } else {
                    list = (List<DeviceExtHis>) QueryUtil.list(q, getDialect(),
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
     * Removes all the device ext hises from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DeviceExtHis deviceExtHis : findAll()) {
            remove(deviceExtHis);
        }
    }

    /**
     * Returns the number of device ext hises.
     *
     * @return the number of device ext hises
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

                Query q = session.createQuery(_SQL_COUNT_DEVICEEXTHIS);

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
     * Initializes the device ext his persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.DeviceExtHis")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DeviceExtHis>> listenersList = new ArrayList<ModelListener<DeviceExtHis>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DeviceExtHis>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DeviceExtHisImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
