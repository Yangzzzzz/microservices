package com.microservices;

import com.micro.spider.Spider;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StrrTest {

    @Test
    public void ttTest(){
        Map<String,String> header = new HashMap<String,String>();
        header.put("Cookie","__DAYU_PP=FvzbqFN7nJUqn6Fjq33U2dab950bd559; q_c1=534563cdcf804fecb6f7892ff1bbabac|1521690984000|1521690984000; _zap=c45013d8-8696-44ae-b9a4-3e6b80b7894d; capsion_ticket=\"2|1:0|10:1521766410|14:capsion_ticket|44:ZTY3OTc0YzU3MTQ3NGYyMzhmNWI0NmY4YTU4NDk0YmM=|faa372f6cb471bf5a0a1bf5903da40f2408e584192a94f10fcb710f41e8ef94d\"; r_cap_id=\"YzE4MWEyN2EyNGNkNDRhZDgzYTBmMDA1YTQ4ZTYyMDA=|1521766413|28d0d683d7d532c97b5cd64db9e670a61c7ee0b7\"; cap_id=\"YzU0YjIxMTJiZjdkNDg2MWJhMGUwNzhlMTllYTkwMjg=|1521766413|d12700b2bcb6d3f8b2498db07244eca16580ae5a\"; l_cap_id=\"OGJjYmU1OWU0MWZmNDkxODg0Njc3ZDA4MDhjNGJjOWI=|1521766413|7d8834e9bd6082626a14d7957e323c98b7675603\"; z_c0=Mi4xdEpXbEFBQUFBQUFBc0s0bzl6VlREUmNBQUFCaEFsVk5FSjZoV3dEc2NqLTBmcVhvalI3ZkFZbW9GNFhlNE02MUJB|1521766416|92ee094d9471ec17ad0e4b29d378f718c87d17c7; __utmv=51854390.100-1|2=registration_date=20141123=1^3=entry_date=20141123=1; d_c0=\"AGDv_igNag2PToR4jJLhxPOEiEdsYvZws5k=|1523235288\"; __utma=51854390.1044755183.1522629937.1523148192.1523235284.5; __utmz=51854390.1523235284.5.5.utmcsr=zhihu.com|utmccn=(referral)|utmcmd=referral|utmcct=/; aliyungf_tc=AQAAAJ1c/h/FawIAKgqVdaeKVQmAvoEF; _xsrf=886153b0-4d52-44c1-b1e6-35e3037f4727");
        header.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36");
        new Spider().addRequest("http://zhihu.com").addHead(header).start();
    }
}
