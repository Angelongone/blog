# Springboot开发blog笔记

## 使用Servlet

1. 目录下新建文件

   ![](/home/angleong/myfile/IdeaProjects/blog/note/image/servlet1.png)

   * 一定要用@WebServlet(urlPatterns = "/se")注解

2. 在启动类上添加注解 @ServletComponentScan(basePackages = "内路径")

   ![](/home/angleong/myfile/IdeaProjects/blog/note/image/servlet2.png)

   