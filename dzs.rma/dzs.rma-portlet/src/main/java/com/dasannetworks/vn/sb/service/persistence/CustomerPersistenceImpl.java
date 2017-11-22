package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.NoSuchCustomerException;
import com.dasannetworks.vn.sb.model.Customer;
import com.dasannetworks.vn.sb.model.impl.CustomerImpl;
import com.dasannetworks.vn.sb.model.impl.CustomerModelImpl;
import com.dasannetworks.vn.sb.service.persistence.CustomerPersistence;

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
 * The persistence implementation for the customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerPersistence
 * @see CustomerUtil
 * @generated
 */
public class CustomerPersistenceImpl extends BasePersistenceImpl<Customer>
    implements CustomerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CustomerUtil} to access the customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CustomerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_CUSTOMERCODE = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByCustomerCode",
            new String[] { String.class.getName() },
            CustomerModelImpl.CUSTOMERCODE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERCODE = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCustomerCode",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_1 = "customer.customerCode IS NULL";
    private static final String _FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_2 = "customer.customerCode = ?";
    private static final String _FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_3 = "(customer.customerCode IS NULL OR customer.customerCode = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PARENTID = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByParentId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID =
        new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByParentId",
            new String[] { Long.class.getName() },
            CustomerModelImpl.PARENTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PARENTID = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByParentId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PARENTID_PARENTID_2 = "customer.parentId = ?";
    private static final String _SQL_SELECT_CUSTOMER = "SELECT customer FROM Customer customer";
    private static final String _SQL_SELECT_CUSTOMER_WHERE = "SELECT customer FROM Customer customer WHERE ";
    private static final String _SQL_COUNT_CUSTOMER = "SELECT COUNT(customer) FROM Customer customer";
    private static final String _SQL_COUNT_CUSTOMER_WHERE = "SELECT COUNT(customer) FROM Customer customer WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "customer.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Customer exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Customer exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CustomerPersistenceImpl.class);
    private static Customer _nullCustomer = new CustomerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Customer> toCacheModel() {
                return _nullCustomerCacheModel;
            }
        };

    private static CacheModel<Customer> _nullCustomerCacheModel = new CacheModel<Customer>() {
            @Override
            public Customer toEntityModel() {
                return _nullCustomer;
            }
        };

    public CustomerPersistenceImpl() {
        setModelClass(Customer.class);
    }

    /**
     * Returns the customer where customerCode = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchCustomerException} if it could not be found.
     *
     * @param customerCode the customer code
     * @return the matching customer
     * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a matching customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer findByCustomerCode(String customerCode)
        throws NoSuchCustomerException, SystemException {
        Customer customer = fetchByCustomerCode(customerCode);

        if (customer == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("customerCode=");
            msg.append(customerCode);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchCustomerException(msg.toString());
        }

        return customer;
    }

    /**
     * Returns the customer where customerCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param customerCode the customer code
     * @return the matching customer, or <code>null</code> if a matching customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer fetchByCustomerCode(String customerCode)
        throws SystemException {
        return fetchByCustomerCode(customerCode, true);
    }

    /**
     * Returns the customer where customerCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param customerCode the customer code
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching customer, or <code>null</code> if a matching customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer fetchByCustomerCode(String customerCode,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { customerCode };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE,
                    finderArgs, this);
        }

        if (result instanceof Customer) {
            Customer customer = (Customer) result;

            if (!Validator.equals(customerCode, customer.getCustomerCode())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_CUSTOMER_WHERE);

            boolean bindCustomerCode = false;

            if (customerCode == null) {
                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_1);
            } else if (customerCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_3);
            } else {
                bindCustomerCode = true;

                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCustomerCode) {
                    qPos.add(customerCode);
                }

                List<Customer> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE,
                        finderArgs, list);
                } else {
                    Customer customer = list.get(0);

                    result = customer;

                    cacheResult(customer);

                    if ((customer.getCustomerCode() == null) ||
                            !customer.getCustomerCode().equals(customerCode)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE,
                            finderArgs, customer);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Customer) result;
        }
    }

    /**
     * Removes the customer where customerCode = &#63; from the database.
     *
     * @param customerCode the customer code
     * @return the customer that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer removeByCustomerCode(String customerCode)
        throws NoSuchCustomerException, SystemException {
        Customer customer = findByCustomerCode(customerCode);

        return remove(customer);
    }

    /**
     * Returns the number of customers where customerCode = &#63;.
     *
     * @param customerCode the customer code
     * @return the number of matching customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCustomerCode(String customerCode)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CUSTOMERCODE;

        Object[] finderArgs = new Object[] { customerCode };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CUSTOMER_WHERE);

            boolean bindCustomerCode = false;

            if (customerCode == null) {
                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_1);
            } else if (customerCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_3);
            } else {
                bindCustomerCode = true;

                query.append(_FINDER_COLUMN_CUSTOMERCODE_CUSTOMERCODE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCustomerCode) {
                    qPos.add(customerCode);
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
     * Returns all the customers where parentId = &#63;.
     *
     * @param parentId the parent ID
     * @return the matching customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Customer> findByParentId(Long parentId)
        throws SystemException {
        return findByParentId(parentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the customers where parentId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param parentId the parent ID
     * @param start the lower bound of the range of customers
     * @param end the upper bound of the range of customers (not inclusive)
     * @return the range of matching customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Customer> findByParentId(Long parentId, int start, int end)
        throws SystemException {
        return findByParentId(parentId, start, end, null);
    }

    /**
     * Returns an ordered range of all the customers where parentId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param parentId the parent ID
     * @param start the lower bound of the range of customers
     * @param end the upper bound of the range of customers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Customer> findByParentId(Long parentId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID;
            finderArgs = new Object[] { parentId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PARENTID;
            finderArgs = new Object[] { parentId, start, end, orderByComparator };
        }

        List<Customer> list = (List<Customer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Customer customer : list) {
                if (!Validator.equals(parentId, customer.getParentId())) {
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

            query.append(_SQL_SELECT_CUSTOMER_WHERE);

            query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CustomerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(parentId.longValue());

                if (!pagination) {
                    list = (List<Customer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Customer>(list);
                } else {
                    list = (List<Customer>) QueryUtil.list(q, getDialect(),
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
     * Returns the first customer in the ordered set where parentId = &#63;.
     *
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching customer
     * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a matching customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer findByParentId_First(Long parentId,
        OrderByComparator orderByComparator)
        throws NoSuchCustomerException, SystemException {
        Customer customer = fetchByParentId_First(parentId, orderByComparator);

        if (customer != null) {
            return customer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("parentId=");
        msg.append(parentId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCustomerException(msg.toString());
    }

    /**
     * Returns the first customer in the ordered set where parentId = &#63;.
     *
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching customer, or <code>null</code> if a matching customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer fetchByParentId_First(Long parentId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Customer> list = findByParentId(parentId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last customer in the ordered set where parentId = &#63;.
     *
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching customer
     * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a matching customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer findByParentId_Last(Long parentId,
        OrderByComparator orderByComparator)
        throws NoSuchCustomerException, SystemException {
        Customer customer = fetchByParentId_Last(parentId, orderByComparator);

        if (customer != null) {
            return customer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("parentId=");
        msg.append(parentId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCustomerException(msg.toString());
    }

    /**
     * Returns the last customer in the ordered set where parentId = &#63;.
     *
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching customer, or <code>null</code> if a matching customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer fetchByParentId_Last(Long parentId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByParentId(parentId);

        if (count == 0) {
            return null;
        }

        List<Customer> list = findByParentId(parentId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the customers before and after the current customer in the ordered set where parentId = &#63;.
     *
     * @param customerId the primary key of the current customer
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next customer
     * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer[] findByParentId_PrevAndNext(long customerId,
        Long parentId, OrderByComparator orderByComparator)
        throws NoSuchCustomerException, SystemException {
        Customer customer = findByPrimaryKey(customerId);

        Session session = null;

        try {
            session = openSession();

            Customer[] array = new CustomerImpl[3];

            array[0] = getByParentId_PrevAndNext(session, customer, parentId,
                    orderByComparator, true);

            array[1] = customer;

            array[2] = getByParentId_PrevAndNext(session, customer, parentId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Customer getByParentId_PrevAndNext(Session session,
        Customer customer, Long parentId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CUSTOMER_WHERE);

        query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);

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
            query.append(CustomerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(parentId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(customer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Customer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the customers where parentId = &#63; from the database.
     *
     * @param parentId the parent ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByParentId(Long parentId) throws SystemException {
        for (Customer customer : findByParentId(parentId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(customer);
        }
    }

    /**
     * Returns the number of customers where parentId = &#63;.
     *
     * @param parentId the parent ID
     * @return the number of matching customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByParentId(Long parentId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PARENTID;

        Object[] finderArgs = new Object[] { parentId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CUSTOMER_WHERE);

            query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(parentId.longValue());

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
     * Caches the customer in the entity cache if it is enabled.
     *
     * @param customer the customer
     */
    @Override
    public void cacheResult(Customer customer) {
        EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerImpl.class, customer.getPrimaryKey(), customer);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE,
            new Object[] { customer.getCustomerCode() }, customer);

        customer.resetOriginalValues();
    }

    /**
     * Caches the customers in the entity cache if it is enabled.
     *
     * @param customers the customers
     */
    @Override
    public void cacheResult(List<Customer> customers) {
        for (Customer customer : customers) {
            if (EntityCacheUtil.getResult(
                        CustomerModelImpl.ENTITY_CACHE_ENABLED,
                        CustomerImpl.class, customer.getPrimaryKey()) == null) {
                cacheResult(customer);
            } else {
                customer.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all customers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CustomerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CustomerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the customer.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Customer customer) {
        EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerImpl.class, customer.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(customer);
    }

    @Override
    public void clearCache(List<Customer> customers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Customer customer : customers) {
            EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
                CustomerImpl.class, customer.getPrimaryKey());

            clearUniqueFindersCache(customer);
        }
    }

    protected void cacheUniqueFindersCache(Customer customer) {
        if (customer.isNew()) {
            Object[] args = new Object[] { customer.getCustomerCode() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERCODE, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE, args,
                customer);
        } else {
            CustomerModelImpl customerModelImpl = (CustomerModelImpl) customer;

            if ((customerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CUSTOMERCODE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { customer.getCustomerCode() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CUSTOMERCODE,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE,
                    args, customer);
            }
        }
    }

    protected void clearUniqueFindersCache(Customer customer) {
        CustomerModelImpl customerModelImpl = (CustomerModelImpl) customer;

        Object[] args = new Object[] { customer.getCustomerCode() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERCODE, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE, args);

        if ((customerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_CUSTOMERCODE.getColumnBitmask()) != 0) {
            args = new Object[] { customerModelImpl.getOriginalCustomerCode() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERCODE, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CUSTOMERCODE, args);
        }
    }

    /**
     * Creates a new customer with the primary key. Does not add the customer to the database.
     *
     * @param customerId the primary key for the new customer
     * @return the new customer
     */
    @Override
    public Customer create(long customerId) {
        Customer customer = new CustomerImpl();

        customer.setNew(true);
        customer.setPrimaryKey(customerId);

        return customer;
    }

    /**
     * Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param customerId the primary key of the customer
     * @return the customer that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer remove(long customerId)
        throws NoSuchCustomerException, SystemException {
        return remove((Serializable) customerId);
    }

    /**
     * Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the customer
     * @return the customer that was removed
     * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer remove(Serializable primaryKey)
        throws NoSuchCustomerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Customer customer = (Customer) session.get(CustomerImpl.class,
                    primaryKey);

            if (customer == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(customer);
        } catch (NoSuchCustomerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Customer removeImpl(Customer customer) throws SystemException {
        customer = toUnwrappedModel(customer);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(customer)) {
                customer = (Customer) session.get(CustomerImpl.class,
                        customer.getPrimaryKeyObj());
            }

            if (customer != null) {
                session.delete(customer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (customer != null) {
            clearCache(customer);
        }

        return customer;
    }

    @Override
    public Customer updateImpl(com.dasannetworks.vn.sb.model.Customer customer)
        throws SystemException {
        customer = toUnwrappedModel(customer);

        boolean isNew = customer.isNew();

        CustomerModelImpl customerModelImpl = (CustomerModelImpl) customer;

        Session session = null;

        try {
            session = openSession();

            if (customer.isNew()) {
                session.save(customer);

                customer.setNew(false);
            } else {
                session.merge(customer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !CustomerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((customerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        customerModelImpl.getOriginalParentId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARENTID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID,
                    args);

                args = new Object[] { customerModelImpl.getParentId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARENTID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID,
                    args);
            }
        }

        EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
            CustomerImpl.class, customer.getPrimaryKey(), customer);

        clearUniqueFindersCache(customer);
        cacheUniqueFindersCache(customer);

        return customer;
    }

    protected Customer toUnwrappedModel(Customer customer) {
        if (customer instanceof CustomerImpl) {
            return customer;
        }

        CustomerImpl customerImpl = new CustomerImpl();

        customerImpl.setNew(customer.isNew());
        customerImpl.setPrimaryKey(customer.getPrimaryKey());

        customerImpl.setCustomerId(customer.getCustomerId());
        customerImpl.setCompanyId(customer.getCompanyId());
        customerImpl.setUserId(customer.getUserId());
        customerImpl.setUserName(customer.getUserName());
        customerImpl.setCreateDate(customer.getCreateDate());
        customerImpl.setModifiedDate(customer.getModifiedDate());
        customerImpl.setCustomerCode(customer.getCustomerCode());
        customerImpl.setCustomerName(customer.getCustomerName());
        customerImpl.setInCharge(customer.getInCharge());
        customerImpl.setEmail(customer.getEmail());
        customerImpl.setPhone(customer.getPhone());
        customerImpl.setAddress(customer.getAddress());
        customerImpl.setParentId(customer.getParentId());

        return customerImpl;
    }

    /**
     * Returns the customer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the customer
     * @return the customer
     * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCustomerException, SystemException {
        Customer customer = fetchByPrimaryKey(primaryKey);

        if (customer == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return customer;
    }

    /**
     * Returns the customer with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchCustomerException} if it could not be found.
     *
     * @param customerId the primary key of the customer
     * @return the customer
     * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer findByPrimaryKey(long customerId)
        throws NoSuchCustomerException, SystemException {
        return findByPrimaryKey((Serializable) customerId);
    }

    /**
     * Returns the customer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the customer
     * @return the customer, or <code>null</code> if a customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Customer customer = (Customer) EntityCacheUtil.getResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
                CustomerImpl.class, primaryKey);

        if (customer == _nullCustomer) {
            return null;
        }

        if (customer == null) {
            Session session = null;

            try {
                session = openSession();

                customer = (Customer) session.get(CustomerImpl.class, primaryKey);

                if (customer != null) {
                    cacheResult(customer);
                } else {
                    EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
                        CustomerImpl.class, primaryKey, _nullCustomer);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
                    CustomerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return customer;
    }

    /**
     * Returns the customer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param customerId the primary key of the customer
     * @return the customer, or <code>null</code> if a customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Customer fetchByPrimaryKey(long customerId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) customerId);
    }

    /**
     * Returns all the customers.
     *
     * @return the customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Customer> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the customers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of customers
     * @param end the upper bound of the range of customers (not inclusive)
     * @return the range of customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Customer> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the customers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of customers
     * @param end the upper bound of the range of customers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Customer> findAll(int start, int end,
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

        List<Customer> list = (List<Customer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CUSTOMER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CUSTOMER;

                if (pagination) {
                    sql = sql.concat(CustomerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Customer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Customer>(list);
                } else {
                    list = (List<Customer>) QueryUtil.list(q, getDialect(),
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
     * Removes all the customers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Customer customer : findAll()) {
            remove(customer);
        }
    }

    /**
     * Returns the number of customers.
     *
     * @return the number of customers
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

                Query q = session.createQuery(_SQL_COUNT_CUSTOMER);

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
     * Initializes the customer persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.dasannetworks.vn.sb.model.Customer")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Customer>> listenersList = new ArrayList<ModelListener<Customer>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Customer>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CustomerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
