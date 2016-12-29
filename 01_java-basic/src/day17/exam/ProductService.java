package day17.exam;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class ProductService {
	ProductDAO dao;
	public ProductService() {
		this.dao = new ProductDAO();
	}
	static Scanner sc = null;
	
	public void start() {
		 Scanner scf = null;
		
		 
		try {
			File f = new File("data/product.txt");
			scf = new Scanner(f);
			
			while(scf.hasNextLine()) {
				Product product = new Product();
				String str = scf.nextLine();
				String[] result = str.split(":");
				//System.out.println(Arrays.toString(result));
				
				product.setMaker(result[0]);
				product.setpName(result[1]);
				product.setpNum(result[2]);
				product.setpPrice(Integer.parseInt(result[3]));
				
				dao.insertProduct(product);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			/*sc.close();
			scf.close();*/
		}
		
		while(true) {
			BaseUI ui = null;
			switch(menu()) {
			case 1: ui = new ListUI(dao); break;
			case 2: ui = new DetailPriceUI(dao); break;
			case 3: ui = new DetailNameUI(dao); break;
			case 4: System.out.print("종료하시겠습니까? (취소 : N, 종료 : 엔터) : ");
					if(Integer.parseInt(sc.nextLine()) == '\r') {
						System.out.println("종료되었습니다.");
						System.exit(0);
					}else if (Integer.parseInt(sc.nextLine()) == 'N') {
						System.out.println("취소하였습니다.");continue;
					}
			}
			ui.execute();
		}
	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("상품관리시스템");
		System.out.println("--------------------------");
		System.out.println("1. 전체 검색");
		System.out.println("2. 금액 검색");
		System.out.println("3. 상품명 검색");
		System.out.println("4. 종료");
		System.out.println("--------------------------");
			
		System.out.print("메뉴선택 : ");
		return Integer.parseInt(sc.nextLine());
			
		}
	
	}

