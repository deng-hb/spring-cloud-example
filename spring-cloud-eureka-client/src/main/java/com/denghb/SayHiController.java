package com.denghb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiController {

    @GetMapping("/sayHi")
    public String sayHi(@RequestParam(value = "name", required = false) String name) {
        return "Hi, " + name;
    }
}
