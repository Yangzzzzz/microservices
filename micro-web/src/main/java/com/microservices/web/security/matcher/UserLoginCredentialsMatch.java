package com.microservices.web.security.matcher;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import java.util.concurrent.atomic.AtomicInteger;

public class UserLoginCredentialsMatch extends HashedCredentialsMatcher {

    private Cache<String, AtomicInteger> passwordRetryCache;

    public UserLoginCredentialsMatch(CacheManager cacheManager){
        passwordRetryCache = cacheManager.getCache("passwordCache");
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {

        return super.doCredentialsMatch(token, info);
    }
}
