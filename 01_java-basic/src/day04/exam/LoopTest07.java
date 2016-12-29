package day04.exam;

import java.util.Scanner;

public class LoopTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수를 입력하세요(2 - 9) : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("단수를 입력하세요(2 - 9) : ");
		int num2 = Integer.parseInt(sc.nextLine());
		int min; int max; 
		 
		if (num1 > num2) {
			 max = num1;
			 min = num2;
		 } else {
			 max = num2;
		 	 min = num1;
		 }	 
		
		for (int i = min; i <= max; i++) {
			System.out.print(i + "단 : ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d ",i * j);
		    }
			System.out.println();
		}	
	}
}
