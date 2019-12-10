package com.sjna0730.web; //페키지에 생성시 클래스가 아니라 servlet으로 만들었다는 점

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add") //add.html의 서블릿을 해준다는 의미
public class Add extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); //한글화
		
		String x_ = request.getParameter("x"); //add.html에서 x값을 받아올때 x_라는 곳에 받는다.
		String y_ = request.getParameter("y");
		int x = 0; //x는 아무것도 적지 않으면 0으로 간주한다.
		int y = 0;
		if(!x_.equals("")) x = Integer.parseInt(x_); //x_가 "" 즉 빈공간으로 오지않는경우 x_를 Int형으로 바꿔준다.
		if(!y_.equals("")) y = Integer.parseInt(y_);
		
		int result = x+y;
		
		response.getWriter().printf("result is %d\n",  result); //사용자에게 문자형으로 받아온 값을 정수형으로 계산해서 표출해줬다.
	}

}
