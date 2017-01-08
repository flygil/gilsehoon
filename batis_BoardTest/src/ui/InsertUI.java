package ui;

import boardDAO.BoardDAO;
import boardVO.BoardVO;

public class InsertUI extends BaseUI {
	private BoardDAO dao;
	public InsertUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.print("제목을 입력하세요 : ");
		vo.setTitle(sc.nextLine());
		System.out.print("글쓴이를 입력하세요 : ");
		vo.setWriter(sc.nextLine());
		System.out.print("내용을 입력하세요 : ");
		vo.setContent(sc.nextLine());
		if(dao.insertBoard(vo) == 1){
			System.out.println("게시글이 저장되었습니다.");
		} else {
			System.out.println("오류 : 게시글이 저장되지 않았습니다.");
		}
		
	}
}
