package day07;

import java.util.Random;
	public class Sub03 {
		/*
		 * add 두수의 합을 구한뒤 결과반환
		 * sub 두수의 차를 구한뒤 결과반환
		 * mul 두수의 곱을 구한뒤 결과반환
		 * div 두수의 나누기를 구한뒤 결과반환
		 */
		int add (int i, int j) {
			return i + j;
		}
		
		int sub (int i, int j) {
			int min;
			int max;
			min = i;
			if (j < min) {
				min = j;
				max = i;
			}else {
				max = j;
			}
			return max - min;
		}
		
		int mul (int i, int j) {
			return i * j;
		}
		int div (int i, int j) {
			return i / j;
		}
		
		//위의 정의된 사칙연산과 연관된 기능을 하나로 합치자.
		/**
		 * @param type : 1(더하기), 2(빼기), 3(곱하기), 4(나누기)
		 * @param num1
		 * @param num2
		 * @return
		 */
		int cal(int type, int num1, int num2) {
			if (type == 1) return num1 + num2;
			if (type == 2) return num1 - num2;
			if (type == 3) return num1 * num2;
			if (type == 4) return num1 / num2;
			return 0;
		}
		
		/*
		 * 
		 *
		int[] makeNumbers() {
			int[] arr = new int[5];
			Random r = new Random();
			for (int i = 0; i < 5; i++) {
			arr[i] = r.nextInt(10) + 1;
			}
			return arr;
		}
		
		int[] makeNumbers(int count) {
			int[] arr = new int[count];
			Random r = new Random();
			for (int i = 0; i < count; i++) {
				arr[i] = r.nextInt(10) + 1;
			}
			return arr;
		}
		
		int[] makeNumbers(int count, int max) {
			int[] arr = new int[count];
			Random r = new Random();
			for (int i = 0; i < count; i++) {
				arr[i] = r.nextInt(max) + 1;
			}
			return arr;
		}
		
		*/
		int[] makeNumbers() {
			return makeNumbers(5, 10);
		}
		
		int[] makeNumbers(int count) {
			return makeNumbers(count, 10);
		}
		
		int[] makeNumbers(int count, int max) {
			int[] arr = new int[count];
			Random r = new Random();
			for (int i = 0; i < count; i++) {
				arr[i] = r.nextInt(max) + 1;
			}
			return arr;
		}
}

