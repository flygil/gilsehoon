package test;

import java.util.Random;

abstract class Shape {
	public abstract void area();
}

class Rectangle extends Shape {
	int i;
	int j;
	public void getNo(int i, int j) {
		this.i = i;
		this.j = j;
		area();
	}
	public void area() {
		int result = i * j;
		System.out.println("직사각형의 면적은" + result + "입니다.");
	}
		
}
class Triangle extends Shape {
	int i;
	int j;
	public void getNo(int i , int j) {
		this.i = i;
		this.j = j;
		area();
	}
	public void area() {
		int result = (i * j) / 2;
		System.out.println("삼각형의 면적은" + result + "입니다.");
	}
		
}

class Circle extends Shape {
	final double PI = 3.14;
	int i;
	
	public void getNo(int i) {
		this.i = i;
		area();
	}
	public void area() {
		int result = (int)PI * i * i;
		System.out.println("원의 면적은" + result + "입니다.");
	}
		
}
	
class Square extends Rectangle{
	int i;
	
	public void getNo(int i) {
		this.i = i;
		area();
	}
	public void area() {
		int result = i * i;
		System.out.println("정사각형의 면적은" + result + "입니다.");
	}
		

}
public class Test02 {
	public static void main(String[] args) {
		Random r = new Random();
		Square shape1 = new Square();
		Rectangle shape2 = new Rectangle();
		Triangle shape3 = new Triangle();
		Circle shape4 = new Circle();
		int[] arrNo = new int[2];
		int type = r.nextInt(4) + 1;
		if (type == 1 || type == 4) {
			int num= r.nextInt(100) + 1;
			if (type == 1) {
				shape1.getNo(num);
			}else {
				shape4.getNo(num);
			}
		}else {
			for (int i = 0; i < 2; i++) {
				arrNo[i]= r.nextInt(100) + 1;
			}if (type == 2) {
				shape2.getNo(arrNo[0], arrNo[1]);
			}else {
				shape3.getNo(arrNo[0], arrNo[1]);
			}
		}
		
	}
}
