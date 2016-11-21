package com.dasannetworks.vn.sb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for HandOverForm. This utility wraps
 * {@link com.dasannetworks.vn.sb.service.impl.HandOverFormLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HandOverFormLocalService
 * @see com.dasannetworks.vn.sb.service.base.HandOverFormLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.impl.HandOverFormLocalServiceImpl
 * @generated
 */
public class HandOverFormLocalServiceUtil {
    private static HandOverFormLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.dasannetworks.vn.sb.service.impl.HandOverFormLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the hand over form to the database. Also notifies the appropriate model listeners.
    *
    * @param handOverForm the hand over form
    * @return the hand over form that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm addHandOverForm(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addHandOverForm(handOverForm);
    }

    /**
    * Creates a new hand over form with the primary key. Does not add the hand over form to the database.
    *
    * @param handOverFormId the primary key for the new hand over form
    * @return the new hand over form
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm createHandOverForm(
        long handOverFormId) {
        return getService().createHandOverForm(handOverFormId);
    }

    /**
    * Deletes the hand over form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param handOverFormId the primary key of the hand over form
    * @return the hand over form that was removed
    * @throws PortalException if a hand over form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm deleteHandOverForm(
        long handOverFormId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteHandOverForm(handOverFormId);
    }

    /**
    * Deletes the hand over form from the database. Also notifies the appropriate model listeners.
    *
    * @param handOverForm the hand over form
    * @return the hand over form that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm deleteHandOverForm(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteHandOverForm(handOverForm);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.dasannetworks.vn.sb.model.HandOverForm fetchHandOverForm(
        long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchHandOverForm(handOverFormId);
    }

    /**
    * Returns the hand over form with the matching UUID and company.
    *
    * @param uuid the hand over form's UUID
    * @param companyId the primary key of the company
    * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm fetchHandOverFormByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchHandOverFormByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the hand over form matching the UUID and group.
    *
    * @param uuid the hand over form's UUID
    * @param groupId the primary key of the group
    * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm fetchHandOverFormByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchHandOverFormByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the hand over form with the primary key.
    *
    * @param handOverFormId the primary key of the hand over form
    * @return the hand over form
    * @throws PortalException if a hand over form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm getHandOverForm(
        long handOverFormId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getHandOverForm(handOverFormId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the hand over form with the matching UUID and company.
    *
    * @param uuid the hand over form's UUID
    * @param companyId the primary key of the company
    * @return the matching hand over form
    * @throws PortalException if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm getHandOverFormByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getHandOverFormByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the hand over form matching the UUID and group.
    *
    * @param uuid the hand over form's UUID
    * @param groupId the primary key of the group
    * @return the matching hand over form
    * @throws PortalException if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm getHandOverFormByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getHandOverFormByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the hand over forms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hand over forms
    * @param end the upper bound of the range of hand over forms (not inclusive)
    * @return the range of hand over forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> getHandOverForms(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getHandOverForms(start, end);
    }

    /**
    * Returns the number of hand over forms.
    *
    * @return the number of hand over forms
    * @throws SystemException if a system exception occurred
    */
    public static int getHandOverFormsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getHandOverFormsCount();
    }

    /**
    * Updates the hand over form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param handOverForm the hand over form
    * @return the hand over form that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm updateHandOverForm(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateHandOverForm(handOverForm);
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

    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> findByG_S(
        long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByG_S(groupId, status);
    }

    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> search(
        com.dasannetworks.vn.tms.service.HandOverFormSearchInput searchInput)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().search(searchInput);
    }

    public static long searchCount(
        com.dasannetworks.vn.tms.service.HandOverFormSearchInput searchInput)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().searchCount(searchInput);
    }

    public static void clearService() {
        _service = null;
    }

    public static HandOverFormLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    HandOverFormLocalService.class.getName());

            if (invokableLocalService instanceof HandOverFormLocalService) {
                _service = (HandOverFormLocalService) invokableLocalService;
            } else {
                _service = new HandOverFormLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(HandOverFormLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(HandOverFormLocalService service) {
    }
}
