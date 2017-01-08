package boardUI;

import boardDAO.BoardDAO;
import boardVO.BoardVO;
import test.MyArrayList;

public class DetailUI extends BaseUI {
	BoardDAO dao;
	DetailUI(BoardDAO dao) {
		this.dao = dao;
	}
	void execute() {
		System.out.print("조회할 게시물의 번호를 입력하세요 : ");
		BoardVO boardVO = new BoardVO();
		boardVO.setNo(Integer.parseInt( sc.nextLine() ) );
		boardVO = dao.selectByNo(boardVO);
		if (boardVO != null) {
			System.out.println("번호 : " + boardVO.getNo());
			System.out.println("제목 : " + boardVO.getTitle());
			System.out.println("글쓴이 : " + boardVO.getWriter());
			System.out.println("내용 : " + boardVO.getContent());
			System.out.println("등록일 : " + sdf.format(boardVO.getRegDate() ) );
			
		}else {
			System.out.println("선택한 게시물이 존재하지 않습니다.");
		}
		System.out.println("---------------------");
	}
}
