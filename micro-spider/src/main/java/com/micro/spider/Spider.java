package com.micro.spider;

import com.micro.spider.page.Page;
import com.micro.spider.performer.Performer;
import com.micro.spider.performer.SimplePerformer;

import java.util.HashMap;
import java.util.LinkedList;

public class Spider {

    private LinkedList<Page> pages ;
    private LinkedList<String> requests;
    private HashMap<String,String> header;
    private HashMap<String,String> cookie;
    private Performer performer = new SimplePerformer();


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
    public void addHead(String name,String val){
        header.put(name,val);
    }


    public Spider(){

    }

    /**
     * 开始抓取
     */
    public void start(){
        for(String request : requests){
            Page page = performer.execute(request,header);
            System.out.print(page);
        }
    }



}
