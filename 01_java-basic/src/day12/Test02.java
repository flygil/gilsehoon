package day12;

interface InterSuper {
	//인터페이스에 선언되는 변수는 public static final 키워드가 자동으로 삽인된다. 
	// public static final int PORT
	int PORT = 8000;
	// public abstract 가 생략되어있고 자동적용된다.
	 void call();
	 void print();
	 //1.8버전 추가내용
	 default void test() {
		 System.out.println("default");
	 }
	 static void test2() {
		 System.out.println("static");
	 }
}

interface InterA {
	public void a();
}

interface InterB extends InterA {
	public void b();
}

class InterSub implements InterSuper, InterB {
	public void call() {
		System.out.println("재정의된 call()");
	}
	public void print() {
		System.out.println("재정의된 print()");
	}
	public void a() {
		System.out.println("재정의된 a()");
	}
	public void b() {
		System.out.println("재정의된 b()");
	}
}
public class Test02 {
	public static void main(String[] args) {
		//인터페이스는 객체생성불가
		//InterSuper iSuper = new Interface();
		InterSuper iSuper = new InterSub(); //자식클래스를 이용해서 객체생성가능
		InterB ib = new InterSub(); //자식클래스를 이용해서 객체생성가능
		InterA ia = new InterSub(); //자식클래스를 이용해서 객체생성가능
		iSuper.call();
		iSuper.print();
		ib.a();
		ib.b();
		
		System.out.println(InterSuper.PORT);
		System.out.println(iSuper.PORT); //static개념이기 때문에 클래스로 접근해야함.
		//InterSuper.PORT = 9000; //final개념이기 때문에 변수에 값할당이 안됨.
	}
}
