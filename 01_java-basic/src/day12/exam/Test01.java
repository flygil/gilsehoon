package day12.exam;

import java.util.Random;

abstract class Shape {
	abstract void area();
}
abstract class Rectangle extends Shape{
	abstract void area();
}
abstract class Square extends Rectangle {
	abstract void area();
}
abstract class Triangle extends Shape {
	abstract void area();
}
abstract class Circle extends Shape {
	abstract void area();
}




public class Test01 {
	public static void main(String[] args) {
		Random r = new Random();
		switch (r.nextInt(4) + 1) {
			case 1:
			case 2:
			case 3:
			case 4:
		}
	}
}
