package com.micro.spider;

import com.micro.spider.factory.PerformerFactory;
import com.micro.spider.page.Page;
import com.micro.spider.performer.Performer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Spider {

    private LinkedList<Page> pages ;
    private LinkedList<String> requests;
    private HashMap<String,String> header = new HashMap<String, String>();
    private HashMap<String,String> cookie;
    private Performer performer = PerformerFactory.getInstance();


    /**
     * 新增请求url
     * @param url
     */
    public Spider addRequest(String url){

        if(requests == null){
            requests = new LinkedList<String>();
        }

        this.requests.add(url);
        return  this;
    }

    /**
     * 新增请求头
     * @param name
     * @param val
     */
    public Spider addHead(String name,String val){
        header.put(name,val);
        return this;
    }

    public Spider addHead(Map<String,String> header){
        this.header.putAll(header);
        return this;
    }


    public Spider(){

    }

    /**
     * 开始抓取
     */
    public void start(){
        for(String request : requests){
            Page page = performer.execute(request,header);
            System.out.println(page);
        }
    }



}
