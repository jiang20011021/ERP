package com.xing.erp.sys.service.impl;

import com.xing.erp.com.util.PageBean;
import com.xing.erp.sys.mapper.RoleMapper;
import com.xing.erp.sys.model.Role;
import com.xing.erp.sys.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(Long roleid) {
        return 0;
    }

    @Override
    public int insert(Role record) {
        return 0;
    }

    @Override
    public int insertSelective(Role record) {
        return 0;
    }

    @Override
    public Role selectByPrimaryKey(Long roleid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return 0;
    }

    @Override
    public List<Role> selectRolePage(Role role, PageBean pageBean) {
        return roleMapper.selectRolePage(role);
    }

    @Override
    public List<Integer> selectByTreeNodeId(Long roleId) {
        return roleMapper.selectByTreeNodeId(roleId);
    }

}
