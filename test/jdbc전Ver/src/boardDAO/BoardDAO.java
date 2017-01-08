package boardDAO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import boardVO.BoardVO;

import test.MyArrayList;
public class BoardDAO {
	private MyArrayList<BoardVO> list = new MyArrayList<>();
	private int no = 0;
	Calendar c = Calendar.getInstance();
	
	
	public MyArrayList selectBoard() {
		return list;
	}
	
	public BoardVO selectByNo(BoardVO boardVO) {
		for (int i = 0; i < list.size(); i++) {
			BoardVO board = list.get(i);
			if (boardVO.getNo() == board.getNo()) {
				return board;
			}
		}
		return null;
	}
	
	public void insertBoard(BoardVO boardVO) {
		boardVO.setNo(++no);
		boardVO.setRegDate(c.getTime());
		list.add(boardVO);
	}
	public boolean updateBoard(BoardVO boardVO) {
		for (int i = 0; i < list.size(); i++) {
			BoardVO board = list.get(i);
			if (boardVO.getNo() != board.getNo()) continue;
				board.setTitle(boardVO.getTitle());
				return true;
		}
		return false;
	}
	
	public boolean deleteBoard(int no) {
		int delIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			BoardVO board = (BoardVO)list.get(i);
			if (no != board.getNo()) continue;
				delIndex = i;
		}
		if (delIndex == -1) return false;
		
		list.remove(delIndex);
		return true;
	}
	
}
