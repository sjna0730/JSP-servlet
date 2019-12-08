package com.sjna0730.web.filter; //filter 페키지 만들고 안에 인코더클레스 하나 만들고 인터페이스에 servlet filter를 추가

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") //web.xml에 필터 설정했던것들을 어노테이션으로 간단하게 설정해줬음
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, 
				ServletResponse response, 
				FilterChain chain) //필터가 클라이언트와 서버의 수문장 역할을 하는데 그걸 이어주는게 chain이다.
			throws IOException, ServletException {
		System.out.println("before filter");
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response); // 클라이언트 요청을 서블릿으로 보내고 다시 클라이언트로 보내는 작업
		System.out.println("after filter");
	}

}
