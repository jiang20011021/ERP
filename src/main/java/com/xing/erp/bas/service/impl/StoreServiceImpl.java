package com.xing.erp.bas.service.impl;

import com.xing.erp.bas.mapper.StoreMapper;
import com.xing.erp.bas.model.Store;
import com.xing.erp.bas.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements IStoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public int deleteByPrimaryKey(Integer uuid) {
        return storeMapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public int insert(Store record) {
        return storeMapper.insert(record);
    }

    @Override
    public int insertSelective(Store record) {
        return storeMapper.insertSelective(record);
    }

    @Override
    public Store selectByPrimaryKey(Integer uuid) {
        return storeMapper.selectByPrimaryKey(uuid);
    }

    @Override
    public int updateByPrimaryKeySelective(Store record) {
        return storeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Store record) {
        return storeMapper.updateByPrimaryKey(record);
    }
}
