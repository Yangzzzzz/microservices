package com.microservices.web.controller;

import com.microservices.cms.util.EmailUtil;
import com.microservices.web.pojo.UserTest;
import com.microservices.web.service.UserTestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/usertest")
public class UserController {
    @Resource
    private UserTestService userTestService;
    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest servletRequest, Model model){
        try {
            EmailUtil.sendEmailMsg();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return "index";
    }
}
