package com.chenjiafeng.gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
//    @Value("${cupSize}")
//    private String size;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
//        return "Hello Spring boot";
//        return "这个女生使用的Size是"+size+"，年龄是"+age;
//        return content;
        return "id为："+myId+",这个女生使用的Size是"+girlProperties.getCupSzie()+",年龄是"+girlProperties.getAge();
    }
}
