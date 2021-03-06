package com.xing.erp.bas.mapper;

import com.xing.erp.bas.model.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}