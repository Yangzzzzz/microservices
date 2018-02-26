package com.microservices.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(HttpServletRequest servletRequest,Model model){

        return "endLess/index.jsp";
    }
}
