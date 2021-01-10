package com.xing.erp.bas.service;

import com.xing.erp.bas.model.GoodsType;

public interface IGoodsTypeService {
    int deleteByPrimaryKey(Integer uuid);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}