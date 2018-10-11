package com.spring.study.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * ServletAPITest class
 *
 * @author Administrator
 * @date 2018/10/11
 */
@RequestMapping("/servletAPITest")
@Controller
public class ServletAPITest {
    public static final String SUCCESS="success";
    @RequestMapping("/testServletAPI")
    public void testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer out)throws IOException{
        System.out.println("testServletAPI: "+request+", "+response);
        out.write("hello springmvc");
    }
}
