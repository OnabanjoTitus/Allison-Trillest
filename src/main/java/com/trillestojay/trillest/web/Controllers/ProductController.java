package com.trillestojay.trillest.web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping")
public class ProductController {
    @GetMapping("")
    public String testConnection(){
        return "index";
    }
    @GetMapping("/shop")
    public String testConnections(){
        return "shops";
    }
}
