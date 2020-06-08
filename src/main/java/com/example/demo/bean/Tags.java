package com.example.demo.bean;

public class Tags {
    private int tagid;
    private String tagname;

    private Types types;
    private Blogs blogs;

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public Blogs getBlogs() {
        return blogs;
    }

    public void setBlogs(Blogs blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "tagid=" + tagid +
                ", tagname='" + tagname + '\'' +
                ", types=" + types +
                ", blogs=" + blogs +
                '}';
    }
}
