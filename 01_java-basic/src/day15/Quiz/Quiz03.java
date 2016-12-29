package day15.Quiz;

import java.util.Arrays;

public class Quiz03 {
	public static void main(String[] args) {
		Data d1 = new Data(3);
		Data d2 = new Data(9);
		Data d3 = new Data(5);
		
		Data[] arr = {d1, d2, d3};
		
		
		for (int i = 0; i < arr.length - 1; i++ ) {
			for(int j = i; j < arr.length; j++) {
				if (arr[i].getNum() < arr[j].getNum()) {
					Data dTemp = arr[i];
					arr[i] = arr[j];
					arr[j] = dTemp;
				}
			
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
