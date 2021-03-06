package com.xing.erp.sys.mapper;

import com.xing.erp.sys.model.TreeNode;
import com.xing.erp.sys.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //分页查询
    List<User> selectUserPage(User user);

    //登录


    //根据用户获取菜单
    List<TreeNode> getTreeNodeByUser(User user);
}