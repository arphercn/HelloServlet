#### [Servlet �̳�](http://www.runoob.com/servlet/servlet-tutorial.html) 
#### 1.1 ������1
#### 1.2 ������2
1.2.1 web.xml��WEB-INFĿ¼��,����HelloForm������servelet-name����ʱ,������Ŀ���Ѿ��д�
servelet,ͨ��eclipse�½�serveletʱ,����ʾ�����½��ظ���servelet  
1.2.2 web.xml���ʽ�Ƚ��ϸ�,����  

	<servlet>
		<servlet-name>HelloForm</servlet-name>
		<servlet-class>hello.HelloForm</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>HelloForm</servlet-name>
		<url-pattern>/Hello/HelloForm</url-pattern>
	</servlet-mapping>
1.2.3 html�ļ���WebContentĿ¼��  
#### 2 �ͻ���HTTP����
servlet�˿��Ի�ȡHTTP�������Ϣ  
#### 2.2 ������ HTTP ��Ӧ
�������÷���headerͷ��Ϣ������,�� �Զ�ˢ��,��ʾʱ��  
#### 2.3 HTTP ״̬��
�������÷���״̬��  
#### 2.4 ��д������
������eclipse��console��ӡ�����������Ϣ,���Լ�¼�ռ�, ��������,������Ӧ  
#### 3.1 �쳣���� 
����404���쳣ҳ��  
#### 3.2 Cookie ����   
ͨ��http://localhost:8080/HelloServlet/TomcatTest/test.html���ύ������Cookie,
ģ���½,����˷���Cookie  
#### 3.3 Session ����     
��ҳ����Դ�ӡ ����˷��ص� session.getId(),����˿���ͨ��session.isNew()
�жϿͻ����Ƿ�֪��session�򲻲���session,���س�������ķ��ʴ���
#### 3.4 ���ݿ����
eclipse����ʱ,mysql�������ŵ�tomcat��libĿ¼��  
����ʱ,�����˿�8009��ռ��,`netstat -aon | findstr "8009"`��,�رն˿ڿ�OK  
##### �ļ��ϴ�,����ʱ�ݲ��ɹ�,�����Ĺ��ܴ������һ��,�������...



