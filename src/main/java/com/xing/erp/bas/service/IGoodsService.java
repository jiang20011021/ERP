package com.xing.erp.bas.service;

import com.xing.erp.bas.model.Goods;
import org.springframework.stereotype.Repository;

public interface IGoodsService {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}