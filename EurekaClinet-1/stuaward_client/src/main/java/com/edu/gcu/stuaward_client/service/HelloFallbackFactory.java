//package com.edu.gcu.stuaward_client.service;
//
//import feign.hystrix.FallbackFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//public class HelloFallbackFactory implements FallbackFactory<HelloService> {
//    @Override
//    public HelloService create(Throwable throwable) {
//        return new HelloService() {
//            @Override
//            public String inHello() {
//                return "fail to load hello-service3, this is fallback factory method";
//            }
//        };
//    }
//}
