package com.xing.erp.bas.service;

import com.xing.erp.bas.model.Store;

public interface IStoreService {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}