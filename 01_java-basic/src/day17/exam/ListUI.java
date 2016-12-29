package day17.exam;
import day17.exam.Product;


import java.util.ArrayList;
import java.util.List;





public class ListUI extends BaseUI{
	ProductDAO dao;
	public ListUI(ProductDAO dao) {
		this.dao = dao;
	}
	
	public void execute() {
		List<Product> list = dao.selectProduct();
		System.out.println("--------------------------");
		System.out.println("상품정보");
		System.out.println("총 " + list.size() + "개 ");
		System.out.println("--------------------------");
		System.out.printf("제조회사\t상품명\t상품번호\t가격\n");
		System.out.println("--------------------------");
		for (int i = 0; i < list.size(); i++) {
			Product product = list.get(i);
			System.out.printf("%s\t%s\t%s\t%d\n", product.getMaker(), product.getpName(), product.getpNum(), product.getpPrice());
		}
		System.out.println("--------------------------");
	}
}
