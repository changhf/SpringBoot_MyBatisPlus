**项目结构** 
```
wstro
├──sql  项目SQL语句
│ 
├──App 项目启动类
│
├──config 配置信息
│
├──controller 控制器
│  ├─admin 后台管理员控制器
│ 
├──service 业务逻辑接口
│  ├─impl 业务逻辑接口实现类
│
├──dao 数据访问接口
│
├──entity 数据持久化实体类
│
├──datasources 多数据源工具类
│
├──shiro Shiro验证框架
│ 
├──task Quartz定时任务
│ 
├──util 项目所用的的所有工具类
│  ├─FreeMarker 自定义FreeMarker标签
│  
├──resources 
│  ├─mapper SQL对应的XML文件
│  ├─templates FreeMarker模版
│  
├──webapp
│  ├─statics 静态资源
│  ├─upload 上传文件
│  ├─WEB-INF
│	├─templates 页面FreeMarker模版

```
<br> 


**技术选型：** 
- 核心框架：Spring Boot 1.5.1
- 安全框架：Apache Shiro
- 视图框架：Spring MVC
- 持久层框架：MyBatis MyBatisPlus
- 缓存技术：EhCache,Redis
- 定时器：Quartz
- 数据库连接池：Druid
- 日志管理：SLF4J、Log4j
- 模版技术：FreeMarker
- 页面交互：BootStrap、Layer等
<br> 


 **本地部署**
- 通过git下载源码
- 创建数据库wstro，数据库编码为UTF-8
- 执行sql/wstro.sql文件，初始化数据
- 修改application-dev.properties，更新MySQL账号和密码

- 修改application-dev.properties,更改Redis连接信息
- 如果不想要Redis服务,注解掉RedisConfig.java	的 @Configuration注解

- Eclipse、IDEA运行App.java，则可启动项目
- 项目访问路径：http://localhost:8080/admin/login.html
- 账号密码：admin/admin



数据库文件: /sql/wstro.sql  直接运行mysql
   			更改配置文件application-*.properties的数据库连接信息
			spring.datasource.url
			spring.datasource.username
			spring.datasource.password
			
项目整合了多数据源,注解方法  @DataSource(这里写数据源名称) 如 DataSourceContextHolder.DATA_SOURCE_B 建议数据源名称都定义在此类中，方便维护
多数据源需要自己去开启，具体在DataSourceConfig.java
						


部署:application.properties更改指定部署模式还是开发模式 dev / prod  
        分别对应application-dev.properties  /  application-prod.properties


	修改dev / prod 文件 
		SEO:
			seo.author 作者
			seo.keywords 关键词
			seo.description 网页描述  (如果是中文，请进行Unicode转码  http://tool.chinaz.com/tools/unicode.aspx)
		
		server.port 服务端口  (部署在Tomcat上以Tomcat为准)
		server.contextPath 服务器上下文路径 (部署在Tomcat上以Tomcat为准)
		
		spring.mail 设置邮件的端口 账号及密码
		
		spring.redis 设置Redis 服务器地址 密码 及端口
		
		spring.datasource.url 设置数据库连接信息  账号(username) 及 密码(password)
