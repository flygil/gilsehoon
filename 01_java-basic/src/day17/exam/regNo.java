package day17.exam;

public class regNo extends BaseService{
	LottoDAO dao;
	public regNo (LottoDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		Lotto lotto = new Lotto();
		System.out.println("---------------------------");
		System.out.println("로또 당첨 번호 등록");
		System.out.println("---------------------------");
		System.out.print("회차 : ");
		lotto.setCount(Integer.parseInt(sc.nextLine()));
		System.out.print("당첨번호 : ");
		lotto.setNum(sc.nextLine());
		if(dao.writeNo(lotto)) {
			System.out.println(lotto.getCount() + "회차 당첨번호가 등록되었습니다.");
		}else {
			System.out.println("이미 등록된 회차입니다.");
		}
		
	}
}
