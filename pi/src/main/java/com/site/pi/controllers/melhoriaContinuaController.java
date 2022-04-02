package com.site.pi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/melhoria_continua")
public class melhoriaContinuaController {
    @GetMapping
    public String melhoria_continua() {
        return "melhoria_continua";
    }

}
