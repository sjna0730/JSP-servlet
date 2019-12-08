package com.sjna0730.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg") //������̼����� URL ������ ���ش�. reg.html���� ������ post �� �޴� ������ �Ѵ�.
public class NoticeReg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
				
		PrintWriter out = response.getWriter();
		
		String title = request.getParameter("title"); //reg.html�� title�� �ش��ϴ°��� �޾ƿ´�.
		String content = request.getParameter("content");
		
		out.println(title); //�޾ƿ� title�� ������ش� ���� content�� ��������
		out.println(content);
	}
}
