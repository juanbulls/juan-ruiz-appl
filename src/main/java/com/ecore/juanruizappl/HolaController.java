package com.ecore.juanruizappl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    
    @RequestMapping("/hola")
    public String hola() {
        return "hola lolas";
    }
}
