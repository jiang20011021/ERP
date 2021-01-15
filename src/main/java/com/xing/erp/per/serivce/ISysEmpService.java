package com.xing.erp.per.serivce;

import com.xing.erp.com.util.JsonResponseBody;
import com.xing.erp.com.util.PageBean;
import com.xing.erp.per.model.SysEmp;

import java.util.List;
import java.util.Set;

public interface ISysEmpService {
    JsonResponseBody<?> deleteByPrimaryKey(Integer uuid);

    JsonResponseBody<?> insert(SysEmp record);

    JsonResponseBody<?> insertSelective(SysEmp record);

    JsonResponseBody<?> selectByPrimaryKey(Integer uuid);

    JsonResponseBody<?> updateByPrimaryKeySelective(SysEmp record);

    JsonResponseBody<?> updateByPrimaryKey(SysEmp record);

    JsonResponseBody<?> querypager(SysEmp sysEmp, PageBean pageBean);


}