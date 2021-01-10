package com.xing.erp.pur.model;

import java.util.Date;

public class ReturnOrders {
    private Integer uuid;

    private Date createtime;

    private Date checktime;

    private Date endtime;

    private String type;

    private String creater;

    private String checker;

    private String ender;

    private Integer supplieruuid;

    private Integer totalmoney;

    private String state;

    private Integer waybillsn;

    private Integer ordersuuid;

    public ReturnOrders(Integer uuid, Date createtime, Date checktime, Date endtime, String type, String creater, String checker, String ender, Integer supplieruuid, Integer totalmoney, String state, Integer waybillsn, Integer ordersuuid) {
        this.uuid = uuid;
        this.createtime = createtime;
        this.checktime = checktime;
        this.endtime = endtime;
        this.type = type;
        this.creater = creater;
        this.checker = checker;
        this.ender = ender;
        this.supplieruuid = supplieruuid;
        this.totalmoney = totalmoney;
        this.state = state;
        this.waybillsn = waybillsn;
        this.ordersuuid = ordersuuid;
    }

    public ReturnOrders() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public Integer getSupplieruuid() {
        return supplieruuid;
    }

    public void setSupplieruuid(Integer supplieruuid) {
        this.supplieruuid = supplieruuid;
    }

    public Integer getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Integer totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getWaybillsn() {
        return waybillsn;
    }

    public void setWaybillsn(Integer waybillsn) {
        this.waybillsn = waybillsn;
    }

    public Integer getOrdersuuid() {
        return ordersuuid;
    }

    public void setOrdersuuid(Integer ordersuuid) {
        this.ordersuuid = ordersuuid;
    }
}