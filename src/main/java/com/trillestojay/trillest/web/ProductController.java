package com.trillestojay.trillest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v1")
public class ProductController {
    @GetMapping("")
    public String testConnection(){
        return "index";
    }
    @PostMapping("")
    public String testConnections(){
        return "We are On post";
    }
}
