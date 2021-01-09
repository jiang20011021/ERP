package com.xing.erp.bas.model;

public class Store {
    private Integer uuid;

    private String name;

    private String emp;

    private String address;

    public Store(Integer uuid, String name, String emp, String address) {
        this.uuid = uuid;
        this.name = name;
        this.emp = emp;
        this.address = address;
    }

    public Store() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}