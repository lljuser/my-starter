package com.cnabs.mylib.service;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
* 测试Starter logger  Properties等
* */
public class MystarterService implements IMystaterService {
    private final static Log logger=LogFactory.getLog(MystarterService.class);

    private String host;
    private Integer port;
    public MystarterService(String host,Integer port){
        this.host=host;
        this.port=port;
    }

    public MystarterService(){

    }

    public void doWork() {
        String server=this.host+":"+this.port;
        System.out.println("["+server+"]this is mylib-spring-boot-starter test............");
        logger.info("["+server+"]this is mylib-spring-boot-starter test............");
        logger.error("["+server+"]this is mylib-spring-boot-starter test............");
    }
}
