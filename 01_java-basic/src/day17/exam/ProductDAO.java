package day17.exam;

import java.util.ArrayList;
import java.util.List;

import util.MyArrayList;

public class ProductDAO {
	private List<Product> pList = new ArrayList<>();
	private int no = 0;
	
	
	
	public List selectProduct() {
		return pList;
	}
	
	public List selectByPrice() {
		return pList;
	}
	public List selectByName() {
		return pList;
	}
	
	public void insertProduct(Product product) {
		pList.add(product);
	}
}
