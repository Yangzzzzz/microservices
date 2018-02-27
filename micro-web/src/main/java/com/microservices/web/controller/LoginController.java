package com.microservices.web.controller;

import com.microservices.web.pojo.UserInfo;
import com.microservices.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@Controller
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public ModelAndView login(String name,String password){
        UserInfo userInfo = userInfoService.selectUserInfo(name,password);
        ModelAndView modelAndView = new ModelAndView();
        if(userInfo == null){
            modelAndView.setViewName("/login.jsp");
            return modelAndView;
        }

        modelAndView.setViewName("contents/endLess/index.jsp");

        return modelAndView;
    }
}
