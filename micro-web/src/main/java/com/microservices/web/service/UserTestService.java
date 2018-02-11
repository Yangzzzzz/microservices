package com.microservices.web.service;

import com.yangz.web.pojo.UserTest;

public interface UserTestService {

    public UserTest getUserTestById(Integer userId);

    public void addUserTest(Integer userId);
}
