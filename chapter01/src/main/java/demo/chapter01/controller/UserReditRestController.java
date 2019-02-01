package demo.chapter01.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ResponseBody + @Controller
 */
@RestController
public class UserReditRestController {

    @RequestMapping("/usercredit/{id}")
    public String getCreditLevel(@PathVariable String id) {
        return 3 + " id=" + id;
    }
}
