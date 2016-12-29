package day15.Quiz;

import java.util.Arrays;

public class Quiz04 {
	public static void main(String[] args) {
		Data d1 = new Data(3);
		Data d2 = new Data(9);
		Data d3 = new Data(5);
		
		Data[] arr = {d1, d2, d3};
		
		//코딩추가
		
		/*
		 * 	sort의 대상이 되는 클래스는 comparable 인터페이스의 자식클래스이어야 한다.
		 * 	정렬의 기준은 compareTo()에서 정의한다.
		 */
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		/*
		String[] sArr = {"hello", "java", "world"};
		Arrays.sort(sArr);
		System.out.println(Arrays.toString(sArr));
		int[] iArr = {3, 9, 5};
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		*/
		
		
		
		
	/*	for (int i = 0; i < arr.length - 1; i++ ) {
			for(int j = i; j < arr.length; j++) {
				if (arr[i].getNum() < arr[j].getNum()) {
					Data dTemp = arr[i];
					arr[i] = arr[j];
					arr[j] = dTemp;
				}
			
			}
		}
		
		System.out.println(Arrays.toString(arr));*/
	}
}
