package com.microservices.spider.page;

import java.util.List;
import java.util.Map;

/**
 * 页面实体类
 */
public class Page {
    //链接 private String url;
    //请求头
    private Map<String,String> heads;
    //cookies
    private Map<String,String> cookies;
    //返回状态码
    private String responseCode;
    //返回字节
    private byte[] responseContent;

}
