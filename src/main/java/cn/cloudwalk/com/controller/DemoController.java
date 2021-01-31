package cn.cloudwalk.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class DemoController {

    @RequestMapping("/demo")
    public String demo() {
        return "hello jenkins";
    }
}
