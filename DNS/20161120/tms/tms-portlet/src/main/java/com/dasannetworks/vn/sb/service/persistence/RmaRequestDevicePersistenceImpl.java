package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException;
import com.dasannetworks.vn.sb.model.RmaRequestDevice;
import com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceImpl;
import com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePersistence;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rma request device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestDevicePersistence
 * @see RmaRequestDeviceUtil
 * @generated
 */
public class RmaRequestDevicePersistenceImpl extends BasePersistenceImpl<RmaRequestDevice>
    implements RmaRequestDevicePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RmaRequestDeviceUtil} to access the rma request device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RmaRequestDeviceImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RMAREQUESTID =
        new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByRmaRequestId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RMAREQUESTID =
        new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRmaRequestId",
            new String[] { Long.class.getName() },
            RmaRequestDeviceModelImpl.RMAREQUESTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_RMAREQUESTID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRmaRequestId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_RMAREQUESTID_RMAREQUESTID_2 = "rmaRequestDevice.id.rmaRequestId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_DEVICEID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByDeviceId", new String[] { Long.class.getName() },
            RmaRequestDeviceModelImpl.DEVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDeviceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_DEVICEID_DEVICEID_2 = "rmaRequestDevice.id.deviceId = ?";
    private static final String _SQL_SELECT_RMAREQUESTDEVICE = "SELECT rmaRequestDevice FROM RmaRequestDevice rmaRequestDevice";
    private static final String _SQL_SELECT_RMAREQUESTDEVICE_WHERE = "SELECT rmaRequestDevice FROM RmaRequestDevice rmaRequestDevice WHERE ";
    private static final String _SQL_COUNT_RMAREQUESTDEVICE = "SELECT COUNT(rmaRequestDevice) FROM RmaRequestDevice rmaRequestDevice";
    private static final String _SQL_COUNT_RMAREQUESTDEVICE_WHERE = "SELECT COUNT(rmaRequestDevice) FROM RmaRequestDevice rmaRequestDevice WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "rmaRequestDevice.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RmaRequestDevice exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RmaRequestDevice exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RmaRequestDevicePersistenceImpl.class);
    private static RmaRequestDevice _nullRmaRequestDevice = new RmaRequestDeviceImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<RmaRequestDevice> toCacheModel() {
                return _nullRmaRequestDeviceCacheModel;
            }
        };

    private static CacheModel<RmaRequestDevice> _nullRmaRequestDeviceCacheModel = new CacheModel<RmaRequestDevice>() {
            @Override
            public RmaRequestDevice toEntityModel() {
                return _nullRmaRequestDevice;
            }
        };

    public RmaRequestDevicePersistenceImpl() {
        setModelClass(RmaRequestDevice.class);
    }

    /**
     * Returns all the rma request devices where rmaRequestId = &#63;.
     *
     * @param rmaRequestId the rma request ID
     * @return the matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByRmaRequestId(long rmaRequestId)
        throws SystemException {
        return findByRmaRequestId(rmaRequestId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma request devices where rmaRequestId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param rmaRequestId the rma request ID
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @return the range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByRmaRequestId(long rmaRequestId,
        int start, int end) throws SystemException {
        return findByRmaRequestId(rmaRequestId, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma request devices where rmaRequestId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param rmaRequestId the rma request ID
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByRmaRequestId(long rmaRequestId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RMAREQUESTID;
            finderArgs = new Object[] { rmaRequestId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RMAREQUESTID;
            finderArgs = new Object[] {
                    rmaRequestId,
                    
                    start, end, orderByComparator
                };
        }

        List<RmaRequestDevice> list = (List<RmaRequestDevice>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequestDevice rmaRequestDevice : list) {
                if ((rmaRequestId != rmaRequestDevice.getRmaRequestId())) {
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

            query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_RMAREQUESTID_RMAREQUESTID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RmaRequestDeviceModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(rmaRequestId);

                if (!pagination) {
                    list = (List<RmaRequestDevice>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequestDevice>(list);
                } else {
                    list = (List<RmaRequestDevice>) QueryUtil.list(q,
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
     * Returns the first rma request device in the ordered set where rmaRequestId = &#63;.
     *
     * @param rmaRequestId the rma request ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByRmaRequestId_First(long rmaRequestId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByRmaRequestId_First(rmaRequestId,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("rmaRequestId=");
        msg.append(rmaRequestId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the first rma request device in the ordered set where rmaRequestId = &#63;.
     *
     * @param rmaRequestId the rma request ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByRmaRequestId_First(long rmaRequestId,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequestDevice> list = findByRmaRequestId(rmaRequestId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request device in the ordered set where rmaRequestId = &#63;.
     *
     * @param rmaRequestId the rma request ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByRmaRequestId_Last(long rmaRequestId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByRmaRequestId_Last(rmaRequestId,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("rmaRequestId=");
        msg.append(rmaRequestId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the last rma request device in the ordered set where rmaRequestId = &#63;.
     *
     * @param rmaRequestId the rma request ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByRmaRequestId_Last(long rmaRequestId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByRmaRequestId(rmaRequestId);

        if (count == 0) {
            return null;
        }

        List<RmaRequestDevice> list = findByRmaRequestId(rmaRequestId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma request devices before and after the current rma request device in the ordered set where rmaRequestId = &#63;.
     *
     * @param rmaRequestDevicePK the primary key of the current rma request device
     * @param rmaRequestId the rma request ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice[] findByRmaRequestId_PrevAndNext(
        RmaRequestDevicePK rmaRequestDevicePK, long rmaRequestId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByPrimaryKey(rmaRequestDevicePK);

        Session session = null;

        try {
            session = openSession();

            RmaRequestDevice[] array = new RmaRequestDeviceImpl[3];

            array[0] = getByRmaRequestId_PrevAndNext(session, rmaRequestDevice,
                    rmaRequestId, orderByComparator, true);

            array[1] = rmaRequestDevice;

            array[2] = getByRmaRequestId_PrevAndNext(session, rmaRequestDevice,
                    rmaRequestId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequestDevice getByRmaRequestId_PrevAndNext(Session session,
        RmaRequestDevice rmaRequestDevice, long rmaRequestId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

        query.append(_FINDER_COLUMN_RMAREQUESTID_RMAREQUESTID_2);

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
            query.append(RmaRequestDeviceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(rmaRequestId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rmaRequestDevice);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RmaRequestDevice> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rma request devices where rmaRequestId = &#63; from the database.
     *
     * @param rmaRequestId the rma request ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRmaRequestId(long rmaRequestId)
        throws SystemException {
        for (RmaRequestDevice rmaRequestDevice : findByRmaRequestId(
                rmaRequestId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequestDevice);
        }
    }

    /**
     * Returns the number of rma request devices where rmaRequestId = &#63;.
     *
     * @param rmaRequestId the rma request ID
     * @return the number of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRmaRequestId(long rmaRequestId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_RMAREQUESTID;

        Object[] finderArgs = new Object[] { rmaRequestId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_RMAREQUESTID_RMAREQUESTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(rmaRequestId);

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
     * Returns the rma request device where deviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
     *
     * @param deviceId the device ID
     * @return the matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByDeviceId(long deviceId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByDeviceId(deviceId);

        if (rmaRequestDevice == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("deviceId=");
            msg.append(deviceId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchRmaRequestDeviceException(msg.toString());
        }

        return rmaRequestDevice;
    }

    /**
     * Returns the rma request device where deviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param deviceId the device ID
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByDeviceId(long deviceId)
        throws SystemException {
        return fetchByDeviceId(deviceId, true);
    }

    /**
     * Returns the rma request device where deviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param deviceId the device ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByDeviceId(long deviceId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { deviceId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DEVICEID,
                    finderArgs, this);
        }

        if (result instanceof RmaRequestDevice) {
            RmaRequestDevice rmaRequestDevice = (RmaRequestDevice) result;

            if ((deviceId != rmaRequestDevice.getDeviceId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceId);

                List<RmaRequestDevice> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "RmaRequestDevicePersistenceImpl.fetchByDeviceId(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    RmaRequestDevice rmaRequestDevice = list.get(0);

                    result = rmaRequestDevice;

                    cacheResult(rmaRequestDevice);

                    if ((rmaRequestDevice.getDeviceId() != deviceId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID,
                            finderArgs, rmaRequestDevice);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (RmaRequestDevice) result;
        }
    }

    /**
     * Removes the rma request device where deviceId = &#63; from the database.
     *
     * @param deviceId the device ID
     * @return the rma request device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice removeByDeviceId(long deviceId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByDeviceId(deviceId);

        return remove(rmaRequestDevice);
    }

    /**
     * Returns the number of rma request devices where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @return the number of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByDeviceId(long deviceId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DEVICEID;

        Object[] finderArgs = new Object[] { deviceId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceId);

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
     * Caches the rma request device in the entity cache if it is enabled.
     *
     * @param rmaRequestDevice the rma request device
     */
    @Override
    public void cacheResult(RmaRequestDevice rmaRequestDevice) {
        EntityCacheUtil.putResult(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, rmaRequestDevice.getPrimaryKey(),
            rmaRequestDevice);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID,
            new Object[] { rmaRequestDevice.getDeviceId() }, rmaRequestDevice);

        rmaRequestDevice.resetOriginalValues();
    }

    /**
     * Caches the rma request devices in the entity cache if it is enabled.
     *
     * @param rmaRequestDevices the rma request devices
     */
    @Override
    public void cacheResult(List<RmaRequestDevice> rmaRequestDevices) {
        for (RmaRequestDevice rmaRequestDevice : rmaRequestDevices) {
            if (EntityCacheUtil.getResult(
                        RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
                        RmaRequestDeviceImpl.class,
                        rmaRequestDevice.getPrimaryKey()) == null) {
                cacheResult(rmaRequestDevice);
            } else {
                rmaRequestDevice.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all rma request devices.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RmaRequestDeviceImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RmaRequestDeviceImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the rma request device.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(RmaRequestDevice rmaRequestDevice) {
        EntityCacheUtil.removeResult(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, rmaRequestDevice.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(rmaRequestDevice);
    }

    @Override
    public void clearCache(List<RmaRequestDevice> rmaRequestDevices) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (RmaRequestDevice rmaRequestDevice : rmaRequestDevices) {
            EntityCacheUtil.removeResult(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
                RmaRequestDeviceImpl.class, rmaRequestDevice.getPrimaryKey());

            clearUniqueFindersCache(rmaRequestDevice);
        }
    }

    protected void cacheUniqueFindersCache(RmaRequestDevice rmaRequestDevice) {
        if (rmaRequestDevice.isNew()) {
            Object[] args = new Object[] { rmaRequestDevice.getDeviceId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEVICEID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID, args,
                rmaRequestDevice);
        } else {
            RmaRequestDeviceModelImpl rmaRequestDeviceModelImpl = (RmaRequestDeviceModelImpl) rmaRequestDevice;

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_DEVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { rmaRequestDevice.getDeviceId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEVICEID, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID, args,
                    rmaRequestDevice);
            }
        }
    }

    protected void clearUniqueFindersCache(RmaRequestDevice rmaRequestDevice) {
        RmaRequestDeviceModelImpl rmaRequestDeviceModelImpl = (RmaRequestDeviceModelImpl) rmaRequestDevice;

        Object[] args = new Object[] { rmaRequestDevice.getDeviceId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEID, args);

        if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_DEVICEID.getColumnBitmask()) != 0) {
            args = new Object[] { rmaRequestDeviceModelImpl.getOriginalDeviceId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEID, args);
        }
    }

    /**
     * Creates a new rma request device with the primary key. Does not add the rma request device to the database.
     *
     * @param rmaRequestDevicePK the primary key for the new rma request device
     * @return the new rma request device
     */
    @Override
    public RmaRequestDevice create(RmaRequestDevicePK rmaRequestDevicePK) {
        RmaRequestDevice rmaRequestDevice = new RmaRequestDeviceImpl();

        rmaRequestDevice.setNew(true);
        rmaRequestDevice.setPrimaryKey(rmaRequestDevicePK);

        return rmaRequestDevice;
    }

    /**
     * Removes the rma request device with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param rmaRequestDevicePK the primary key of the rma request device
     * @return the rma request device that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice remove(RmaRequestDevicePK rmaRequestDevicePK)
        throws NoSuchRmaRequestDeviceException, SystemException {
        return remove((Serializable) rmaRequestDevicePK);
    }

    /**
     * Removes the rma request device with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the rma request device
     * @return the rma request device that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice remove(Serializable primaryKey)
        throws NoSuchRmaRequestDeviceException, SystemException {
        Session session = null;

        try {
            session = openSession();

            RmaRequestDevice rmaRequestDevice = (RmaRequestDevice) session.get(RmaRequestDeviceImpl.class,
                    primaryKey);

            if (rmaRequestDevice == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRmaRequestDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(rmaRequestDevice);
        } catch (NoSuchRmaRequestDeviceException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected RmaRequestDevice removeImpl(RmaRequestDevice rmaRequestDevice)
        throws SystemException {
        rmaRequestDevice = toUnwrappedModel(rmaRequestDevice);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(rmaRequestDevice)) {
                rmaRequestDevice = (RmaRequestDevice) session.get(RmaRequestDeviceImpl.class,
                        rmaRequestDevice.getPrimaryKeyObj());
            }

            if (rmaRequestDevice != null) {
                session.delete(rmaRequestDevice);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (rmaRequestDevice != null) {
            clearCache(rmaRequestDevice);
        }

        return rmaRequestDevice;
    }

    @Override
    public RmaRequestDevice updateImpl(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice)
        throws SystemException {
        rmaRequestDevice = toUnwrappedModel(rmaRequestDevice);

        boolean isNew = rmaRequestDevice.isNew();

        RmaRequestDeviceModelImpl rmaRequestDeviceModelImpl = (RmaRequestDeviceModelImpl) rmaRequestDevice;

        Session session = null;

        try {
            session = openSession();

            if (rmaRequestDevice.isNew()) {
                session.save(rmaRequestDevice);

                rmaRequestDevice.setNew(false);
            } else {
                session.merge(rmaRequestDevice);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RmaRequestDeviceModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RMAREQUESTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDeviceModelImpl.getOriginalRmaRequestId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RMAREQUESTID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RMAREQUESTID,
                    args);

                args = new Object[] { rmaRequestDeviceModelImpl.getRmaRequestId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RMAREQUESTID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RMAREQUESTID,
                    args);
            }
        }

        EntityCacheUtil.putResult(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, rmaRequestDevice.getPrimaryKey(),
            rmaRequestDevice);

        clearUniqueFindersCache(rmaRequestDevice);
        cacheUniqueFindersCache(rmaRequestDevice);

        return rmaRequestDevice;
    }

    protected RmaRequestDevice toUnwrappedModel(
        RmaRequestDevice rmaRequestDevice) {
        if (rmaRequestDevice instanceof RmaRequestDeviceImpl) {
            return rmaRequestDevice;
        }

        RmaRequestDeviceImpl rmaRequestDeviceImpl = new RmaRequestDeviceImpl();

        rmaRequestDeviceImpl.setNew(rmaRequestDevice.isNew());
        rmaRequestDeviceImpl.setPrimaryKey(rmaRequestDevice.getPrimaryKey());

        rmaRequestDeviceImpl.setRmaRequestId(rmaRequestDevice.getRmaRequestId());
        rmaRequestDeviceImpl.setDeviceId(rmaRequestDevice.getDeviceId());
        rmaRequestDeviceImpl.setCompanyId(rmaRequestDevice.getCompanyId());
        rmaRequestDeviceImpl.setUserId(rmaRequestDevice.getUserId());
        rmaRequestDeviceImpl.setUserName(rmaRequestDevice.getUserName());
        rmaRequestDeviceImpl.setCreateDate(rmaRequestDevice.getCreateDate());
        rmaRequestDeviceImpl.setModifiedDate(rmaRequestDevice.getModifiedDate());
        rmaRequestDeviceImpl.setFaultNote(rmaRequestDevice.getFaultNote());
        rmaRequestDeviceImpl.setStatus(rmaRequestDevice.getStatus());

        return rmaRequestDeviceImpl;
    }

    /**
     * Returns the rma request device with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the rma request device
     * @return the rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByPrimaryKey(primaryKey);

        if (rmaRequestDevice == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRmaRequestDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return rmaRequestDevice;
    }

    /**
     * Returns the rma request device with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
     *
     * @param rmaRequestDevicePK the primary key of the rma request device
     * @return the rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByPrimaryKey(
        RmaRequestDevicePK rmaRequestDevicePK)
        throws NoSuchRmaRequestDeviceException, SystemException {
        return findByPrimaryKey((Serializable) rmaRequestDevicePK);
    }

    /**
     * Returns the rma request device with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the rma request device
     * @return the rma request device, or <code>null</code> if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        RmaRequestDevice rmaRequestDevice = (RmaRequestDevice) EntityCacheUtil.getResult(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
                RmaRequestDeviceImpl.class, primaryKey);

        if (rmaRequestDevice == _nullRmaRequestDevice) {
            return null;
        }

        if (rmaRequestDevice == null) {
            Session session = null;

            try {
                session = openSession();

                rmaRequestDevice = (RmaRequestDevice) session.get(RmaRequestDeviceImpl.class,
                        primaryKey);

                if (rmaRequestDevice != null) {
                    cacheResult(rmaRequestDevice);
                } else {
                    EntityCacheUtil.putResult(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
                        RmaRequestDeviceImpl.class, primaryKey,
                        _nullRmaRequestDevice);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
                    RmaRequestDeviceImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return rmaRequestDevice;
    }

    /**
     * Returns the rma request device with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param rmaRequestDevicePK the primary key of the rma request device
     * @return the rma request device, or <code>null</code> if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByPrimaryKey(
        RmaRequestDevicePK rmaRequestDevicePK) throws SystemException {
        return fetchByPrimaryKey((Serializable) rmaRequestDevicePK);
    }

    /**
     * Returns all the rma request devices.
     *
     * @return the rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma request devices.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @return the range of rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the rma request devices.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findAll(int start, int end,
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

        List<RmaRequestDevice> list = (List<RmaRequestDevice>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_RMAREQUESTDEVICE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_RMAREQUESTDEVICE;

                if (pagination) {
                    sql = sql.concat(RmaRequestDeviceModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<RmaRequestDevice>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequestDevice>(list);
                } else {
                    list = (List<RmaRequestDevice>) QueryUtil.list(q,
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
     * Removes all the rma request devices from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (RmaRequestDevice rmaRequestDevice : findAll()) {
            remove(rmaRequestDevice);
        }
    }

    /**
     * Returns the number of rma request devices.
     *
     * @return the number of rma request devices
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

                Query q = session.createQuery(_SQL_COUNT_RMAREQUESTDEVICE);

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
     * Initializes the rma request device persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.RmaRequestDevice")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<RmaRequestDevice>> listenersList = new ArrayList<ModelListener<RmaRequestDevice>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<RmaRequestDevice>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RmaRequestDeviceImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
