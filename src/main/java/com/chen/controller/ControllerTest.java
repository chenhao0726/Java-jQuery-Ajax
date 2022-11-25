package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {

    @RequestMapping("/test")
    @ResponseBody
    public String TestOne() {
        return "111测试测试测试";
    }
}
