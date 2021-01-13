package com.xing.erp.rep.service.impl;

import com.xing.erp.rep.mapper.StoreDetailMapper;
import com.xing.erp.rep.model.StoreDetail;
import com.xing.erp.rep.service.IStoreDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreDetailServiceImpl implements IStoreDetailService {
    @Autowired
    private StoreDetailMapper storeDetailMapper;

    @Override
    public int deleteByPrimaryKey(Integer uuid) {
        return 0;
    }

    @Override
    public int insert(StoreDetail record) {
        return 0;
    }

    @Override
    public int insertSelective(StoreDetail record) {
        return 0;
    }

    @Override
    public StoreDetail selectByPrimaryKey(Integer uuid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(StoreDetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StoreDetail record) {
        return 0;
    }

    @Override
    public int seleceTstoredetAil(Integer storeuuid, Integer goodsuuid) {
        return storeDetailMapper.seleceTstoredetAil(storeuuid,goodsuuid);
    }
}
