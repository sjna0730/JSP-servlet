package com.sjna0730.web; //��Ű���� ������ Ŭ������ �ƴ϶� servlet���� ������ٴ� ��

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add") //add.html�� ������ ���شٴ� �ǹ�
public class Add extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); //�ѱ�ȭ
		
		String x_ = request.getParameter("x"); //add.html���� x���� �޾ƿö� x_��� ���� �޴´�.
		String y_ = request.getParameter("y");
		int x = 0; //x�� �ƹ��͵� ���� ������ 0���� �����Ѵ�.
		int y = 0;
		if(!x_.equals("")) x = Integer.parseInt(x_); //x_�� "" �� ��������� �����ʴ°�� x_�� Int������ �ٲ��ش�.
		if(!y_.equals("")) y = Integer.parseInt(y_);
		
		int result = x+y;
		
		response.getWriter().printf("result is %d\n",  result); //����ڿ��� ���������� �޾ƿ� ���� ���������� ����ؼ� ǥ�������.
	}

}
