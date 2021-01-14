package com.xing.erp.per.mapper;

import com.xing.erp.com.util.PageBean;
import com.xing.erp.per.model.Dep;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DepMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);

    List<Dep> querypager(Dep dep);


}