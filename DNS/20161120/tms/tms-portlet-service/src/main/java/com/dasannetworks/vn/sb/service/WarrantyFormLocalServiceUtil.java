package com.dasannetworks.vn.sb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for WarrantyForm. This utility wraps
 * {@link com.dasannetworks.vn.sb.service.impl.WarrantyFormLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyFormLocalService
 * @see com.dasannetworks.vn.sb.service.base.WarrantyFormLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.impl.WarrantyFormLocalServiceImpl
 * @generated
 */
public class WarrantyFormLocalServiceUtil {
    private static WarrantyFormLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.dasannetworks.vn.sb.service.impl.WarrantyFormLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the warranty form to the database. Also notifies the appropriate model listeners.
    *
    * @param warrantyForm the warranty form
    * @return the warranty form that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm addWarrantyForm(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addWarrantyForm(warrantyForm);
    }

    /**
    * Creates a new warranty form with the primary key. Does not add the warranty form to the database.
    *
    * @param warrantyFormId the primary key for the new warranty form
    * @return the new warranty form
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm createWarrantyForm(
        long warrantyFormId) {
        return getService().createWarrantyForm(warrantyFormId);
    }

    /**
    * Deletes the warranty form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form that was removed
    * @throws PortalException if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm deleteWarrantyForm(
        long warrantyFormId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteWarrantyForm(warrantyFormId);
    }

    /**
    * Deletes the warranty form from the database. Also notifies the appropriate model listeners.
    *
    * @param warrantyForm the warranty form
    * @return the warranty form that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm deleteWarrantyForm(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteWarrantyForm(warrantyForm);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.dasannetworks.vn.sb.model.WarrantyForm fetchWarrantyForm(
        long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchWarrantyForm(warrantyFormId);
    }

    /**
    * Returns the warranty form with the primary key.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form
    * @throws PortalException if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm getWarrantyForm(
        long warrantyFormId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getWarrantyForm(warrantyFormId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the warranty forms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of warranty forms
    * @param end the upper bound of the range of warranty forms (not inclusive)
    * @return the range of warranty forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> getWarrantyForms(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getWarrantyForms(start, end);
    }

    /**
    * Returns the number of warranty forms.
    *
    * @return the number of warranty forms
    * @throws SystemException if a system exception occurred
    */
    public static int getWarrantyFormsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getWarrantyFormsCount();
    }

    /**
    * Updates the warranty form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param warrantyForm the warranty form
    * @return the warranty form that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm updateWarrantyForm(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateWarrantyForm(warrantyForm);
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

    public static void clearService() {
        _service = null;
    }

    public static WarrantyFormLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    WarrantyFormLocalService.class.getName());

            if (invokableLocalService instanceof WarrantyFormLocalService) {
                _service = (WarrantyFormLocalService) invokableLocalService;
            } else {
                _service = new WarrantyFormLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(WarrantyFormLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(WarrantyFormLocalService service) {
    }
}
