package com.spring.study.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloWorld class
 *
 * @author Administrator
 * @date 2018/10/11
 */
@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello word");
        return "success";
    }
}
