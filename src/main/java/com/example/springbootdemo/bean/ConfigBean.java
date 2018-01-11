package com.example.springbootdemo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
//有时候属性太多了，一个个绑定到属性字段上太累，官方提倡绑定一个对象的bean，这里我们建一个ConfigBean.java类，顶部需要使用注解@ConfigurationProperties(prefix = "com.Rainyn")来指明使用哪个，这里配置完还需要在spring Boot入口类加上@EnableConfigurationProperties并指明要加载哪个bean
@ConfigurationProperties(prefix = "com.Rainyn")
public class ConfigBean {

    private String name;

    private String want;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
