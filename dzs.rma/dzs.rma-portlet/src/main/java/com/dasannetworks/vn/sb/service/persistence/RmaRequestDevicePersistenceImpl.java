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
import com.liferay.portal.kernel.util.Validator;
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
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByDeviceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID =
        new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeviceId",
            new String[] { Long.class.getName() },
            RmaRequestDeviceModelImpl.DEVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDeviceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_DEVICEID_DEVICEID_2 = "rmaRequestDevice.id.deviceId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PARTNERID =
        new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByPartnerId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTNERID =
        new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPartnerId",
            new String[] { Long.class.getName() },
            RmaRequestDeviceModelImpl.PARTNERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PARTNERID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPartnerId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PARTNERID_PARTNERID_2 = "rmaRequestDevice.partnerId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByStatus",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { Integer.class.getName() },
            RmaRequestDeviceModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "rmaRequestDevice.status = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REPLACEDNUMBER =
        new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByReplacedNumber",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLACEDNUMBER =
        new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReplacedNumber",
            new String[] { String.class.getName() },
            RmaRequestDeviceModelImpl.REPLACEDNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REPLACEDNUMBER = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReplacedNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_1 = "rmaRequestDevice.replacedNumber IS NULL";
    private static final String _FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_2 = "rmaRequestDevice.replacedNumber = ?";
    private static final String _FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_3 = "(rmaRequestDevice.replacedNumber IS NULL OR rmaRequestDevice.replacedNumber = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByReplacedOldDeviceId",
            new String[] { Long.class.getName() },
            RmaRequestDeviceModelImpl.REPLACEDOLDDEVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByReplacedOldDeviceId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_REPLACEDOLDDEVICEID_REPLACEDOLDDEVICEID_2 =
        "rmaRequestDevice.replacedOldDeviceId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByReplacedOldDeviceExtId",
            new String[] { Long.class.getName() },
            RmaRequestDeviceModelImpl.REPLACEDOLDDEVICEEXTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEEXTID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByReplacedOldDeviceExtId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_REPLACEDOLDDEVICEEXTID_REPLACEDOLDDEVICEEXTID_2 =
        "rmaRequestDevice.replacedOldDeviceExtId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByReplacedNewDeviceId",
            new String[] { Long.class.getName() },
            RmaRequestDeviceModelImpl.REPLACEDNEWDEVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByReplacedNewDeviceId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_REPLACEDNEWDEVICEID_REPLACEDNEWDEVICEID_2 =
        "rmaRequestDevice.replacedNewDeviceId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED,
            RmaRequestDeviceImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByReplacedNewDeviceExtId",
            new String[] { Long.class.getName() },
            RmaRequestDeviceModelImpl.REPLACEDNEWDEVICEEXTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEEXTID = new FinderPath(RmaRequestDeviceModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByReplacedNewDeviceExtId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_REPLACEDNEWDEVICEEXTID_REPLACEDNEWDEVICEEXTID_2 =
        "rmaRequestDevice.replacedNewDeviceExtId = ?";
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
     * Returns all the rma request devices where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @return the matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByDeviceId(long deviceId)
        throws SystemException {
        return findByDeviceId(deviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the rma request devices where deviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceId the device ID
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @return the range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByDeviceId(long deviceId, int start,
        int end) throws SystemException {
        return findByDeviceId(deviceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma request devices where deviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceId the device ID
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByDeviceId(long deviceId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID;
            finderArgs = new Object[] { deviceId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID;
            finderArgs = new Object[] { deviceId, start, end, orderByComparator };
        }

        List<RmaRequestDevice> list = (List<RmaRequestDevice>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequestDevice rmaRequestDevice : list) {
                if ((deviceId != rmaRequestDevice.getDeviceId())) {
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

            query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

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

                qPos.add(deviceId);

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
     * Returns the first rma request device in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByDeviceId_First(long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByDeviceId_First(deviceId,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceId=");
        msg.append(deviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the first rma request device in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByDeviceId_First(long deviceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequestDevice> list = findByDeviceId(deviceId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request device in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByDeviceId_Last(long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByDeviceId_Last(deviceId,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceId=");
        msg.append(deviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the last rma request device in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByDeviceId_Last(long deviceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByDeviceId(deviceId);

        if (count == 0) {
            return null;
        }

        List<RmaRequestDevice> list = findByDeviceId(deviceId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma request devices before and after the current rma request device in the ordered set where deviceId = &#63;.
     *
     * @param rmaRequestDevicePK the primary key of the current rma request device
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice[] findByDeviceId_PrevAndNext(
        RmaRequestDevicePK rmaRequestDevicePK, long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByPrimaryKey(rmaRequestDevicePK);

        Session session = null;

        try {
            session = openSession();

            RmaRequestDevice[] array = new RmaRequestDeviceImpl[3];

            array[0] = getByDeviceId_PrevAndNext(session, rmaRequestDevice,
                    deviceId, orderByComparator, true);

            array[1] = rmaRequestDevice;

            array[2] = getByDeviceId_PrevAndNext(session, rmaRequestDevice,
                    deviceId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequestDevice getByDeviceId_PrevAndNext(Session session,
        RmaRequestDevice rmaRequestDevice, long deviceId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

        query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

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

        qPos.add(deviceId);

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
     * Removes all the rma request devices where deviceId = &#63; from the database.
     *
     * @param deviceId the device ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByDeviceId(long deviceId) throws SystemException {
        for (RmaRequestDevice rmaRequestDevice : findByDeviceId(deviceId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequestDevice);
        }
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
     * Returns all the rma request devices where partnerId = &#63;.
     *
     * @param partnerId the partner ID
     * @return the matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByPartnerId(Long partnerId)
        throws SystemException {
        return findByPartnerId(partnerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the rma request devices where partnerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param partnerId the partner ID
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @return the range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByPartnerId(Long partnerId, int start,
        int end) throws SystemException {
        return findByPartnerId(partnerId, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma request devices where partnerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param partnerId the partner ID
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByPartnerId(Long partnerId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTNERID;
            finderArgs = new Object[] { partnerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PARTNERID;
            finderArgs = new Object[] { partnerId, start, end, orderByComparator };
        }

        List<RmaRequestDevice> list = (List<RmaRequestDevice>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequestDevice rmaRequestDevice : list) {
                if (!Validator.equals(partnerId, rmaRequestDevice.getPartnerId())) {
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

            query.append(_FINDER_COLUMN_PARTNERID_PARTNERID_2);

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

                qPos.add(partnerId.longValue());

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
     * Returns the first rma request device in the ordered set where partnerId = &#63;.
     *
     * @param partnerId the partner ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByPartnerId_First(Long partnerId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByPartnerId_First(partnerId,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("partnerId=");
        msg.append(partnerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the first rma request device in the ordered set where partnerId = &#63;.
     *
     * @param partnerId the partner ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByPartnerId_First(Long partnerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequestDevice> list = findByPartnerId(partnerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request device in the ordered set where partnerId = &#63;.
     *
     * @param partnerId the partner ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByPartnerId_Last(Long partnerId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByPartnerId_Last(partnerId,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("partnerId=");
        msg.append(partnerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the last rma request device in the ordered set where partnerId = &#63;.
     *
     * @param partnerId the partner ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByPartnerId_Last(Long partnerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPartnerId(partnerId);

        if (count == 0) {
            return null;
        }

        List<RmaRequestDevice> list = findByPartnerId(partnerId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma request devices before and after the current rma request device in the ordered set where partnerId = &#63;.
     *
     * @param rmaRequestDevicePK the primary key of the current rma request device
     * @param partnerId the partner ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice[] findByPartnerId_PrevAndNext(
        RmaRequestDevicePK rmaRequestDevicePK, Long partnerId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByPrimaryKey(rmaRequestDevicePK);

        Session session = null;

        try {
            session = openSession();

            RmaRequestDevice[] array = new RmaRequestDeviceImpl[3];

            array[0] = getByPartnerId_PrevAndNext(session, rmaRequestDevice,
                    partnerId, orderByComparator, true);

            array[1] = rmaRequestDevice;

            array[2] = getByPartnerId_PrevAndNext(session, rmaRequestDevice,
                    partnerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequestDevice getByPartnerId_PrevAndNext(Session session,
        RmaRequestDevice rmaRequestDevice, Long partnerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

        query.append(_FINDER_COLUMN_PARTNERID_PARTNERID_2);

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

        qPos.add(partnerId.longValue());

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
     * Removes all the rma request devices where partnerId = &#63; from the database.
     *
     * @param partnerId the partner ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPartnerId(Long partnerId) throws SystemException {
        for (RmaRequestDevice rmaRequestDevice : findByPartnerId(partnerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequestDevice);
        }
    }

    /**
     * Returns the number of rma request devices where partnerId = &#63;.
     *
     * @param partnerId the partner ID
     * @return the number of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPartnerId(Long partnerId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PARTNERID;

        Object[] finderArgs = new Object[] { partnerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_PARTNERID_PARTNERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(partnerId.longValue());

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
     * Returns all the rma request devices where status = &#63;.
     *
     * @param status the status
     * @return the matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByStatus(int status)
        throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma request devices where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @return the range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByStatus(int status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma request devices where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByStatus(int status, int start, int end,
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

        List<RmaRequestDevice> list = (List<RmaRequestDevice>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequestDevice rmaRequestDevice : list) {
                if ((status != rmaRequestDevice.getStatus())) {
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

            query.append(_FINDER_COLUMN_STATUS_STATUS_2);

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

                qPos.add(status);

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
     * Returns the first rma request device in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByStatus_First(int status,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByStatus_First(status,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the first rma request device in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByStatus_First(int status,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequestDevice> list = findByStatus(status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request device in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByStatus_Last(int status,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByStatus_Last(status,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the last rma request device in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByStatus_Last(int status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<RmaRequestDevice> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma request devices before and after the current rma request device in the ordered set where status = &#63;.
     *
     * @param rmaRequestDevicePK the primary key of the current rma request device
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice[] findByStatus_PrevAndNext(
        RmaRequestDevicePK rmaRequestDevicePK, int status,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByPrimaryKey(rmaRequestDevicePK);

        Session session = null;

        try {
            session = openSession();

            RmaRequestDevice[] array = new RmaRequestDeviceImpl[3];

            array[0] = getByStatus_PrevAndNext(session, rmaRequestDevice,
                    status, orderByComparator, true);

            array[1] = rmaRequestDevice;

            array[2] = getByStatus_PrevAndNext(session, rmaRequestDevice,
                    status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequestDevice getByStatus_PrevAndNext(Session session,
        RmaRequestDevice rmaRequestDevice, int status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

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
            query.append(RmaRequestDeviceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(status);

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
     * Removes all the rma request devices where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(int status) throws SystemException {
        for (RmaRequestDevice rmaRequestDevice : findByStatus(status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequestDevice);
        }
    }

    /**
     * Returns the number of rma request devices where status = &#63;.
     *
     * @param status the status
     * @return the number of matching rma request devices
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

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

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
     * Returns all the rma request devices where replacedNumber = &#63;.
     *
     * @param replacedNumber the replaced number
     * @return the matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByReplacedNumber(String replacedNumber)
        throws SystemException {
        return findByReplacedNumber(replacedNumber, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma request devices where replacedNumber = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param replacedNumber the replaced number
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @return the range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByReplacedNumber(String replacedNumber,
        int start, int end) throws SystemException {
        return findByReplacedNumber(replacedNumber, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma request devices where replacedNumber = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param replacedNumber the replaced number
     * @param start the lower bound of the range of rma request devices
     * @param end the upper bound of the range of rma request devices (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequestDevice> findByReplacedNumber(String replacedNumber,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLACEDNUMBER;
            finderArgs = new Object[] { replacedNumber };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REPLACEDNUMBER;
            finderArgs = new Object[] {
                    replacedNumber,
                    
                    start, end, orderByComparator
                };
        }

        List<RmaRequestDevice> list = (List<RmaRequestDevice>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequestDevice rmaRequestDevice : list) {
                if (!Validator.equals(replacedNumber,
                            rmaRequestDevice.getReplacedNumber())) {
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

            boolean bindReplacedNumber = false;

            if (replacedNumber == null) {
                query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_1);
            } else if (replacedNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_3);
            } else {
                bindReplacedNumber = true;

                query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_2);
            }

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

                if (bindReplacedNumber) {
                    qPos.add(replacedNumber);
                }

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
     * Returns the first rma request device in the ordered set where replacedNumber = &#63;.
     *
     * @param replacedNumber the replaced number
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByReplacedNumber_First(String replacedNumber,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByReplacedNumber_First(replacedNumber,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("replacedNumber=");
        msg.append(replacedNumber);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the first rma request device in the ordered set where replacedNumber = &#63;.
     *
     * @param replacedNumber the replaced number
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedNumber_First(String replacedNumber,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequestDevice> list = findByReplacedNumber(replacedNumber, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request device in the ordered set where replacedNumber = &#63;.
     *
     * @param replacedNumber the replaced number
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByReplacedNumber_Last(String replacedNumber,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByReplacedNumber_Last(replacedNumber,
                orderByComparator);

        if (rmaRequestDevice != null) {
            return rmaRequestDevice;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("replacedNumber=");
        msg.append(replacedNumber);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestDeviceException(msg.toString());
    }

    /**
     * Returns the last rma request device in the ordered set where replacedNumber = &#63;.
     *
     * @param replacedNumber the replaced number
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedNumber_Last(String replacedNumber,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByReplacedNumber(replacedNumber);

        if (count == 0) {
            return null;
        }

        List<RmaRequestDevice> list = findByReplacedNumber(replacedNumber,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma request devices before and after the current rma request device in the ordered set where replacedNumber = &#63;.
     *
     * @param rmaRequestDevicePK the primary key of the current rma request device
     * @param replacedNumber the replaced number
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice[] findByReplacedNumber_PrevAndNext(
        RmaRequestDevicePK rmaRequestDevicePK, String replacedNumber,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByPrimaryKey(rmaRequestDevicePK);

        Session session = null;

        try {
            session = openSession();

            RmaRequestDevice[] array = new RmaRequestDeviceImpl[3];

            array[0] = getByReplacedNumber_PrevAndNext(session,
                    rmaRequestDevice, replacedNumber, orderByComparator, true);

            array[1] = rmaRequestDevice;

            array[2] = getByReplacedNumber_PrevAndNext(session,
                    rmaRequestDevice, replacedNumber, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequestDevice getByReplacedNumber_PrevAndNext(
        Session session, RmaRequestDevice rmaRequestDevice,
        String replacedNumber, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

        boolean bindReplacedNumber = false;

        if (replacedNumber == null) {
            query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_1);
        } else if (replacedNumber.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_3);
        } else {
            bindReplacedNumber = true;

            query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_2);
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
            query.append(RmaRequestDeviceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindReplacedNumber) {
            qPos.add(replacedNumber);
        }

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
     * Removes all the rma request devices where replacedNumber = &#63; from the database.
     *
     * @param replacedNumber the replaced number
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByReplacedNumber(String replacedNumber)
        throws SystemException {
        for (RmaRequestDevice rmaRequestDevice : findByReplacedNumber(
                replacedNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequestDevice);
        }
    }

    /**
     * Returns the number of rma request devices where replacedNumber = &#63;.
     *
     * @param replacedNumber the replaced number
     * @return the number of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByReplacedNumber(String replacedNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REPLACEDNUMBER;

        Object[] finderArgs = new Object[] { replacedNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

            boolean bindReplacedNumber = false;

            if (replacedNumber == null) {
                query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_1);
            } else if (replacedNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_3);
            } else {
                bindReplacedNumber = true;

                query.append(_FINDER_COLUMN_REPLACEDNUMBER_REPLACEDNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindReplacedNumber) {
                    qPos.add(replacedNumber);
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
     * Returns the rma request device where replacedOldDeviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
     *
     * @param replacedOldDeviceId the replaced old device ID
     * @return the matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByReplacedOldDeviceId(Long replacedOldDeviceId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByReplacedOldDeviceId(replacedOldDeviceId);

        if (rmaRequestDevice == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("replacedOldDeviceId=");
            msg.append(replacedOldDeviceId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchRmaRequestDeviceException(msg.toString());
        }

        return rmaRequestDevice;
    }

    /**
     * Returns the rma request device where replacedOldDeviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param replacedOldDeviceId the replaced old device ID
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedOldDeviceId(Long replacedOldDeviceId)
        throws SystemException {
        return fetchByReplacedOldDeviceId(replacedOldDeviceId, true);
    }

    /**
     * Returns the rma request device where replacedOldDeviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param replacedOldDeviceId the replaced old device ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedOldDeviceId(
        Long replacedOldDeviceId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { replacedOldDeviceId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
                    finderArgs, this);
        }

        if (result instanceof RmaRequestDevice) {
            RmaRequestDevice rmaRequestDevice = (RmaRequestDevice) result;

            if (!Validator.equals(replacedOldDeviceId,
                        rmaRequestDevice.getReplacedOldDeviceId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_REPLACEDOLDDEVICEID_REPLACEDOLDDEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(replacedOldDeviceId.longValue());

                List<RmaRequestDevice> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
                        finderArgs, list);
                } else {
                    RmaRequestDevice rmaRequestDevice = list.get(0);

                    result = rmaRequestDevice;

                    cacheResult(rmaRequestDevice);

                    if ((rmaRequestDevice.getReplacedOldDeviceId() != replacedOldDeviceId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
                            finderArgs, rmaRequestDevice);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
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
     * Removes the rma request device where replacedOldDeviceId = &#63; from the database.
     *
     * @param replacedOldDeviceId the replaced old device ID
     * @return the rma request device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice removeByReplacedOldDeviceId(
        Long replacedOldDeviceId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByReplacedOldDeviceId(replacedOldDeviceId);

        return remove(rmaRequestDevice);
    }

    /**
     * Returns the number of rma request devices where replacedOldDeviceId = &#63;.
     *
     * @param replacedOldDeviceId the replaced old device ID
     * @return the number of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByReplacedOldDeviceId(Long replacedOldDeviceId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEID;

        Object[] finderArgs = new Object[] { replacedOldDeviceId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_REPLACEDOLDDEVICEID_REPLACEDOLDDEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(replacedOldDeviceId.longValue());

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
     * Returns the rma request device where replacedOldDeviceExtId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
     *
     * @param replacedOldDeviceExtId the replaced old device ext ID
     * @return the matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByReplacedOldDeviceExtId(
        Long replacedOldDeviceExtId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByReplacedOldDeviceExtId(replacedOldDeviceExtId);

        if (rmaRequestDevice == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("replacedOldDeviceExtId=");
            msg.append(replacedOldDeviceExtId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchRmaRequestDeviceException(msg.toString());
        }

        return rmaRequestDevice;
    }

    /**
     * Returns the rma request device where replacedOldDeviceExtId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param replacedOldDeviceExtId the replaced old device ext ID
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedOldDeviceExtId(
        Long replacedOldDeviceExtId) throws SystemException {
        return fetchByReplacedOldDeviceExtId(replacedOldDeviceExtId, true);
    }

    /**
     * Returns the rma request device where replacedOldDeviceExtId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param replacedOldDeviceExtId the replaced old device ext ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedOldDeviceExtId(
        Long replacedOldDeviceExtId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { replacedOldDeviceExtId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
                    finderArgs, this);
        }

        if (result instanceof RmaRequestDevice) {
            RmaRequestDevice rmaRequestDevice = (RmaRequestDevice) result;

            if (!Validator.equals(replacedOldDeviceExtId,
                        rmaRequestDevice.getReplacedOldDeviceExtId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_REPLACEDOLDDEVICEEXTID_REPLACEDOLDDEVICEEXTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(replacedOldDeviceExtId.longValue());

                List<RmaRequestDevice> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
                        finderArgs, list);
                } else {
                    RmaRequestDevice rmaRequestDevice = list.get(0);

                    result = rmaRequestDevice;

                    cacheResult(rmaRequestDevice);

                    if ((rmaRequestDevice.getReplacedOldDeviceExtId() != replacedOldDeviceExtId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
                            finderArgs, rmaRequestDevice);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
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
     * Removes the rma request device where replacedOldDeviceExtId = &#63; from the database.
     *
     * @param replacedOldDeviceExtId the replaced old device ext ID
     * @return the rma request device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice removeByReplacedOldDeviceExtId(
        Long replacedOldDeviceExtId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByReplacedOldDeviceExtId(replacedOldDeviceExtId);

        return remove(rmaRequestDevice);
    }

    /**
     * Returns the number of rma request devices where replacedOldDeviceExtId = &#63;.
     *
     * @param replacedOldDeviceExtId the replaced old device ext ID
     * @return the number of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByReplacedOldDeviceExtId(Long replacedOldDeviceExtId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEEXTID;

        Object[] finderArgs = new Object[] { replacedOldDeviceExtId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_REPLACEDOLDDEVICEEXTID_REPLACEDOLDDEVICEEXTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(replacedOldDeviceExtId.longValue());

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
     * Returns the rma request device where replacedNewDeviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
     *
     * @param replacedNewDeviceId the replaced new device ID
     * @return the matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByReplacedNewDeviceId(Long replacedNewDeviceId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByReplacedNewDeviceId(replacedNewDeviceId);

        if (rmaRequestDevice == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("replacedNewDeviceId=");
            msg.append(replacedNewDeviceId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchRmaRequestDeviceException(msg.toString());
        }

        return rmaRequestDevice;
    }

    /**
     * Returns the rma request device where replacedNewDeviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param replacedNewDeviceId the replaced new device ID
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedNewDeviceId(Long replacedNewDeviceId)
        throws SystemException {
        return fetchByReplacedNewDeviceId(replacedNewDeviceId, true);
    }

    /**
     * Returns the rma request device where replacedNewDeviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param replacedNewDeviceId the replaced new device ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedNewDeviceId(
        Long replacedNewDeviceId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { replacedNewDeviceId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
                    finderArgs, this);
        }

        if (result instanceof RmaRequestDevice) {
            RmaRequestDevice rmaRequestDevice = (RmaRequestDevice) result;

            if (!Validator.equals(replacedNewDeviceId,
                        rmaRequestDevice.getReplacedNewDeviceId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_REPLACEDNEWDEVICEID_REPLACEDNEWDEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(replacedNewDeviceId.longValue());

                List<RmaRequestDevice> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
                        finderArgs, list);
                } else {
                    RmaRequestDevice rmaRequestDevice = list.get(0);

                    result = rmaRequestDevice;

                    cacheResult(rmaRequestDevice);

                    if ((rmaRequestDevice.getReplacedNewDeviceId() != replacedNewDeviceId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
                            finderArgs, rmaRequestDevice);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
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
     * Removes the rma request device where replacedNewDeviceId = &#63; from the database.
     *
     * @param replacedNewDeviceId the replaced new device ID
     * @return the rma request device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice removeByReplacedNewDeviceId(
        Long replacedNewDeviceId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByReplacedNewDeviceId(replacedNewDeviceId);

        return remove(rmaRequestDevice);
    }

    /**
     * Returns the number of rma request devices where replacedNewDeviceId = &#63;.
     *
     * @param replacedNewDeviceId the replaced new device ID
     * @return the number of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByReplacedNewDeviceId(Long replacedNewDeviceId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEID;

        Object[] finderArgs = new Object[] { replacedNewDeviceId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_REPLACEDNEWDEVICEID_REPLACEDNEWDEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(replacedNewDeviceId.longValue());

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
     * Returns the rma request device where replacedNewDeviceExtId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
     *
     * @param replacedNewDeviceExtId the replaced new device ext ID
     * @return the matching rma request device
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice findByReplacedNewDeviceExtId(
        Long replacedNewDeviceExtId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = fetchByReplacedNewDeviceExtId(replacedNewDeviceExtId);

        if (rmaRequestDevice == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("replacedNewDeviceExtId=");
            msg.append(replacedNewDeviceExtId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchRmaRequestDeviceException(msg.toString());
        }

        return rmaRequestDevice;
    }

    /**
     * Returns the rma request device where replacedNewDeviceExtId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param replacedNewDeviceExtId the replaced new device ext ID
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedNewDeviceExtId(
        Long replacedNewDeviceExtId) throws SystemException {
        return fetchByReplacedNewDeviceExtId(replacedNewDeviceExtId, true);
    }

    /**
     * Returns the rma request device where replacedNewDeviceExtId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param replacedNewDeviceExtId the replaced new device ext ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice fetchByReplacedNewDeviceExtId(
        Long replacedNewDeviceExtId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { replacedNewDeviceExtId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
                    finderArgs, this);
        }

        if (result instanceof RmaRequestDevice) {
            RmaRequestDevice rmaRequestDevice = (RmaRequestDevice) result;

            if (!Validator.equals(replacedNewDeviceExtId,
                        rmaRequestDevice.getReplacedNewDeviceExtId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_REPLACEDNEWDEVICEEXTID_REPLACEDNEWDEVICEEXTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(replacedNewDeviceExtId.longValue());

                List<RmaRequestDevice> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
                        finderArgs, list);
                } else {
                    RmaRequestDevice rmaRequestDevice = list.get(0);

                    result = rmaRequestDevice;

                    cacheResult(rmaRequestDevice);

                    if ((rmaRequestDevice.getReplacedNewDeviceExtId() != replacedNewDeviceExtId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
                            finderArgs, rmaRequestDevice);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
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
     * Removes the rma request device where replacedNewDeviceExtId = &#63; from the database.
     *
     * @param replacedNewDeviceExtId the replaced new device ext ID
     * @return the rma request device that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequestDevice removeByReplacedNewDeviceExtId(
        Long replacedNewDeviceExtId)
        throws NoSuchRmaRequestDeviceException, SystemException {
        RmaRequestDevice rmaRequestDevice = findByReplacedNewDeviceExtId(replacedNewDeviceExtId);

        return remove(rmaRequestDevice);
    }

    /**
     * Returns the number of rma request devices where replacedNewDeviceExtId = &#63;.
     *
     * @param replacedNewDeviceExtId the replaced new device ext ID
     * @return the number of matching rma request devices
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByReplacedNewDeviceExtId(Long replacedNewDeviceExtId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEEXTID;

        Object[] finderArgs = new Object[] { replacedNewDeviceExtId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUESTDEVICE_WHERE);

            query.append(_FINDER_COLUMN_REPLACEDNEWDEVICEEXTID_REPLACEDNEWDEVICEEXTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(replacedNewDeviceExtId.longValue());

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

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
            new Object[] { rmaRequestDevice.getReplacedOldDeviceId() },
            rmaRequestDevice);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
            new Object[] { rmaRequestDevice.getReplacedOldDeviceExtId() },
            rmaRequestDevice);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
            new Object[] { rmaRequestDevice.getReplacedNewDeviceId() },
            rmaRequestDevice);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
            new Object[] { rmaRequestDevice.getReplacedNewDeviceExtId() },
            rmaRequestDevice);

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
            Object[] args = new Object[] {
                    rmaRequestDevice.getReplacedOldDeviceId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
                args, rmaRequestDevice);

            args = new Object[] { rmaRequestDevice.getReplacedOldDeviceExtId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEEXTID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
                args, rmaRequestDevice);

            args = new Object[] { rmaRequestDevice.getReplacedNewDeviceId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
                args, rmaRequestDevice);

            args = new Object[] { rmaRequestDevice.getReplacedNewDeviceExtId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEEXTID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
                args, rmaRequestDevice);
        } else {
            RmaRequestDeviceModelImpl rmaRequestDeviceModelImpl = (RmaRequestDeviceModelImpl) rmaRequestDevice;

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDevice.getReplacedOldDeviceId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
                    args, rmaRequestDevice);
            }

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDevice.getReplacedOldDeviceExtId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEEXTID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
                    args, rmaRequestDevice);
            }

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDevice.getReplacedNewDeviceId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
                    args, rmaRequestDevice);
            }

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDevice.getReplacedNewDeviceExtId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEEXTID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
                    args, rmaRequestDevice);
            }
        }
    }

    protected void clearUniqueFindersCache(RmaRequestDevice rmaRequestDevice) {
        RmaRequestDeviceModelImpl rmaRequestDeviceModelImpl = (RmaRequestDeviceModelImpl) rmaRequestDevice;

        Object[] args = new Object[] { rmaRequestDevice.getReplacedOldDeviceId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
            args);

        if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    rmaRequestDeviceModelImpl.getOriginalReplacedOldDeviceId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEID,
                args);
        }

        args = new Object[] { rmaRequestDevice.getReplacedOldDeviceExtId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEEXTID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
            args);

        if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    rmaRequestDeviceModelImpl.getOriginalReplacedOldDeviceExtId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDOLDDEVICEEXTID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDOLDDEVICEEXTID,
                args);
        }

        args = new Object[] { rmaRequestDevice.getReplacedNewDeviceId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
            args);

        if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    rmaRequestDeviceModelImpl.getOriginalReplacedNewDeviceId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEID,
                args);
        }

        args = new Object[] { rmaRequestDevice.getReplacedNewDeviceExtId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEEXTID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
            args);

        if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    rmaRequestDeviceModelImpl.getOriginalReplacedNewDeviceExtId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDNEWDEVICEEXTID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPLACEDNEWDEVICEEXTID,
                args);
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

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDeviceModelImpl.getOriginalDeviceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
                    args);

                args = new Object[] { rmaRequestDeviceModelImpl.getDeviceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
                    args);
            }

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTNERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDeviceModelImpl.getOriginalPartnerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARTNERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTNERID,
                    args);

                args = new Object[] { rmaRequestDeviceModelImpl.getPartnerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARTNERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTNERID,
                    args);
            }

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDeviceModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { rmaRequestDeviceModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }

            if ((rmaRequestDeviceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLACEDNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestDeviceModelImpl.getOriginalReplacedNumber()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDNUMBER,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLACEDNUMBER,
                    args);

                args = new Object[] {
                        rmaRequestDeviceModelImpl.getReplacedNumber()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPLACEDNUMBER,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLACEDNUMBER,
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
        rmaRequestDeviceImpl.setOriginalSerialNumber(rmaRequestDevice.getOriginalSerialNumber());
        rmaRequestDeviceImpl.setFaultyDate(rmaRequestDevice.getFaultyDate());
        rmaRequestDeviceImpl.setFaultyNote(rmaRequestDevice.getFaultyNote());
        rmaRequestDeviceImpl.setAction(rmaRequestDevice.getAction());
        rmaRequestDeviceImpl.setPartnerId(rmaRequestDevice.getPartnerId());
        rmaRequestDeviceImpl.setPartnerInCharge(rmaRequestDevice.getPartnerInCharge());
        rmaRequestDeviceImpl.setPartnerEmail(rmaRequestDevice.getPartnerEmail());
        rmaRequestDeviceImpl.setPartnerPhone(rmaRequestDevice.getPartnerPhone());
        rmaRequestDeviceImpl.setPartnerAddress(rmaRequestDevice.getPartnerAddress());
        rmaRequestDeviceImpl.setSendingEstReturnDate(rmaRequestDevice.getSendingEstReturnDate());
        rmaRequestDeviceImpl.setSendingReturnedDate(rmaRequestDevice.getSendingReturnedDate());
        rmaRequestDeviceImpl.setSendingAssignedDate(rmaRequestDevice.getSendingAssignedDate());
        rmaRequestDeviceImpl.setSendingNote(rmaRequestDevice.getSendingNote());
        rmaRequestDeviceImpl.setReceivingReturnedDate(rmaRequestDevice.getReceivingReturnedDate());
        rmaRequestDeviceImpl.setReceivingNote(rmaRequestDevice.getReceivingNote());
        rmaRequestDeviceImpl.setReturningReturnedDate(rmaRequestDevice.getReturningReturnedDate());
        rmaRequestDeviceImpl.setReturningNote(rmaRequestDevice.getReturningNote());
        rmaRequestDeviceImpl.setDuplicatedRmaRequestId(rmaRequestDevice.getDuplicatedRmaRequestId());
        rmaRequestDeviceImpl.setDeniedDate(rmaRequestDevice.getDeniedDate());
        rmaRequestDeviceImpl.setDeniedNote(rmaRequestDevice.getDeniedNote());
        rmaRequestDeviceImpl.setReplacedDate(rmaRequestDevice.getReplacedDate());
        rmaRequestDeviceImpl.setReplacedNote(rmaRequestDevice.getReplacedNote());
        rmaRequestDeviceImpl.setReplacedNumber(rmaRequestDevice.getReplacedNumber());
        rmaRequestDeviceImpl.setReplacedOldDeviceId(rmaRequestDevice.getReplacedOldDeviceId());
        rmaRequestDeviceImpl.setReplacedOldDeviceExtId(rmaRequestDevice.getReplacedOldDeviceExtId());
        rmaRequestDeviceImpl.setReplacedNewDeviceId(rmaRequestDevice.getReplacedNewDeviceId());
        rmaRequestDeviceImpl.setReplacedNewDeviceExtId(rmaRequestDevice.getReplacedNewDeviceExtId());
        rmaRequestDeviceImpl.setOldStatus(rmaRequestDevice.getOldStatus());
        rmaRequestDeviceImpl.setStatus(rmaRequestDevice.getStatus());
        rmaRequestDeviceImpl.setStatusByUserId(rmaRequestDevice.getStatusByUserId());
        rmaRequestDeviceImpl.setStatusDate(rmaRequestDevice.getStatusDate());

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
