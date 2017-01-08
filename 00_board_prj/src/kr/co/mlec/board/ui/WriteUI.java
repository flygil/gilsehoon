package kr.co.mlec.board.ui;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.BoardVO;

public class WriteUI extends BaseUI {
	private BoardMapper dao;
	public WriteUI(BoardMapper dao) {
		this.dao = dao;
	}
	
	public void execute() {
		try {
			BoardVO boardVO = new BoardVO();
			System.out.print("제목을 입력하세요 : ");
			boardVO.setTitle(sc.nextLine());
			System.out.print("글쓴이를 입력하세요 : ");
			boardVO.setWriter(sc.nextLine());
			System.out.print("내용을 입력하세요 : ");
			boardVO.setContent(sc.nextLine());
			dao.insertBoard(boardVO);
			System.out.println("게시물 등록이 완료되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
