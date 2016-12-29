package day16;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		File f = new File("data");
		File[] fList = f.listFiles();
		String type = "";
		for(File sub : fList) {
			/*
			if (sub.isDirectory()) {
				type = "D";
			}else {
				type = "F";
			}*/
			/*
			type = sub.isDirectory() ? "D" : "F" ;
			System.out.println(type + ":" + sub.getName());
			*/
			
			System.out.printf("%s:%s\n", sub.isDirectory() ? "D" : "F", sub.getName());
		}
		
		/*
		String[] list = f.list();
		for(String name : list) {
			File f2 = new File("data/" + name);
			if(f2.isDirectory()){
				System.out.println("D : " + name );
			}else {
				System.out.println("F : " + name );
			}
			//System.out.println(name);
		}
		*/
	}
}
