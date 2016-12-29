package boardUI;

import boardDAO.BoardDAO;
import boardVO.BoardVO;
import test.MyArrayList;

public class ListUI extends BaseUI{
	BoardDAO dao;
	ListUI(BoardDAO dao) {
		this.dao = dao;
	}
	
	public void execute() {
		MyArrayList<BoardVO> list = dao.selectBoard();
		System.out.println("---------------------");
		System.out.println("번호\t제목\t글쓴이\t등록일\n");
		if (list != null) {
			for (int i = list.size() - 1; i >= 0; i--) {
				BoardVO boardVO = list.get(i);
			System.out.printf("%d\t%s\t%s\t%s\n",
					boardVO.getNo(),boardVO.getTitle(),boardVO.getWriter(), sdf.format(boardVO.getRegDate()) );
			}
			}else {
				System.out.println("게시물이 존재하지 않습니다.");
			}
		System.out.println("---------------------");
	}
}
