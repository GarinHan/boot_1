package com.garin.boot_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    public static void main(String[] args) {
        System.out.println(11);
    }

    @GetMapping("/a")
    public String getString(String a){
        return "aaa_"+ a;
    }
}
