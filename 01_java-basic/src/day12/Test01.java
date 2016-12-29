package day12;

//추상클래스
abstract class AbsSuper {
	
	//추상 메소드  : 구현되지 않은 메소드(바디없다)
	public abstract void test();
	
	public void call() {
		System.out.println("메소드바디");
	}
}


class AbsSub extends AbsSuper {
	public void test(){
		System.out.println("재정의메소드");
	}
}

public class Test01 {
	public static void main(String[] args) {
	//AbsSuper absSuper = new AbsSuper();
	//추상클래스의 객체는 자식 클래스를 이용함.
	AbsSuper absSuper = new AbsSub();
	}
}
