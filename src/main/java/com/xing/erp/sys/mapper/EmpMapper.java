package com.xing.erp.sys.mapper;

import com.xing.erp.sys.model.Emp;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}