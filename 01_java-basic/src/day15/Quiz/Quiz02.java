package day15.Quiz;

import java.util.Arrays;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 실행시 화면출력이 다음과 같도록 코딩작성
		 * [9,5,3]
		 * 
		 */
		
		int[] arr = {3,9,5};
		for (int j = 1; j < arr.length; j++ ) {
			int max = arr[j -1];
			for(int i = j; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
					arr[i] = arr[j -1];
					arr[j -1] = max;
				}
			
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	/*public void maxSwap(int[] arr; int j, int i) {
		int max;
		max = arr[i];
		arr[i] = arr[j -1];
		arr[j -1] = max;
		
	}*/
}
