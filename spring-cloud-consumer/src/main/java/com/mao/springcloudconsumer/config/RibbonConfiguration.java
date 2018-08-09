package com.mao.springcloudconsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon 配置负载规则
 *
 * @author 毛进宝
 * @date Created in 14:14 2018-8-9
 * @modified By
 */
@Configuration
@RibbonClient(name = "spring-cloud-provider", configuration = RibbonConfiguration.class)
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
