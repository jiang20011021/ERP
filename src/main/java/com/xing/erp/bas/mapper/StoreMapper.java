package com.xing.erp.bas.mapper;

import com.xing.erp.bas.model.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}