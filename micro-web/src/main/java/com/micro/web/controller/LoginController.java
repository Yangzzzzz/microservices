package com.micro.web.controller;

import com.micro.web.service.UserInfoService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 登录校验
 */
@Controller
public class LoginController {

    Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping(value="/login")
    public ModelAndView login(@RequestParam(value="name",required = false) String name, @RequestParam(value="password",required = false) String password, HttpSession httpSession, HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView();
        String errMsg = null;
        modelAndView.setViewName("/login.jsp");

        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()){
            modelAndView.setViewName("contents/endLess/index.jsp");
            return modelAndView;
        }

        if(StringUtils.isEmpty(name) || StringUtils.isEmpty(password)){
            return modelAndView;
        }

        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        try{
            subject.login(token);
        }catch (AuthenticationException e){
            errMsg = "登录失败！";
        }catch (Exception e){
            logger.error("权限校验异常！",e);
        }

        if(errMsg != null){
            modelAndView.addObject("resultMsg","1");
            return  modelAndView;
        }


        modelAndView.setViewName("contents/endLess/index.jsp");
        return modelAndView;
    }
}
