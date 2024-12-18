package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    // 환경변수를 받아와 코드에 출력
    @Value("${MY_ACCOUNT:default}")
    private String myAccount;
    @Value("${MY_PASSWORD:default}")
    private String myPassword;

    @GetMapping("/")
    public String home() {
        return "Version 1.0";
    }

    @GetMapping("/info")
    public String info() {
        return "MyAccount: " + myAccount + ", MyPassword: " + myPassword;
    }
}
