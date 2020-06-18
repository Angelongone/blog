package com.example.demo.Controller;

import com.example.demo.bean.Blogs;
import com.example.demo.bean.Types;
import com.example.demo.mapper.TypeMapper;
import com.example.demo.mapper.UsersMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Temp {

    @Resource
    UsersMapper usersMapper;


    @RequestMapping("/text")
    public String temp(@RequestParam(value = "content") String text,
                       Model model,
                       HttpServletResponse response,
                       HttpServletRequest request){
        System.out.println(text);
        request.setAttribute("text",text);
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

    @RequestMapping("/vblog1")
    public void blo(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        String blogtext = request.getParameter("blogtext");
            session.setAttribute("blogtext",blogtext);
            System.out.println(blogtext);
    }

    @RequestMapping("/blogv")
    public String blogtemp(){
        return "blog";
    }

    @RequestMapping("/path/{id}")
    public String path(@PathVariable("id") int id){
        System.out.println("获取的值为：" + id);
        return "index";
    }

    @RequestMapping("/input")
    public String inputb(){
        return "admin/blogs-input";
    }



}
