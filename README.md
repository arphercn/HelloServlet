#### [Servlet 教程](http://www.runoob.com/servlet/servlet-tutorial.html) 
1.1 表单数据1  
1.2 表单数据2  
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
2 客户端HTTP请求  
servlet端可以获取HTTP请求的信息  
2.2 服务器 HTTP 响应  
可以设置返回header头信息和内容,如 自动刷新,显示时间  
2.3 HTTP 状态码  
可以设置返回状态码
2.4 编写过滤器  
可以在eclise的console打印所以请求的消息,可以记录日记, 拦截请求,处理响应  

