package com.microservices;

import com.micro.spider.Spider;
import org.junit.Test;

public class StrrTest {

    @Test
    public void ttTest(){
        new Spider().addRequest("http://localhost/cms/common/main.jsp").start();
    }
}
