package com.xing.erp.bas.service;

import com.xing.erp.bas.model.Supplier;

public interface ISupplierService {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}