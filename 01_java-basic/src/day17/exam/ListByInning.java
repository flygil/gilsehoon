package day17.exam;

import java.util.ArrayList;

public class ListByInning extends BaseService {
	LottoDAO dao;
	public ListByInning (LottoDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		ArrayList<Lotto> list = dao.selectInning();
		System.out.println("---------------------------");
		System.out.println("각 회별 로또 번호");
		System.out.println("총" + list.size() + "회");
		System.out.println("---------------------------");
		if (list != null) {
			for (int i = list.size(); i > 0; i--) {
				Lotto lotto = list.get(i -1);
				System.out.printf("%d회. %s\n", lotto.getCount(), lotto.getNum());
			}
			System.out.println("---------------------------");
		}else {
			System.out.println("등록된 당첨번호가 없습니다.");
			System.out.println("---------------------------");
		}
	}
}
