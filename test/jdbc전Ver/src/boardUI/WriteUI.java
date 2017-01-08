package boardUI;

import boardDAO.BoardDAO;
import boardVO.BoardVO;

public class WriteUI extends BaseUI {
	BoardDAO dao;
	WriteUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		BoardVO boardVO = new BoardVO();
		System.out.println("---------------------");
		System.out.print("제목을 입력하세요 : ");
		boardVO.setTitle(sc.nextLine());
		System.out.print("글쓴이를 입력하세요 : ");
		boardVO.setWriter(sc.nextLine());
		System.out.print("내용을 입력하세요 : ");
		boardVO.setContent(sc.nextLine());
		dao.insertBoard(boardVO);
		System.out.println("글등록이 완료되었습니다.");
		System.out.println("---------------------");
	}
}
