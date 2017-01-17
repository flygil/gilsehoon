package servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz/quiz02")
public class Quiz02 extends HttpServlet{
	
	static Random r = new Random();
	static int findNo =  r.nextInt(100) + 1;
	static int count = 0;
	
	
//	PUBLIC VOID INIT() THROWS SERVLETEXCEPTION {
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("choose"));
		String comp;
		count += Integer.parseInt(request.getParameter("count"));
		if (number > findNo){
			comp = "작은수를 입력하세요";
		}else if(number < findNo) {
			comp = "큰수를 입력하세요";
		} else comp = "정답입니다.";
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("정답 : " + findNo );
		out.println("<br>" );
		out.print(count + "회 시도");
		out.println("<br>" );
		out.print(comp);
		out.println("<br>" );
		out.print("<a href='quiz02.html'>다시입력</a>");
		out.println("</body>");
		out.println("</html>");
	}
	
}
