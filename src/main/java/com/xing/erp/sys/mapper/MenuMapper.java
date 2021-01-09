package com.xing.erp.sys.mapper;

import com.xing.erp.sys.model.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(String menuid);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String menuid);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}