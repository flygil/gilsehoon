package day04.exam;

import java.util.Scanner;

public class LoopTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max; int min; int sum = 0;
		System.out.print("수를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("수를 입력하세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
	 if (num1 > num2) {
		 max = num1;
		 min = num2;
	 } else {
		 max = num2;
	 	 min = num1;
	 }	 
	
	 for (int i = min; i <= max; i++) {
		 sum += i;
	 }
		 
	 System.out.printf("%d 부터 %d까지의 합은 %d 입니다.", min, max, sum);
	
	}
}
