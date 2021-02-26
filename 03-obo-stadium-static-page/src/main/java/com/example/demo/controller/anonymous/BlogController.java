package com.example.demo.controller.anonymous;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/tin-tuc")
    public String getNewsPage(Model model){
        return "shop/news";
    }
}
