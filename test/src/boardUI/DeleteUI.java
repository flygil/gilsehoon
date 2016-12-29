package boardUI;

import boardDAO.BoardDAO;

public class DeleteUI extends BaseUI {
	private BoardDAO dao;
	DeleteUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		System.out.println("---------------------");
		System.out.print("삭제할 게시물의 번호를 입력하세요 : ");
		int no = Integer.parseInt(sc.nextLine());
		if (dao.deleteBoard(no) ) {
			System.out.println("삭제가 완료되었습니다.");
		}else System.out.println("선택된 게시글이 존재하지 않습니다.");
	}
}
