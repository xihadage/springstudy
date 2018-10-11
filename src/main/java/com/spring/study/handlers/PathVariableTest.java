package com.spring.study.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PathVariableTest class
 *
 * @author Administrator
 * @date 2018/10/11
 */
@RequestMapping("/pathVariableTest")
@Controller
public class PathVariableTest {
    public static final String SUCCESS="success";
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id){
        System.out.println("testPathVariable:"+id);
        return SUCCESS;
    }

}
