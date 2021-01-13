package com.xing.erp.bas.service.impl;

import com.xing.erp.bas.mapper.SupplierMapper;
import com.xing.erp.bas.model.Supplier;
import com.xing.erp.bas.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements ISupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public int deleteByPrimaryKey(Integer uuid) {
        return supplierMapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public int insert(Supplier record) {
        return supplierMapper.insert(record);
    }

    @Override
    public int insertSelective(Supplier record) {
        return supplierMapper.insertSelective(record);
    }

    @Override
    public Supplier selectByPrimaryKey(Integer uuid) {
        return supplierMapper.selectByPrimaryKey(uuid);
    }

    @Override
    public int updateByPrimaryKeySelective(Supplier record) {
        return supplierMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Supplier record) {
        return supplierMapper.updateByPrimaryKey(record);
    }
}
