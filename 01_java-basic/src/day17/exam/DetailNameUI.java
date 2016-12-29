package day17.exam;

import java.util.ArrayList;
import java.util.List;

public class DetailNameUI extends BaseUI{
	ProductDAO dao;
	public DetailNameUI(ProductDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		boolean flag = false;
		System.out.println("--------------------------");
		System.out.println("상품명 검색");
		System.out.println("--------------------------");
		System.out.print("검색어 입력 : ");
		String name = baseSc.nextLine();
		System.out.println("--------------------------");
		System.out.println();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("[" + name + "]" +"자를 포함하는 상품");
		System.out.println("--------------------------");
		System.out.printf("제조회사\t상품명\t상품번호\t가격\n");
		System.out.println("--------------------------");
		List<Product> list = dao.selectByName();
		for (int i = 0; i < list.size(); i++) {
			Product product = list.get(i);
			if (product.getpName().contains(name)) {
				System.out.printf("%s\t%s\t%s\t%d\n", product.getMaker(), product.getpName(), product.getpNum(), product.getpPrice());
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("검색된 상품정보가 없습니다.");
			System.out.println("--------------------------");
		}else {
			System.out.println("--------------------------");
			
		}
	}

}
