package com.xing.erp.pur.controller;

import com.xing.erp.pur.model.Orders;
import com.xing.erp.pur.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Order")
public class OrdersController {


    @Autowired
    private IOrdersService ordersService;


    @RequestMapping("/getSelectAllState")
    @ResponseBody
    public List<Orders> getSelectAllState(){
        List<Orders> orders = ordersService.selectAllState();
        orders.forEach(System.out::println);
        return orders;
    }




}
