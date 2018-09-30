package com.monetto.controller;

import com.monetto.spring.Controller;
import com.monetto.spring.RequestMapping;
import com.monetto.spring.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/index.do")
    public String index() {
        System.out.println("This is Common HandlerMapping");
        return "v";
    }

    @ResponseBody
    @RequestMapping("/index2.do")
    public String index2(String param) {
        System.out.println("This is ResponseBody HandlerMapping");
        return "ResponseBody:"+param;
    }

}
