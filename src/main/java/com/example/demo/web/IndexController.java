package com.example.demo.web;

import com.example.demo.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
//        int i = 9/0;
//        String blog = null;
//        if (blog == null){
//            throw new NotFoundException("博客资源找不到！");
//        }
        return "index";
    }
}
