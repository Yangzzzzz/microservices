package com.micro.spider.factory;

import com.micro.spider.performer.Performer;
import com.micro.spider.performer.SimplePerformer;

public class PerformerFactory {

    private static Performer performer;

    private PerformerFactory(){

    }

    synchronized public static Performer getInstance(){
        if(performer == null){
            performer = new SimplePerformer();
        }
        return  performer;
    }
}
