package com.xing.erp.pur.mapper;

import com.xing.erp.pur.model.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}