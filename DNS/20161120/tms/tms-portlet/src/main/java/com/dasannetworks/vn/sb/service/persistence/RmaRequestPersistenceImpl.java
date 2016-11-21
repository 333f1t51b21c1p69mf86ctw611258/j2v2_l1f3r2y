package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchRmaRequestException;
import com.dasannetworks.vn.sb.model.RmaRequest;
import com.dasannetworks.vn.sb.model.impl.RmaRequestImpl;
import com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestPersistence;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the rma request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestPersistence
 * @see RmaRequestUtil
 * @generated
 */
public class RmaRequestPersistenceImpl extends BasePersistenceImpl<RmaRequest>
    implements RmaRequestPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RmaRequestUtil} to access the rma request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RmaRequestImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            RmaRequestModelImpl.UUID_COLUMN_BITMASK |
            RmaRequestModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "rmaRequest.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "rmaRequest.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(rmaRequest.uuid IS NULL OR rmaRequest.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            RmaRequestModelImpl.UUID_COLUMN_BITMASK |
            RmaRequestModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "rmaRequest.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "rmaRequest.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(rmaRequest.uuid IS NULL OR rmaRequest.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "rmaRequest.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            RmaRequestModelImpl.UUID_COLUMN_BITMASK |
            RmaRequestModelImpl.COMPANYID_COLUMN_BITMASK |
            RmaRequestModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "rmaRequest.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "rmaRequest.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(rmaRequest.uuid IS NULL OR rmaRequest.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "rmaRequest.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { Integer.class.getName() },
            RmaRequestModelImpl.STATUS_COLUMN_BITMASK |
            RmaRequestModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "rmaRequest.status = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByRmaRequestNumber",
            new String[] { String.class.getName() },
            RmaRequestModelImpl.RMAREQUESTNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_RMAREQUESTNUMBER = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByRmaRequestNumber", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_1 =
        "rmaRequest.rmaRequestNumber IS NULL";
    private static final String _FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_2 =
        "rmaRequest.rmaRequestNumber = ?";
    private static final String _FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_3 =
        "(rmaRequest.rmaRequestNumber IS NULL OR rmaRequest.rmaRequestNumber = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            RmaRequestModelImpl.GROUPID_COLUMN_BITMASK |
            RmaRequestModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "rmaRequest.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
            new String[] { Long.class.getName() },
            RmaRequestModelImpl.COMPANYID_COLUMN_BITMASK |
            RmaRequestModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "rmaRequest.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSCODE = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycusCode",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSCODE =
        new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycusCode",
            new String[] { String.class.getName() },
            RmaRequestModelImpl.CUSCODE_COLUMN_BITMASK |
            RmaRequestModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSCODE = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycusCode",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CUSCODE_CUSCODE_1 = "rmaRequest.cusCode IS NULL";
    private static final String _FINDER_COLUMN_CUSCODE_CUSCODE_2 = "rmaRequest.cusCode = ?";
    private static final String _FINDER_COLUMN_CUSCODE_CUSCODE_3 = "(rmaRequest.cusCode IS NULL OR rmaRequest.cusCode = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_S",
            new String[] {
                Long.class.getName(), Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_S",
            new String[] { Long.class.getName(), Integer.class.getName() },
            RmaRequestModelImpl.GROUPID_COLUMN_BITMASK |
            RmaRequestModelImpl.STATUS_COLUMN_BITMASK |
            RmaRequestModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
            new String[] { Long.class.getName(), Integer.class.getName() });
    private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "rmaRequest.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_S_STATUS_2 = "rmaRequest.status = ?";
    private static final String _SQL_SELECT_RMAREQUEST = "SELECT rmaRequest FROM RmaRequest rmaRequest";
    private static final String _SQL_SELECT_RMAREQUEST_WHERE = "SELECT rmaRequest FROM RmaRequest rmaRequest WHERE ";
    private static final String _SQL_COUNT_RMAREQUEST = "SELECT COUNT(rmaRequest) FROM RmaRequest rmaRequest";
    private static final String _SQL_COUNT_RMAREQUEST_WHERE = "SELECT COUNT(rmaRequest) FROM RmaRequest rmaRequest WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "rmaRequest.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RmaRequest exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RmaRequest exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RmaRequestPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static RmaRequest _nullRmaRequest = new RmaRequestImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<RmaRequest> toCacheModel() {
                return _nullRmaRequestCacheModel;
            }
        };

    private static CacheModel<RmaRequest> _nullRmaRequestCacheModel = new CacheModel<RmaRequest>() {
            @Override
            public RmaRequest toEntityModel() {
                return _nullRmaRequest;
            }
        };

    public RmaRequestPersistenceImpl() {
        setModelClass(RmaRequest.class);
    }

    /**
     * Returns all the rma requests where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma requests where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequest rmaRequest : list) {
                if (!Validator.equals(uuid, rmaRequest.getUuid())) {
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

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequest>(list);
                } else {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
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
     * Returns the first rma request in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByUuid_First(uuid, orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the first rma request in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequest> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByUuid_Last(uuid, orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the last rma request in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<RmaRequest> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma requests before and after the current rma request in the ordered set where uuid = &#63;.
     *
     * @param rmaRequestId the primary key of the current rma request
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest[] findByUuid_PrevAndNext(long rmaRequestId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByPrimaryKey(rmaRequestId);

        Session session = null;

        try {
            session = openSession();

            RmaRequest[] array = new RmaRequestImpl[3];

            array[0] = getByUuid_PrevAndNext(session, rmaRequest, uuid,
                    orderByComparator, true);

            array[1] = rmaRequest;

            array[2] = getByUuid_PrevAndNext(session, rmaRequest, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequest getByUuid_PrevAndNext(Session session,
        RmaRequest rmaRequest, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUEST_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
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
            query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rmaRequest);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RmaRequest> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rma requests where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (RmaRequest rmaRequest : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
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
     * Returns the rma request where uuid = &#63; and groupId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByUUID_G(String uuid, long groupId)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByUUID_G(uuid, groupId);

        if (rmaRequest == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchRmaRequestException(msg.toString());
        }

        return rmaRequest;
    }

    /**
     * Returns the rma request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the rma request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof RmaRequest) {
            RmaRequest rmaRequest = (RmaRequest) result;

            if (!Validator.equals(uuid, rmaRequest.getUuid()) ||
                    (groupId != rmaRequest.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<RmaRequest> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    RmaRequest rmaRequest = list.get(0);

                    result = rmaRequest;

                    cacheResult(rmaRequest);

                    if ((rmaRequest.getUuid() == null) ||
                            !rmaRequest.getUuid().equals(uuid) ||
                            (rmaRequest.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, rmaRequest);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (RmaRequest) result;
        }
    }

    /**
     * Removes the rma request where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the rma request that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest removeByUUID_G(String uuid, long groupId)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByUUID_G(uuid, groupId);

        return remove(rmaRequest);
    }

    /**
     * Returns the number of rma requests where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

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
     * Returns all the rma requests where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma requests where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByUuid_C(String uuid, long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequest rmaRequest : list) {
                if (!Validator.equals(uuid, rmaRequest.getUuid()) ||
                        (companyId != rmaRequest.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequest>(list);
                } else {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
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
     * Returns the first rma request in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the first rma request in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequest> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the last rma request in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<RmaRequest> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma requests before and after the current rma request in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param rmaRequestId the primary key of the current rma request
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest[] findByUuid_C_PrevAndNext(long rmaRequestId,
        String uuid, long companyId, OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByPrimaryKey(rmaRequestId);

        Session session = null;

        try {
            session = openSession();

            RmaRequest[] array = new RmaRequestImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, rmaRequest, uuid,
                    companyId, orderByComparator, true);

            array[1] = rmaRequest;

            array[2] = getByUuid_C_PrevAndNext(session, rmaRequest, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequest getByUuid_C_PrevAndNext(Session session,
        RmaRequest rmaRequest, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUEST_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
            query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rmaRequest);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RmaRequest> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rma requests where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (RmaRequest rmaRequest : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

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
     * Returns all the rma requests where status = &#63;.
     *
     * @param status the status
     * @return the matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByStatus(int status) throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma requests where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByStatus(int status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByStatus(int status, int start, int end,
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

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequest rmaRequest : list) {
                if ((status != rmaRequest.getStatus())) {
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

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            query.append(_FINDER_COLUMN_STATUS_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(status);

                if (!pagination) {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequest>(list);
                } else {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
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
     * Returns the first rma request in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByStatus_First(int status,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByStatus_First(status, orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the first rma request in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByStatus_First(int status,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequest> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByStatus_Last(int status,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByStatus_Last(status, orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the last rma request in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByStatus_Last(int status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<RmaRequest> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma requests before and after the current rma request in the ordered set where status = &#63;.
     *
     * @param rmaRequestId the primary key of the current rma request
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest[] findByStatus_PrevAndNext(long rmaRequestId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByPrimaryKey(rmaRequestId);

        Session session = null;

        try {
            session = openSession();

            RmaRequest[] array = new RmaRequestImpl[3];

            array[0] = getByStatus_PrevAndNext(session, rmaRequest, status,
                    orderByComparator, true);

            array[1] = rmaRequest;

            array[2] = getByStatus_PrevAndNext(session, rmaRequest, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequest getByStatus_PrevAndNext(Session session,
        RmaRequest rmaRequest, int status, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUEST_WHERE);

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
            query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rmaRequest);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RmaRequest> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rma requests where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(int status) throws SystemException {
        for (RmaRequest rmaRequest : findByStatus(status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests where status = &#63;.
     *
     * @param status the status
     * @return the number of matching rma requests
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

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

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
     * Returns the rma request where rmaRequestNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestException} if it could not be found.
     *
     * @param rmaRequestNumber the rma request number
     * @return the matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByRmaRequestNumber(String rmaRequestNumber)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByRmaRequestNumber(rmaRequestNumber);

        if (rmaRequest == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("rmaRequestNumber=");
            msg.append(rmaRequestNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchRmaRequestException(msg.toString());
        }

        return rmaRequest;
    }

    /**
     * Returns the rma request where rmaRequestNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param rmaRequestNumber the rma request number
     * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByRmaRequestNumber(String rmaRequestNumber)
        throws SystemException {
        return fetchByRmaRequestNumber(rmaRequestNumber, true);
    }

    /**
     * Returns the rma request where rmaRequestNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param rmaRequestNumber the rma request number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByRmaRequestNumber(String rmaRequestNumber,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { rmaRequestNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
                    finderArgs, this);
        }

        if (result instanceof RmaRequest) {
            RmaRequest rmaRequest = (RmaRequest) result;

            if (!Validator.equals(rmaRequestNumber,
                        rmaRequest.getRmaRequestNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            boolean bindRmaRequestNumber = false;

            if (rmaRequestNumber == null) {
                query.append(_FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_1);
            } else if (rmaRequestNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_3);
            } else {
                bindRmaRequestNumber = true;

                query.append(_FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRmaRequestNumber) {
                    qPos.add(rmaRequestNumber);
                }

                List<RmaRequest> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
                        finderArgs, list);
                } else {
                    RmaRequest rmaRequest = list.get(0);

                    result = rmaRequest;

                    cacheResult(rmaRequest);

                    if ((rmaRequest.getRmaRequestNumber() == null) ||
                            !rmaRequest.getRmaRequestNumber()
                                           .equals(rmaRequestNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
                            finderArgs, rmaRequest);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (RmaRequest) result;
        }
    }

    /**
     * Removes the rma request where rmaRequestNumber = &#63; from the database.
     *
     * @param rmaRequestNumber the rma request number
     * @return the rma request that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest removeByRmaRequestNumber(String rmaRequestNumber)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByRmaRequestNumber(rmaRequestNumber);

        return remove(rmaRequest);
    }

    /**
     * Returns the number of rma requests where rmaRequestNumber = &#63;.
     *
     * @param rmaRequestNumber the rma request number
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRmaRequestNumber(String rmaRequestNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_RMAREQUESTNUMBER;

        Object[] finderArgs = new Object[] { rmaRequestNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            boolean bindRmaRequestNumber = false;

            if (rmaRequestNumber == null) {
                query.append(_FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_1);
            } else if (rmaRequestNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_3);
            } else {
                bindRmaRequestNumber = true;

                query.append(_FINDER_COLUMN_RMAREQUESTNUMBER_RMAREQUESTNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRmaRequestNumber) {
                    qPos.add(rmaRequestNumber);
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
     * Returns all the rma requests where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma requests where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequest rmaRequest : list) {
                if ((groupId != rmaRequest.getGroupId())) {
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

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequest>(list);
                } else {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
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
     * Returns the first rma request in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByGroupId_First(groupId, orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the first rma request in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequest> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByGroupId_Last(groupId, orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the last rma request in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<RmaRequest> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma requests before and after the current rma request in the ordered set where groupId = &#63;.
     *
     * @param rmaRequestId the primary key of the current rma request
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest[] findByGroupId_PrevAndNext(long rmaRequestId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByPrimaryKey(rmaRequestId);

        Session session = null;

        try {
            session = openSession();

            RmaRequest[] array = new RmaRequestImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, rmaRequest, groupId,
                    orderByComparator, true);

            array[1] = rmaRequest;

            array[2] = getByGroupId_PrevAndNext(session, rmaRequest, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequest getByGroupId_PrevAndNext(Session session,
        RmaRequest rmaRequest, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUEST_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
            query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rmaRequest);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RmaRequest> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rma requests where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (RmaRequest rmaRequest : findByGroupId(groupId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

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
     * Returns all the rma requests where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByCompanyId(long companyId)
        throws SystemException {
        return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the rma requests where companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param companyId the company ID
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByCompanyId(long companyId, int start, int end)
        throws SystemException {
        return findByCompanyId(companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests where companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param companyId the company ID
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByCompanyId(long companyId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId, start, end, orderByComparator };
        }

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequest rmaRequest : list) {
                if ((companyId != rmaRequest.getCompanyId())) {
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

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequest>(list);
                } else {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
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
     * Returns the first rma request in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByCompanyId_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByCompanyId_First(companyId,
                orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the first rma request in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByCompanyId_First(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequest> list = findByCompanyId(companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByCompanyId_Last(companyId,
                orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the last rma request in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCompanyId(companyId);

        if (count == 0) {
            return null;
        }

        List<RmaRequest> list = findByCompanyId(companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma requests before and after the current rma request in the ordered set where companyId = &#63;.
     *
     * @param rmaRequestId the primary key of the current rma request
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest[] findByCompanyId_PrevAndNext(long rmaRequestId,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByPrimaryKey(rmaRequestId);

        Session session = null;

        try {
            session = openSession();

            RmaRequest[] array = new RmaRequestImpl[3];

            array[0] = getByCompanyId_PrevAndNext(session, rmaRequest,
                    companyId, orderByComparator, true);

            array[1] = rmaRequest;

            array[2] = getByCompanyId_PrevAndNext(session, rmaRequest,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequest getByCompanyId_PrevAndNext(Session session,
        RmaRequest rmaRequest, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUEST_WHERE);

        query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
            query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rmaRequest);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RmaRequest> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rma requests where companyId = &#63; from the database.
     *
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCompanyId(long companyId) throws SystemException {
        for (RmaRequest rmaRequest : findByCompanyId(companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCompanyId(long companyId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

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
     * Returns all the rma requests where cusCode = &#63;.
     *
     * @param cusCode the cus code
     * @return the matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findBycusCode(String cusCode)
        throws SystemException {
        return findBycusCode(cusCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma requests where cusCode = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param cusCode the cus code
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findBycusCode(String cusCode, int start, int end)
        throws SystemException {
        return findBycusCode(cusCode, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests where cusCode = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param cusCode the cus code
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findBycusCode(String cusCode, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSCODE;
            finderArgs = new Object[] { cusCode };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSCODE;
            finderArgs = new Object[] { cusCode, start, end, orderByComparator };
        }

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequest rmaRequest : list) {
                if (!Validator.equals(cusCode, rmaRequest.getCusCode())) {
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

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            boolean bindCusCode = false;

            if (cusCode == null) {
                query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_1);
            } else if (cusCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_3);
            } else {
                bindCusCode = true;

                query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCusCode) {
                    qPos.add(cusCode);
                }

                if (!pagination) {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequest>(list);
                } else {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
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
     * Returns the first rma request in the ordered set where cusCode = &#63;.
     *
     * @param cusCode the cus code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findBycusCode_First(String cusCode,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchBycusCode_First(cusCode, orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("cusCode=");
        msg.append(cusCode);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the first rma request in the ordered set where cusCode = &#63;.
     *
     * @param cusCode the cus code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchBycusCode_First(String cusCode,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequest> list = findBycusCode(cusCode, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request in the ordered set where cusCode = &#63;.
     *
     * @param cusCode the cus code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findBycusCode_Last(String cusCode,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchBycusCode_Last(cusCode, orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("cusCode=");
        msg.append(cusCode);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the last rma request in the ordered set where cusCode = &#63;.
     *
     * @param cusCode the cus code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchBycusCode_Last(String cusCode,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBycusCode(cusCode);

        if (count == 0) {
            return null;
        }

        List<RmaRequest> list = findBycusCode(cusCode, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma requests before and after the current rma request in the ordered set where cusCode = &#63;.
     *
     * @param rmaRequestId the primary key of the current rma request
     * @param cusCode the cus code
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest[] findBycusCode_PrevAndNext(long rmaRequestId,
        String cusCode, OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByPrimaryKey(rmaRequestId);

        Session session = null;

        try {
            session = openSession();

            RmaRequest[] array = new RmaRequestImpl[3];

            array[0] = getBycusCode_PrevAndNext(session, rmaRequest, cusCode,
                    orderByComparator, true);

            array[1] = rmaRequest;

            array[2] = getBycusCode_PrevAndNext(session, rmaRequest, cusCode,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequest getBycusCode_PrevAndNext(Session session,
        RmaRequest rmaRequest, String cusCode,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUEST_WHERE);

        boolean bindCusCode = false;

        if (cusCode == null) {
            query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_1);
        } else if (cusCode.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_3);
        } else {
            bindCusCode = true;

            query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_2);
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
            query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindCusCode) {
            qPos.add(cusCode);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rmaRequest);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RmaRequest> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rma requests where cusCode = &#63; from the database.
     *
     * @param cusCode the cus code
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBycusCode(String cusCode) throws SystemException {
        for (RmaRequest rmaRequest : findBycusCode(cusCode, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests where cusCode = &#63;.
     *
     * @param cusCode the cus code
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBycusCode(String cusCode) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CUSCODE;

        Object[] finderArgs = new Object[] { cusCode };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            boolean bindCusCode = false;

            if (cusCode == null) {
                query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_1);
            } else if (cusCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_3);
            } else {
                bindCusCode = true;

                query.append(_FINDER_COLUMN_CUSCODE_CUSCODE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCusCode) {
                    qPos.add(cusCode);
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
     * Returns all the rma requests where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByG_S(long groupId, int status)
        throws SystemException {
        return findByG_S(groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the rma requests where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param status the status
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByG_S(long groupId, int status, int start,
        int end) throws SystemException {
        return findByG_S(groupId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param status the status
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByG_S(long groupId, int status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S;
            finderArgs = new Object[] { groupId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S;
            finderArgs = new Object[] {
                    groupId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequest rmaRequest : list) {
                if ((groupId != rmaRequest.getGroupId()) ||
                        (status != rmaRequest.getStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_RMAREQUEST_WHERE);

            query.append(_FINDER_COLUMN_G_S_GROUPID_2);

            query.append(_FINDER_COLUMN_G_S_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(status);

                if (!pagination) {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequest>(list);
                } else {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
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
     * Returns the first rma request in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByG_S_First(long groupId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByG_S_First(groupId, status,
                orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the first rma request in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByG_S_First(long groupId, int status,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequest> list = findByG_S(groupId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByG_S_Last(long groupId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByG_S_Last(groupId, status,
                orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the last rma request in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByG_S_Last(long groupId, int status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_S(groupId, status);

        if (count == 0) {
            return null;
        }

        List<RmaRequest> list = findByG_S(groupId, status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma requests before and after the current rma request in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param rmaRequestId the primary key of the current rma request
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest[] findByG_S_PrevAndNext(long rmaRequestId, long groupId,
        int status, OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByPrimaryKey(rmaRequestId);

        Session session = null;

        try {
            session = openSession();

            RmaRequest[] array = new RmaRequestImpl[3];

            array[0] = getByG_S_PrevAndNext(session, rmaRequest, groupId,
                    status, orderByComparator, true);

            array[1] = rmaRequest;

            array[2] = getByG_S_PrevAndNext(session, rmaRequest, groupId,
                    status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequest getByG_S_PrevAndNext(Session session,
        RmaRequest rmaRequest, long groupId, int status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUEST_WHERE);

        query.append(_FINDER_COLUMN_G_S_GROUPID_2);

        query.append(_FINDER_COLUMN_G_S_STATUS_2);

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
            query.append(RmaRequestModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rmaRequest);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RmaRequest> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rma requests where groupId = &#63; and status = &#63; from the database.
     *
     * @param groupId the group ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_S(long groupId, int status) throws SystemException {
        for (RmaRequest rmaRequest : findByG_S(groupId, status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_S(long groupId, int status) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

        Object[] finderArgs = new Object[] { groupId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            query.append(_FINDER_COLUMN_G_S_GROUPID_2);

            query.append(_FINDER_COLUMN_G_S_STATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

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
     * Caches the rma request in the entity cache if it is enabled.
     *
     * @param rmaRequest the rma request
     */
    @Override
    public void cacheResult(RmaRequest rmaRequest) {
        EntityCacheUtil.putResult(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestImpl.class, rmaRequest.getPrimaryKey(), rmaRequest);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { rmaRequest.getUuid(), rmaRequest.getGroupId() },
            rmaRequest);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
            new Object[] { rmaRequest.getRmaRequestNumber() }, rmaRequest);

        rmaRequest.resetOriginalValues();
    }

    /**
     * Caches the rma requests in the entity cache if it is enabled.
     *
     * @param rmaRequests the rma requests
     */
    @Override
    public void cacheResult(List<RmaRequest> rmaRequests) {
        for (RmaRequest rmaRequest : rmaRequests) {
            if (EntityCacheUtil.getResult(
                        RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
                        RmaRequestImpl.class, rmaRequest.getPrimaryKey()) == null) {
                cacheResult(rmaRequest);
            } else {
                rmaRequest.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all rma requests.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RmaRequestImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RmaRequestImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the rma request.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(RmaRequest rmaRequest) {
        EntityCacheUtil.removeResult(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestImpl.class, rmaRequest.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(rmaRequest);
    }

    @Override
    public void clearCache(List<RmaRequest> rmaRequests) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (RmaRequest rmaRequest : rmaRequests) {
            EntityCacheUtil.removeResult(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
                RmaRequestImpl.class, rmaRequest.getPrimaryKey());

            clearUniqueFindersCache(rmaRequest);
        }
    }

    protected void cacheUniqueFindersCache(RmaRequest rmaRequest) {
        if (rmaRequest.isNew()) {
            Object[] args = new Object[] {
                    rmaRequest.getUuid(), rmaRequest.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                rmaRequest);

            args = new Object[] { rmaRequest.getRmaRequestNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RMAREQUESTNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
                args, rmaRequest);
        } else {
            RmaRequestModelImpl rmaRequestModelImpl = (RmaRequestModelImpl) rmaRequest;

            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequest.getUuid(), rmaRequest.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    rmaRequest);
            }

            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { rmaRequest.getRmaRequestNumber() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RMAREQUESTNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
                    args, rmaRequest);
            }
        }
    }

    protected void clearUniqueFindersCache(RmaRequest rmaRequest) {
        RmaRequestModelImpl rmaRequestModelImpl = (RmaRequestModelImpl) rmaRequest;

        Object[] args = new Object[] {
                rmaRequest.getUuid(), rmaRequest.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((rmaRequestModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    rmaRequestModelImpl.getOriginalUuid(),
                    rmaRequestModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }

        args = new Object[] { rmaRequest.getRmaRequestNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RMAREQUESTNUMBER, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER, args);

        if ((rmaRequestModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    rmaRequestModelImpl.getOriginalRmaRequestNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RMAREQUESTNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
                args);
        }
    }

    /**
     * Creates a new rma request with the primary key. Does not add the rma request to the database.
     *
     * @param rmaRequestId the primary key for the new rma request
     * @return the new rma request
     */
    @Override
    public RmaRequest create(long rmaRequestId) {
        RmaRequest rmaRequest = new RmaRequestImpl();

        rmaRequest.setNew(true);
        rmaRequest.setPrimaryKey(rmaRequestId);

        String uuid = PortalUUIDUtil.generate();

        rmaRequest.setUuid(uuid);

        return rmaRequest;
    }

    /**
     * Removes the rma request with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param rmaRequestId the primary key of the rma request
     * @return the rma request that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest remove(long rmaRequestId)
        throws NoSuchRmaRequestException, SystemException {
        return remove((Serializable) rmaRequestId);
    }

    /**
     * Removes the rma request with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the rma request
     * @return the rma request that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest remove(Serializable primaryKey)
        throws NoSuchRmaRequestException, SystemException {
        Session session = null;

        try {
            session = openSession();

            RmaRequest rmaRequest = (RmaRequest) session.get(RmaRequestImpl.class,
                    primaryKey);

            if (rmaRequest == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRmaRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(rmaRequest);
        } catch (NoSuchRmaRequestException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected RmaRequest removeImpl(RmaRequest rmaRequest)
        throws SystemException {
        rmaRequest = toUnwrappedModel(rmaRequest);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(rmaRequest)) {
                rmaRequest = (RmaRequest) session.get(RmaRequestImpl.class,
                        rmaRequest.getPrimaryKeyObj());
            }

            if (rmaRequest != null) {
                session.delete(rmaRequest);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (rmaRequest != null) {
            clearCache(rmaRequest);
        }

        return rmaRequest;
    }

    @Override
    public RmaRequest updateImpl(
        com.dasannetworks.vn.sb.model.RmaRequest rmaRequest)
        throws SystemException {
        rmaRequest = toUnwrappedModel(rmaRequest);

        boolean isNew = rmaRequest.isNew();

        RmaRequestModelImpl rmaRequestModelImpl = (RmaRequestModelImpl) rmaRequest;

        if (Validator.isNull(rmaRequest.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            rmaRequest.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (rmaRequest.isNew()) {
                session.save(rmaRequest);

                rmaRequest.setNew(false);
            } else {
                session.merge(rmaRequest);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RmaRequestModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { rmaRequestModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestModelImpl.getOriginalUuid(),
                        rmaRequestModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        rmaRequestModelImpl.getUuid(),
                        rmaRequestModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { rmaRequestModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }

            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { rmaRequestModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);

                args = new Object[] { rmaRequestModelImpl.getCompanyId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);
            }

            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSCODE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestModelImpl.getOriginalCusCode()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSCODE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSCODE,
                    args);

                args = new Object[] { rmaRequestModelImpl.getCusCode() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSCODE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSCODE,
                    args);
            }

            if ((rmaRequestModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestModelImpl.getOriginalGroupId(),
                        rmaRequestModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
                    args);

                args = new Object[] {
                        rmaRequestModelImpl.getGroupId(),
                        rmaRequestModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
                    args);
            }
        }

        EntityCacheUtil.putResult(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestImpl.class, rmaRequest.getPrimaryKey(), rmaRequest);

        clearUniqueFindersCache(rmaRequest);
        cacheUniqueFindersCache(rmaRequest);

        return rmaRequest;
    }

    protected RmaRequest toUnwrappedModel(RmaRequest rmaRequest) {
        if (rmaRequest instanceof RmaRequestImpl) {
            return rmaRequest;
        }

        RmaRequestImpl rmaRequestImpl = new RmaRequestImpl();

        rmaRequestImpl.setNew(rmaRequest.isNew());
        rmaRequestImpl.setPrimaryKey(rmaRequest.getPrimaryKey());

        rmaRequestImpl.setUuid(rmaRequest.getUuid());
        rmaRequestImpl.setRmaRequestId(rmaRequest.getRmaRequestId());
        rmaRequestImpl.setCompanyId(rmaRequest.getCompanyId());
        rmaRequestImpl.setUserId(rmaRequest.getUserId());
        rmaRequestImpl.setUserName(rmaRequest.getUserName());
        rmaRequestImpl.setCreateDate(rmaRequest.getCreateDate());
        rmaRequestImpl.setModifiedDate(rmaRequest.getModifiedDate());
        rmaRequestImpl.setGroupId(rmaRequest.getGroupId());
        rmaRequestImpl.setRmaRequestNumber(rmaRequest.getRmaRequestNumber());
        rmaRequestImpl.setCusCode(rmaRequest.getCusCode());
        rmaRequestImpl.setCusInCharge(rmaRequest.getCusInCharge());
        rmaRequestImpl.setCusEmail(rmaRequest.getCusEmail());
        rmaRequestImpl.setCusPhone(rmaRequest.getCusPhone());
        rmaRequestImpl.setCusLocation(rmaRequest.getCusLocation());
        rmaRequestImpl.setProvInCharge(rmaRequest.getProvInCharge());
        rmaRequestImpl.setCreatingEstReturnDate(rmaRequest.getCreatingEstReturnDate());
        rmaRequestImpl.setCreatingReturnedDate(rmaRequest.getCreatingReturnedDate());
        rmaRequestImpl.setCreatingAssignedDate(rmaRequest.getCreatingAssignedDate());
        rmaRequestImpl.setCreatingNote(rmaRequest.getCreatingNote());
        rmaRequestImpl.setPartnerCode(rmaRequest.getPartnerCode());
        rmaRequestImpl.setPartnerInCharge(rmaRequest.getPartnerInCharge());
        rmaRequestImpl.setPartnerEmail(rmaRequest.getPartnerEmail());
        rmaRequestImpl.setPartnerPhone(rmaRequest.getPartnerPhone());
        rmaRequestImpl.setPartnerLocation(rmaRequest.getPartnerLocation());
        rmaRequestImpl.setSendingEstReturnDate(rmaRequest.getSendingEstReturnDate());
        rmaRequestImpl.setSendingReturnedDate(rmaRequest.getSendingReturnedDate());
        rmaRequestImpl.setSendingAssignedDate(rmaRequest.getSendingAssignedDate());
        rmaRequestImpl.setSendingNote(rmaRequest.getSendingNote());
        rmaRequestImpl.setReceivingReturnedDate(rmaRequest.getReceivingReturnedDate());
        rmaRequestImpl.setReceivingNote(rmaRequest.getReceivingNote());
        rmaRequestImpl.setReturningReturnedDate(rmaRequest.getReturningReturnedDate());
        rmaRequestImpl.setReturningNote(rmaRequest.getReturningNote());
        rmaRequestImpl.setStatus(rmaRequest.getStatus());
        rmaRequestImpl.setStatusByUserId(rmaRequest.getStatusByUserId());
        rmaRequestImpl.setStatusDate(rmaRequest.getStatusDate());

        return rmaRequestImpl;
    }

    /**
     * Returns the rma request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the rma request
     * @return the rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByPrimaryKey(primaryKey);

        if (rmaRequest == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRmaRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return rmaRequest;
    }

    /**
     * Returns the rma request with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestException} if it could not be found.
     *
     * @param rmaRequestId the primary key of the rma request
     * @return the rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByPrimaryKey(long rmaRequestId)
        throws NoSuchRmaRequestException, SystemException {
        return findByPrimaryKey((Serializable) rmaRequestId);
    }

    /**
     * Returns the rma request with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the rma request
     * @return the rma request, or <code>null</code> if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        RmaRequest rmaRequest = (RmaRequest) EntityCacheUtil.getResult(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
                RmaRequestImpl.class, primaryKey);

        if (rmaRequest == _nullRmaRequest) {
            return null;
        }

        if (rmaRequest == null) {
            Session session = null;

            try {
                session = openSession();

                rmaRequest = (RmaRequest) session.get(RmaRequestImpl.class,
                        primaryKey);

                if (rmaRequest != null) {
                    cacheResult(rmaRequest);
                } else {
                    EntityCacheUtil.putResult(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
                        RmaRequestImpl.class, primaryKey, _nullRmaRequest);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
                    RmaRequestImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return rmaRequest;
    }

    /**
     * Returns the rma request with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param rmaRequestId the primary key of the rma request
     * @return the rma request, or <code>null</code> if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByPrimaryKey(long rmaRequestId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) rmaRequestId);
    }

    /**
     * Returns all the rma requests.
     *
     * @return the rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma requests.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findAll(int start, int end,
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

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_RMAREQUEST);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_RMAREQUEST;

                if (pagination) {
                    sql = sql.concat(RmaRequestModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RmaRequest>(list);
                } else {
                    list = (List<RmaRequest>) QueryUtil.list(q, getDialect(),
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
     * Removes all the rma requests from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (RmaRequest rmaRequest : findAll()) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests.
     *
     * @return the number of rma requests
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

                Query q = session.createQuery(_SQL_COUNT_RMAREQUEST);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the rma request persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.RmaRequest")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<RmaRequest>> listenersList = new ArrayList<ModelListener<RmaRequest>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<RmaRequest>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RmaRequestImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
