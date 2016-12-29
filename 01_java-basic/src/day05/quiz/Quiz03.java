package day05.quiz;

public class Quiz03 {
	public static void main(String[] args) {
		int [] arr = {6, 8, 3, 9, 7, 4};
		/*
		 * 출력형식 >
		 * 배열의 모든 요소가 홀수입니다.
		 * 배열의 모든 요소가 홀수는 아닙니다.
		 * 
		 */
		
		/*
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				count++;
			}
		}
		if(count == arr.length) {
			System.out.println("배열의 모든 요소가 홀수입니다.");
		}else 
			System.out.println("배열의 모든 요소가 홀수는 아닙니다.");
		*/
		
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("배열의 모든 요소가 홀수는 아닙니다.");
				flag = true;
				break;
			}
			if (flag == false) {
				System.out.println("배열의 모든 요소가 홀수 입니다.");
				
			}
		}
		
//	System.out.println	(flag == false ? "홀수" : "짝수") ;
		
		
	}
}
