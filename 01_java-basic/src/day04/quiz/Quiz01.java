package day04.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		//1-10 까지의 숫자의 합을 구하시오
		//출력형식 >
		//1 - 10 까지의 합 : 55
		//짝수의 합 : 30
		//홀수의 합 : 25
		
	//	int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i =1; i <= 10; i++) {
			if(i % 2 == 0) {
			 evenSum += i; 	
	//		 sum += i;
			 continue;
			}
				oddSum += i;
	//			sum += i;
		}
		
		System.out.println("1 - 10까지의 합 : " + (evenSum+oddSum) );
		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("홀수의 합 : " + oddSum);
		
		
		
		
	}
}
