package com.xing.erp.sys.mapper;

import com.xing.erp.sys.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {

    int deleteByPrimaryKey(Long roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    //分页查询角色
    List<Role> selectRolePage(Role role);
    //添加角色
    //删除角色
    //编辑角色

    //根据角色id获取菜单id集合
    List<Integer> selectByTreeNodeId(Long roleId);

    //添加角色权限
    //删除角色权限

}