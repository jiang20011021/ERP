package com.xing.erp.pur.mapper;

import com.xing.erp.pur.model.ReturnOrders;

public interface ReturnOrdersMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(ReturnOrders record);

    int insertSelective(ReturnOrders record);

    ReturnOrders selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(ReturnOrders record);

    int updateByPrimaryKey(ReturnOrders record);
}