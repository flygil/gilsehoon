package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class Test06 {
	public static void main(String[] args) {
		try {
			a();
		}catch	(Exception e) {
			System.out.println("점장예외총괄처리");
		}
	}

	private static void a() throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("a.txt");
		}catch (FileNotFoundException fe) {
			System.out.println("알바가예외처리");
			//예외강제발생
			throw fe;
		}
		
	}
}
