package day05.quiz;

import java.util.Arrays;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		System.out.println("배열 : " + Arrays.toString(arr));
		/*
		 * 출력형식 >
		 * 바꿀 인덱스 : 2
		 * 바꿀 인덱스 : 4
		 * arr 배열의 결과 : 
		 */
		Scanner sc = new Scanner(System.in);
		int buff;
		
		System.out.print("바꿀 인덱스 : ");
		int num1 = Integer.parseInt(sc.nextLine() );
		System.out.print("바꿀 인덱스 : ");
		int num2 = Integer.parseInt(sc.nextLine() );
		buff = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = buff;
		
		System.out.println(Arrays.toString(arr));
	}
}
