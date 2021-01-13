package com.xing.erp.per.service.impl;

import com.xing.erp.per.mapper.DepMapper;
import com.xing.erp.per.model.Dep;
import com.xing.erp.per.service.IDepService;

public class DepServiceImpl implements IDepService {

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
}
