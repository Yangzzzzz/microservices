package com.micro.web.service;

import com.micro.web.pojo.UserInfo;

public interface UserInfoService {

    public UserInfo selectUserInfo(String name, String password);

    public UserInfo selectByPrimaryKey(Integer id);
}
