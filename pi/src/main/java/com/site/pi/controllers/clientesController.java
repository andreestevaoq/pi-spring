package com.site.pi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/clientes_e_fornecedores")
public class clientesController {
    @GetMapping
    public String clientes_e_fornecedores(){
        return "clientes_e_fornecedores";
    }
    
}
