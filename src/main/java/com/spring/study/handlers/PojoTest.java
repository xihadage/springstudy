package com.spring.study.handlers;

import com.spring.study.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PojoTest class
 *
 * @author Administrator
 * @date 2018/10/11
 */
@RequestMapping("/pojoTest")
@Controller
public class PojoTest {

    public static final String SUCCESS="success";

    /**
     * Spring MVC 会按请求参数名和 POJO 属性名进行自动匹配，
     * 自动为该对象填充属性值。支持级联属性。
     * 如：address.province、address.city等。
     */
    @RequestMapping("/testPojo")
    public String testPojo(User user) {
        System.out.println("testPojo: " + user);
        return SUCCESS;
    }
}
