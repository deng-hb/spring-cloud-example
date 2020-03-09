package com.denghb.service;

import org.springframework.stereotype.Component;

@Component
public class SayHiServiceFallback implements SayHiService {
    @Override
    public String sayHi(String name) {
        return null;
    }
}
