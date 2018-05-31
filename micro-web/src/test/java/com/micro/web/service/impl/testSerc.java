package com.micro.web.service.impl;

import com.sun.deploy.util.ArrayUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testSerc {

    @Test
    public void test_main() throws UnsupportedEncodingException {
        new mytest();
    }

    public String test(List<String[]> list ,int pos,String ch){

        String str ="";

        for(int i=0;i<list.size();i++){
            String[] sh = list.get(i);
            for(int j=0;j<sh.length;j++){
                if(j==pos){
                    str += sh[j];
                }
            }

        }

        return str;

    }
    public void sort(int[] list , int i ,int j){

//        int i = 0;
//        int j = list.length - 1;
        if(i >= j){
            return;
        }
        int first = i;
        int laset = j;

        boolean flag = true;
        for(;i<j;){
            if(flag){
                int temp = list[i];
                while(i<j){
                    if(list[j] <=temp){
                        j--;
                    }else{
                        int tt = list[i];
                        list[i] = list[j];
                        list[j] = tt;
                        flag = !flag;
                        break;
                    }

                }
            }else{
                int temp = list[j];
                while(i<j){

                    if(list[i] >=temp){
                        i++;
                    }else{
                        int tt = list[i];
                        list[i] = list[j];
                        list[j] = tt;
                        flag = !flag;
                        break;
                    }
                }
            }
        }

        sort(list,first,i-1);
        sort(list,i+1,laset);
    }
}

class mytest{
    static private String a = "1" ;
    static {
        System.out.print(a);
    }


    }
