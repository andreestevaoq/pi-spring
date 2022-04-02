package com.site.pi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contatos")
public class contatosController {
    @GetMapping
    public String contatos(){
        return "contatos";
    }    
}
