package day17.exam;

import java.util.ArrayList;

public class LottoDAO {
	Lotto lot;
	ArrayList<Lotto> list = new ArrayList<>();
	public ArrayList<Lotto> selectInning() {
		return list;
		/*for (int i = 0; i < list.size(); i++) {
			lot = list.get(i);
			if (lot.getCount() == lotto.getCount()) {
				return lot;
			}
		}
		return null;*/
	}
	
	
	public boolean writeNo(Lotto lotto) {
		for(int i = 0; i < list.size(); i++) {
			Lotto lot = list.get(i);
			if (lotto.getCount() == lot.getCount()) {
				return false;
			}
		}
		list.add(lotto);
		return true;
	}
}
