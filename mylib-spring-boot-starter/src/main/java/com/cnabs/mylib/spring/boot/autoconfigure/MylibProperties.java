package com.cnabs.mylib.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.mylib")
public class MylibProperties {
    private String host;
    private Integer port;

    public String getHost(){
        return this.host;
    }

    public void setHost(String host){
        this.host=host;
    }

    public Integer getPort(){
        return  this.port;
    }

    public void setPort(Integer port){
        this.port=port;
    }
}
