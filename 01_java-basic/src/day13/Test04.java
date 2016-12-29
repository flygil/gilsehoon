package day13;

import java.io.FileReader;

public class Test04 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			FileReader fr = new FileReader("data/a.txt");
			fr.read();
			System.out.println(2);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(3);
			//return;
			//System.exit(0);
		}finally { //catch에서 리턴을해도 finally는 실행되고 메소드 종료
			System.out.println("메롱");
		}
	}
}
