package com.edu.gcu.stuaward_client2.controller;

import com.edu.gcu.stuaward_client2.bean.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
        return "hello "+request.getServerPort();
    }
    @RequestMapping(value = "/sendValue",method = RequestMethod.POST)
    public String sendValue(HttpServletRequest request,  @RequestBody Hello hello){
        Hello hello1 = hello;
        System.out.println(hello1.getName()+" "+hello1.getId()+" "+hello1.getCash());
        return "Hello ENTITY : "+hello.getHelloInLists().get(0).getName();
    }
}
