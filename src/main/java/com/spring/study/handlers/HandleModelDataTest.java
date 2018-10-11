package com.spring.study.handlers;

import com.spring.study.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * HandleModelDataTest class
 *
 * @author Administrator
 * @date 2018/10/11
 */
@RequestMapping("/handleModelDataTest")
@Controller
public class HandleModelDataTest {
    public static final String SUCCESS="success";

    /**
     * 目标方法的返回值可以是 ModelAndView 类型。
     * 其中可以包含视图和模型信息
     * SpringMVC 会把 ModelAndView的model中数据放入到 request 域对象中.
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        String viewName = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(viewName);

        //添加模型数据到 ModelAndView 中.
        modelAndView.addObject("time", new Date());

        return modelAndView;
    }

    /**
     * 目标方法可以添加 Map 类型(实际上也可以是 Model 类型或 ModelMap 类型)的参数.
     * 把map的键的类型作为目标方法的返回类型，在前台即可通过${requestScope.names }
     * 获取值
     * @param map
     * @return
     */
    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map){
        System.out.println(map.getClass().getName());
        map.put("names", Arrays.asList("Tom", "Jerry", "Mike"));
        return SUCCESS;
    }

    /**
     * @SessionAttributes 除了可以通过属性名指定需要放到会话中的
     * 属性外(实际上使用的是 value 属性值),
     * 还可以通过模型属性的对象类型指定哪些模型属性需要放到
     * 会话中(实际上使用的是 types 属性值)
     *
     * 注意: 该注解只能放在类的上面. 而不能修饰放方法.
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String, Object> map){
        User user = new User("Tom", "123456", "shenzhen", 15);
        map.put("user", user);
        map.put("school", "shenzhen");
        return SUCCESS;
    }

    /**
     * 1. 有 @ModelAttribute 标记的方法, 会在每个目标方法执行之前被 SpringMVC 调用!
     * 2. @ModelAttribute 注解也可以来修饰目标方法 POJO 类型的入参, 其 value 属性值有如下的作用:
     * 1). SpringMVC 会使用 value 属性值在 implicitModel 中查找对应的对象, 若存在则会直接传入到目标方法的入参中.
     * 2). SpringMVC 会一 value 为 key, POJO 类型的对象为 value, 存入到 request 中.
     */
    @ModelAttribute
    public void getUser(@RequestParam(value="id",required=false) Integer id,
                        Map<String, Object> map){
        System.out.println("modelAttribute method");
        if(id != null){
            //模拟从数据库中获取对象
            User user = new User("Tom", "123456", "666qq.com", 12);
            System.out.println("从数据库中获取一个对象: " + user);

            map.put("user", user);
        }
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("修改: " + user);
        return SUCCESS;
    }
}
