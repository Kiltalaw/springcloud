package com.edu.gcu.stuaward_client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "hello-service3",fallback = FailHelloServiceImpl.class)
public interface HelloService {
    @RequestMapping(value = "/inhello",method = RequestMethod.GET)
    public String inHello();
}
