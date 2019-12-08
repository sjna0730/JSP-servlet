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
		
		String cnt_ = request.getParameter("cnt"); //cnt_라는 임시변수를 만들고 클라이언트가 어떤값을 주는지에 따라 달라진다.
		int cnt = 100; //기본값 100
		if(cnt_ != null && !cnt_.equals("")) //만약 전달받는 값이 null이 아니면서 "" 빈 문자열이 아닌경우
			cnt = Integer.parseInt(cnt_); //cnt_에 값을 받아온다.
		
		for(int i=0; i<cnt; i++)
			out.println((i+1)+": 안녕 ~servlet<br>");
		
	}
}
