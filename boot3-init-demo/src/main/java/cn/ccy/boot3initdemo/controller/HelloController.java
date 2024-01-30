package cn.ccy.boot3initdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
// ||
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){

        return "Hello,Spring Boot 3!";
    }

}
