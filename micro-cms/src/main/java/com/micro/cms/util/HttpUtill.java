package com.micro.cms.util;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Map;

/**
 * http工具类
 */
public class HttpUtill {

    //private static MultiThreadedHttpConnectionManager clientManager;
    private static final Logger logger = Logger.getLogger(HttpUtill.class);
    private static final int MAX_CONNECT_CNT = 10;
    private static final int MAX_HOST_CONNECT_CNT = 10;
    private static final int SOCK_TIME_OUT = 10000;
    private static final int CONNECT_TIME_OUT = 10000;
    private static final String CHARSET = "UTF-8";
    private static final int RESULT_OK = 200;



    //初始化连接池
    static {
//        clientManager = new MultiThreadedHttpConnectionManager();
//        //客户端总连接数
//        clientManager.getParams().setMaxTotalConnections(MAX_CONNECT_CNT);
//        //每个主机最大连接数
//        clientManager.getParams().setDefaultMaxConnectionsPerHost(MAX_HOST_CONNECT_CNT);
//        //设置连接socket超时时间
//        clientManager.getParams().setSoTimeout(SOCK_TIME_OUT);
//        //设置connect超时时间
//        clientManager.getParams().setConnectionTimeout(CONNECT_TIME_OUT);

    }

    public static void sendPostRequest(String url){

       // EntityEnclosingMethod postMethod = new PostMethod();

    }

    public static String sendGetRequest(String url,Map<String,String> headers){
        //
        String rspStr = "";
        //创建客户端
        HttpClient httpClient = HttpClients.createDefault();
        //创建请求
        HttpGet httpGet = new HttpGet(url);
        //设置请求头
        for(String key : headers.keySet()){
            httpGet.addHeader(key,headers.get(key));
        }
        //获取应答
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity = httpResponse.getEntity();
            rspStr = EntityUtils.toString(httpEntity);

        } catch (IOException e) {
            logger.error("http请求失败!",e);
        }

        return rspStr;
    }

    /**
     * 获取客户端实例
     * @return
     */
    private HttpClient getClient(){
        HttpClient httpClient = HttpClients.createDefault();
        return httpClient;
    }
}
