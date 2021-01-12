package com.xing.erp.pur.mapper;

import com.xing.erp.pur.model.ReturnOrdersDetail;

public interface ReturnOrdersDetailMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(ReturnOrdersDetail record);

    int insertSelective(ReturnOrdersDetail record);

    ReturnOrdersDetail selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(ReturnOrdersDetail record);

    int updateByPrimaryKey(ReturnOrdersDetail record);
}