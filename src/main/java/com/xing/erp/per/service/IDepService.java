package com.xing.erp.per.service;

import com.xing.erp.per.model.Dep;

public interface IDepService {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);
}