package com.micro.web.service;


import com.micro.web.pojo.UserTest;

public interface UserTestService {

    public UserTest getUserTestById(Integer userId);

    public void addUserTest(Integer userId);
}
