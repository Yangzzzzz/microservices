package com.micro.spider.page;

import org.apache.http.util.EntityUtils;

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
    //编码
    private String charSet = "ISO-8859-1";
    //返回状态码
    private String responseCode;
    //返回字节
    private byte[] responseContent;
    //目标url 下一个爬取对象
    private List<String> targetUrl;



    public List<String> xpath(String regex){



        return null;
    }


    public String toString(){
        return "";
    }




    public Map<String, String> getHeads() {
        return heads;
    }

    public void setHeads(Map<String, String> heads) {
        this.heads = heads;
    }

    public Map<String, String> getCookies() {
        return cookies;
    }

    public void setCookies(Map<String, String> cookies) {
        this.cookies = cookies;
    }

    public String getCharSet() {
        return charSet;
    }

    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public byte[] getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(byte[] responseContent) {
        this.responseContent = responseContent;
    }

    public List<String> getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(List<String> targetUrl) {
        this.targetUrl = targetUrl;
    }
}
