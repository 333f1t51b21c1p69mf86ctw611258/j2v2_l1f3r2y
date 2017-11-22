package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchPurchaseOrderException;
import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.model.impl.PurchaseOrderImpl;
import com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl;
import com.dasannetworks.vn.sb.service.persistence.PurchaseOrderPersistence;

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
 * The persistence implementation for the purchase order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseOrderPersistence
 * @see PurchaseOrderUtil
 * @generated
 */
public class PurchaseOrderPersistenceImpl extends BasePersistenceImpl<PurchaseOrder>
    implements PurchaseOrderPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PurchaseOrderUtil} to access the purchase order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PurchaseOrderImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderModelImpl.FINDER_CACHE_ENABLED,
            PurchaseOrderImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderModelImpl.FINDER_CACHE_ENABLED,
            PurchaseOrderImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER = new FinderPath(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderModelImpl.FINDER_CACHE_ENABLED,
            PurchaseOrderImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByPurchaseOrderNumber",
            new String[] { String.class.getName() },
            PurchaseOrderModelImpl.PURCHASEORDERNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PURCHASEORDERNUMBER = new FinderPath(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPurchaseOrderNumber",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_1 =
        "purchaseOrder.purchaseOrderNumber IS NULL";
    private static final String _FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_2 =
        "purchaseOrder.purchaseOrderNumber = ?";
    private static final String _FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_3 =
        "(purchaseOrder.purchaseOrderNumber IS NULL OR purchaseOrder.purchaseOrderNumber = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMERID =
        new FinderPath(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderModelImpl.FINDER_CACHE_ENABLED,
            PurchaseOrderImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByCustomerId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID =
        new FinderPath(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderModelImpl.FINDER_CACHE_ENABLED,
            PurchaseOrderImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByCustomerId", new String[] { Long.class.getName() },
            PurchaseOrderModelImpl.CUSTOMERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERID = new FinderPath(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCustomerId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMERID_CUSTOMERID_2 = "purchaseOrder.customerId = ?";
    private static final String _SQL_SELECT_PURCHASEORDER = "SELECT purchaseOrder FROM PurchaseOrder purchaseOrder";
    private static final String _SQL_SELECT_PURCHASEORDER_WHERE = "SELECT purchaseOrder FROM PurchaseOrder purchaseOrder WHERE ";
    private static final String _SQL_COUNT_PURCHASEORDER = "SELECT COUNT(purchaseOrder) FROM PurchaseOrder purchaseOrder";
    private static final String _SQL_COUNT_PURCHASEORDER_WHERE = "SELECT COUNT(purchaseOrder) FROM PurchaseOrder purchaseOrder WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "purchaseOrder.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PurchaseOrder exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PurchaseOrder exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PurchaseOrderPersistenceImpl.class);
    private static PurchaseOrder _nullPurchaseOrder = new PurchaseOrderImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PurchaseOrder> toCacheModel() {
                return _nullPurchaseOrderCacheModel;
            }
        };

    private static CacheModel<PurchaseOrder> _nullPurchaseOrderCacheModel = new CacheModel<PurchaseOrder>() {
            @Override
            public PurchaseOrder toEntityModel() {
                return _nullPurchaseOrder;
            }
        };

    public PurchaseOrderPersistenceImpl() {
        setModelClass(PurchaseOrder.class);
    }

    /**
     * Returns the purchase order where purchaseOrderNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchPurchaseOrderException} if it could not be found.
     *
     * @param purchaseOrderNumber the purchase order number
     * @return the matching purchase order
     * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a matching purchase order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder findByPurchaseOrderNumber(String purchaseOrderNumber)
        throws NoSuchPurchaseOrderException, SystemException {
        PurchaseOrder purchaseOrder = fetchByPurchaseOrderNumber(purchaseOrderNumber);

        if (purchaseOrder == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("purchaseOrderNumber=");
            msg.append(purchaseOrderNumber);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPurchaseOrderException(msg.toString());
        }

        return purchaseOrder;
    }

    /**
     * Returns the purchase order where purchaseOrderNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param purchaseOrderNumber the purchase order number
     * @return the matching purchase order, or <code>null</code> if a matching purchase order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder fetchByPurchaseOrderNumber(String purchaseOrderNumber)
        throws SystemException {
        return fetchByPurchaseOrderNumber(purchaseOrderNumber, true);
    }

    /**
     * Returns the purchase order where purchaseOrderNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param purchaseOrderNumber the purchase order number
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching purchase order, or <code>null</code> if a matching purchase order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder fetchByPurchaseOrderNumber(
        String purchaseOrderNumber, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { purchaseOrderNumber };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
                    finderArgs, this);
        }

        if (result instanceof PurchaseOrder) {
            PurchaseOrder purchaseOrder = (PurchaseOrder) result;

            if (!Validator.equals(purchaseOrderNumber,
                        purchaseOrder.getPurchaseOrderNumber())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_PURCHASEORDER_WHERE);

            boolean bindPurchaseOrderNumber = false;

            if (purchaseOrderNumber == null) {
                query.append(_FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_1);
            } else if (purchaseOrderNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_3);
            } else {
                bindPurchaseOrderNumber = true;

                query.append(_FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPurchaseOrderNumber) {
                    qPos.add(purchaseOrderNumber);
                }

                List<PurchaseOrder> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
                        finderArgs, list);
                } else {
                    PurchaseOrder purchaseOrder = list.get(0);

                    result = purchaseOrder;

                    cacheResult(purchaseOrder);

                    if ((purchaseOrder.getPurchaseOrderNumber() == null) ||
                            !purchaseOrder.getPurchaseOrderNumber()
                                              .equals(purchaseOrderNumber)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
                            finderArgs, purchaseOrder);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (PurchaseOrder) result;
        }
    }

    /**
     * Removes the purchase order where purchaseOrderNumber = &#63; from the database.
     *
     * @param purchaseOrderNumber the purchase order number
     * @return the purchase order that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder removeByPurchaseOrderNumber(String purchaseOrderNumber)
        throws NoSuchPurchaseOrderException, SystemException {
        PurchaseOrder purchaseOrder = findByPurchaseOrderNumber(purchaseOrderNumber);

        return remove(purchaseOrder);
    }

    /**
     * Returns the number of purchase orders where purchaseOrderNumber = &#63;.
     *
     * @param purchaseOrderNumber the purchase order number
     * @return the number of matching purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPurchaseOrderNumber(String purchaseOrderNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PURCHASEORDERNUMBER;

        Object[] finderArgs = new Object[] { purchaseOrderNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PURCHASEORDER_WHERE);

            boolean bindPurchaseOrderNumber = false;

            if (purchaseOrderNumber == null) {
                query.append(_FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_1);
            } else if (purchaseOrderNumber.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_3);
            } else {
                bindPurchaseOrderNumber = true;

                query.append(_FINDER_COLUMN_PURCHASEORDERNUMBER_PURCHASEORDERNUMBER_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPurchaseOrderNumber) {
                    qPos.add(purchaseOrderNumber);
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
     * Returns all the purchase orders where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @return the matching purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseOrder> findByCustomerId(Long customerId)
        throws SystemException {
        return findByCustomerId(customerId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the purchase orders where customerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param customerId the customer ID
     * @param start the lower bound of the range of purchase orders
     * @param end the upper bound of the range of purchase orders (not inclusive)
     * @return the range of matching purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseOrder> findByCustomerId(Long customerId, int start,
        int end) throws SystemException {
        return findByCustomerId(customerId, start, end, null);
    }

    /**
     * Returns an ordered range of all the purchase orders where customerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param customerId the customer ID
     * @param start the lower bound of the range of purchase orders
     * @param end the upper bound of the range of purchase orders (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseOrder> findByCustomerId(Long customerId, int start,
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

        List<PurchaseOrder> list = (List<PurchaseOrder>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PurchaseOrder purchaseOrder : list) {
                if (!Validator.equals(customerId, purchaseOrder.getCustomerId())) {
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

            query.append(_SQL_SELECT_PURCHASEORDER_WHERE);

            query.append(_FINDER_COLUMN_CUSTOMERID_CUSTOMERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PurchaseOrderModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(customerId.longValue());

                if (!pagination) {
                    list = (List<PurchaseOrder>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PurchaseOrder>(list);
                } else {
                    list = (List<PurchaseOrder>) QueryUtil.list(q,
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
     * Returns the first purchase order in the ordered set where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching purchase order
     * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a matching purchase order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder findByCustomerId_First(Long customerId,
        OrderByComparator orderByComparator)
        throws NoSuchPurchaseOrderException, SystemException {
        PurchaseOrder purchaseOrder = fetchByCustomerId_First(customerId,
                orderByComparator);

        if (purchaseOrder != null) {
            return purchaseOrder;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("customerId=");
        msg.append(customerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPurchaseOrderException(msg.toString());
    }

    /**
     * Returns the first purchase order in the ordered set where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching purchase order, or <code>null</code> if a matching purchase order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder fetchByCustomerId_First(Long customerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<PurchaseOrder> list = findByCustomerId(customerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last purchase order in the ordered set where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching purchase order
     * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a matching purchase order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder findByCustomerId_Last(Long customerId,
        OrderByComparator orderByComparator)
        throws NoSuchPurchaseOrderException, SystemException {
        PurchaseOrder purchaseOrder = fetchByCustomerId_Last(customerId,
                orderByComparator);

        if (purchaseOrder != null) {
            return purchaseOrder;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("customerId=");
        msg.append(customerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPurchaseOrderException(msg.toString());
    }

    /**
     * Returns the last purchase order in the ordered set where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching purchase order, or <code>null</code> if a matching purchase order could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder fetchByCustomerId_Last(Long customerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCustomerId(customerId);

        if (count == 0) {
            return null;
        }

        List<PurchaseOrder> list = findByCustomerId(customerId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the purchase orders before and after the current purchase order in the ordered set where customerId = &#63;.
     *
     * @param purchaseOrderId the primary key of the current purchase order
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next purchase order
     * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder[] findByCustomerId_PrevAndNext(long purchaseOrderId,
        Long customerId, OrderByComparator orderByComparator)
        throws NoSuchPurchaseOrderException, SystemException {
        PurchaseOrder purchaseOrder = findByPrimaryKey(purchaseOrderId);

        Session session = null;

        try {
            session = openSession();

            PurchaseOrder[] array = new PurchaseOrderImpl[3];

            array[0] = getByCustomerId_PrevAndNext(session, purchaseOrder,
                    customerId, orderByComparator, true);

            array[1] = purchaseOrder;

            array[2] = getByCustomerId_PrevAndNext(session, purchaseOrder,
                    customerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PurchaseOrder getByCustomerId_PrevAndNext(Session session,
        PurchaseOrder purchaseOrder, Long customerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PURCHASEORDER_WHERE);

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
            query.append(PurchaseOrderModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(customerId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(purchaseOrder);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PurchaseOrder> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the purchase orders where customerId = &#63; from the database.
     *
     * @param customerId the customer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCustomerId(Long customerId) throws SystemException {
        for (PurchaseOrder purchaseOrder : findByCustomerId(customerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(purchaseOrder);
        }
    }

    /**
     * Returns the number of purchase orders where customerId = &#63;.
     *
     * @param customerId the customer ID
     * @return the number of matching purchase orders
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

            query.append(_SQL_COUNT_PURCHASEORDER_WHERE);

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
     * Caches the purchase order in the entity cache if it is enabled.
     *
     * @param purchaseOrder the purchase order
     */
    @Override
    public void cacheResult(PurchaseOrder purchaseOrder) {
        EntityCacheUtil.putResult(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderImpl.class, purchaseOrder.getPrimaryKey(),
            purchaseOrder);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
            new Object[] { purchaseOrder.getPurchaseOrderNumber() },
            purchaseOrder);

        purchaseOrder.resetOriginalValues();
    }

    /**
     * Caches the purchase orders in the entity cache if it is enabled.
     *
     * @param purchaseOrders the purchase orders
     */
    @Override
    public void cacheResult(List<PurchaseOrder> purchaseOrders) {
        for (PurchaseOrder purchaseOrder : purchaseOrders) {
            if (EntityCacheUtil.getResult(
                        PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
                        PurchaseOrderImpl.class, purchaseOrder.getPrimaryKey()) == null) {
                cacheResult(purchaseOrder);
            } else {
                purchaseOrder.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all purchase orders.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PurchaseOrderImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PurchaseOrderImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the purchase order.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PurchaseOrder purchaseOrder) {
        EntityCacheUtil.removeResult(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderImpl.class, purchaseOrder.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(purchaseOrder);
    }

    @Override
    public void clearCache(List<PurchaseOrder> purchaseOrders) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PurchaseOrder purchaseOrder : purchaseOrders) {
            EntityCacheUtil.removeResult(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
                PurchaseOrderImpl.class, purchaseOrder.getPrimaryKey());

            clearUniqueFindersCache(purchaseOrder);
        }
    }

    protected void cacheUniqueFindersCache(PurchaseOrder purchaseOrder) {
        if (purchaseOrder.isNew()) {
            Object[] args = new Object[] { purchaseOrder.getPurchaseOrderNumber() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PURCHASEORDERNUMBER,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
                args, purchaseOrder);
        } else {
            PurchaseOrderModelImpl purchaseOrderModelImpl = (PurchaseOrderModelImpl) purchaseOrder;

            if ((purchaseOrderModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        purchaseOrder.getPurchaseOrderNumber()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PURCHASEORDERNUMBER,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
                    args, purchaseOrder);
            }
        }
    }

    protected void clearUniqueFindersCache(PurchaseOrder purchaseOrder) {
        PurchaseOrderModelImpl purchaseOrderModelImpl = (PurchaseOrderModelImpl) purchaseOrder;

        Object[] args = new Object[] { purchaseOrder.getPurchaseOrderNumber() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURCHASEORDERNUMBER,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
            args);

        if ((purchaseOrderModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER.getColumnBitmask()) != 0) {
            args = new Object[] {
                    purchaseOrderModelImpl.getOriginalPurchaseOrderNumber()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURCHASEORDERNUMBER,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PURCHASEORDERNUMBER,
                args);
        }
    }

    /**
     * Creates a new purchase order with the primary key. Does not add the purchase order to the database.
     *
     * @param purchaseOrderId the primary key for the new purchase order
     * @return the new purchase order
     */
    @Override
    public PurchaseOrder create(long purchaseOrderId) {
        PurchaseOrder purchaseOrder = new PurchaseOrderImpl();

        purchaseOrder.setNew(true);
        purchaseOrder.setPrimaryKey(purchaseOrderId);

        return purchaseOrder;
    }

    /**
     * Removes the purchase order with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param purchaseOrderId the primary key of the purchase order
     * @return the purchase order that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder remove(long purchaseOrderId)
        throws NoSuchPurchaseOrderException, SystemException {
        return remove((Serializable) purchaseOrderId);
    }

    /**
     * Removes the purchase order with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the purchase order
     * @return the purchase order that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder remove(Serializable primaryKey)
        throws NoSuchPurchaseOrderException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PurchaseOrder purchaseOrder = (PurchaseOrder) session.get(PurchaseOrderImpl.class,
                    primaryKey);

            if (purchaseOrder == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPurchaseOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(purchaseOrder);
        } catch (NoSuchPurchaseOrderException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PurchaseOrder removeImpl(PurchaseOrder purchaseOrder)
        throws SystemException {
        purchaseOrder = toUnwrappedModel(purchaseOrder);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(purchaseOrder)) {
                purchaseOrder = (PurchaseOrder) session.get(PurchaseOrderImpl.class,
                        purchaseOrder.getPrimaryKeyObj());
            }

            if (purchaseOrder != null) {
                session.delete(purchaseOrder);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (purchaseOrder != null) {
            clearCache(purchaseOrder);
        }

        return purchaseOrder;
    }

    @Override
    public PurchaseOrder updateImpl(
        com.dasannetworks.vn.sb.model.PurchaseOrder purchaseOrder)
        throws SystemException {
        purchaseOrder = toUnwrappedModel(purchaseOrder);

        boolean isNew = purchaseOrder.isNew();

        PurchaseOrderModelImpl purchaseOrderModelImpl = (PurchaseOrderModelImpl) purchaseOrder;

        Session session = null;

        try {
            session = openSession();

            if (purchaseOrder.isNew()) {
                session.save(purchaseOrder);

                purchaseOrder.setNew(false);
            } else {
                session.merge(purchaseOrder);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PurchaseOrderModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((purchaseOrderModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        purchaseOrderModelImpl.getOriginalCustomerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID,
                    args);

                args = new Object[] { purchaseOrderModelImpl.getCustomerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseOrderImpl.class, purchaseOrder.getPrimaryKey(),
            purchaseOrder);

        clearUniqueFindersCache(purchaseOrder);
        cacheUniqueFindersCache(purchaseOrder);

        return purchaseOrder;
    }

    protected PurchaseOrder toUnwrappedModel(PurchaseOrder purchaseOrder) {
        if (purchaseOrder instanceof PurchaseOrderImpl) {
            return purchaseOrder;
        }

        PurchaseOrderImpl purchaseOrderImpl = new PurchaseOrderImpl();

        purchaseOrderImpl.setNew(purchaseOrder.isNew());
        purchaseOrderImpl.setPrimaryKey(purchaseOrder.getPrimaryKey());

        purchaseOrderImpl.setPurchaseOrderId(purchaseOrder.getPurchaseOrderId());
        purchaseOrderImpl.setCompanyId(purchaseOrder.getCompanyId());
        purchaseOrderImpl.setUserId(purchaseOrder.getUserId());
        purchaseOrderImpl.setUserName(purchaseOrder.getUserName());
        purchaseOrderImpl.setCreateDate(purchaseOrder.getCreateDate());
        purchaseOrderImpl.setModifiedDate(purchaseOrder.getModifiedDate());
        purchaseOrderImpl.setCustomerId(purchaseOrder.getCustomerId());
        purchaseOrderImpl.setSignDate(purchaseOrder.getSignDate());
        purchaseOrderImpl.setWarrantyStartDate(purchaseOrder.getWarrantyStartDate());
        purchaseOrderImpl.setWarrantyEndDate(purchaseOrder.getWarrantyEndDate());
        purchaseOrderImpl.setPurchaseOrderNumber(purchaseOrder.getPurchaseOrderNumber());

        return purchaseOrderImpl;
    }

    /**
     * Returns the purchase order with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the purchase order
     * @return the purchase order
     * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPurchaseOrderException, SystemException {
        PurchaseOrder purchaseOrder = fetchByPrimaryKey(primaryKey);

        if (purchaseOrder == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPurchaseOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return purchaseOrder;
    }

    /**
     * Returns the purchase order with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchPurchaseOrderException} if it could not be found.
     *
     * @param purchaseOrderId the primary key of the purchase order
     * @return the purchase order
     * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder findByPrimaryKey(long purchaseOrderId)
        throws NoSuchPurchaseOrderException, SystemException {
        return findByPrimaryKey((Serializable) purchaseOrderId);
    }

    /**
     * Returns the purchase order with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the purchase order
     * @return the purchase order, or <code>null</code> if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PurchaseOrder purchaseOrder = (PurchaseOrder) EntityCacheUtil.getResult(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
                PurchaseOrderImpl.class, primaryKey);

        if (purchaseOrder == _nullPurchaseOrder) {
            return null;
        }

        if (purchaseOrder == null) {
            Session session = null;

            try {
                session = openSession();

                purchaseOrder = (PurchaseOrder) session.get(PurchaseOrderImpl.class,
                        primaryKey);

                if (purchaseOrder != null) {
                    cacheResult(purchaseOrder);
                } else {
                    EntityCacheUtil.putResult(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
                        PurchaseOrderImpl.class, primaryKey, _nullPurchaseOrder);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PurchaseOrderModelImpl.ENTITY_CACHE_ENABLED,
                    PurchaseOrderImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return purchaseOrder;
    }

    /**
     * Returns the purchase order with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param purchaseOrderId the primary key of the purchase order
     * @return the purchase order, or <code>null</code> if a purchase order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseOrder fetchByPrimaryKey(long purchaseOrderId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) purchaseOrderId);
    }

    /**
     * Returns all the purchase orders.
     *
     * @return the purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseOrder> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the purchase orders.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of purchase orders
     * @param end the upper bound of the range of purchase orders (not inclusive)
     * @return the range of purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseOrder> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the purchase orders.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of purchase orders
     * @param end the upper bound of the range of purchase orders (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of purchase orders
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseOrder> findAll(int start, int end,
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

        List<PurchaseOrder> list = (List<PurchaseOrder>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PURCHASEORDER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PURCHASEORDER;

                if (pagination) {
                    sql = sql.concat(PurchaseOrderModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PurchaseOrder>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PurchaseOrder>(list);
                } else {
                    list = (List<PurchaseOrder>) QueryUtil.list(q,
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
     * Removes all the purchase orders from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PurchaseOrder purchaseOrder : findAll()) {
            remove(purchaseOrder);
        }
    }

    /**
     * Returns the number of purchase orders.
     *
     * @return the number of purchase orders
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

                Query q = session.createQuery(_SQL_COUNT_PURCHASEORDER);

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
     * Initializes the purchase order persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.PurchaseOrder")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PurchaseOrder>> listenersList = new ArrayList<ModelListener<PurchaseOrder>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PurchaseOrder>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PurchaseOrderImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
