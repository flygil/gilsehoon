package boardUI;

import  java.util.Scanner;
import boardDAO.BoardDAO;
import boardVO.BoardVO;
import test.MyArrayList;

public class BoardUI {
	private BoardDAO dao;
	public BoardUI() {
		this.dao = new BoardDAO();
	}
	private Scanner sc = new Scanner(System.in);
	public void execute() {
		while(true) {
			BaseUI ui = null;
			switch(menu()) {
				case 1: ui = new ListUI(dao); break;
				case 2:	ui = new DetailUI(dao); break;
				case 3:	ui = new WriteUI(dao); break;
				case 4:	ui = new ModUI(dao); break;
				case 5:	ui = new DeleteUI(dao); break;
				case 0:	ui = new ExitUI();
			}
			ui.execute();
		}
	}
	int menu() {
		System.out.println("------------------------------------------");
		System.out.println("1.전체 게시글 조회");
		System.out.println("2.글번호 조회");
		System.out.println("3.글등록");
		System.out.println("4.글수정");
		System.out.println("5.글삭제");
		System.out.println("0.종료");
		System.out.println("------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
}
