package com.wy.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/helloworld")
    public String Helloworld(){
        return "Hello world";
    }
}
