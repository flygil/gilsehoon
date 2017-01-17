package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class Test06 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod();
		//요청방식이 post일 경우 파라미터의 한글 처리지정
		if ("POST".equals(method)) {
			request.setCharacterEncoding("utf-8");
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>응답성공</h1>");
		out.println("<h2>id : " + id + "<h2>");
		out.println("<h2>pass : " + pass + "<h2>");
	out.println("</body>");
		out.println("</html>");

		out.close();
	}

}
