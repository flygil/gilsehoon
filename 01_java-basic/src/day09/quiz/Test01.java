package day09.quiz;
//싱글톤패턴

class TestQuiz {
	private TestQuiz() {}
	public void msg() { 
		System.out.println("성공");
	}
	static TestQuiz getAddr(){
		TestQuiz tq = new TestQuiz();
		return tq;
		
	}
	/*
	 * 위의 제공된 코드는 변경하지 않는다.
	 * 코드를 추가하여 Test01 클래스에서 객체변수를 얻을 수 있게 작성한다.
	 * 단, 코드를 추가하되 생성자 추가는 안된다.
	 * 실행시 화면에 "성공"이 출력된다.
	 */
	
	
	
}
public class Test01 {
	public static void main(String[] args) {
		TestQuiz tq = TestQuiz.getAddr();
		tq.msg();
	}
}
