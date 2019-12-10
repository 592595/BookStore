package com.pan.model;

import java.sql.Date;

public class OrdersMes {
    private String idOrder;

    private String idBuyer;

    private String idSeller;

    private String nameBook;

    private Integer sumBook;

    private Double priceBook;

    private Double priceOrder;

    private Date timeOrder;

    private String addressBuyer;

    private String deliverCheck;

    private String payCheck;

    private String idBook;

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(String idBuyer) {
        this.idBuyer = idBuyer;
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

    public Integer getSumBook() {
        return sumBook;
    }

    public void setSumBook(Integer sumBook) {
        this.sumBook = sumBook;
    }

    public Double getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(Double priceBook) {
        this.priceBook = priceBook;
    }

    public Double getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(Double priceOrder) {
        this.priceOrder = priceOrder;
    }

    public Date getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(Date timeOrder) {
        this.timeOrder = timeOrder;
    }

    public String getAddressBuyer() {
        return addressBuyer;
    }

    public void setAddressBuyer(String addressBuyer) {
        this.addressBuyer = addressBuyer;
    }

    public String getDeliverCheck() {
        return deliverCheck;
    }

    public void setDeliverCheck(String deliverCheck) {
        this.deliverCheck = deliverCheck;
    }

    public String getPayCheck() {
        return payCheck;
    }

    public void setPayCheck(String payCheck) {
        this.payCheck = payCheck;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }
}