package com.sjna0730.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg") //어노테이션으로 URL 매핑을 해준다. reg.html에서 보내는 post 를 받는 역할을 한다.
public class NoticeReg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
				
		PrintWriter out = response.getWriter();
		
		String title = request.getParameter("title"); //reg.html에 title에 해당하는것을 받아온다.
		String content = request.getParameter("content");
		
		out.println(title); //받아온 title을 출력해준다 밑의 content도 마찬가지
		out.println(content);
	}
}
