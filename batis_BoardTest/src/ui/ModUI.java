package ui;

import boardDAO.BoardDAO;
import boardVO.BoardVO;

public class ModUI extends BaseUI {
	private BoardDAO dao;
	public ModUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.print("수정할 글번호를 입력하세요 : ");
		vo.setNo(Integer.parseInt(sc.nextLine()));
		System.out.print("변경할 제목을 입력하세요 : ");
		vo.setTitle(sc.nextLine());
		if(dao.updateBoard(vo) ==1) {
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("해당게시물이 존재하지 않습니다.");
		}
	}
}
