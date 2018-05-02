package com.microservices;

import com.micro.spider.Spider;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StrrTest {

    @Test
    public void ttTest(){
        Map<String,String> header = new HashMap<String,String>();
        String requestNum = "29815334";
        int offset = 1;
        int limit = 10;
        String prefix = "https://www.zhihu.com/api/v4/questions/";
        String sufix = "/answers?include=data%5B*%5D.is_normal%2Cadmin_closed_comment%2Creward_info%2Cis_collapsed%2Cannotation_action%2Cannotation_detail%2Ccollapse_reason%2Cis_sticky%2Ccollapsed_by%2Csuggest_edit%2Ccomment_count%2Ccan_comment%2Ccontent%2Ceditable_content%2Cvoteup_count%2Creshipment_settings%2Ccomment_permission%2Ccreated_time%2Cupdated_time%2Creview_info%2Crelevant_info%2Cquestion%2Cexcerpt%2Crelationship.is_authorized%2Cis_author%2Cvoting%2Cis_thanked%2Cis_nothelp%2Cupvoted_followees%3Bdata%5B*%5D.mark_infos%5B*%5D.url%3Bdata%5B*%5D.author.follower_count%2Cbadge%5B%3F(type%3Dbest_answerer)%5D.topics&sort_by=default";
        String url = "http://www.zhihu.com/api/v4/questions/29815334/answers?include=data[*].is_normal,admin_closed_comment,reward_info,is_collapsed,annotation_action,annotation_detail,collapse_reason,is_sticky,collapsed_by,suggest_edit,comment_count,can_comment,content,editable_content,voteup_count,reshipment_settings,comment_permission,created_time,updated_time,review_info,relevant_info,question,excerpt,relationship.is_authorized,is_author,voting,is_thanked,is_nothelp,upvoted_followees;data[*].mark_infos[*].url;data[*].author.follower_count,badge[?(type=best_answerer)].topics&limit=10&offset=0&sort_by=default";//prefix+requestNum+sufix+"&offset="+offset+"&limit="+limit;
        header.put("Cookie","__DAYU_PP=FvzbqFN7nJUqn6Fjq33U2dab950bd559; q_c1=534563cdcf804fecb6f7892ff1bbabac|1521690984000|1521690984000; _zap=c45013d8-8696-44ae-b9a4-3e6b80b7894d; capsion_ticket=\"2|1:0|10:1521766410|14:capsion_ticket|44:ZTY3OTc0YzU3MTQ3NGYyMzhmNWI0NmY4YTU4NDk0YmM=|faa372f6cb471bf5a0a1bf5903da40f2408e584192a94f10fcb710f41e8ef94d\"; r_cap_id=\"YzE4MWEyN2EyNGNkNDRhZDgzYTBmMDA1YTQ4ZTYyMDA=|1521766413|28d0d683d7d532c97b5cd64db9e670a61c7ee0b7\"; cap_id=\"YzU0YjIxMTJiZjdkNDg2MWJhMGUwNzhlMTllYTkwMjg=|1521766413|d12700b2bcb6d3f8b2498db07244eca16580ae5a\"; l_cap_id=\"OGJjYmU1OWU0MWZmNDkxODg0Njc3ZDA4MDhjNGJjOWI=|1521766413|7d8834e9bd6082626a14d7957e323c98b7675603\"; z_c0=Mi4xdEpXbEFBQUFBQUFBc0s0bzl6VlREUmNBQUFCaEFsVk5FSjZoV3dEc2NqLTBmcVhvalI3ZkFZbW9GNFhlNE02MUJB|1521766416|92ee094d9471ec17ad0e4b29d378f718c87d17c7; __utmv=51854390.100-1|2=registration_date=20141123=1^3=entry_date=20141123=1; d_c0=\"AGDv_igNag2PToR4jJLhxPOEiEdsYvZws5k=|1523235288\"; __utma=51854390.1044755183.1522629937.1523148192.1523235284.5; __utmz=51854390.1523235284.5.5.utmcsr=zhihu.com|utmccn=(referral)|utmcmd=referral|utmcct=/; aliyungf_tc=AQAAAJ1c/h/FawIAKgqVdaeKVQmAvoEF; _xsrf=886153b0-4d52-44c1-b1e6-35e3037f4727");
        header.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36");
        new Spider().addRequest(url).addHead(header).start();


    }
}
