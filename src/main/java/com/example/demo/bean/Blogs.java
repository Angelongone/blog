package com.example.demo.bean;

import java.util.Date;

public class Blogs {
    private int blogid;
    private String blogname;
    private String blogtext;
    private int typeid;
    private int tagid;
    private int userid;
    private Date createtime;
    private int publish;

    private Types types;
    private Tags tags;

    public int getBlogid() {
        return blogid;
    }

    public void setBlogid(int blogid) {
        this.blogid = blogid;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public String getBlogtext() {
        return blogtext;
    }

    public void setBlogtext(String blogtext) {
        this.blogtext = blogtext;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Blogs{" +
                "blogid=" + blogid +
                ", blogname='" + blogname + '\'' +
                ", blogtext='" + blogtext + '\'' +
                ", typeid=" + typeid +
                ", tagid=" + tagid +
                ", userid=" + userid +
                ", createtime=" + createtime +
                ", publish=" + publish +
                ", types=" + types +
                ", tags=" + tags +
                '}';
    }
}
