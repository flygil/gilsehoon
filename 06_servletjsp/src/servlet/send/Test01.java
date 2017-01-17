package servlet.send;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/send/test01")
public class Test01 extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg = "redirect는 데이터 공유안됨";
		
		request.setAttribute("msg", msg);
		
		//sendRedirect - 이동
		// http://localhost:8000/06_servletjsp/servlet/send/test01(서블릿)
		// http://localhost:8000/06_servletjsp/servlet/send/test01.jsp
		
		//절대경로로 접근할때 :forward와 다르게 프로젝트경로부터 표시해야 한다.
		//response.sendRedirect("06_servletjsp/servlet/send/test01.jsp");
		response.sendRedirect("test01.jsp");
	}
	
}
