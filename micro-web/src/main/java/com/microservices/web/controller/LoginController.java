package com.microservices.web.controller;

import com.microservices.web.pojo.UserInfo;
import com.microservices.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value="/login")
    public ModelAndView login(@RequestParam(value="name",required = false) String name, @RequestParam(value="password",required = false) String password, HttpSession httpSession, HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login.jsp");
        if(httpSession.getAttribute("userName")!=null){
            modelAndView.setViewName("contents/endLess/index.jsp");
            return modelAndView;
        }
        if(!request.getMethod().equals("POST")){
            return modelAndView;
        }
        UserInfo userInfo = userInfoService.selectUserInfo(name,password);

        if(userInfo == null){

            modelAndView.addObject("resultMsg","账号或密码错误，请重新输入！");
            return modelAndView;
        }

        modelAndView.setViewName("contents/endLess/index.jsp");
        httpSession.setAttribute("userName",name);
        return modelAndView;
    }
}
