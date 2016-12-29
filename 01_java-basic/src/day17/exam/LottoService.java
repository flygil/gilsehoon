package day17.exam;

import java.util.Scanner;

public class LottoService {
	LottoDAO dao; 
	public LottoService() {
		this.dao = new LottoDAO();
	}
	
	public void execute() {
		while (true) {
			BaseService service = null;
			switch (menu()) {
			case 1: service = new ListByInning(dao); break;
			case 2: service = new selectByNo(dao); break;
			case 3: service = new regNo(dao); break;
			case 4: System.out.println("종료");
			}
			service.execute();
		}
	}	
	
	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("로또(LOTTO) 관리자 시스템");
		System.out.println("---------------------------");
		System.out.println("1. 각 회별 로또 번호보기");
		System.out.println("2. 번호별 당첨된 횟수 보기");
		System.out.println("3. 당첨 번호 등록");
		System.out.println("4. 종료");
		System.out.println("---------------------------");
		System.out.print("메뉴 선택 : ");
		return Integer.parseInt(sc.nextLine());
		 
	}
}
