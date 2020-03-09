package com.denghb.controller;

import com.denghb.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSayHiController {

    @Autowired
    private SayHiService sayHiService;

    @GetMapping("/say")
    public String say(@RequestParam(value = "name", required = false) String name) {

        return sayHiService.sayHi(name);
    }
}
