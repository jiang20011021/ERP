package com.xing.erp.rep.service;

import com.xing.erp.rep.model.StoreDetail;
import org.springframework.stereotype.Repository;


public interface IStoreDetailService {
    int deleteByPrimaryKey(Integer uuid);

    int insert(StoreDetail record);

    int insertSelective(StoreDetail record);

    StoreDetail selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(StoreDetail record);

    int updateByPrimaryKey(StoreDetail record);

    /**
     * 库存查询
     * @param storeuuid  仓库id
     * @param goodsuuid  商品id
     * @return
     */
    int seleceTstoredetAil(Integer storeuuid, Integer goodsuuid);


}