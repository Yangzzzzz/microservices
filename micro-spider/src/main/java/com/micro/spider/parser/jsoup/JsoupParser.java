package com.micro.spider.parser.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupParser {


    public String parser(String html){

        Document document = Jsoup.parse(html);
        document.select("//");
        return "";
    }
}
