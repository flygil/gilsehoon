package day05.quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 출력형식 >
		 * 
		 * 수를입력 : 5
		 * 5보다 큰수가 4개 있습니다.
		 * 
		 * 수를 입력 : 7
		 * 7보다 큰수가 2개 있습니다.
		 * 
		 */
		
		while(true) {
			System.out.print("수를 입력 :");
			int num = Integer.parseInt(sc.nextLine());
			if (num == -1) break;
			int count = 0;
			for(int i = 0; i < arr.length; i++) {
				if (num < arr[i]) {
					count++;
				}
			}
		System.out.printf("%d보다 큰수가 %d개 있습니다.\n", num, count);
		}
		System.out.printf("종료합니다.");
	}
}
