package com.runoob.test;

//�������� java ��
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

//��չ HttpServlet ��
public class ShowError extends HttpServlet {

	// ���� GET ��������ķ���
	public void doGet(HttpServletRequest request,
	                 HttpServletResponse response)
	         throws ServletException, IOException
	{
	   // ���ô�������ԭ��
	   response.sendError(403, "Forbidden!!!" );
	}
	// ���� POST ��������ķ���
	public void doPost(HttpServletRequest request,
	                  HttpServletResponse response)
	   throws ServletException, IOException {
	  doGet(request, response);
	}
}