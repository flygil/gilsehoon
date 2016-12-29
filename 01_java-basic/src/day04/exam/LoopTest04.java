package day04.exam;

import java.util.Scanner;

public class LoopTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요(2 - 10) : ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.print(num +"의 배수 : ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * num + " ");
		}
		
	}
}
