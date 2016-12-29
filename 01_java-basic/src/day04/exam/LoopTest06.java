package day04.exam;

public class LoopTest06 {
	public static void main(String[] args) {
		
		System.out.printf(" :   ");
		for (int i = 1; i <= 9; i++) {
		System.out.printf("%2d ", i);
		}
		System.out.println();
		System.out.println("---------------------------------");
		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단 : ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d ",i * j);
		    }
			System.out.println();
		}	
	}
}
