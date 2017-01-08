package boardUI;

import java.util.ArrayList;
import java.util.List;

import boardDAO.BoardDAO;
import boardVO.BoardVO;

public class ListUI extends BaseUI{
	BoardDAO dao;
	ListUI(BoardDAO dao) {
		this.dao = dao;
	}
	
	public void execute() {
		List<BoardVO> list = dao.selectBoard();
		System.out.println("------------------------------------------");
		System.out.println("번호\t제목\t글쓴이\t등록일\n");
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				BoardVO boardVO = list.get(i);
			System.out.printf("%d\t%s\t%s\t%s\n",
					boardVO.getNo(),boardVO.getTitle(),boardVO.getWriter(), sdf.format(boardVO.getRegDate()) );
			}
			}else {
				System.out.println("게시물이 존재하지 않습니다.");
			}
		System.out.println("------------------------------------------");
	}
}
