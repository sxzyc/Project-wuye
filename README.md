# Project-wuye—— 27766738726
# 介绍
基于JavaEE小区物业管理系统，项目采用MVC模式结合SSM框架进行实现，前端页面使用Bootstrap进行实现。
## 功能
### 用户端
 - (1)业主信息查询 
 - (2)房产信息查询
 - (3)公告查询管理 
 - (4)收费管理
 - (5)报修管理
 - (6)修改用户密码
### 物业端
 - (1)管理员信息管理，包括对管理员的增加、删除 、修改等
 - (2)完善的用户信息，包括用户信息的录入、查询、修改等
 - (3)房产信息管理，包括房产信息的录入、查询、修改等。
 - (4)公告信息管理，包括公告信息的录入、查询、修改等。
 - (5)报修管理，包括用户报修信息的录入、查询、修改等。
 - (6)保安清洁，包括保安和清洁人员信息的录入、查询、修改等。

本系统的使用者分为用户（业主）和管理员（物业）两类，根据使用者不同，将有不同的主页，对应不同的功能权限。将本系统分为用户子系统和管理员子系统。
在用户子系统中，使用者通过账号密码（用户）登入系统，进入主页，通过主页链接，进入小区公告，业主信息查询，房产信息，收费管理，系统功能五个功能模块，在模块内可以完成报修，查看公告，查询房产相关信息，查询业主信息，查询缴费信息，修改密码，退出系统功能等。
在管理员子系统中，使用者通过帐号密码（管理员）登入系统，进入主页，通过主页链接进入管理员信息管理，物业管理，报修管理，保安保洁，公告管理，收费管理，系统功能七个功能模块：在管理员信息管理中可以对管理员使用者的信息进行管理；在物业管理模块中，可以对房产信息和业主信息进行管理；在报修管理中，可以查看报修记录并安排维修人员；在保安保洁模块中，可以对保安保洁模块中，可以对保安或保洁员的工作进行安排和记录；在公告管理模块中，可以发布公告，查看历史公告；在系统功能模块中可以进行密码管理和退出系统
### 运行环境
 - jdk： 建议1.8以上。
 - tomcat： 8.5版本（9以上有js文件乱码的现象，，还没搞明白什么情况0.0）
 - 编写环境：Eclipse
 - 数据库：Mysql
### 程序设置
 - 配置mysql数据库链接信息
  ![说明](https://tva1.sinaimg.cn/large/005RH3Rxgy1gi3zeu1ye4j31b40hoaby.jpg)
 ### 部署说明
- `conf.xml`是MyBatis核心配置文件，所有SQL语句统一放在`userMapper.xml`。（SQL语句不涉及多表查询）
  ![说明](https://tva1.sinaimg.cn/large/005RH3Rxgy1gi3zfkkvngj31dw0f4acx.jpg)
  ![说明](https://tvax1.sinaimg.cn/large/005RH3Rxgy1gi3ziie125j31gx0i542d.jpg)
 ### 截图赏析
 ![登录](https://tvax1.sinaimg.cn/large/005RH3Rxgy1gi3z8xpluhj31gn0pee81.jpg)
 ![首页](https://tva1.sinaimg.cn/large/005RH3Rxgy1gi3zkwdx3pj31h10pstae.jpg)
 ![管理](https://tvax1.sinaimg.cn/large/005RH3Rxgy1gi3zmdromzj31go0ow77d.jpg)

