package com.sparta.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorller {

    @GetMapping("/")
    public String getTest() {
        return "cicdtest main CI/CD 테스트 중입니다. 가자!!!!!!!! 하위프로젝트 컨트롤 ㄱㄱㄱ 가자!!!";
    }
}
