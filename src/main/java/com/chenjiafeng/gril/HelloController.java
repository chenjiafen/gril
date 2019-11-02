package com.chenjiafeng.gril;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${cupSize}")
    private String size;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
//        return "Hello Spring boot";
        return size;

    }
}
