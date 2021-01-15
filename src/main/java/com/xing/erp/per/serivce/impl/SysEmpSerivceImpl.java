package com.xing.erp.per.serivce.impl;

import com.xing.erp.com.execption.BusinessException;
import com.xing.erp.com.util.JsonResponseBody;
import com.xing.erp.com.util.PageBean;
import com.xing.erp.com.util.ResponseStatus;
import com.xing.erp.per.mapper.SysEmpMapper;
import com.xing.erp.per.model.Dep;
import com.xing.erp.per.model.SysEmp;
import com.xing.erp.per.serivce.ISysEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class SysEmpSerivceImpl implements ISysEmpService {

    @Autowired
    private SysEmpMapper sysEmpMapper;

    @Override
    public JsonResponseBody<?> deleteByPrimaryKey(Integer uuid) {
        int i=sysEmpMapper.deleteByPrimaryKey(uuid);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_203);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> insert(SysEmp record) {
        int i=sysEmpMapper.insert(record);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_201);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> insertSelective(SysEmp record) {
        int i=sysEmpMapper.insertSelective(record);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_201);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> selectByPrimaryKey(Integer uuid) {
        SysEmp sysEmp=sysEmpMapper.selectByPrimaryKey(uuid);
        if (null==sysEmp){
            return new JsonResponseBody<>(ResponseStatus.STATUS_204);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKeySelective(SysEmp record) {
        int i=sysEmpMapper.updateByPrimaryKeySelective(record);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_201);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKey(SysEmp record) {
        int i=sysEmpMapper.updateByPrimaryKey(record);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_201);
        }
        return new JsonResponseBody<>();
    }

    public JsonResponseBody<?> querypager(SysEmp sysEmp, PageBean pageBean){
        List<SysEmp> sysEmps = sysEmpMapper.querypager(sysEmp);
        return new JsonResponseBody<>(sysEmps);
    }
}
