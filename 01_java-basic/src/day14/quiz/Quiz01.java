package day14.quiz;

import java.util.Calendar;

public class Quiz01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int val = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, 1);
		int dayofweek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayofweek);
		
		c.add(Calendar.MONTH, -1);
		int preval = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(preval);
		
		c.add(Calendar.MONTH, 2);
		int nextdayofweek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(nextdayofweek);
		int count = 0;
		
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		int index = -2;
			for(int j = 1; j <= val; j++) {
				if (j == 1) {
					for(int i = 1; i <= dayofweek -1; i++) {
						System.out.printf("%2d\t",preval - dayofweek -index );
						index--;
						count++;
					}
				}
				System.out.printf("%2d\t", j);
				count++;
				if (count == 7) {
					System.out.println();
					count = 0;
					
					if (j > val) {
					  	if (nextdayofweek != 1) {
								for(int k = 1; k <= (15 -nextdayofweek) ; k++) {
									System.out.printf("%2d\t", k);
									count++;
										}
						}else {
						for(int l = 1; l <= 7; l++) {
									System.out.printf("%2d\t", l);
									count++;
										}	
									
						 }
					  	if (count == 7) {
					  		System.out.println();
					  		count = 0;
					  	}
					  }
					
					}
				}
				
			
			
			
					
			
		
	}
}
