package boardUI;

import boardDAO.BoardDAO;
import boardVO.BoardVO;

public class ModUI extends BaseUI{
	private BoardDAO dao;
	ModUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
	BoardVO boardVO = new BoardVO();
		System.out.println("------------------------------------------");
		System.out.print("수정할 게시물의 번호를 입력하세요 : ");
		boardVO.setNo(Integer.parseInt(sc.nextLine()));
		System.out.print("제목을 입력하세요 : ");
		boardVO.setTitle(sc.nextLine());
		if (dao.updateBoard(boardVO)) {
			System.out.println("수정이 완료되었습니다.");
		}else 
			System.out.println("선택한 게시글이 없습니다.");
		System.out.println("------------------------------------------");
	}
}
