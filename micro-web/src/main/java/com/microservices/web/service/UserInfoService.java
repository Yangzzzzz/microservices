package com.microservices.web.service;

import com.microservices.web.pojo.UserInfo;

public interface UserInfoService {

    public UserInfo selectUserInfo(String name, String password);

    public UserInfo selectByPrimaryKey(Integer id);
}
