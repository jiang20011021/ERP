package com.xing.erp.pur.model;

import java.util.Date;

public class OrdersDetail {
    private Integer orderdetailid;

    private Integer goodsid;

    private String goodsname;

    private Float price;

    private Integer num;

    private Float money;

    private Date endtime;

    private String ender;

    private Integer storeid;

    private String state;

    private Integer ordersid;

    public OrdersDetail(Integer orderdetailid, Integer goodsid, String goodsname, Float price, Integer num, Float money, Date endtime, String ender, Integer storeid, String state, Integer ordersid) {
        this.orderdetailid = orderdetailid;
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.price = price;
        this.num = num;
        this.money = money;
        this.endtime = endtime;
        this.ender = ender;
        this.storeid = storeid;
        this.state = state;
        this.ordersid = ordersid;
    }

    public OrdersDetail() {
        super();
    }

    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }
}