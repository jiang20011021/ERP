package com.xing.erp.com.shiro;

import com.xing.erp.sys.model.User;
import com.xing.erp.sys.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;


    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

//        //获取账号密码
//        String username = authenticationToken.getPrincipal().toString();
//        String password = authenticationToken.getCredentials().toString();
//        //验证
//        User user = userService.login(username);
//        //判断
//        if(null==user){
//            throw new UnknownAccountException("账号错误");
//        }
//
//        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(), ByteSource.Util.bytes(user.getSalt()),this.getName());

        return null;

    }

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

}
