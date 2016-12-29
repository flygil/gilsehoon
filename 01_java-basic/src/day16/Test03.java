package day16;

import java.io.File;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		File f = new File("data/a1.txt");
		
		
		boolean result = f.delete();
		if (result) {
			System.out.println("파일삭제완료");
		}else {
		System.out.println("파일삭제실패");
		
		}
		
		
		
		/* 파일생성하기
		if (!f.exists()) {
			System.out.println("파일생성");
			try {
				boolean result = f.createNewFile();
				if (result) {
					System.out.println("파일생성완료");
			}else {
				System.out.println("파일생성실패");
				
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		
		/* 
		//byte의 크기를 반환
		long length = f.length();
		System.out.println("length : " + length);
		*/
		
		
		
		/* 파일 경로, 파일이름, 파일상위경로 가져오기
		String path = f.getPath();
		String name = f.getName();
		String parent = f.getParent();
		System.out.println("path :" + path);
		System.out.println("name :" + name);
		System.out.println("parent :" + parent);
		*/
	}
}
