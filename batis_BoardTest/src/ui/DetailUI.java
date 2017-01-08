package ui;

import java.text.SimpleDateFormat;

import boardDAO.BoardDAO;
import boardVO.BoardVO;

public class DetailUI extends BaseUI{
	private BoardDAO dao;
	public DetailUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		System.out.print("조회할 글번호를 입력하세요 : ");
		int no = Integer.parseInt(sc.nextLine());
		BoardVO vo = new BoardVO();
		vo = dao.selectByOne(no);
		if (vo != null) {
			System.out.printf("%d\t%s\t%s\t%s\n", vo.getNo(),vo.getTitle(),vo.getWriter(),
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(vo.getRegDate()));
		} else {
			System.out.println("입력한 글번호에 해당하는 게시물이 없습니다.");
		}
	}
}
