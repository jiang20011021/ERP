package com.xing.erp.sys.service;

import com.xing.erp.com.util.PageBean;
import com.xing.erp.sys.model.Role;

import java.util.List;

public interface IRoleService {
    int deleteByPrimaryKey(Long roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    //分页查询角色
    List<Role> selectRolePage(Role role, PageBean pageBean);

    //添加角色
    //删除角色
    //编辑角色

    //根据角色id获取菜单id
    List<Integer> selectByTreeNodeId(Long roleId);

    //添加角色权限
    //删除角色权限

}