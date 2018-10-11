package com.spring.study.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * RequestParamTest class
 *
 * @author Administrator
 * @date 2018/10/11
 */
@RequestMapping("/requestParamTest")
@Controller
public class RequestParamTest {
    public static final String SUCCESS="success";
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username")String username,
                                   @RequestParam (value = "age",required = false,defaultValue = "0")int age){
        System.out.println("testRequestParam,username:"+username+",age:"+age);
        return SUCCESS;
    }
}
