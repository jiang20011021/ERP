package com.xing.erp.per.serivce.impl;

import com.xing.erp.com.util.PageBean;
import com.xing.erp.per.mapper.DepMapper;
import com.xing.erp.per.model.Dep;
import com.xing.erp.per.serivce.IDepSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepSerivceImpl implements IDepSerivce {

    @Autowired
    private DepMapper depMapper;

    @Override
    public int deleteByPrimaryKey(Integer uuid) {
        return depMapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public int insert(Dep record) {
        return depMapper.insert(record);
    }

    @Override
    public int insertSelective(Dep record) {
        return depMapper.insertSelective(record);
    }

    @Override
    public Dep selectByPrimaryKey(Integer uuid) {
        return depMapper.selectByPrimaryKey(uuid);
    }

    @Override
    public int updateByPrimaryKeySelective(Dep record) {
        return depMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dep record) {
        return depMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Dep> query(Dep dep, PageBean pageBean) {
        return depMapper.query(dep);
    }

}
