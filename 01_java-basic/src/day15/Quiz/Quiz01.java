package day15.Quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz01 {
	//set 을 활용한 로또 번호 추출
	//1 - 45 사이의 랜덤하게 6개 생성후 출력
	public static void main(String[] args) {
		
		Random r = new Random();
		Set<Integer> set = new HashSet<>();
		for (int i = 1 ; i <= 6; i++ ) { 
		set.add(r.nextInt(45) + 1 );
		 if (set.size() != i) i--;
		}
		 System.out.println(set);
		
		 while(set.size() < 6) {
			 set.add(r.nextInt(45) + 1);
		 }
		 System.out.println(set);
	}
	
	
}
