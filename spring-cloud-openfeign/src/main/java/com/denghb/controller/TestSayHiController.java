package com.denghb.controller;

import com.denghb.service.SayHiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestSayHiController {

    @Autowired
    private SayHiService sayHiService;

    @GetMapping("/say")
    public String say(@RequestParam(value = "name", required = false) String name) {
        log.info("say:{}", name);
        return sayHiService.sayHi(name);
    }
}
