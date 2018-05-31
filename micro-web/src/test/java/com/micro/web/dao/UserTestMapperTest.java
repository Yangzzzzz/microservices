package com.micro.web.dao;

import org.junit.Test;

public class UserTestMapperTest {
    public class tt{
        public String name ;
    }
    @Test
    public void test_01(){
//        String str = "1234";
      System.out.println(testTry());
    }


    public String testTry(){
        try {
            return "1";
        }catch (Exception e){
            return "2";
        }finally {
            return "3";
        }
    }
}
