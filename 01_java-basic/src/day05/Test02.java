package day05;

public class Test02 {
	public static void main(String[] args) {
		//정수를 3개 담는 배열을 만들고 배열의 요소로 10, 20, 30 을 넣어라
		/* 1번방식 : 배열을 생성할 때 어떤값을 입력할지 모르는 경우.
		int[] iArr = new int[3];
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[3] = 30;
		*/
		//2번방식 : 배열을 선언할 때만 가능함.
		int[] iArr2 = {10, 20, 30};
		// iArr2 = {40, 50, 60}; //에러발생
		
		//3번 방식 : 1번 + 2번, 선언 이후에도 사용가능
		int[] iArr3 = new int[]{10, 20, 30};
		iArr3 = new int[]{40, 50, 60};
	}	
}
