package demo.chapter01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller Spring MVC注解, 表示此类用于负责处理Web请求
 * @RequestMapping Spring MVC注解, 表示如果请求路径匹配, 被注解的方法会被调用
 * @ResponseBody 表示此方法返回的是文本而不是视图名称
 */
@RestController
public class HelloworldController {

    @RequestMapping("say")
    public String say() {
        return "say";
    }

    @RequestMapping("sayHello")
    public String sayHello() {
        return "say hello";
    }

    @RequestMapping("sayNihao")
    public String sayNihao() {
        return "say nihao";
    }

    @RequestMapping("sayHelloworld")
    public String sayHelloworld() {
        return "say hello world";
    }
}
