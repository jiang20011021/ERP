package com.xing.erp.pur.mapper;

import com.xing.erp.pur.model.OrdersDetail;

public interface OrdersDetailMapper {
    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(OrdersDetail record);

    int insertSelective(OrdersDetail record);

    OrdersDetail selectByPrimaryKey(Integer orderdetailid);

    int updateByPrimaryKeySelective(OrdersDetail record);

    int updateByPrimaryKey(OrdersDetail record);
}