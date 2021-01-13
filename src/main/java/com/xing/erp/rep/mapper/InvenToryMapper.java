package com.xing.erp.rep.mapper;

import com.xing.erp.rep.model.InvenTory;

public interface InvenToryMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(InvenTory record);

    int insertSelective(InvenTory record);

    InvenTory selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(InvenTory record);

    int updateByPrimaryKey(InvenTory record);
}