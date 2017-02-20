package com.denghb.spring.cloud.controller;

import com.denghb.spring.cloud.exception.JsonException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${com.denghb.title}")
    private String title;

    @Value("${com.denghb.random.number}")
    private String rNumber;
    @Value("${com.denghb.random.value}")
    private String rValue;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World<br/>" + title + "<br/>" + rNumber + "<br/>" + rValue;
    }

    @RequestMapping("/hello")// "/error"内部保留
    public String hello(Model model) {
        model.addAttribute("message","你好denghb");
        return "hello";
    }

    @RequestMapping("/error1")// "/error"内部保留
    public String error1() throws Exception {
        throw new Exception("error1");
    }

    @RequestMapping("/json-error")
    @ResponseBody
    public String jsonError() throws JsonException {
        throw new JsonException("sada");
    }
}