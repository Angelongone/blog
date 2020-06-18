package com.example.demo.Controller;

import com.example.demo.bean.Tags;
import com.example.demo.bean.Types;
import com.example.demo.mapper.TagMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class tag {

    @Resource
    TagMapper tagMapper;

//    获取所有
    @RequestMapping("/getAllTag")
    public String getAllTag(Model model){
        List<Tags> allTag = tagMapper.getAllTag();
        model.addAttribute("tag",allTag);
        return "tag";
    }

//    添加标签
    @RequestMapping("/addTag")
    public void addTag(String tagname, HttpServletResponse resp) throws IOException {
        tagMapper.addTag(tagname);
        resp.sendRedirect("/getAllTag");
    }

//    删除标签
    @RequestMapping("/deleteTag/{id}")
    public void deleteTag(@PathVariable("id") int id,
                          HttpServletResponse resp) throws IOException {
        tagMapper.deleteTag(id);
        resp.sendRedirect("/getAllTag");
    }
}
