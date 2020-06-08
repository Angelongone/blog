package com.example.demo.bean;

public class Types {
    private int typeid;
    private String typename;
    private int tagid;

    private Tags tags;
    private Blogs blogs;

    @Override
    public String toString() {
        return "Types{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                ", tagid=" + tagid +
                ", tags=" + tags +
                ", blogs=" + blogs +
                '}';
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Blogs getBlogs() {
        return blogs;
    }

    public void setBlogs(Blogs blogs) {
        this.blogs = blogs;
    }
}
