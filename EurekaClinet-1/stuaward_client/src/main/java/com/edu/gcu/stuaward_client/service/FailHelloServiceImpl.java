package com.edu.gcu.stuaward_client.service;

import org.springframework.stereotype.Component;

@Component
public class FailHelloServiceImpl implements HelloService{
    @Override
    public String inHello() {
        return "fail to load hello service, this is fall back method";
    }
}
