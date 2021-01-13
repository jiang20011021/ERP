package com.xing.erp.bas.service.impl;

import com.xing.erp.bas.mapper.GoodsMapper;
import com.xing.erp.bas.model.Goods;
import com.xing.erp.bas.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int deleteByPrimaryKey(Integer uuid) {
        return goodsMapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public Goods selectByPrimaryKey(Integer uuid) {
        return goodsMapper.selectByPrimaryKey(uuid);
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }
}
