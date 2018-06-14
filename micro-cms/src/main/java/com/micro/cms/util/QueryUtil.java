package com.micro.cms.util;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 查询解析工具类
 */
public class QueryUtil {

    /**
     * 按参数拼接sql
     *
     * @param sql
     * @param params
     * @return
     */
    public static Map<String, List<Object>> proceSqlByParam(String sql, Map<String, Object> params) {

//        sql = format(sql);
        Pattern pattern = Pattern.compile("\\s+and\\s+[\\w]+(\\s+like\\s+|\\s*[=<>]{1,2}\\s*):([\\w]+)");
        Matcher matcher = pattern.matcher(sql);
//        matcher.find();
//        int cnt = matcher.groupCount();
        Map<String, String> paramMap = new LinkedHashMap<String, String>();
//        for(int i =0 ;i<cnt ;i++){
//
//        }
        int nextIndex = 0;
        String key = null;
        String nextKey = null;
        while (matcher.find()) {
            int startIndex = matcher.start();
            key = nextKey;
            paramMap.put(key, sql.substring(nextIndex, startIndex));
            nextKey = matcher.group(2);
            nextIndex = startIndex;
        }
        paramMap.put(nextKey, sql.substring(nextIndex, sql.length() - 1));
        String sqlTar = paramMap.get(null);
        paramMap.remove(null);

        return packageSql(sqlTar, paramMap, params);
    }

    private static Map<String, List<Object>> packageSql(String sqlTar, Map<String, String> sqlMap, Map<String, Object> params) {

        Map<String, List<Object>> result = new HashMap<String, List<Object>>();
        StringBuilder sb = new StringBuilder();
        sb.append(sqlTar);
        List<Object> paramList = new ArrayList<Object>();
        for (String key : sqlMap.keySet()) {
            if (params.containsKey(key)) {
                sb.append(sqlMap.get(key).replaceAll(":\\w+", "?"));
                paramList.add(params.get(key));
            }
        }
        result.put(sb.toString(), paramList);
        return result;
    }

    /**
     * 格式化sql
     *
     * @return
     */
    private static String format(String sql) {
        return sql.replaceAll("[\\s]+", "  ");
    }

    /**
     * 测试用
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("createTime", "1");
        params.put("updateTime", "2");
        params.put("c1", "3");
        params.put("e1", "4");
        Map<String, List<Object>> result = QueryUtil.proceSqlByParam("select a.* from grid_database_company a LEFT JOIN grid_database_push_log b on a.id=b.databaseId where (b.id is null or ((b.type='05' or b.type='11') and (b.recCode is null or b.recCode<>'200'))) and length(a.id)>0 and a.`status`<>'99'  and (a.createTime <=:createTime) and (a.updateTime <=:updateTime)", params);



    }
}
