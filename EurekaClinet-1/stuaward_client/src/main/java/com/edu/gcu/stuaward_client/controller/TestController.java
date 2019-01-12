package com.edu.gcu.stuaward_client.controller;

import com.edu.gcu.stuaward_client.service.HelloService;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.ref.ReferenceQueue;

@RestController
@SuppressWarnings("SpringJavaAutowiringInspection")
public class TestController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
        return "hello "+request.getServerPort();
    }
    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "inhello")
    public String sayHello(){
        return helloService.inHello();
    }
    public String inhello(){
        return "fail to load hello-service3, this is service2 method";
    }
}
