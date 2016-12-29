package day05.quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		/*
		 * 수를 입력 : 3
		 * 배열에 1개가 들어있습니다.
		 * 
		 * 수를입력 : 1
		 * 배열에 0개가 들어있습니다.
		 * 
		 * 수를입력 : -1
		 * 종료합니다.
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		
		while (num != -1) {
			System.out.print("수를 입력 : ");
			num = Integer.parseInt(sc.nextLine());
			if (num == -1) break;
			for (int val : arr) {
				if (val == num) {
					count++;
				}
			}
			/*
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
					count++;
				}
			}
			*/
			if (num != -1)
			System.out.println("배열에 " + count +"개가 들어있습니다.");
			 count = 0;
		}
		System.out.println("종료합니다.");
		
		
		
		
	}
}
