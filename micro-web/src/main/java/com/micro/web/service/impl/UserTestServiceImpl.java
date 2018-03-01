package com.micro.web.service.impl;

import com.micro.web.dao.UserTestMapper;
import com.micro.web.pojo.UserTest;
import com.micro.web.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service()
public class UserTestServiceImpl implements UserTestService {
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
