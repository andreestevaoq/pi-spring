package com.site.pi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class produtosController {
    @GetMapping
    public String produtos(){
        return "produtos";

    }


    
}
