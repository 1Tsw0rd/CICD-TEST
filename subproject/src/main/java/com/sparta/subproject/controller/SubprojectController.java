package com.sparta.subproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubprojectController {

    @GetMapping("/")
    public String startTest(){
        return "subproject cicd test 해보자ㄱㄱㄱㄱㄱ!! 다중 CI/CD 가보자!!!!";
    }

}
