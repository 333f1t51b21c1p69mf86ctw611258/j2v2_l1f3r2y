package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.UploadFile;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the upload file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UploadFilePersistenceImpl
 * @see UploadFileUtil
 * @generated
 */
public interface UploadFilePersistence extends BasePersistence<UploadFile> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UploadFileUtil} to access the upload file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the upload file in the entity cache if it is enabled.
    *
    * @param uploadFile the upload file
    */
    public void cacheResult(com.dasannetworks.vn.sb.model.UploadFile uploadFile);

    /**
    * Caches the upload files in the entity cache if it is enabled.
    *
    * @param uploadFiles the upload files
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.UploadFile> uploadFiles);

    /**
    * Creates a new upload file with the primary key. Does not add the upload file to the database.
    *
    * @param uploadFileId the primary key for the new upload file
    * @return the new upload file
    */
    public com.dasannetworks.vn.sb.model.UploadFile create(long uploadFileId);

    /**
    * Removes the upload file with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param uploadFileId the primary key of the upload file
    * @return the upload file that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchUploadFileException if a upload file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.UploadFile remove(long uploadFileId)
        throws com.dasannetworks.vn.sb.NoSuchUploadFileException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.UploadFile updateImpl(
        com.dasannetworks.vn.sb.model.UploadFile uploadFile)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the upload file with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchUploadFileException} if it could not be found.
    *
    * @param uploadFileId the primary key of the upload file
    * @return the upload file
    * @throws com.dasannetworks.vn.sb.NoSuchUploadFileException if a upload file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.UploadFile findByPrimaryKey(
        long uploadFileId)
        throws com.dasannetworks.vn.sb.NoSuchUploadFileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the upload file with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param uploadFileId the primary key of the upload file
    * @return the upload file, or <code>null</code> if a upload file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.UploadFile fetchByPrimaryKey(
        long uploadFileId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the upload files.
    *
    * @return the upload files
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.UploadFile> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the upload files.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.UploadFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of upload files
    * @param end the upper bound of the range of upload files (not inclusive)
    * @return the range of upload files
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.UploadFile> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the upload files.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.UploadFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of upload files
    * @param end the upper bound of the range of upload files (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of upload files
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.UploadFile> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the upload files from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of upload files.
    *
    * @return the number of upload files
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
