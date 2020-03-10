package com.denghb.service;

import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client", fallback = SayHiServiceFallback.class)
//fallbackFactory = FeignClientFallbackFactory.class)
public interface SayHiService {

    @GetMapping(value = "/sayHi")
    String sayHi(@RequestParam(value = "name", required = false) String name);

}

@Component
class FeignClientFallbackFactory implements FallbackFactory<SayHiService> {
    @Override
    public SayHiService create(Throwable throwable) {
        return new SayHiService() {
            @Override
            public String sayHi(String name) {
                return "error";
            }
        };
    }
}

@Component
class SayHiServiceFallback implements SayHiService {

    @Override
    public String sayHi(String name) {
        return "error";
    }
}