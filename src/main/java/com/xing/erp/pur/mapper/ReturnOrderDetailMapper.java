package com.xing.erp.pur.mapper;

import com.xing.erp.pur.model.ReturnOrderDetail;

public interface ReturnOrderDetailMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(ReturnOrderDetail record);

    int insertSelective(ReturnOrderDetail record);

    ReturnOrderDetail selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(ReturnOrderDetail record);

    int updateByPrimaryKey(ReturnOrderDetail record);
}