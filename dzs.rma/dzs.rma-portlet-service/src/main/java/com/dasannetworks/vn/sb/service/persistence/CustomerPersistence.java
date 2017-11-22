package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.Customer;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerPersistenceImpl
 * @see CustomerUtil
 * @generated
 */
public interface CustomerPersistence extends BasePersistence<Customer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CustomerUtil} to access the customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the customer where customerCode = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchCustomerException} if it could not be found.
    *
    * @param customerCode the customer code
    * @return the matching customer
    * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a matching customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer findByCustomerCode(
        java.lang.String customerCode)
        throws com.dasannetworks.vn.sb.NoSuchCustomerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the customer where customerCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param customerCode the customer code
    * @return the matching customer, or <code>null</code> if a matching customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer fetchByCustomerCode(
        java.lang.String customerCode)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the customer where customerCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param customerCode the customer code
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching customer, or <code>null</code> if a matching customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer fetchByCustomerCode(
        java.lang.String customerCode, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the customer where customerCode = &#63; from the database.
    *
    * @param customerCode the customer code
    * @return the customer that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer removeByCustomerCode(
        java.lang.String customerCode)
        throws com.dasannetworks.vn.sb.NoSuchCustomerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of customers where customerCode = &#63;.
    *
    * @param customerCode the customer code
    * @return the number of matching customers
    * @throws SystemException if a system exception occurred
    */
    public int countByCustomerCode(java.lang.String customerCode)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the customers where parentId = &#63;.
    *
    * @param parentId the parent ID
    * @return the matching customers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Customer> findByParentId(
        java.lang.Long parentId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.Customer> findByParentId(
        java.lang.Long parentId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.Customer> findByParentId(
        java.lang.Long parentId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first customer in the ordered set where parentId = &#63;.
    *
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching customer
    * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a matching customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer findByParentId_First(
        java.lang.Long parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchCustomerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first customer in the ordered set where parentId = &#63;.
    *
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching customer, or <code>null</code> if a matching customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer fetchByParentId_First(
        java.lang.Long parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last customer in the ordered set where parentId = &#63;.
    *
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching customer
    * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a matching customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer findByParentId_Last(
        java.lang.Long parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchCustomerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last customer in the ordered set where parentId = &#63;.
    *
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching customer, or <code>null</code> if a matching customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer fetchByParentId_Last(
        java.lang.Long parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.dasannetworks.vn.sb.model.Customer[] findByParentId_PrevAndNext(
        long customerId, java.lang.Long parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchCustomerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the customers where parentId = &#63; from the database.
    *
    * @param parentId the parent ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByParentId(java.lang.Long parentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of customers where parentId = &#63;.
    *
    * @param parentId the parent ID
    * @return the number of matching customers
    * @throws SystemException if a system exception occurred
    */
    public int countByParentId(java.lang.Long parentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the customer in the entity cache if it is enabled.
    *
    * @param customer the customer
    */
    public void cacheResult(com.dasannetworks.vn.sb.model.Customer customer);

    /**
    * Caches the customers in the entity cache if it is enabled.
    *
    * @param customers the customers
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.Customer> customers);

    /**
    * Creates a new customer with the primary key. Does not add the customer to the database.
    *
    * @param customerId the primary key for the new customer
    * @return the new customer
    */
    public com.dasannetworks.vn.sb.model.Customer create(long customerId);

    /**
    * Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param customerId the primary key of the customer
    * @return the customer that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer remove(long customerId)
        throws com.dasannetworks.vn.sb.NoSuchCustomerException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.Customer updateImpl(
        com.dasannetworks.vn.sb.model.Customer customer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the customer with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchCustomerException} if it could not be found.
    *
    * @param customerId the primary key of the customer
    * @return the customer
    * @throws com.dasannetworks.vn.sb.NoSuchCustomerException if a customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer findByPrimaryKey(
        long customerId)
        throws com.dasannetworks.vn.sb.NoSuchCustomerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the customer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param customerId the primary key of the customer
    * @return the customer, or <code>null</code> if a customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Customer fetchByPrimaryKey(
        long customerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the customers.
    *
    * @return the customers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Customer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.Customer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.Customer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the customers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of customers.
    *
    * @return the number of customers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
