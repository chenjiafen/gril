package com.chenjiafeng.gril;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${cupSize}")
    private String size;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
//        return "Hello Spring boot";
//        return "这个女生使用的Size是"+size+"，年龄是"+age;
        return content;
    }
}
