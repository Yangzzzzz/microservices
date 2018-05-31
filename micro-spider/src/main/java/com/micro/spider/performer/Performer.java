package com.micro.spider.performer;

import com.micro.spider.page.Page;

import java.util.Map;

public interface Performer {

    Page execute(String url,Map<String,String> headers);

}
