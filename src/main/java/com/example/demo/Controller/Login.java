package com.example.demo.Controller;

import com.example.demo.bean.Users;
import com.example.demo.mapper.UsersMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class Login {
    @Resource
    UsersMapper usersMapper;

    @RequestMapping("/l")
    @ResponseBody
    public List<Users> getAllUser(){
        return usersMapper.getAllUser();
    }

    @RequestMapping("/get")
    public String getPassword(@RequestParam(value = "username") String username,
                            @RequestParam(value = "password") String password,
                            HttpServletResponse response,
                            HttpServletRequest request,
                            Model model) throws IOException {
        Users password1 = usersMapper.getPassword(username, password);
        if(password1 != null){
            String user = password1.getUsername();
            String pass = password1.getPassword();
            if (username.equals(user) && password.equals(pass)){
                System.out.println("id = " + password1.getUserid());
                HttpSession session = request.getSession();
                session.setAttribute("userid",password1.getUserid());
                session.setAttribute("username",user);
                session.setAttribute("password",pass);
                return "index";
            }else{
                model.addAttribute("usernull","密码错误");
                return "login";
            }
        }else{
            model.addAttribute("usernull","用户名不存在");
            return "login";
        }
    }

    @RequestMapping("/t")
    public String temp(){
        return "/admin/blogs-input";
    }

}
