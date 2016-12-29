package day07;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		
		Sub03 s03 = new Sub03();
		
		System.out.println(s03.add(1,2));
		System.out.println(s03.sub(1,2));
		System.out.println(s03.mul(1,2));
		System.out.println(s03.div(1,2));
		System.out.println();
		System.out.println(s03.cal(1,200,100));
		System.out.println(s03.cal(2,200,100));
		System.out.println(s03.cal(3,200,100));
		System.out.println(s03.cal(4,200,100));
		
		System.out.println();
	
		int[] arr = s03.makeNumbers();
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(s03.makeNumbers(6,45)));
	}
}
