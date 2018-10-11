package com.spring.study.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RequestMappingTest class
 *
 * @author Administrator
 * @date 2018/10/11
 */
@RequestMapping("/requestMappingTest")
@Controller
public class RequestMappingTest {
    public static final String SUCCRSS="success";

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return SUCCRSS;
    }

    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod 的post方式");
        return SUCCRSS;
    }

    @RequestMapping(value = "testParamsAndHeaders", params = { "username", "age!=10" }, headers = { "Accept-Language=zh-CN,zh;q=0.8" })
    public String testParamsAndHeaders(){
        System.out.println("testParamsAndHeaders");
        return SUCCRSS;
    }
    @RequestMapping("/testAntPath/*/abc")
    public String testAntPath(){
        System.out.println("testAntPath");
        return SUCCRSS;
    }
}
