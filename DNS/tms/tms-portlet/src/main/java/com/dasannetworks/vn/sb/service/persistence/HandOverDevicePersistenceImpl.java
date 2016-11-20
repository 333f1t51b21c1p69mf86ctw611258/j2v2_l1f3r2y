package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchHandOverDeviceException;
import com.dasannetworks.vn.sb.model.HandOverDevice;
import com.dasannetworks.vn.sb.model.impl.HandOverDeviceImpl;
import com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl;
import com.dasannetworks.vn.sb.service.persistence.HandOverDevicePersistence;

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
 * The persistence implementation for the hand over device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverDevicePersistence
 * @see HandOverDeviceUtil
 * @generated
 */
public class HandOverDevicePersistenceImpl extends BasePersistenceImpl<HandOverDevice>
    implements HandOverDevicePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link HandOverDeviceUtil} to access the hand over device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = HandOverDeviceImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceModelImpl.FINDER_CACHE_ENABLED,
            HandOverDeviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceModelImpl.FINDER_CACHE_ENABLED,
            HandOverDeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HANDOVERFORMID =
        new FinderPath(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceModelImpl.FINDER_CACHE_ENABLED,
            HandOverDeviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByHandOverFormId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HANDOVERFORMID =
        new FinderPath(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceModelImpl.FINDER_CACHE_ENABLED,
            HandOverDeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHandOverFormId",
            new String[] { Long.class.getName() },
            HandOverDeviceModelImpl.HANDOVERFORMID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_HANDOVERFORMID = new FinderPath(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHandOverFormId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_HANDOVERFORMID_HANDOVERFORMID_2 = "handOverDevice.id.handOverFormId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_DEVICEID = new FinderPath(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceModelImpl.FINDER_CACHE_ENABLED,
            HandOverDeviceImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByDeviceId", new String[] { Long.class.getName() },
            HandOverDeviceModelImpl.DEVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEID = new FinderPath(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDeviceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_DEVICEID_DEVICEID_2 = "handOverDevice.id.deviceId = ?";
    private static final String _SQL_SELECT_HANDOVERDEVICE = "SELECT handOverDevice FROM HandOverDevice handOverDevice";
    private static final String _SQL_SELECT_HANDOVERDEVICE_WHERE = "SELECT handOverDevice FROM HandOverDevice handOverDevice WHERE ";
    private static final String _SQL_COUNT_HANDOVERDEVICE = "SELECT COUNT(handOverDevice) FROM HandOverDevice handOverDevice";
    private static final String _SQL_COUNT_HANDOVERDEVICE_WHERE = "SELECT COUNT(handOverDevice) FROM HandOverDevice handOverDevice WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "handOverDevice.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HandOverDevice exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HandOverDevice exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(HandOverDevicePersistenceImpl.class);
    private static HandOverDevice _nullHandOverDevice = new HandOverDeviceImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<HandOverDevice> toCacheModel() {
                return _nullHandOverDeviceCacheModel;
            }
        };

    private static CacheModel<HandOverDevice> _nullHandOverDeviceCacheModel = new CacheModel<HandOverDevice>() {
            @Override
            public HandOverDevice toEntityModel() {
                return _nullHandOverDevice;
            }
        };

    public HandOverDevicePersistenceImpl() {
        setModelClass(HandOverDevice.class);
    }

    /**
     * Returns all the hand over devices where handOverFormId = &#63;.
     *
     * @param handOverFormId the hand over form ID
     * @return the matching hand over devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverDevice> findByHandOverFormId(long handOverFormId)
        throws SystemException {
        return findByHandOverFormId(handOverFormId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hand over devices where handOverFormId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param handOverFormId the hand over form ID
     * @param start the lower bound of the range of hand over devices
     * @param end the upper bound of the range of hand over devices (not inclusive)
     * @return the range of matching hand over devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverDevice> findByHandOverFormId(long handOverFormId,
        int start, int end) throws SystemException {
        return findByHandOverFormId(handOverFormId, start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over devices where handOverFormId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param handOverFormId the hand over form ID
     * @param start the lower bound of the range of hand over devices
     * @param end the upper bound of the range of hand over devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching hand over devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverDevice> findByHandOverFormId(long handOverFormId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HANDOVERFORMID;
            finderArgs = new Object[] { handOverFormId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HANDOVERFORMID;
            finderArgs = new Object[] {
                    handOverFormId,
                    
                    start, end, orderByComparator
                };
        }

        List<HandOverDevice> list = (List<HandOverDevice>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (HandOverDevice handOverDevice : list) {
                if ((handOverFormId != handOverDevice.getHandOverFormId())) {
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

            query.append(_SQL_SELECT_HANDOVERDEVICE_WHERE);

            query.append(_FINDER_COLUMN_HANDOVERFORMID_HANDOVERFORMID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(HandOverDeviceModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(handOverFormId);

                if (!pagination) {
                    list = (List<HandOverDevice>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverDevice>(list);
                } else {
                    list = (List<HandOverDevice>) QueryUtil.list(q,
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
     * Returns the first hand over device in the ordered set where handOverFormId = &#63;.
     *
     * @param handOverFormId the hand over form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over device
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice findByHandOverFormId_First(long handOverFormId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverDeviceException, SystemException {
        HandOverDevice handOverDevice = fetchByHandOverFormId_First(handOverFormId,
                orderByComparator);

        if (handOverDevice != null) {
            return handOverDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("handOverFormId=");
        msg.append(handOverFormId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverDeviceException(msg.toString());
    }

    /**
     * Returns the first hand over device in the ordered set where handOverFormId = &#63;.
     *
     * @param handOverFormId the hand over form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching hand over device, or <code>null</code> if a matching hand over device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice fetchByHandOverFormId_First(long handOverFormId,
        OrderByComparator orderByComparator) throws SystemException {
        List<HandOverDevice> list = findByHandOverFormId(handOverFormId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last hand over device in the ordered set where handOverFormId = &#63;.
     *
     * @param handOverFormId the hand over form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over device
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice findByHandOverFormId_Last(long handOverFormId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverDeviceException, SystemException {
        HandOverDevice handOverDevice = fetchByHandOverFormId_Last(handOverFormId,
                orderByComparator);

        if (handOverDevice != null) {
            return handOverDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("handOverFormId=");
        msg.append(handOverFormId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchHandOverDeviceException(msg.toString());
    }

    /**
     * Returns the last hand over device in the ordered set where handOverFormId = &#63;.
     *
     * @param handOverFormId the hand over form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching hand over device, or <code>null</code> if a matching hand over device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice fetchByHandOverFormId_Last(long handOverFormId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByHandOverFormId(handOverFormId);

        if (count == 0) {
            return null;
        }

        List<HandOverDevice> list = findByHandOverFormId(handOverFormId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the hand over devices before and after the current hand over device in the ordered set where handOverFormId = &#63;.
     *
     * @param handOverDevicePK the primary key of the current hand over device
     * @param handOverFormId the hand over form ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next hand over device
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice[] findByHandOverFormId_PrevAndNext(
        HandOverDevicePK handOverDevicePK, long handOverFormId,
        OrderByComparator orderByComparator)
        throws NoSuchHandOverDeviceException, SystemException {
        HandOverDevice handOverDevice = findByPrimaryKey(handOverDevicePK);

        Session session = null;

        try {
            session = openSession();

            HandOverDevice[] array = new HandOverDeviceImpl[3];

            array[0] = getByHandOverFormId_PrevAndNext(session, handOverDevice,
                    handOverFormId, orderByComparator, true);

            array[1] = handOverDevice;

            array[2] = getByHandOverFormId_PrevAndNext(session, handOverDevice,
                    handOverFormId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected HandOverDevice getByHandOverFormId_PrevAndNext(Session session,
        HandOverDevice handOverDevice, long handOverFormId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_HANDOVERDEVICE_WHERE);

        query.append(_FINDER_COLUMN_HANDOVERFORMID_HANDOVERFORMID_2);

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
            query.append(HandOverDeviceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(handOverFormId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(handOverDevice);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<HandOverDevice> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the hand over devices where handOverFormId = &#63; from the database.
     *
     * @param handOverFormId the hand over form ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByHandOverFormId(long handOverFormId)
        throws SystemException {
        for (HandOverDevice handOverDevice : findByHandOverFormId(
                handOverFormId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(handOverDevice);
        }
    }

    /**
     * Returns the number of hand over devices where handOverFormId = &#63;.
     *
     * @param handOverFormId the hand over form ID
     * @return the number of matching hand over devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByHandOverFormId(long handOverFormId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_HANDOVERFORMID;

        Object[] finderArgs = new Object[] { handOverFormId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_HANDOVERDEVICE_WHERE);

            query.append(_FINDER_COLUMN_HANDOVERFORMID_HANDOVERFORMID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(handOverFormId);

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
     * Returns the hand over device where deviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverDeviceException} if it could not be found.
     *
     * @param deviceId the device ID
     * @return the matching hand over device
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice findByDeviceId(long deviceId)
        throws NoSuchHandOverDeviceException, SystemException {
        HandOverDevice handOverDevice = fetchByDeviceId(deviceId);

        if (handOverDevice == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("deviceId=");
            msg.append(deviceId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchHandOverDeviceException(msg.toString());
        }

        return handOverDevice;
    }

    /**
     * Returns the hand over device where deviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param deviceId the device ID
     * @return the matching hand over device, or <code>null</code> if a matching hand over device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice fetchByDeviceId(long deviceId)
        throws SystemException {
        return fetchByDeviceId(deviceId, true);
    }

    /**
     * Returns the hand over device where deviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param deviceId the device ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching hand over device, or <code>null</code> if a matching hand over device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice fetchByDeviceId(long deviceId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { deviceId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DEVICEID,
                    finderArgs, this);
        }

        if (result instanceof HandOverDevice) {
            HandOverDevice handOverDevice = (HandOverDevice) result;

            if ((deviceId != handOverDevice.getDeviceId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_HANDOVERDEVICE_WHERE);

            query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceId);

                List<HandOverDevice> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID,
                        finderArgs, list);
                } else {
                    HandOverDevice handOverDevice = list.get(0);

                    result = handOverDevice;

                    cacheResult(handOverDevice);

                    if ((handOverDevice.getDeviceId() != deviceId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID,
                            finderArgs, handOverDevice);
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
            return (HandOverDevice) result;
        }
    }

    /**
     * Removes the hand over device where deviceId = &#63; from the database.
     *
     * @param deviceId the device ID
     * @return the hand over device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice removeByDeviceId(long deviceId)
        throws NoSuchHandOverDeviceException, SystemException {
        HandOverDevice handOverDevice = findByDeviceId(deviceId);

        return remove(handOverDevice);
    }

    /**
     * Returns the number of hand over devices where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @return the number of matching hand over devices
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

            query.append(_SQL_COUNT_HANDOVERDEVICE_WHERE);

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
     * Caches the hand over device in the entity cache if it is enabled.
     *
     * @param handOverDevice the hand over device
     */
    @Override
    public void cacheResult(HandOverDevice handOverDevice) {
        EntityCacheUtil.putResult(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceImpl.class, handOverDevice.getPrimaryKey(),
            handOverDevice);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID,
            new Object[] { handOverDevice.getDeviceId() }, handOverDevice);

        handOverDevice.resetOriginalValues();
    }

    /**
     * Caches the hand over devices in the entity cache if it is enabled.
     *
     * @param handOverDevices the hand over devices
     */
    @Override
    public void cacheResult(List<HandOverDevice> handOverDevices) {
        for (HandOverDevice handOverDevice : handOverDevices) {
            if (EntityCacheUtil.getResult(
                        HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
                        HandOverDeviceImpl.class, handOverDevice.getPrimaryKey()) == null) {
                cacheResult(handOverDevice);
            } else {
                handOverDevice.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hand over devices.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(HandOverDeviceImpl.class.getName());
        }

        EntityCacheUtil.clearCache(HandOverDeviceImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hand over device.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(HandOverDevice handOverDevice) {
        EntityCacheUtil.removeResult(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceImpl.class, handOverDevice.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(handOverDevice);
    }

    @Override
    public void clearCache(List<HandOverDevice> handOverDevices) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (HandOverDevice handOverDevice : handOverDevices) {
            EntityCacheUtil.removeResult(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
                HandOverDeviceImpl.class, handOverDevice.getPrimaryKey());

            clearUniqueFindersCache(handOverDevice);
        }
    }

    protected void cacheUniqueFindersCache(HandOverDevice handOverDevice) {
        if (handOverDevice.isNew()) {
            Object[] args = new Object[] { handOverDevice.getDeviceId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEVICEID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID, args,
                handOverDevice);
        } else {
            HandOverDeviceModelImpl handOverDeviceModelImpl = (HandOverDeviceModelImpl) handOverDevice;

            if ((handOverDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_DEVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { handOverDevice.getDeviceId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEVICEID, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEID, args,
                    handOverDevice);
            }
        }
    }

    protected void clearUniqueFindersCache(HandOverDevice handOverDevice) {
        HandOverDeviceModelImpl handOverDeviceModelImpl = (HandOverDeviceModelImpl) handOverDevice;

        Object[] args = new Object[] { handOverDevice.getDeviceId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEID, args);

        if ((handOverDeviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_DEVICEID.getColumnBitmask()) != 0) {
            args = new Object[] { handOverDeviceModelImpl.getOriginalDeviceId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEID, args);
        }
    }

    /**
     * Creates a new hand over device with the primary key. Does not add the hand over device to the database.
     *
     * @param handOverDevicePK the primary key for the new hand over device
     * @return the new hand over device
     */
    @Override
    public HandOverDevice create(HandOverDevicePK handOverDevicePK) {
        HandOverDevice handOverDevice = new HandOverDeviceImpl();

        handOverDevice.setNew(true);
        handOverDevice.setPrimaryKey(handOverDevicePK);

        return handOverDevice;
    }

    /**
     * Removes the hand over device with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param handOverDevicePK the primary key of the hand over device
     * @return the hand over device that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice remove(HandOverDevicePK handOverDevicePK)
        throws NoSuchHandOverDeviceException, SystemException {
        return remove((Serializable) handOverDevicePK);
    }

    /**
     * Removes the hand over device with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hand over device
     * @return the hand over device that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice remove(Serializable primaryKey)
        throws NoSuchHandOverDeviceException, SystemException {
        Session session = null;

        try {
            session = openSession();

            HandOverDevice handOverDevice = (HandOverDevice) session.get(HandOverDeviceImpl.class,
                    primaryKey);

            if (handOverDevice == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHandOverDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(handOverDevice);
        } catch (NoSuchHandOverDeviceException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected HandOverDevice removeImpl(HandOverDevice handOverDevice)
        throws SystemException {
        handOverDevice = toUnwrappedModel(handOverDevice);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(handOverDevice)) {
                handOverDevice = (HandOverDevice) session.get(HandOverDeviceImpl.class,
                        handOverDevice.getPrimaryKeyObj());
            }

            if (handOverDevice != null) {
                session.delete(handOverDevice);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (handOverDevice != null) {
            clearCache(handOverDevice);
        }

        return handOverDevice;
    }

    @Override
    public HandOverDevice updateImpl(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice)
        throws SystemException {
        handOverDevice = toUnwrappedModel(handOverDevice);

        boolean isNew = handOverDevice.isNew();

        HandOverDeviceModelImpl handOverDeviceModelImpl = (HandOverDeviceModelImpl) handOverDevice;

        Session session = null;

        try {
            session = openSession();

            if (handOverDevice.isNew()) {
                session.save(handOverDevice);

                handOverDevice.setNew(false);
            } else {
                session.merge(handOverDevice);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !HandOverDeviceModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((handOverDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HANDOVERFORMID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        handOverDeviceModelImpl.getOriginalHandOverFormId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HANDOVERFORMID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HANDOVERFORMID,
                    args);

                args = new Object[] { handOverDeviceModelImpl.getHandOverFormId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HANDOVERFORMID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HANDOVERFORMID,
                    args);
            }
        }

        EntityCacheUtil.putResult(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
            HandOverDeviceImpl.class, handOverDevice.getPrimaryKey(),
            handOverDevice);

        clearUniqueFindersCache(handOverDevice);
        cacheUniqueFindersCache(handOverDevice);

        return handOverDevice;
    }

    protected HandOverDevice toUnwrappedModel(HandOverDevice handOverDevice) {
        if (handOverDevice instanceof HandOverDeviceImpl) {
            return handOverDevice;
        }

        HandOverDeviceImpl handOverDeviceImpl = new HandOverDeviceImpl();

        handOverDeviceImpl.setNew(handOverDevice.isNew());
        handOverDeviceImpl.setPrimaryKey(handOverDevice.getPrimaryKey());

        handOverDeviceImpl.setHandOverFormId(handOverDevice.getHandOverFormId());
        handOverDeviceImpl.setDeviceId(handOverDevice.getDeviceId());
        handOverDeviceImpl.setCompanyId(handOverDevice.getCompanyId());
        handOverDeviceImpl.setUserId(handOverDevice.getUserId());
        handOverDeviceImpl.setUserName(handOverDevice.getUserName());
        handOverDeviceImpl.setCreateDate(handOverDevice.getCreateDate());
        handOverDeviceImpl.setModifiedDate(handOverDevice.getModifiedDate());
        handOverDeviceImpl.setFaultNote(handOverDevice.getFaultNote());
        handOverDeviceImpl.setStatus(handOverDevice.getStatus());

        return handOverDeviceImpl;
    }

    /**
     * Returns the hand over device with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hand over device
     * @return the hand over device
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHandOverDeviceException, SystemException {
        HandOverDevice handOverDevice = fetchByPrimaryKey(primaryKey);

        if (handOverDevice == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHandOverDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return handOverDevice;
    }

    /**
     * Returns the hand over device with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverDeviceException} if it could not be found.
     *
     * @param handOverDevicePK the primary key of the hand over device
     * @return the hand over device
     * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice findByPrimaryKey(HandOverDevicePK handOverDevicePK)
        throws NoSuchHandOverDeviceException, SystemException {
        return findByPrimaryKey((Serializable) handOverDevicePK);
    }

    /**
     * Returns the hand over device with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hand over device
     * @return the hand over device, or <code>null</code> if a hand over device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        HandOverDevice handOverDevice = (HandOverDevice) EntityCacheUtil.getResult(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
                HandOverDeviceImpl.class, primaryKey);

        if (handOverDevice == _nullHandOverDevice) {
            return null;
        }

        if (handOverDevice == null) {
            Session session = null;

            try {
                session = openSession();

                handOverDevice = (HandOverDevice) session.get(HandOverDeviceImpl.class,
                        primaryKey);

                if (handOverDevice != null) {
                    cacheResult(handOverDevice);
                } else {
                    EntityCacheUtil.putResult(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
                        HandOverDeviceImpl.class, primaryKey,
                        _nullHandOverDevice);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(HandOverDeviceModelImpl.ENTITY_CACHE_ENABLED,
                    HandOverDeviceImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return handOverDevice;
    }

    /**
     * Returns the hand over device with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param handOverDevicePK the primary key of the hand over device
     * @return the hand over device, or <code>null</code> if a hand over device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HandOverDevice fetchByPrimaryKey(HandOverDevicePK handOverDevicePK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) handOverDevicePK);
    }

    /**
     * Returns all the hand over devices.
     *
     * @return the hand over devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverDevice> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hand over devices.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hand over devices
     * @param end the upper bound of the range of hand over devices (not inclusive)
     * @return the range of hand over devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverDevice> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hand over devices.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hand over devices
     * @param end the upper bound of the range of hand over devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hand over devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HandOverDevice> findAll(int start, int end,
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

        List<HandOverDevice> list = (List<HandOverDevice>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HANDOVERDEVICE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HANDOVERDEVICE;

                if (pagination) {
                    sql = sql.concat(HandOverDeviceModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<HandOverDevice>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HandOverDevice>(list);
                } else {
                    list = (List<HandOverDevice>) QueryUtil.list(q,
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
     * Removes all the hand over devices from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (HandOverDevice handOverDevice : findAll()) {
            remove(handOverDevice);
        }
    }

    /**
     * Returns the number of hand over devices.
     *
     * @return the number of hand over devices
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

                Query q = session.createQuery(_SQL_COUNT_HANDOVERDEVICE);

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
     * Initializes the hand over device persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.HandOverDevice")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<HandOverDevice>> listenersList = new ArrayList<ModelListener<HandOverDevice>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<HandOverDevice>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(HandOverDeviceImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
