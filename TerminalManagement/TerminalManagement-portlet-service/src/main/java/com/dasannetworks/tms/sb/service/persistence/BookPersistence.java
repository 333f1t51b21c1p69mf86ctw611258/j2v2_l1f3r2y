package com.dasannetworks.tms.sb.service.persistence;

import com.dasannetworks.tms.sb.model.Book;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookPersistenceImpl
 * @see BookUtil
 * @generated
 */
public interface BookPersistence extends BasePersistence<Book> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BookUtil} to access the book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the book in the entity cache if it is enabled.
    *
    * @param book the book
    */
    public void cacheResult(com.dasannetworks.tms.sb.model.Book book);

    /**
    * Caches the books in the entity cache if it is enabled.
    *
    * @param books the books
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.tms.sb.model.Book> books);

    /**
    * Creates a new book with the primary key. Does not add the book to the database.
    *
    * @param bookId the primary key for the new book
    * @return the new book
    */
    public com.dasannetworks.tms.sb.model.Book create(long bookId);

    /**
    * Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bookId the primary key of the book
    * @return the book that was removed
    * @throws com.dasannetworks.tms.sb.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.tms.sb.model.Book remove(long bookId)
        throws com.dasannetworks.tms.sb.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.tms.sb.model.Book updateImpl(
        com.dasannetworks.tms.sb.model.Book book)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the book with the primary key or throws a {@link com.dasannetworks.tms.sb.NoSuchBookException} if it could not be found.
    *
    * @param bookId the primary key of the book
    * @return the book
    * @throws com.dasannetworks.tms.sb.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.tms.sb.model.Book findByPrimaryKey(long bookId)
        throws com.dasannetworks.tms.sb.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the book with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bookId the primary key of the book
    * @return the book, or <code>null</code> if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.tms.sb.model.Book fetchByPrimaryKey(long bookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the books.
    *
    * @return the books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.tms.sb.model.Book> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.tms.sb.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @return the range of books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.tms.sb.model.Book> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.tms.sb.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.tms.sb.model.Book> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the books from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of books.
    *
    * @return the number of books
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
