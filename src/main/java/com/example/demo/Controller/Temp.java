package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class Temp {

    @RequestMapping("/text")
    public String temp(@RequestParam(value = "content") String text,
                     Model model,
                     HttpServletResponse response){
        System.out.println(text);
        model.addAttribute("text",text);
        return "blog";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/b")
    public String tem(){
        return "/admin/blogs-input";
    }
}
