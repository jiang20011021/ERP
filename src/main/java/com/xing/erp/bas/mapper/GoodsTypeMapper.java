package com.xing.erp.bas.mapper;

import com.xing.erp.bas.model.GoodsType;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}