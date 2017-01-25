package kr.co.mlec.board.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

@WebServlet("/board/detail")
public class DetailServlet extends HttpServlet {
	private BoardDAO dao;
	public DetailServlet() {
		this.dao = new BoardDAO();
	}

	@Override
	public void service(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException{
		int no = Integer.parseInt(request.getParameter("no"));
		BoardVO boardVO = dao.selectOneBoard(no);
		
		request.setAttribute("boardVO", boardVO);
		
		// 페이지 이동
		RequestDispatcher rd = 
				request.getRequestDispatcher("/jsp/board/detail.jsp");
		rd.forward(request, response);
	}
}








