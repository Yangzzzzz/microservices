package com.microservices.web.filter;


import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "PermissionCheckFilterFilter")
public class PermissionCheckFilterFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String userName = (String) request.getSession().getAttribute("userName");
        if(StringUtils.isEmpty(userName) && !request.getRequestURL().toString().contains("login")){
           request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
           return;
        }
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
