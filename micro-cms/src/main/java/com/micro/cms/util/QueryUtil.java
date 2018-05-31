package com.micro.cms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 查询解析工具类
 */
public class QueryUtil {

    public static String proceSqlByParam(String sql, Map<String,Object> params){
        Pattern pattern = Pattern.compile("\\s*and\\s+[a-zA-Z]+\\s*=\\s*:[a-zA-Z]+\\s*");
        Matcher matcher =pattern.matcher(sql);
//        matcher.find();
//        int cnt = matcher.groupCount();
        List<String> strList = new ArrayList<String>();
//        for(int i =0 ;i<cnt ;i++){
//
//        }
        int nextIndex = 0;
        while(matcher.find()){
            int startIndex = matcher.start();
            strList.add(sql.substring(nextIndex,startIndex));
            nextIndex = startIndex;
        }
        strList.add(sql.substring(nextIndex,sql.length()-1));
        return "";
    }
    public static void main(String[] args){
        QueryUtil.proceSqlByParam("select * from test where 1=1 and a=:a" +
                " and b=:b and c=:c ",null);
    }
}
