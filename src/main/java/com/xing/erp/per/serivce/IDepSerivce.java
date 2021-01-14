package com.xing.erp.per.serivce;


import com.xing.erp.com.util.PageBean;
import com.xing.erp.per.model.Dep;

import java.util.List;

public interface IDepSerivce {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);

    List<Dep> querypager(Dep dep, PageBean pageBean);


}