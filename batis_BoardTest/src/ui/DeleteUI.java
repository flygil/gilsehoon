package ui;

import boardDAO.BoardDAO;

public class DeleteUI extends BaseUI {
	private BoardDAO dao;
	public DeleteUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		System.out.print("삭제할 글번호를 입력하세요 : ");
		int no = Integer.parseInt(sc.nextLine());
		if (dao.deleteBoard(no) == 1) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("해당게시물이 존재하지 않습니다.");
		}
	
	}
}
