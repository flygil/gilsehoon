package day17.exam;

import java.util.ArrayList;
import java.util.List;

public class DetailPriceUI extends BaseUI{
	ProductDAO dao;
	public DetailPriceUI(ProductDAO dao) {
		this.dao = dao;
	}
	public void execute() {
		boolean flag = false;
		System.out.println("--------------------------");
		System.out.println("금액으로 검색");
		System.out.println("--------------------------");
		System.out.print("낮은금액 : ");
		int min = Integer.parseInt(baseSc.nextLine());
		System.out.print("높은금액 : ");
		int max = Integer.parseInt(baseSc.nextLine());
		System.out.println("--------------------------");
		System.out.println();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println(min + "원 ~ " + max + "사이의 상품");
		System.out.println("--------------------------");
		System.out.printf("제조회사\t상품명\t상품번호\t가격\n");
		System.out.println("--------------------------");
		List<Product> list = dao.selectByPrice();
		for (int i = 0; i < list.size(); i++) {
			Product product = list.get(i);
			if (product.getpPrice() > min && product.getpPrice() < max) {
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
