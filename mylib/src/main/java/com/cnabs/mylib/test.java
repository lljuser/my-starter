package com.cnabs.mylib;

import com.cnabs.mylib.service.IMystaterService;
import com.cnabs.mylib.service.MystarterService;

public class test {
    public static void main(String[] args){
        IMystaterService mystaterService=new MystarterService("localhost",1001);
        mystaterService.doWork();
    }
}
