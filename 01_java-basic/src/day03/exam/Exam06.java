package day03.exam;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력하세요(만원) : ");
		
		int price = Integer.parseInt( sc.nextLine());
		
		if (price <= 10) {
			System.out.println("할인된 금액은 " + (int)(price * 0.97 * 10000) + " 입니다.");
		} else if (price <= 20) {
			System.out.println("할인된 금액은 " + (int)(price * 0.95 *10000) + " 입니다.");			
		} else if (price <= 30) {
			System.out.println("할인된 금액은 " + (int)(price * 0.92 * 10000) + " 입니다.");			
		} else if (price > 100) {
			System.out.println("할인된 금액은 " + (int)(price * 0.9 * 10000) + " 입니다.");			
		}
	}
}
