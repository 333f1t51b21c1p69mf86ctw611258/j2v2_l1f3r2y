package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchDeviceExtException;
import com.dasannetworks.vn.sb.model.DeviceExt;
import com.dasannetworks.vn.sb.model.impl.DeviceExtImpl;
import com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl;
import com.dasannetworks.vn.sb.service.persistence.DeviceExtPersistence;

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
 * The persistence implementation for the device ext service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtPersistence
 * @see DeviceExtUtil
 * @generated
 */
public class DeviceExtPersistenceImpl extends BasePersistenceImpl<DeviceExt>
    implements DeviceExtPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DeviceExtUtil} to access the device ext persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DeviceExtImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEEXTORDERID =
        new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeviceExtOrderId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID =
        new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByDeviceExtOrderId", new String[] { Long.class.getName() },
            DeviceExtModelImpl.DEVICEEXTORDERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEEXTORDERID = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByDeviceExtOrderId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_DEVICEEXTORDERID_DEVICEEXTORDERID_2 =
        "deviceExt.deviceExtOrderId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByModelName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByModelName",
            new String[] { String.class.getName() },
            DeviceExtModelImpl.MODELNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_MODELNAME = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByModelName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_1 = "deviceExt.modelName IS NULL";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_2 = "deviceExt.modelName = ?";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_3 = "(deviceExt.modelName IS NULL OR deviceExt.modelName = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_SERIALNUMBER = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchBySerialNumber",
            new String[] { String.class.getName() },
            DeviceExtModelImpl.SERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERIALNUMBER = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_1 = "deviceExt.serialNumber IS NULL";
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_2 = "deviceExt.serialNumber = ?";
    private static final String _FINDER_COLUMN_SERIALNUMBER_SERIALNUMBER_3 = "(deviceExt.serialNumber IS NULL OR deviceExt.serialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_GPONSERIALNUMBER = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByGponSerialNumber",
            new String[] { String.class.getName() },
            DeviceExtModelImpl.GPONSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GPONSERIALNUMBER = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByGponSerialNumber", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_1 =
        "deviceExt.gponSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_2 =
        "deviceExt.gponSerialNumber = ?";
    private static final String _FINDER_COLUMN_GPONSERIALNUMBER_GPONSERIALNUMBER_3 =
        "(deviceExt.gponSerialNumber IS NULL OR deviceExt.gponSerialNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, DeviceExtImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByCustomerSerialNumber",
            new String[] { String.class.getName() },
            DeviceExtModelImpl.CUSTOMERSERIALNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER = new FinderPath(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCustomerSerialNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_1 =
        "deviceExt.customerSerialNumber IS NULL";
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_2 =
        "deviceExt.customerSerialNumber = ?";
    private static final String _FINDER_COLUMN_CUSTOMERSERIALNUMBER_CUSTOMERSERIALNUMBER_3 =
        "(deviceExt.customerSerialNumber IS NULL OR deviceExt.customerSerialNumber = '')";
    private static final String _SQL_SELECT_DEVICEEXT = "SELECT deviceExt FROM DeviceExt deviceExt";
    private static final String _SQL_SELECT_DEVICEEXT_WHERE = "SELECT deviceExt FROM DeviceExt deviceExt WHERE ";
    private static final String _SQL_COUNT_DEVICEEXT = "SELECT COUNT(deviceExt) FROM DeviceExt deviceExt";
    private static final String _SQL_COUNT_DEVICEEXT_WHERE = "SELECT COUNT(deviceExt) FROM DeviceExt deviceExt WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "deviceExt.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DeviceExt exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DeviceExt exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DeviceExtPersistenceImpl.class);
    private static DeviceExt _nullDeviceExt = new DeviceExtImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DeviceExt> toCacheModel() {
                return _nullDeviceExtCacheModel;
            }
        };

    private static CacheModel<DeviceExt> _nullDeviceExtCacheModel = new CacheModel<DeviceExt>() {
            @Override
            public DeviceExt toEntityModel() {
                return _nullDeviceExt;
            }
        };

    public DeviceExtPersistenceImpl() {
        setModelClass(DeviceExt.class);
    }

    /**
     * Returns all the device exts where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @return the matching device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findByDeviceExtOrderId(Long deviceExtOrderId)
        throws SystemException {
        return findByDeviceExtOrderId(deviceExtOrderId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device exts where deviceExtOrderId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceExtOrderId the device ext order ID
     * @param start the lower bound of the range of device exts
     * @param end the upper bound of the range of device exts (not inclusive)
     * @return the range of matching device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findByDeviceExtOrderId(Long deviceExtOrderId,
        int start, int end) throws SystemException {
        return findByDeviceExtOrderId(deviceExtOrderId, start, end, null);
    }

    /**
     * Returns an ordered range of all the device exts where deviceExtOrderId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceExtOrderId the device ext order ID
     * @param start the lower bound of the range of device exts
     * @param end the upper bound of the range of device exts (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findByDeviceExtOrderId(Long deviceExtOrderId,
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

        List<DeviceExt> list = (List<DeviceExt>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceExt deviceExt : list) {
                if (!Validator.equals(deviceExtOrderId,
                            deviceExt.getDeviceExtOrderId())) {
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

            query.append(_SQL_SELECT_DEVICEEXT_WHERE);

            query.append(_FINDER_COLUMN_DEVICEEXTORDERID_DEVICEEXTORDERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceExtModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceExtOrderId.longValue());

                if (!pagination) {
                    list = (List<DeviceExt>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceExt>(list);
                } else {
                    list = (List<DeviceExt>) QueryUtil.list(q, getDialect(),
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
     * Returns the first device ext in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findByDeviceExtOrderId_First(Long deviceExtOrderId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = fetchByDeviceExtOrderId_First(deviceExtOrderId,
                orderByComparator);

        if (deviceExt != null) {
            return deviceExt;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceExtOrderId=");
        msg.append(deviceExtOrderId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceExtException(msg.toString());
    }

    /**
     * Returns the first device ext in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByDeviceExtOrderId_First(Long deviceExtOrderId,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceExt> list = findByDeviceExtOrderId(deviceExtOrderId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device ext in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findByDeviceExtOrderId_Last(Long deviceExtOrderId,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = fetchByDeviceExtOrderId_Last(deviceExtOrderId,
                orderByComparator);

        if (deviceExt != null) {
            return deviceExt;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceExtOrderId=");
        msg.append(deviceExtOrderId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceExtException(msg.toString());
    }

    /**
     * Returns the last device ext in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByDeviceExtOrderId_Last(Long deviceExtOrderId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByDeviceExtOrderId(deviceExtOrderId);

        if (count == 0) {
            return null;
        }

        List<DeviceExt> list = findByDeviceExtOrderId(deviceExtOrderId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device exts before and after the current device ext in the ordered set where deviceExtOrderId = &#63;.
     *
     * @param deviceExtId the primary key of the current device ext
     * @param deviceExtOrderId the device ext order ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt[] findByDeviceExtOrderId_PrevAndNext(long deviceExtId,
        Long deviceExtOrderId, OrderByComparator orderByComparator)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = findByPrimaryKey(deviceExtId);

        Session session = null;

        try {
            session = openSession();

            DeviceExt[] array = new DeviceExtImpl[3];

            array[0] = getByDeviceExtOrderId_PrevAndNext(session, deviceExt,
                    deviceExtOrderId, orderByComparator, true);

            array[1] = deviceExt;

            array[2] = getByDeviceExtOrderId_PrevAndNext(session, deviceExt,
                    deviceExtOrderId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceExt getByDeviceExtOrderId_PrevAndNext(Session session,
        DeviceExt deviceExt, Long deviceExtOrderId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEEXT_WHERE);

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
            query.append(DeviceExtModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(deviceExtOrderId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(deviceExt);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceExt> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device exts where deviceExtOrderId = &#63; from the database.
     *
     * @param deviceExtOrderId the device ext order ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByDeviceExtOrderId(Long deviceExtOrderId)
        throws SystemException {
        for (DeviceExt deviceExt : findByDeviceExtOrderId(deviceExtOrderId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceExt);
        }
    }

    /**
     * Returns the number of device exts where deviceExtOrderId = &#63;.
     *
     * @param deviceExtOrderId the device ext order ID
     * @return the number of matching device exts
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

            query.append(_SQL_COUNT_DEVICEEXT_WHERE);

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
     * Returns all the device exts where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the matching device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findByModelName(String modelName)
        throws SystemException {
        return findByModelName(modelName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the device exts where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of device exts
     * @param end the upper bound of the range of device exts (not inclusive)
     * @return the range of matching device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findByModelName(String modelName, int start, int end)
        throws SystemException {
        return findByModelName(modelName, start, end, null);
    }

    /**
     * Returns an ordered range of all the device exts where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of device exts
     * @param end the upper bound of the range of device exts (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findByModelName(String modelName, int start,
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

        List<DeviceExt> list = (List<DeviceExt>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceExt deviceExt : list) {
                if (!Validator.equals(modelName, deviceExt.getModelName())) {
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

            query.append(_SQL_SELECT_DEVICEEXT_WHERE);

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
                query.append(DeviceExtModelImpl.ORDER_BY_JPQL);
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
                    list = (List<DeviceExt>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceExt>(list);
                } else {
                    list = (List<DeviceExt>) QueryUtil.list(q, getDialect(),
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
     * Returns the first device ext in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findByModelName_First(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = fetchByModelName_First(modelName,
                orderByComparator);

        if (deviceExt != null) {
            return deviceExt;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceExtException(msg.toString());
    }

    /**
     * Returns the first device ext in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByModelName_First(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceExt> list = findByModelName(modelName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device ext in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findByModelName_Last(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = fetchByModelName_Last(modelName, orderByComparator);

        if (deviceExt != null) {
            return deviceExt;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceExtException(msg.toString());
    }

    /**
     * Returns the last device ext in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByModelName_Last(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByModelName(modelName);

        if (count == 0) {
            return null;
        }

        List<DeviceExt> list = findByModelName(modelName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device exts before and after the current device ext in the ordered set where modelName = &#63;.
     *
     * @param deviceExtId the primary key of the current device ext
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt[] findByModelName_PrevAndNext(long deviceExtId,
        String modelName, OrderByComparator orderByComparator)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = findByPrimaryKey(deviceExtId);

        Session session = null;

        try {
            session = openSession();

            DeviceExt[] array = new DeviceExtImpl[3];

            array[0] = getByModelName_PrevAndNext(session, deviceExt,
                    modelName, orderByComparator, true);

            array[1] = deviceExt;

            array[2] = getByModelName_PrevAndNext(session, deviceExt,
                    modelName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceExt getByModelName_PrevAndNext(Session session,
        DeviceExt deviceExt, String modelName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEEXT_WHERE);

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
            query.append(DeviceExtModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(deviceExt);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceExt> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device exts where modelName = &#63; from the database.
     *
     * @param modelName the model name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByModelName(String modelName) throws SystemException {
        for (DeviceExt deviceExt : findByModelName(modelName,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceExt);
        }
    }

    /**
     * Returns the number of device exts where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the number of matching device exts
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

            query.append(_SQL_COUNT_DEVICEEXT_WHERE);

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
     * Returns the device ext where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtException} if it could not be found.
     *
     * @param serialNumber the serial number
     * @return the matching device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findBySerialNumber(String serialNumber)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = fetchBySerialNumber(serialNumber);

        if (deviceExt == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("serialNumber=");
            msg.append(serialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceExtException(msg.toString());
        }

        return deviceExt;
    }

    /**
     * Returns the device ext where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param serialNumber the serial number
     * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchBySerialNumber(String serialNumber)
        throws SystemException {
        return fetchBySerialNumber(serialNumber, true);
    }

    /**
     * Returns the device ext where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param serialNumber the serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchBySerialNumber(String serialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { serialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceExt) {
            DeviceExt deviceExt = (DeviceExt) result;

            if (!Validator.equals(serialNumber, deviceExt.getSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEEXT_WHERE);

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

                List<DeviceExt> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceExt deviceExt = list.get(0);

                    result = deviceExt;

                    cacheResult(deviceExt);

                    if ((deviceExt.getSerialNumber() == null) ||
                            !deviceExt.getSerialNumber().equals(serialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                            finderArgs, deviceExt);
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
            return (DeviceExt) result;
        }
    }

    /**
     * Removes the device ext where serialNumber = &#63; from the database.
     *
     * @param serialNumber the serial number
     * @return the device ext that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt removeBySerialNumber(String serialNumber)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = findBySerialNumber(serialNumber);

        return remove(deviceExt);
    }

    /**
     * Returns the number of device exts where serialNumber = &#63;.
     *
     * @param serialNumber the serial number
     * @return the number of matching device exts
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

            query.append(_SQL_COUNT_DEVICEEXT_WHERE);

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
     * Returns the device ext where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtException} if it could not be found.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the matching device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findByGponSerialNumber(String gponSerialNumber)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = fetchByGponSerialNumber(gponSerialNumber);

        if (deviceExt == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("gponSerialNumber=");
            msg.append(gponSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceExtException(msg.toString());
        }

        return deviceExt;
    }

    /**
     * Returns the device ext where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByGponSerialNumber(String gponSerialNumber)
        throws SystemException {
        return fetchByGponSerialNumber(gponSerialNumber, true);
    }

    /**
     * Returns the device ext where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param gponSerialNumber the gpon serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByGponSerialNumber(String gponSerialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { gponSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceExt) {
            DeviceExt deviceExt = (DeviceExt) result;

            if (!Validator.equals(gponSerialNumber,
                        deviceExt.getGponSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEEXT_WHERE);

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

                List<DeviceExt> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceExt deviceExt = list.get(0);

                    result = deviceExt;

                    cacheResult(deviceExt);

                    if ((deviceExt.getGponSerialNumber() == null) ||
                            !deviceExt.getGponSerialNumber()
                                          .equals(gponSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                            finderArgs, deviceExt);
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
            return (DeviceExt) result;
        }
    }

    /**
     * Removes the device ext where gponSerialNumber = &#63; from the database.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the device ext that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt removeByGponSerialNumber(String gponSerialNumber)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = findByGponSerialNumber(gponSerialNumber);

        return remove(deviceExt);
    }

    /**
     * Returns the number of device exts where gponSerialNumber = &#63;.
     *
     * @param gponSerialNumber the gpon serial number
     * @return the number of matching device exts
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

            query.append(_SQL_COUNT_DEVICEEXT_WHERE);

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
     * Returns the device ext where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtException} if it could not be found.
     *
     * @param customerSerialNumber the customer serial number
     * @return the matching device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findByCustomerSerialNumber(String customerSerialNumber)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = fetchByCustomerSerialNumber(customerSerialNumber);

        if (deviceExt == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("customerSerialNumber=");
            msg.append(customerSerialNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchDeviceExtException(msg.toString());
        }

        return deviceExt;
    }

    /**
     * Returns the device ext where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param customerSerialNumber the customer serial number
     * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByCustomerSerialNumber(String customerSerialNumber)
        throws SystemException {
        return fetchByCustomerSerialNumber(customerSerialNumber, true);
    }

    /**
     * Returns the device ext where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param customerSerialNumber the customer serial number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByCustomerSerialNumber(String customerSerialNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { customerSerialNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    finderArgs, this);
        }

        if (result instanceof DeviceExt) {
            DeviceExt deviceExt = (DeviceExt) result;

            if (!Validator.equals(customerSerialNumber,
                        deviceExt.getCustomerSerialNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_DEVICEEXT_WHERE);

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

                List<DeviceExt> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                        finderArgs, list);
                } else {
                    DeviceExt deviceExt = list.get(0);

                    result = deviceExt;

                    cacheResult(deviceExt);

                    if ((deviceExt.getCustomerSerialNumber() == null) ||
                            !deviceExt.getCustomerSerialNumber()
                                          .equals(customerSerialNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                            finderArgs, deviceExt);
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
            return (DeviceExt) result;
        }
    }

    /**
     * Removes the device ext where customerSerialNumber = &#63; from the database.
     *
     * @param customerSerialNumber the customer serial number
     * @return the device ext that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt removeByCustomerSerialNumber(String customerSerialNumber)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = findByCustomerSerialNumber(customerSerialNumber);

        return remove(deviceExt);
    }

    /**
     * Returns the number of device exts where customerSerialNumber = &#63;.
     *
     * @param customerSerialNumber the customer serial number
     * @return the number of matching device exts
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

            query.append(_SQL_COUNT_DEVICEEXT_WHERE);

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
     * Caches the device ext in the entity cache if it is enabled.
     *
     * @param deviceExt the device ext
     */
    @Override
    public void cacheResult(DeviceExt deviceExt) {
        EntityCacheUtil.putResult(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtImpl.class, deviceExt.getPrimaryKey(), deviceExt);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
            new Object[] { deviceExt.getSerialNumber() }, deviceExt);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
            new Object[] { deviceExt.getGponSerialNumber() }, deviceExt);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
            new Object[] { deviceExt.getCustomerSerialNumber() }, deviceExt);

        deviceExt.resetOriginalValues();
    }

    /**
     * Caches the device exts in the entity cache if it is enabled.
     *
     * @param deviceExts the device exts
     */
    @Override
    public void cacheResult(List<DeviceExt> deviceExts) {
        for (DeviceExt deviceExt : deviceExts) {
            if (EntityCacheUtil.getResult(
                        DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceExtImpl.class, deviceExt.getPrimaryKey()) == null) {
                cacheResult(deviceExt);
            } else {
                deviceExt.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all device exts.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DeviceExtImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DeviceExtImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the device ext.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DeviceExt deviceExt) {
        EntityCacheUtil.removeResult(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtImpl.class, deviceExt.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(deviceExt);
    }

    @Override
    public void clearCache(List<DeviceExt> deviceExts) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DeviceExt deviceExt : deviceExts) {
            EntityCacheUtil.removeResult(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
                DeviceExtImpl.class, deviceExt.getPrimaryKey());

            clearUniqueFindersCache(deviceExt);
        }
    }

    protected void cacheUniqueFindersCache(DeviceExt deviceExt) {
        if (deviceExt.isNew()) {
            Object[] args = new Object[] { deviceExt.getSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args,
                deviceExt);

            args = new Object[] { deviceExt.getGponSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                args, deviceExt);

            args = new Object[] { deviceExt.getCustomerSerialNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                args, deviceExt);
        } else {
            DeviceExtModelImpl deviceExtModelImpl = (DeviceExtModelImpl) deviceExt;

            if ((deviceExtModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_SERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceExt.getSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SERIALNUMBER,
                    args, deviceExt);
            }

            if ((deviceExtModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_GPONSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceExt.getGponSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                    args, deviceExt);
            }

            if ((deviceExtModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { deviceExt.getCustomerSerialNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                    args, deviceExt);
            }
        }
    }

    protected void clearUniqueFindersCache(DeviceExt deviceExt) {
        DeviceExtModelImpl deviceExtModelImpl = (DeviceExtModelImpl) deviceExt;

        Object[] args = new Object[] { deviceExt.getSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args);

        if ((deviceExtModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_SERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] { deviceExtModelImpl.getOriginalSerialNumber() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERIALNUMBER, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SERIALNUMBER, args);
        }

        args = new Object[] { deviceExt.getGponSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER, args);

        if ((deviceExtModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_GPONSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] { deviceExtModelImpl.getOriginalGponSerialNumber() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPONSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GPONSERIALNUMBER,
                args);
        }

        args = new Object[] { deviceExt.getCustomerSerialNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
            args);

        if ((deviceExtModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    deviceExtModelImpl.getOriginalCustomerSerialNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERSERIALNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERSERIALNUMBER,
                args);
        }
    }

    /**
     * Creates a new device ext with the primary key. Does not add the device ext to the database.
     *
     * @param deviceExtId the primary key for the new device ext
     * @return the new device ext
     */
    @Override
    public DeviceExt create(long deviceExtId) {
        DeviceExt deviceExt = new DeviceExtImpl();

        deviceExt.setNew(true);
        deviceExt.setPrimaryKey(deviceExtId);

        return deviceExt;
    }

    /**
     * Removes the device ext with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param deviceExtId the primary key of the device ext
     * @return the device ext that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt remove(long deviceExtId)
        throws NoSuchDeviceExtException, SystemException {
        return remove((Serializable) deviceExtId);
    }

    /**
     * Removes the device ext with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the device ext
     * @return the device ext that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt remove(Serializable primaryKey)
        throws NoSuchDeviceExtException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DeviceExt deviceExt = (DeviceExt) session.get(DeviceExtImpl.class,
                    primaryKey);

            if (deviceExt == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDeviceExtException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(deviceExt);
        } catch (NoSuchDeviceExtException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DeviceExt removeImpl(DeviceExt deviceExt)
        throws SystemException {
        deviceExt = toUnwrappedModel(deviceExt);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(deviceExt)) {
                deviceExt = (DeviceExt) session.get(DeviceExtImpl.class,
                        deviceExt.getPrimaryKeyObj());
            }

            if (deviceExt != null) {
                session.delete(deviceExt);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (deviceExt != null) {
            clearCache(deviceExt);
        }

        return deviceExt;
    }

    @Override
    public DeviceExt updateImpl(
        com.dasannetworks.vn.sb.model.DeviceExt deviceExt)
        throws SystemException {
        deviceExt = toUnwrappedModel(deviceExt);

        boolean isNew = deviceExt.isNew();

        DeviceExtModelImpl deviceExtModelImpl = (DeviceExtModelImpl) deviceExt;

        Session session = null;

        try {
            session = openSession();

            if (deviceExt.isNew()) {
                session.save(deviceExt);

                deviceExt.setNew(false);
            } else {
                session.merge(deviceExt);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !DeviceExtModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((deviceExtModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceExtModelImpl.getOriginalDeviceExtOrderId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEEXTORDERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID,
                    args);

                args = new Object[] { deviceExtModelImpl.getDeviceExtOrderId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEEXTORDERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEEXTORDERID,
                    args);
            }

            if ((deviceExtModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceExtModelImpl.getOriginalModelName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);

                args = new Object[] { deviceExtModelImpl.getModelName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);
            }
        }

        EntityCacheUtil.putResult(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
            DeviceExtImpl.class, deviceExt.getPrimaryKey(), deviceExt);

        clearUniqueFindersCache(deviceExt);
        cacheUniqueFindersCache(deviceExt);

        return deviceExt;
    }

    protected DeviceExt toUnwrappedModel(DeviceExt deviceExt) {
        if (deviceExt instanceof DeviceExtImpl) {
            return deviceExt;
        }

        DeviceExtImpl deviceExtImpl = new DeviceExtImpl();

        deviceExtImpl.setNew(deviceExt.isNew());
        deviceExtImpl.setPrimaryKey(deviceExt.getPrimaryKey());

        deviceExtImpl.setDeviceExtId(deviceExt.getDeviceExtId());
        deviceExtImpl.setGroupId(deviceExt.getGroupId());
        deviceExtImpl.setCompanyId(deviceExt.getCompanyId());
        deviceExtImpl.setUserId(deviceExt.getUserId());
        deviceExtImpl.setUserName(deviceExt.getUserName());
        deviceExtImpl.setCreateDate(deviceExt.getCreateDate());
        deviceExtImpl.setModifiedDate(deviceExt.getModifiedDate());
        deviceExtImpl.setModelName(deviceExt.getModelName());
        deviceExtImpl.setSerialNumber(deviceExt.getSerialNumber());
        deviceExtImpl.setGponSerialNumber(deviceExt.getGponSerialNumber());
        deviceExtImpl.setBoxSerialNumber(deviceExt.getBoxSerialNumber());
        deviceExtImpl.setCustomerSerialNumber(deviceExt.getCustomerSerialNumber());
        deviceExtImpl.setManufacturerSerialNumber(deviceExt.getManufacturerSerialNumber());
        deviceExtImpl.setHardwareRevision(deviceExt.getHardwareRevision());
        deviceExtImpl.setSoftwareRevision(deviceExt.getSoftwareRevision());
        deviceExtImpl.setMacAddress(deviceExt.getMacAddress());
        deviceExtImpl.setPartNumber(deviceExt.getPartNumber());
        deviceExtImpl.setSpecification(deviceExt.getSpecification());
        deviceExtImpl.setFactoryOut(deviceExt.getFactoryOut());
        deviceExtImpl.setStatus(deviceExt.getStatus());
        deviceExtImpl.setOstStatusChangedDate(deviceExt.getOstStatusChangedDate());
        deviceExtImpl.setDeviceExtOrderId(deviceExt.getDeviceExtOrderId());

        return deviceExtImpl;
    }

    /**
     * Returns the device ext with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the device ext
     * @return the device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDeviceExtException, SystemException {
        DeviceExt deviceExt = fetchByPrimaryKey(primaryKey);

        if (deviceExt == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDeviceExtException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return deviceExt;
    }

    /**
     * Returns the device ext with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtException} if it could not be found.
     *
     * @param deviceExtId the primary key of the device ext
     * @return the device ext
     * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt findByPrimaryKey(long deviceExtId)
        throws NoSuchDeviceExtException, SystemException {
        return findByPrimaryKey((Serializable) deviceExtId);
    }

    /**
     * Returns the device ext with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the device ext
     * @return the device ext, or <code>null</code> if a device ext with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DeviceExt deviceExt = (DeviceExt) EntityCacheUtil.getResult(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
                DeviceExtImpl.class, primaryKey);

        if (deviceExt == _nullDeviceExt) {
            return null;
        }

        if (deviceExt == null) {
            Session session = null;

            try {
                session = openSession();

                deviceExt = (DeviceExt) session.get(DeviceExtImpl.class,
                        primaryKey);

                if (deviceExt != null) {
                    cacheResult(deviceExt);
                } else {
                    EntityCacheUtil.putResult(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceExtImpl.class, primaryKey, _nullDeviceExt);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DeviceExtModelImpl.ENTITY_CACHE_ENABLED,
                    DeviceExtImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return deviceExt;
    }

    /**
     * Returns the device ext with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param deviceExtId the primary key of the device ext
     * @return the device ext, or <code>null</code> if a device ext with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceExt fetchByPrimaryKey(long deviceExtId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) deviceExtId);
    }

    /**
     * Returns all the device exts.
     *
     * @return the device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device exts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device exts
     * @param end the upper bound of the range of device exts (not inclusive)
     * @return the range of device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the device exts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device exts
     * @param end the upper bound of the range of device exts (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of device exts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceExt> findAll(int start, int end,
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

        List<DeviceExt> list = (List<DeviceExt>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEVICEEXT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEVICEEXT;

                if (pagination) {
                    sql = sql.concat(DeviceExtModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DeviceExt>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceExt>(list);
                } else {
                    list = (List<DeviceExt>) QueryUtil.list(q, getDialect(),
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
     * Removes all the device exts from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DeviceExt deviceExt : findAll()) {
            remove(deviceExt);
        }
    }

    /**
     * Returns the number of device exts.
     *
     * @return the number of device exts
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

                Query q = session.createQuery(_SQL_COUNT_DEVICEEXT);

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
     * Initializes the device ext persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.DeviceExt")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DeviceExt>> listenersList = new ArrayList<ModelListener<DeviceExt>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DeviceExt>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DeviceExtImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
