package com.xing.erp.bas.model;

public class Goods {
    private Integer uuid;

    private String name;

    private String origin;

    private Integer producer;

    private String unit;

    private Integer inprice;

    private Integer outprice;

    private Integer goodstypeuuid;

    public Goods(Integer uuid, String name, String origin, Integer producer, String unit, Integer inprice, Integer outprice, Integer goodstypeuuid) {
        this.uuid = uuid;
        this.name = name;
        this.origin = origin;
        this.producer = producer;
        this.unit = unit;
        this.inprice = inprice;
        this.outprice = outprice;
        this.goodstypeuuid = goodstypeuuid;
    }

    public Goods() {
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getProducer() {
        return producer;
    }

    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getInprice() {
        return inprice;
    }

    public void setInprice(Integer inprice) {
        this.inprice = inprice;
    }

    public Integer getOutprice() {
        return outprice;
    }

    public void setOutprice(Integer outprice) {
        this.outprice = outprice;
    }

    public Integer getGoodstypeuuid() {
        return goodstypeuuid;
    }

    public void setGoodstypeuuid(Integer goodstypeuuid) {
        this.goodstypeuuid = goodstypeuuid;
    }
}