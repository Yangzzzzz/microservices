package com.micro.spider.performer;

import com.micro.spider.page.Page;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

public class SimplePerformer extends AbstrctPerformer{



    @Override
    public Page execute(String url,Map<String,String> headers) {
        return doGet(url,headers);
    }


    private Page doGet(String url , Map<String,String> headers){

        CloseableHttpClient httpclient = HttpClients.createDefault();
        Page page = new Page();

        try {

            // 创建httpget.
            HttpGet httpget = new HttpGet(url);

            //设置请求头
            if(headers != null && !headers.isEmpty()){
                for (String key : headers.keySet()){
                    httpget.addHeader(key,headers.get(key));
                }
            }
            System.out.println("executing request " + httpget.getURI());
            // 执行get请求.
            CloseableHttpResponse response = httpclient.execute(httpget);
            page.setResponseCode(response.getStatusLine().getStatusCode());

            try {
                // 获取响应实体
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    page.setResponseContent(EntityUtils.toByteArray(entity));
                    page.setHeads(headers);
                    Charset charset = ContentType.get(entity).getCharset();
                    if(charset != null){
                        page.setCharSet(charset.name());
                    }
                }
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return page;
    }

}
