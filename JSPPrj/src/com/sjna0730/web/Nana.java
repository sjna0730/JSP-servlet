package com.sjna0730.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi") //어노테이션으로 URL 매핑을 해준다. 이로써 web.xml에 survlet 매핑 선언을 안해도 된다..
public class Nana extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		
		for(int i=0; i<cnt; i++)
			out.println((i+1)+": 안녕 ~servlet<br>");
		
	}
}
