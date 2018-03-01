package com.micro.web.service.impl;

import com.micro.web.dao.UserInfoMapper;
import com.micro.web.pojo.UserInfo;
import com.micro.web.service.UserInfoService;
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
