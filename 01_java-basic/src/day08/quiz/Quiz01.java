package day08.quiz;

import java.util.Scanner;
import java.io.File;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		/*
		 * 	data/day08/quiz/quiz01.txt 파일의 내용을 읽어서
		 * 아래와 같이 출력되도록 프로그램을 작성한다.
		 * java 파일은 2개 있습니다.
		 * txt 파일은 1개 있습니다.
		 * jpg 파일은 1개 있습니다.
		 */
		findFileCount("java");
		findFileCount("txt");
		findFileCount("jpg");
	}
	
public static void findFileCount(String ext) throws Exception {
		int count = 0;
		File f = new File("data/day08/quiz/quiz01.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			if (s.endsWith(ext)) count++;
			
		}
		System.out.printf("%s 파일은 %d개 있습니다.\n",ext, count);
	}
}
