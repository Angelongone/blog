package com.example.demo.mapper;

import com.example.demo.bean.Types;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {

//    获取所有的类型
    List<Types> getAllType();

//    添加类型
    void addType(String typename);

//    删除类型
    void deleteType(int id);
}
