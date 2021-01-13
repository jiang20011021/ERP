package com.xing.erp.pur.service;

import com.xing.erp.pur.model.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IOrdersService {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    //采购模块
    //查询所有状态
    List<Orders> selectAllState();
}