package day04.exam;

import java.util.Scanner;

public class LoopTest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if (num == sum) {
			System.out.println(num + "은 완전수 입니다.");
		} else 
			System.out.println(num + "은 완전수가 아닙니다.");
	}
}
