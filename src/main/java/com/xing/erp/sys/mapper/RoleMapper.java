package com.xing.erp.sys.mapper;

import com.xing.erp.sys.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}