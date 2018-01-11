package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置文件解析Controller
 */

@RestController
public class PropertiesController {

    @Autowired
    ConfigBean configBean;

    @Value("${com.rainyn.mood}")
    private String mood;

    @Value("${com.rainyn.reason}")
    private String reason;

    @Value("${com.Rainyn.yearHope}")
    private  String  yearHope;

    @Value("${random.value}")
    private String secret ;

    @Value(" ${random.int}")
    private int num;

    @Value("${random.long}")
    private long bigNum;

    @Value("${random.uuid}")
    private String uuid;

    @Value("${rainyn.num.less.than.ten}")
     private  int  numLessThanTen;

    @Value("${rainyn.num.in.range}")
     private  int numInRange;


    @RequestMapping("/getMoodNow")
    public String  moodNow() {
        return mood +",因为"+ reason;
    }
    @RequestMapping("/getYearHope")
    public String  yearHope(){
        return configBean.getName()+configBean.getWant();
    }

    @RequestMapping("/getYearHope2")
    public String  yearHope2(){
        return yearHope;
    }

    @RequestMapping("/randomTest")
    public String randomTest(){
      return  secret+"\r\n"+num+"\r\n"+bigNum+"\r\n"+uuid+"\r\n"+numLessThanTen+"\r\n"+numInRange;
    }
}
