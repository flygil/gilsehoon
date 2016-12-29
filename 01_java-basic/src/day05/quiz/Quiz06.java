package day05.quiz;

public class Quiz06 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		
		//배열의 홀수 인덱스 요소들의 합계 : 21
		int sum = 0;
		int count = 0;
		for (int val : arr) {
			if (count % 2 == 1){
				//System.out.println(val);
				sum += val;				
			}
			count++;
		}
		/*
		for (int i = 0; i <= arr.length; i++ ) {
			if (i % 2 == 1) {
				sum += arr[i];
			}
		}
		*/
		System.out.println("배열의 홀수 인덱스 요소들의 합계 :" + sum);
		
	}
}
