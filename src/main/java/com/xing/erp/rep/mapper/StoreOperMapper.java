package com.xing.erp.rep.mapper;

import com.xing.erp.rep.model.StoreOper;

public interface StoreOperMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(StoreOper record);

    int insertSelective(StoreOper record);

    StoreOper selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(StoreOper record);

    int updateByPrimaryKey(StoreOper record);
}