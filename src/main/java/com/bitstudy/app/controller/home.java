package com.bitstudy.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class home {
    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }
}
