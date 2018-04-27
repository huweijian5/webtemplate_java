package com.gosuncn.sdas.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String test(String content){
        return "hello:"+content;
    }
}
