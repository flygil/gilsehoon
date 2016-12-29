package day15.Quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import util.MyArrayList;

public class Quiz06 {
	public static void main(String[] args) {
		//data/day15/quiz06.txt 파일의 내용을 읽어서 아래와 같이 출력
		/*
		 * 성적발표
		 * ---------------
		 * 1. 이름 : ... 총점 : ...
		 * 2.  ...
		 * 3.  ...
		 * ---------------
		 * 
		 */
		
		try {
		File f = new File("data/day15/Quiz06.txt");
			Scanner sc = new Scanner(f);
			List<StudentVO> list = new ArrayList<>();
			while (sc.hasNextLine()) {
				String[] arr = sc.nextLine().split(":");
				StudentVO student = new StudentVO(arr[0], Integer.parseInt(arr[1]), 
						Integer.parseInt(arr[2]), Integer.parseInt(arr[3]) );
				list.add(student);
			}
			Collections.sort(list);
			int no = 1;
			System.out.println("성적결과");
			System.out.println("-----------------");
			for (StudentVO student : list) {
				System.out.printf("%d. 이름 : %s, 총점 : %d\n", no++, student.getName(), student.getSum());
				if (no == 4) break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
