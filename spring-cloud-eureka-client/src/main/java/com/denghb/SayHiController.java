package com.denghb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SayHiController {

    @GetMapping("/sayHi")
    public String sayHi(@RequestParam(value = "name", required = false) String name) {
        String say = "Hi, " + name;
        log.info("say:{}", say);
        return say;
    }
}
