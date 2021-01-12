package com.xing.erp.bas.service.impl;

import com.xing.erp.bas.mapper.GoodsTypeMapper;
import com.xing.erp.bas.model.GoodsType;
import com.xing.erp.bas.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer uuid) {
        return goodsTypeMapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public int insert(GoodsType record) {
        return goodsTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsType record) {
        return goodsTypeMapper.insertSelective(record);
    }

    @Override
    public GoodsType selectByPrimaryKey(Integer uuid) {
        return goodsTypeMapper.selectByPrimaryKey(uuid);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsType record) {
        return goodsTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsType record) {
        return updateByPrimaryKey(record);
    }
}
