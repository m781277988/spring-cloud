package com.mao.springcloudconsumer.resource;

import com.mao.springcloudconsumer.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 测试controller
 *
 * @author 毛进宝
 * @date Created in 14:56 2018-7-30
 * @modified By
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 获取服务者提供的user信息
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://spring-cloud-provider/" + id, User.class);
    }

    /**
     * 测试负载均衡后的client信息
     * @return
     */
    @GetMapping("/client/info")
    public ServiceInstance getClientInfo() {
       return loadBalancerClient.choose("spring-cloud-provider");
    }

}
