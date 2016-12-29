package day02;
import day01.*;

class A{
	String name = "홍길동";
	int age = 29;
	void print() {
		System.out.println("내이름은 : " + name + "이고, 나이는 " + age +"입니다.\n");
	}
}	
		

public class As {
	public static void main(String[] args){
	A aTest = new A();
	aTest.name = "길세훈";
	aTest.print();

	B bTest = new B();
	bTest.name = "Gil sehoon";
	bTest.print();
	
	ABC abcTest = new ABC();
	System.out.println( abcTest.AB(5,9) );
	}
}