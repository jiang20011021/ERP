package com.xing.erp.per.mapper;

import com.xing.erp.per.model.SysEmp;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SysEmpMapper {

    int deleteByPrimaryKey(Integer uuid);

    int insert(SysEmp record);

    int insertSelective(SysEmp record);

    SysEmp selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysEmp record);

    int updateByPrimaryKey(SysEmp record);

    List<SysEmp> querypager(SysEmp sysEmp);






}