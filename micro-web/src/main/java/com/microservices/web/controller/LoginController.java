package com.microservices.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String showUser(HttpServletRequest servletRequest, @RequestParam() Model model){

        return "html/login.html";
    }
}
