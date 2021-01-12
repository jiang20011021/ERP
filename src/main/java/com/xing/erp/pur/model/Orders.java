package com.xing.erp.pur.model;

import java.util.Date;

public class Orders {
    private Integer uuid;

    private Date createtime;

    private Date checktime;

    private Date starttime;

    private Date endtime;

    private String type;

    private String creater;

    private String checker;

    private String starter;

    private String ender;

    private String supplierid;

    private Float totalmony;

    private String state;

    private Integer waybillsn;

    public Orders(Integer uuid, Date createtime, Date checktime, Date starttime, Date endtime, String type, String creater, String checker, String starter, String ender, String supplierid, Float totalmony, String state, Integer waybillsn) {
        this.uuid = uuid;
        this.createtime = createtime;
        this.checktime = checktime;
        this.starttime = starttime;
        this.endtime = endtime;
        this.type = type;
        this.creater = creater;
        this.checker = checker;
        this.starter = starter;
        this.ender = ender;
        this.supplierid = supplierid;
        this.totalmony = totalmony;
        this.state = state;
        this.waybillsn = waybillsn;
    }

    public Orders() {
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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
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

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public Float getTotalmony() {
        return totalmony;
    }

    public void setTotalmony(Float totalmony) {
        this.totalmony = totalmony;
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
}