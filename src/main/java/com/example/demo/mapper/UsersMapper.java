package com.example.demo.mapper;

import com.example.demo.bean.Blogs;
import com.example.demo.bean.Users;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UsersMapper {
    List<Users> getAllUser();

//    登录
    Users getPassword(String username,String password);

//    博客发表
    void publishBlog(String blogname,String blogtext,String typeid,String tagid,int userid,int publish);

//    博客列表
    ArrayList<Blogs> getAllBlog();

//    通过id查询博客内容
    String getBlogText(Long id);
}
