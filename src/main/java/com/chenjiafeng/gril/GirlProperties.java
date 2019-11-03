package com.chenjiafeng.gril;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    //注意变量名和配置名保持一致
private String cupSzie;
private String age;

    public String getCupSzie() {
        return cupSzie;
    }

    public void setCupSzie(String cupSzie) {
        this.cupSzie = cupSzie;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

