package com.xing.erp.rep.mapper;

import com.xing.erp.rep.model.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}