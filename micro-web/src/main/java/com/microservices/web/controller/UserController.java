package com.microservices.web.controller;

import com.microservices.web.service.UserTestService;
import com.yangz.web.pojo.UserTest;
import com.yangz.web.service.UserTestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/usertest")
public class UserController {
    @Resource
    private UserTestService userTestService;
    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest servletRequest, Model model){
        UserTest userTest= userTestService.getUserTestById(1);
        userTest.getUserId();
        userTest.getUserName();
        model.addAttribute("userTest",userTest);
        return "index";
    }
}
