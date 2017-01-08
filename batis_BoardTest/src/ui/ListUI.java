package ui;

import java.text.SimpleDateFormat;
import java.util.List;

import boardDAO.BoardDAO;
import boardVO.BoardVO;

public class ListUI extends BaseUI{
	private BoardDAO dao;
	public ListUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		List<BoardVO> list = dao.selectList();
		System.out.printf("전체 %d개\n", list.size());
		System.out.println("------------------------------------");
		System.out.println("번호\t제목\t글쓴이\t등록일");
		System.out.println("------------------------------------");
		for(int i = 0; i < list.size(); i++) {
			BoardVO vo = list.get(i);
			System.out.printf("%d\t%s\t%s\t%s\n", vo.getNo(),vo.getTitle(),vo.getWriter(),
					new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegDate()));
		}
	}
}
