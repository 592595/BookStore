package com.pan.model;

import java.sql.Date;

public class BooksMes {
    private String idBook;

    private String idSeller;

    private String nameBook;

    private Double priceBook;

    private String pressBook;

    private Date timeBook;

    private Integer sumBook;

    private String typeBook;

    private String illegalBook;

    private String bookimgUrl;

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(String idSeller) {
        this.idSeller = idSeller;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Double getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(Double priceBook) {
        this.priceBook = priceBook;
    }

    public String getPressBook() {
        return pressBook;
    }

    public void setPressBook(String pressBook) {
        this.pressBook = pressBook;
    }

    public Date getTimeBook() {
        return timeBook;
    }

    public void setTimeBook(Date timeBook) {
        this.timeBook = timeBook;
    }

    public Integer getSumBook() {
        return sumBook;
    }

    public void setSumBook(Integer sumBook) {
        this.sumBook = sumBook;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    public String getIllegalBook() {
        return illegalBook;
    }

    public void setIllegalBook(String illegalBook) {
        this.illegalBook = illegalBook;
    }

    public String getBookimgUrl() {
        return bookimgUrl;
    }

    public void setBookimgUrl(String bookimgUrl) {
        this.bookimgUrl = bookimgUrl;
    }

    @Override
    public String toString() {
        return "BooksMes{" +
                "idBook='" + idBook + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", priceBook=" + priceBook +
                ", pressBook='" + pressBook + '\'' +
                ", timeBook=" + timeBook +
                ", sumBook=" + sumBook +
                ", typeBook='" + typeBook + '\'' +
                ", illegalBook='" + illegalBook + '\'' +
               // ", bookimgUrl='" + bookimgUrl + '\'' +
                '}';
    }
}