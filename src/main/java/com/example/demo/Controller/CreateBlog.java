package com.example.demo.Controller;

import com.example.demo.bean.Blogs;
import com.example.demo.mapper.UsersMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CreateBlog {

    @Resource
    UsersMapper usersMapper;

    @RequestMapping("blog")
    public String publishBlog(@RequestParam(value = "title") String blogname,
                              @RequestParam(value = "content") String blogtext,
                              @RequestParam(value = "type") String typeid,
                              @RequestParam(value = "tag") String tagid,
                              Model model){
        model.addAttribute("blogtext",blogtext);
        usersMapper.publishBlog(blogname,blogtext,typeid,tagid,1,1);
        return "blog";
    }

    @RequestMapping("/in")
    public String indxe(Model model){
        List<Blogs> allBlog = usersMapper.getAllBlog();
        String blogname = allBlog.get(2).getBlogname();
        String blogtext = allBlog.get(2).getBlogtext();
        model.addAttribute("blogname",blogname);
        model.addAttribute("blogtext",blogtext);
        return "index";
    }
}
