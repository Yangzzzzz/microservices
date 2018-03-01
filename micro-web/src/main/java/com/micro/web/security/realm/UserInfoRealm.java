package com.micro.web.security.realm;

import com.micro.web.pojo.UserInfo;
import com.micro.web.service.UserInfoService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class UserInfoRealm  extends AuthorizingRealm {

    @Autowired
    private UserInfoService userInfoService;

    private static final String sal = "YANGZ";

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName = token.getUsername();

        UserInfo userInfo = userInfoService.selectUserInfo(userName,null);

        if(userInfo == null){
            throw new AuthenticationException("该用户不存在!");
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userInfo.getName(),userInfo.getPassword(), ByteSource.Util.bytes(sal),getName());

        return authenticationInfo;
    }
}
