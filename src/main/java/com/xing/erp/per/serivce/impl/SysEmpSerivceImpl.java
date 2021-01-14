package com.xing.erp.per.serivce.impl;

import com.xing.erp.com.util.PageBean;
import com.xing.erp.per.mapper.SysEmpMapper;
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
    public int deleteByPrimaryKey(Integer uuid) {
        return sysEmpMapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public int insert(SysEmp record) {
        return sysEmpMapper.insert(record);
    }

    @Override
    public int insertSelective(SysEmp record) {
        return sysEmpMapper.insertSelective(record);
    }

    @Override
    public SysEmp selectByPrimaryKey(Integer uuid) {
        return sysEmpMapper.selectByPrimaryKey(uuid);
    }

    @Override
    public int updateByPrimaryKeySelective(SysEmp record) {
        return sysEmpMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysEmp record) {
        return sysEmpMapper.updateByPrimaryKey(record);
    }

    public List<SysEmp> querypager(SysEmp sysEmp, PageBean pageBean){
        return sysEmpMapper.querypager(sysEmp);
    }
}
