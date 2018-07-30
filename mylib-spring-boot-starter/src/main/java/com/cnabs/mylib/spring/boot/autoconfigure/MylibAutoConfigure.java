package com.cnabs.mylib.spring.boot.autoconfigure;

import com.cnabs.mylib.service.IMystaterService;
import com.cnabs.mylib.service.MystarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ConditionalOnClass，当classpath下发现该类的情况下进行自动配置.
 * @ConditionalOnMissingBean，当Spring Context中不存在该Bean时。
 * @ConditionalOnProperty(prefix = "spring.mylib",value = "enabled",havingValue = "true")，当配置文件中example.service.enabled=true时。
 * 记得在配置META-INF/spring.factories
 * **/
@Configuration
@ConditionalOnClass(MystarterService.class)
@EnableConfigurationProperties(MylibProperties.class)
public class MylibAutoConfigure {
    @Autowired
    private MylibProperties mylibProperties;

    @Bean
    @ConditionalOnMissingBean
    //@ConditionalOnProperty(prefix = "spring.mylib",value = "enabled",havingValue = "true")
    public IMystaterService mystaterService(){
        return new MystarterService(mylibProperties.getHost(),mylibProperties.getPort());
    }
}
