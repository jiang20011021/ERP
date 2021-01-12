package com.xing.erp.pur.service.impl;

import com.xing.erp.pur.mapper.OrdersMapper;
import com.xing.erp.pur.model.Orders;
import com.xing.erp.pur.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int deleteByPrimaryKey(Integer uuid) {
        return ordersMapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public int insert(Orders record) {
        return ordersMapper.insert(record);
    }

    @Override
    public int insertSelective(Orders record) {
        return ordersMapper.insertSelective(record);
    }

    @Override
    public Orders selectByPrimaryKey(Integer uuid) {
        return ordersMapper.selectByPrimaryKey(uuid);
    }

    @Override
    public int updateByPrimaryKeySelective(Orders record) {
        return ordersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return ordersMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Orders> selectAllState() {
        return ordersMapper.selectAllState();
    }
}
