package day04;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		/*
		 *  화면출력
		 *  **********
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("별 개수 : ");
		
	
		int count = Integer.parseInt( sc.nextLine() );
		/*
		for (int i = 1; i <= count; i++)	{
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}	
			
			System.out.println();
		}		
		sc.close();
		*/
		
		
		for (int i = 1; i <= count; i++)	{
			if (i <= (count + 1) / 2 ) {
				for (int k = 1; k <= i ; k++) {
					System.out.print("*");
				}	
			
				System.out.println();
			} else {
				for (int k = 1; k <= (count + 1) - i  ; k++) {
					System.out.print("*");
				}	
				
				System.out.println();
			} 
				
			
		}
	}
}
