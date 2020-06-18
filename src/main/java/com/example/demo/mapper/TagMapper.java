package com.example.demo.mapper;

import com.example.demo.bean.Tags;
import com.example.demo.bean.Types;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagMapper {

//    获取所有的类型
    List<Tags> getAllTag();

//    添加类型
    void addTag(String tagname);

//    删除类型
    void deleteTag(int id);
}
