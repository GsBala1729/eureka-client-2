package com.tekb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("appb")
public class MyRestController {

    @GetMapping("/testb")
    public String dummy(){
        System.out.println("I am application B");
        return "I am application B";
    }
}
