package com.site.pi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sobre_nos")
public class sobreNosController {
    @GetMapping
    public String sobre_nos(){
        return "sobre_nos";
    }
}
