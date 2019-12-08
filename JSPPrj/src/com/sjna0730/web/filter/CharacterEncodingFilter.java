package com.sjna0730.web.filter; //filter ��Ű�� ����� �ȿ� ���ڴ�Ŭ���� �ϳ� ����� �������̽��� servlet filter�� �߰�

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") //web.xml�� ���� �����ߴ��͵��� ������̼����� �����ϰ� ����������
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, 
				ServletResponse response, 
				FilterChain chain) //���Ͱ� Ŭ���̾�Ʈ�� ������ ������ ������ �ϴµ� �װ� �̾��ִ°� chain�̴�.
			throws IOException, ServletException {
		System.out.println("before filter");
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response); // Ŭ���̾�Ʈ ��û�� �������� ������ �ٽ� Ŭ���̾�Ʈ�� ������ �۾�
		System.out.println("after filter");
	}

}
