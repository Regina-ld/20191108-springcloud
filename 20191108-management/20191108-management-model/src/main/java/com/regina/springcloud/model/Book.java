package com.regina.springcloud.model;

import java.io.Serializable;
import java.util.Objects;


public class Book implements Serializable {
    private Long id;
    private String bookName;
    private Long bookPrice;
    private Long catId;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", catId=" + catId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookPrice, book.bookPrice) &&
                Objects.equals(catId, book.catId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, bookPrice, catId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Long bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Book() {
    }

    public Book(Long id, String bookName, Long bookPrice, Long catId) {
        this.id = id;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.catId = catId;
    }
}
