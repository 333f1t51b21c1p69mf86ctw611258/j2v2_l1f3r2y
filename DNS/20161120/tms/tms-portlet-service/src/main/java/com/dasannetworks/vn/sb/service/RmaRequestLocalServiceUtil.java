package com.dasannetworks.vn.sb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for RmaRequest. This utility wraps
 * {@link com.dasannetworks.vn.sb.service.impl.RmaRequestLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestLocalService
 * @see com.dasannetworks.vn.sb.service.base.RmaRequestLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.impl.RmaRequestLocalServiceImpl
 * @generated
 */
public class RmaRequestLocalServiceUtil {
    private static RmaRequestLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.dasannetworks.vn.sb.service.impl.RmaRequestLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the rma request to the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequest the rma request
    * @return the rma request that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest addRmaRequest(
        com.dasannetworks.vn.sb.model.RmaRequest rmaRequest)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRmaRequest(rmaRequest);
    }

    /**
    * Creates a new rma request with the primary key. Does not add the rma request to the database.
    *
    * @param rmaRequestId the primary key for the new rma request
    * @return the new rma request
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest createRmaRequest(
        long rmaRequestId) {
        return getService().createRmaRequest(rmaRequestId);
    }

    /**
    * Deletes the rma request with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestId the primary key of the rma request
    * @return the rma request that was removed
    * @throws PortalException if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest deleteRmaRequest(
        long rmaRequestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRmaRequest(rmaRequestId);
    }

    /**
    * Deletes the rma request from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequest the rma request
    * @return the rma request that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest deleteRmaRequest(
        com.dasannetworks.vn.sb.model.RmaRequest rmaRequest)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRmaRequest(rmaRequest);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.dasannetworks.vn.sb.model.RmaRequest fetchRmaRequest(
        long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRmaRequest(rmaRequestId);
    }

    /**
    * Returns the rma request with the matching UUID and company.
    *
    * @param uuid the rma request's UUID
    * @param companyId the primary key of the company
    * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchRmaRequestByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRmaRequestByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the rma request matching the UUID and group.
    *
    * @param uuid the rma request's UUID
    * @param groupId the primary key of the group
    * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchRmaRequestByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRmaRequestByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the rma request with the primary key.
    *
    * @param rmaRequestId the primary key of the rma request
    * @return the rma request
    * @throws PortalException if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest getRmaRequest(
        long rmaRequestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRmaRequest(rmaRequestId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the rma request with the matching UUID and company.
    *
    * @param uuid the rma request's UUID
    * @param companyId the primary key of the company
    * @return the matching rma request
    * @throws PortalException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest getRmaRequestByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRmaRequestByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the rma request matching the UUID and group.
    *
    * @param uuid the rma request's UUID
    * @param groupId the primary key of the group
    * @return the matching rma request
    * @throws PortalException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest getRmaRequestByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRmaRequestByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> getRmaRequests(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRmaRequests(start, end);
    }

    /**
    * Returns the number of rma requests.
    *
    * @return the number of rma requests
    * @throws SystemException if a system exception occurred
    */
    public static int getRmaRequestsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRmaRequestsCount();
    }

    /**
    * Updates the rma request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rmaRequest the rma request
    * @return the rma request that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest updateRmaRequest(
        com.dasannetworks.vn.sb.model.RmaRequest rmaRequest)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRmaRequest(rmaRequest);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByStatus(status);
    }

    public static void clearService() {
        _service = null;
    }

    public static RmaRequestLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RmaRequestLocalService.class.getName());

            if (invokableLocalService instanceof RmaRequestLocalService) {
                _service = (RmaRequestLocalService) invokableLocalService;
            } else {
                _service = new RmaRequestLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RmaRequestLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RmaRequestLocalService service) {
    }
}
