package day05.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		
		//실행시 아래와 같이 출력되도록 프로그램 작성
		//출력형식 >
		//최댓값 : 9
		//최소값 : 3
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i ++) {
			
				if (min > arr[i]) {
					min = arr[i];
				} 
				if (max < arr[i]){
					max = arr[i];
				}			
		}
		System.out.printf("최댓값 : %d 최솟값 : %d", max, min);
	}
}
