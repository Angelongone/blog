package com.example.demo.Controller;

import com.example.demo.bean.Blogs;
import com.example.demo.bean.Tags;
import com.example.demo.bean.Types;
import com.example.demo.mapper.TagMapper;
import com.example.demo.mapper.TypeMapper;
import com.example.demo.mapper.UsersMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CreateBlog {

    @Resource
    UsersMapper usersMapper;

    @Resource
    TypeMapper typeMapper;

    @Resource
    TagMapper tagMapper;


    @RequestMapping("/blog")
    public String publishBlog(@RequestParam(value = "title") String blogname,
                              @RequestParam(value = "content") String blogtext,
                              @RequestParam(value = "type") int typeid,
                              @RequestParam(value = "tag") int tagid,
                              Model model){
        model.addAttribute("blogtext",blogtext);
        usersMapper.publishBlog(blogname,blogtext,typeid,tagid,1,1);
        return "blog";
    }

    /**
     * 首页显示博客列表
     * @param model
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping("/index")
    public String indxe(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<Blogs> allBlog = usersMapper.getAllBlog();
        List<Tags> allTag = tagMapper.getAllTag();
        List<Types> allType = typeMapper.getAllType();
        model.addAttribute("blogs",allBlog);
        model.addAttribute("type",allType);
        model.addAttribute("tag",allTag);
        return "index";
    }

    /**
     * 首页点击博客查看博客内容
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/vblog/{id}")
    public String vBlog(@PathVariable("id") Long id,Model model){
        String blogText = usersMapper.getBlogText(id);
        model.addAttribute("blogtext",blogText);
        return "blog";
    }

}
