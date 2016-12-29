package day04.exam;

import java.util.Scanner;

public class LoopTest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 행의 수를 입력하세요(1 -10) : ");
		int hor = Integer.parseInt(sc.nextLine());
		System.out.print("출력할 열의 수를 입력하세요(1 -10) : ");
		int vir = Integer.parseInt(sc.nextLine());
		String str;
		
		if (hor % 2 == 1) {
			str = "<";
			for (int i = 1; i <= vir; i++) {				
				for(int j = 1; j <= hor; j++) {
					System.out.print(str);
				}
				if (i % 2 == 1)
					str = ">";
				if (i % 2 == 0)
					str = "<";				
				System.out.println();
				}
		} else {
			str = ">";
			for (int i = 1; i <= vir; i++) {
				for(int j = 1; j <= hor; j++) {
					System.out.print(str);
				}
				if (i % 2 == 1)
					str = "<";
				if (i % 2 == 0)
					str = ">";				
				System.out.println();
				}
		}
	}
}
