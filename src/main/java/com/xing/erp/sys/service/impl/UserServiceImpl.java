package com.xing.erp.sys.service.impl;

import com.xing.erp.sys.mapper.UserMapper;
import com.xing.erp.sys.model.TreeNode;
import com.xing.erp.sys.model.User;
import com.xing.erp.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public List<User> selectUserPage(User user) {
        return null;
    }

    @Override
    public List<TreeNode> getTreeNodeByUser(User user) {
        return userMapper.getTreeNodeByUser(user);
    }
    
}
