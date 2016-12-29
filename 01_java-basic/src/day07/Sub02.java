package day07;
/*
 * 반환타입이 void가 아니라면 
 * 1.반드시 메소드내에 return이 존재해야 한다.
 * 2.return문 뒤에는 반환타입이 받을 수 있는 값을 설정해야한다.
 */
import java.util.Random;
public class Sub02 {
	int method01() {
		return 100;
	}
	
	char method02() {
		return 'a';
	}
	
	String method03() {
		return "성공";
	}
	Random method04() {
		return new Random();
	}
	
	int[] method05() {
		//int[] array = new int[1];
		return  new int[1];
				//array;
	}
	
	HaHa method06(KiKi k) {
		
		return new HaHa();
	}
	
	
}

class HaHa {
	
}
class KiKi {
	
}