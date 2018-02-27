package com.microservices.web.service.impl;

import com.microservices.web.dao.UserInfoMapper;
import com.microservices.web.pojo.UserInfo;
import com.microservices.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectUserInfo(String name, String password) {
        UserInfo userInfo = userInfoMapper.selectUserInfo(name,password);
        return userInfo;
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer id) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        return userInfo;
    }


}
