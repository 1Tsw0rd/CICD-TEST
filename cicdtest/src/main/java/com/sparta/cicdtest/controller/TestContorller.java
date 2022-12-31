package com.sparta.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorller {

    @GetMapping("/")
    public String getTest() {
        return "vvvCI/CD 테스트 중입니다. 제발 되라 ㅠㅠㅠddddd";
    }
}
