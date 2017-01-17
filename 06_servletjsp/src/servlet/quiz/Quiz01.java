package servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz/quiz01")
public class Quiz01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int first = Integer.parseInt(req.getParameter("first"));
		int second = Integer.parseInt(req.getParameter("second"));
		String cal = req.getParameter("cal");
		int result = 0;
		switch (cal) {
		case "+":  result = first + second; break;
		case "-":  result = first - second; break;
		case "*": result = first * second; break;
		case "/": result = first / second; break;
		}
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println(first);
		out.println(cal);
		out.println(second);
		out.println("= " + result );
		out.println("<a href='quiz01.html'>다시계산</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	
}
