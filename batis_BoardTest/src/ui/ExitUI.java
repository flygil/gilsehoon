package ui;

import boardDAO.BoardDAO;

public class ExitUI extends BaseUI{
	private BoardDAO dao;
	public ExitUI(BoardDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		System.out.println("프로그램이 종료됩니다.");
		System.exit(0);
	}
}
