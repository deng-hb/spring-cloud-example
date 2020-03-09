package com.denghb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client", fallback = SayHiServiceFallback.class)
public interface SayHiService {

    @GetMapping(value = "/sayHi")
    String sayHi(@RequestParam(value = "name", required = false) String name);
}
