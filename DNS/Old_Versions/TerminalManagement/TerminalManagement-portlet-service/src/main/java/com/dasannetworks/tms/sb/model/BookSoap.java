package com.dasannetworks.tms.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dasannetworks.tms.sb.service.http.BookServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.tms.sb.service.http.BookServiceSoap
 * @generated
 */
public class BookSoap implements Serializable {
    private long _bookId;
    private String _bookName;
    private String _description;
    private String _authorName;
    private int _isbn;
    private int _price;

    public BookSoap() {
    }

    public static BookSoap toSoapModel(Book model) {
        BookSoap soapModel = new BookSoap();

        soapModel.setBookId(model.getBookId());
        soapModel.setBookName(model.getBookName());
        soapModel.setDescription(model.getDescription());
        soapModel.setAuthorName(model.getAuthorName());
        soapModel.setIsbn(model.getIsbn());
        soapModel.setPrice(model.getPrice());

        return soapModel;
    }

    public static BookSoap[] toSoapModels(Book[] models) {
        BookSoap[] soapModels = new BookSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BookSoap[][] toSoapModels(Book[][] models) {
        BookSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BookSoap[models.length][models[0].length];
        } else {
            soapModels = new BookSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BookSoap[] toSoapModels(List<Book> models) {
        List<BookSoap> soapModels = new ArrayList<BookSoap>(models.size());

        for (Book model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BookSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bookId;
    }

    public void setPrimaryKey(long pk) {
        setBookId(pk);
    }

    public long getBookId() {
        return _bookId;
    }

    public void setBookId(long bookId) {
        _bookId = bookId;
    }

    public String getBookName() {
        return _bookName;
    }

    public void setBookName(String bookName) {
        _bookName = bookName;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getAuthorName() {
        return _authorName;
    }

    public void setAuthorName(String authorName) {
        _authorName = authorName;
    }

    public int getIsbn() {
        return _isbn;
    }

    public void setIsbn(int isbn) {
        _isbn = isbn;
    }

    public int getPrice() {
        return _price;
    }

    public void setPrice(int price) {
        _price = price;
    }
}
