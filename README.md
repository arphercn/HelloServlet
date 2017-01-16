#### [Servlet 教程](http://www.runoob.com/servlet/servlet-tutorial.html) 
#### 1.1 表单数据1
#### 1.2 表单数据2
1.2.1 web.xml在WEB-INF目录下,当有HelloForm字样的servelet-name存在时,代表项目中已经有此
servelet,通过eclipse新建servelet时,会提示不能新建重复的servelet  
1.2.2 web.xml里格式比较严格,如下  

	<servlet>
		<servlet-name>HelloForm</servlet-name>
		<servlet-class>hello.HelloForm</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>HelloForm</servlet-name>
		<url-pattern>/Hello/HelloForm</url-pattern>
	</servlet-mapping>
1.2.3 html文件在WebContent目录下  
#### 2 客户端HTTP请求
servlet端可以获取HTTP请求的信息  
#### 2.2 服务器 HTTP 响应
可以设置返回header头信息和内容,如 自动刷新,显示时间  
#### 2.3 HTTP 状态码
可以设置返回状态码  
#### 2.4 编写过滤器
可以在eclipse的console打印所以请求的消息,可以记录日记, 拦截请求,处理响应  
#### 3.1 异常处理 
制作404等异常页面  
#### 3.2 Cookie 处理   
通过http://localhost:8080/HelloServlet/TomcatTest/test.html里提交表单发送Cookie,
模拟登陆,服务端返回Cookie  
#### 3.3 Session 跟踪     
在页面可以打印 服务端返回的 session.getId(),服务端可以通过session.isNew()
判断客户端是否不知道session或不参与session,返回持续保存的访问次数
#### 3.4 数据库访问
eclipse运行时,mysql驱动包放到tomcat的lib目录下  
调试时,遇到端口8009等占用,`netstat -aon | findstr "8009"`后,关闭端口可OK  
##### 文件上传,调试时暂不成功,其他的功能大体过了一遍,完结撒花...



