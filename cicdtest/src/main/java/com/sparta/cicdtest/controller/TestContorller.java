package com.sparta.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorller {

    @GetMapping("/")
    public String getTest() {
        return "vvvCI/CD 테스트 중입saddsa니다. 제발 adsdasddasdads되라 ㅠㅠㅠdddddfsddsffsd";
    }
}
