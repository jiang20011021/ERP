package com.xing.erp.per.serivce;


import com.xing.erp.com.util.JsonResponseBody;
import com.xing.erp.com.util.PageBean;
import com.xing.erp.per.model.Dep;

import java.util.List;

public interface IDepSerivce {
    JsonResponseBody<?> deleteByPrimaryKey(Integer uuid);

    JsonResponseBody<?> insert(Dep record);

    JsonResponseBody<?> insertSelective(Dep record);

    JsonResponseBody<?> selectByPrimaryKey(Integer uuid);

    JsonResponseBody<?> updateByPrimaryKeySelective(Dep record);

    JsonResponseBody<?> updateByPrimaryKey(Dep record);

    JsonResponseBody<?> query(Dep dep, PageBean pageBean);


}