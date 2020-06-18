package com.example.demo.Controller;

import com.example.demo.bean.Blogs;
import com.example.demo.bean.Types;
import com.example.demo.bean.Users;
import com.example.demo.mapper.TypeMapper;
import com.example.demo.mapper.UsersMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Type {

    @Resource
    TypeMapper typeMapper;
    @Resource
    UsersMapper usersMapper;


    @RequestMapping("/getAllType")
    public String getAll(Model model){
        List<Types> allType = typeMapper.getAllType();
        ArrayList<Blogs> allBlog = usersMapper.getAllBlog();
        model.addAttribute("type",allType);
        model.addAttribute("blogs",allBlog);
        for (int i = 0; i < allType.size() && allType != null; i++){
            System.out.println(allType.get(i).getTypename());
        }
        return "type" ;
    }

    @RequestMapping("/addType")
    public void addType(@RequestParam(value = "typename") String typename,
                        Model model,
                        HttpServletResponse resp) throws IOException {
        System.out.println(typename);
        typeMapper.addType(typename);
        resp.sendRedirect("/getAllType");
    }

    @RequestMapping("/deleteType/{id}")
    public void deleteType(@PathVariable("id") int id,
                           HttpServletResponse resp) throws IOException {
        typeMapper.deleteType(id);
        resp.sendRedirect("/getAllType");
    }

}
