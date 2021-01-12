package com.xing.erp.sys.controller;

import com.xing.erp.sys.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping("/selectByTreeNodeId")
    @ResponseBody
    public List<Integer> selectByTreeNodeId(Long roleId){
        List<Integer> list = roleService.selectByTreeNodeId(roleId);
        return list;
    }




}
