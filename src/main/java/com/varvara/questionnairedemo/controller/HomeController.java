package com.varvara.questionnairedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/news")
    public String showNewsPage(){
        return "news_page.html";
    }

    @GetMapping("/contacts")
    public String showContacts(){
        return "contact_page.html";
    }

    @GetMapping("/courses")
    public String showCourses(){
        return "courses_page.html";
    }

}
