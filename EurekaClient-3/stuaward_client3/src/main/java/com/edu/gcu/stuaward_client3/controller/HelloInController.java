package com.edu.gcu.stuaward_client3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloInController {
    @RequestMapping(value = "/inhello",method = RequestMethod.GET)
    public String inHello(){
        return "this is hello 3 service method";
    }
}
