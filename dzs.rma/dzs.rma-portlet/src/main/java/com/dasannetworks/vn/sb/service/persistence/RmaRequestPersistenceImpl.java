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
            RmaRequestModelImpl.STATUS_COLUMN_BITMASK);
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
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMERID =
        new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCustomerId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID =
        new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, RmaRequestImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCustomerId",
            new String[] { Long.class.getName() },
            RmaRequestModelImpl.CUSTOMERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERID = new FinderPath(RmaRequestModelImpl.ENTITY_CACHE_ENABLED,
            RmaRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCustomerId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMERID_CUSTOMERID_2 = "rmaRequest.customerId = ?";
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
     * Returns all the rma requests where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @return the matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByCustomerId(Long customerId)
        throws SystemException {
        return findByCustomerId(customerId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rma requests where customerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param customerId the customer ID
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @return the range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByCustomerId(Long customerId, int start, int end)
        throws SystemException {
        return findByCustomerId(customerId, start, end, null);
    }

    /**
     * Returns an ordered range of all the rma requests where customerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param customerId the customer ID
     * @param start the lower bound of the range of rma requests
     * @param end the upper bound of the range of rma requests (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RmaRequest> findByCustomerId(Long customerId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID;
            finderArgs = new Object[] { customerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMERID;
            finderArgs = new Object[] { customerId, start, end, orderByComparator };
        }

        List<RmaRequest> list = (List<RmaRequest>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RmaRequest rmaRequest : list) {
                if (!Validator.equals(customerId, rmaRequest.getCustomerId())) {
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

            query.append(_FINDER_COLUMN_CUSTOMERID_CUSTOMERID_2);

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

                qPos.add(customerId.longValue());

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
     * Returns the first rma request in the ordered set where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByCustomerId_First(Long customerId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByCustomerId_First(customerId,
                orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("customerId=");
        msg.append(customerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the first rma request in the ordered set where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByCustomerId_First(Long customerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<RmaRequest> list = findByCustomerId(customerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last rma request in the ordered set where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest findByCustomerId_Last(Long customerId,
        OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = fetchByCustomerId_Last(customerId,
                orderByComparator);

        if (rmaRequest != null) {
            return rmaRequest;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("customerId=");
        msg.append(customerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRmaRequestException(msg.toString());
    }

    /**
     * Returns the last rma request in the ordered set where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest fetchByCustomerId_Last(Long customerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCustomerId(customerId);

        if (count == 0) {
            return null;
        }

        List<RmaRequest> list = findByCustomerId(customerId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the rma requests before and after the current rma request in the ordered set where customerId = &#63;.
     *
     * @param rmaRequestId the primary key of the current rma request
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next rma request
     * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RmaRequest[] findByCustomerId_PrevAndNext(long rmaRequestId,
        Long customerId, OrderByComparator orderByComparator)
        throws NoSuchRmaRequestException, SystemException {
        RmaRequest rmaRequest = findByPrimaryKey(rmaRequestId);

        Session session = null;

        try {
            session = openSession();

            RmaRequest[] array = new RmaRequestImpl[3];

            array[0] = getByCustomerId_PrevAndNext(session, rmaRequest,
                    customerId, orderByComparator, true);

            array[1] = rmaRequest;

            array[2] = getByCustomerId_PrevAndNext(session, rmaRequest,
                    customerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RmaRequest getByCustomerId_PrevAndNext(Session session,
        RmaRequest rmaRequest, Long customerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RMAREQUEST_WHERE);

        query.append(_FINDER_COLUMN_CUSTOMERID_CUSTOMERID_2);

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

        qPos.add(customerId.longValue());

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
     * Removes all the rma requests where customerId = &#63; from the database.
     *
     * @param customerId the customer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCustomerId(Long customerId) throws SystemException {
        for (RmaRequest rmaRequest : findByCustomerId(customerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(rmaRequest);
        }
    }

    /**
     * Returns the number of rma requests where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @return the number of matching rma requests
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCustomerId(Long customerId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CUSTOMERID;

        Object[] finderArgs = new Object[] { customerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RMAREQUEST_WHERE);

            query.append(_FINDER_COLUMN_CUSTOMERID_CUSTOMERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(customerId.longValue());

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
            Object[] args = new Object[] { rmaRequest.getRmaRequestNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RMAREQUESTNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RMAREQUESTNUMBER,
                args, rmaRequest);
        } else {
            RmaRequestModelImpl rmaRequestModelImpl = (RmaRequestModelImpl) rmaRequest;

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

        Object[] args = new Object[] { rmaRequest.getRmaRequestNumber() };

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
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        rmaRequestModelImpl.getOriginalCustomerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID,
                    args);

                args = new Object[] { rmaRequestModelImpl.getCustomerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID,
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

        rmaRequestImpl.setRmaRequestId(rmaRequest.getRmaRequestId());
        rmaRequestImpl.setCompanyId(rmaRequest.getCompanyId());
        rmaRequestImpl.setUserId(rmaRequest.getUserId());
        rmaRequestImpl.setUserName(rmaRequest.getUserName());
        rmaRequestImpl.setCreateDate(rmaRequest.getCreateDate());
        rmaRequestImpl.setModifiedDate(rmaRequest.getModifiedDate());
        rmaRequestImpl.setGroupId(rmaRequest.getGroupId());
        rmaRequestImpl.setRmaRequestNumber(rmaRequest.getRmaRequestNumber());
        rmaRequestImpl.setCustomerId(rmaRequest.getCustomerId());
        rmaRequestImpl.setCusInCharge(rmaRequest.getCusInCharge());
        rmaRequestImpl.setCusEmail(rmaRequest.getCusEmail());
        rmaRequestImpl.setCusPhone(rmaRequest.getCusPhone());
        rmaRequestImpl.setCusAddress(rmaRequest.getCusAddress());
        rmaRequestImpl.setCreatingEstReturnDate(rmaRequest.getCreatingEstReturnDate());
        rmaRequestImpl.setCreatingAssignedDate(rmaRequest.getCreatingAssignedDate());
        rmaRequestImpl.setCreatingNote(rmaRequest.getCreatingNote());
        rmaRequestImpl.setCreatingImportedFileName(rmaRequest.getCreatingImportedFileName());
        rmaRequestImpl.setStatus(rmaRequest.getStatus());

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
