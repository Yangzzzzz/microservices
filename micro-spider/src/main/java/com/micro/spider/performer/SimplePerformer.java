package com.micro.spider.performer;

import com.micro.spider.page.Page;

public class SimplePerformer implements  Performer{

    private Page page ;


    public SimplePerformer(Page page){
        this.page = page;
    }


    @Override
    public Page execute() {

        return null;
    }


}
