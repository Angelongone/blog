#  Blog博客项目开发

## 一、概要

## 二、需求分析

## 三、概要设计

## 四、详细设计

### 数据库设计r

> 数据库名称：blog
>
> 相关表名称：t_user，

#### 用户表：t_user

| 字段名   | 数据类型    | 字段要求     |
| -------- | ----------- | ------------ |
| userid   | int         | 主键，自增长 |
| username | varchar(20) | 唯一，不为空 |
| password | varchar(20) | 不为空       |
| email    | varchar(20) | 不为空       |
| qq       | varchar(20) | 不为空       |
| aboutme  | text        | 可以为空     |
| headimg  | longblob    | 可以为空     |

```mysql
/* 创建数据库*/
create table t_user(
userid int primary key auto_increment,
username varchar(20) unique not null,
password varchar(20) not null,
email varchar(20) not null,
qq varchar(20) not null,
aboutme text ,
headimg longblob);

/*插入数据*/
insert into t_user(username,password,email,qq) values("Angelong","123","123456.@qq.com","26918279899");

```



#### 分类表: t_type

| 字段名   | 数据类型    | 字段要求     |
| -------- | ----------- | ------------ |
| typeid   | int         | 主键，自增长 |
| typename | varchar(20) | 唯一，不为空 |
| tagid    | int         | 不为空       |

#### 标签表：t_tag

| 字段名  | 数据类型    | 字段要求     |
| ------- | ----------- | ------------ |
| tagid   | int         | 主键，自增长 |
| tagname | varchar(20) | 唯一，不为空 |

#### 博客表：t_blog

| 字段名     | 数据类型    | 字段要求     |
| ---------- | ----------- | ------------ |
| blogid     | int         | 主键，自增长 |
| blogname   | varchar(20) | 不为空       |
| blogtext   | longtext    | 不为空       |
| blogtype   | int         | 不为空       |
| blogtag    | int         | 不为空       |
| createtime | timestamp   | null         |
| bloguser   | int         | 不为空       |
| publish    | int         | 不为空       |
|            |             |              |



用户个人表：u_用户名称

| 字段名  | 数据类型 | 字段要求     |
| ------- | -------- | ------------ |
| uid     | int      | 主键，自增长 |
| utypeid | int      | 不为空       |
| utagid  | int      | 不为空       |
| ublogid | int      | 不为空       |



