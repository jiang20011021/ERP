package com.xing.erp.sys.mapper;

import com.xing.erp.sys.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}