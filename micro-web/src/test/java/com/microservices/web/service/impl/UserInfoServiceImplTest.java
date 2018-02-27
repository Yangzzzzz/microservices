package com.microservices.web.service.impl;

import com.microservices.web.pojo.UserInfo;
import com.microservices.web.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)//此处调用Spring单元测试类
//@WebAppConfiguration  //调用javaWEB的组件，比如自动注入
@ContextConfiguration(locations = {"classpath*:/spring-mvc.xml","classpath*:/spring-mybatis.xml"})//加载spring容器
//当然 你可以声明一个事务管理 每个单元测试都进行事务回滚 无论成功与否
@TransactionConfiguration( transactionManager = "transactionManager",defaultRollback = true)
@Transactional
public class UserInfoServiceImplTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void selectUserInfo(){
        UserInfo userInfo = userInfoService.selectUserInfo("yangzh2i","1143802555");
        System.out.println(userInfo);

    }
}
