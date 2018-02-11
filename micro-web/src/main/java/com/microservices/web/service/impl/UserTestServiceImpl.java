package com.microservices.web.service.impl;

import com.yangz.web.dao.UserTestMapper;
import com.yangz.web.pojo.UserTest;
import com.yangz.web.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service()
public class UserTestServiceImpl implements UserTestService{
    @Autowired
    private UserTestMapper userTestMapper;
    @Override
    public UserTest getUserTestById(Integer userId) {
        return userTestMapper.selectByPrimaryKey(userId);
    }

    @Override
    public void addUserTest(Integer userId) {
        UserTest userTest = new UserTest(userId,"1122","yzz",new Date());
        userTestMapper.insert(userTest);
    }
}
