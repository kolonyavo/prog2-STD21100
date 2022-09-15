package com.final_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinalProjectController {
    @GetMapping("/")
    public String method(){
        return "Management of members of private lessons";
    }
}
