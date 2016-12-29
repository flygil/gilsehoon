package day05.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4, 10};
		System.out.println("배열 : " + Arrays.toString(arr));
		/*
		 * 출력형식 >
		 * 바꿀 인덱스 : 2
		 * 바꿀 인덱스 : 4
		 * arr 배열의 결과 : 
		 */
		Scanner sc = new Scanner(System.in);
		int buff;
		
		for (int i = 0; i < arr.length /2 ; i++) {
		buff = arr[i];
		arr[i] = arr[arr.length - (i + 1)];
		arr[arr.length - (i + 1)] = buff;
		}
		System.out.println(Arrays.toString(arr));
	}
}
