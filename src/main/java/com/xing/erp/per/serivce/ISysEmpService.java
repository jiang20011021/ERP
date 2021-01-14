package com.xing.erp.per.serivce;

import com.xing.erp.com.util.PageBean;
import com.xing.erp.per.model.SysEmp;

import java.util.List;
import java.util.Set;

public interface ISysEmpService {
    int deleteByPrimaryKey(Integer uuid);

    int insert(SysEmp record);

    int insertSelective(SysEmp record);

    SysEmp selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(SysEmp record);

    int updateByPrimaryKey(SysEmp record);

    List<SysEmp> querypager(SysEmp sysEmp, PageBean pageBean);


}