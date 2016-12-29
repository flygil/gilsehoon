package day09;

public class Dog {
	//디폴트 생성자가 생성
	//public Dog(){}
	private String name;
	private int age;
	
	
	public Dog () {
		//this.name = "이름모름";
		//this.age = 0;
		//System.out.println("Dog()호출");
		this("이름모름", 0);
	}
	
	public Dog (String name) {
		//this.name = name;
		//this.age = 1;
		//System.out.println("Dog(String)호출");
		this(name, 1);
	}
		
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
		//System.out.println("Dog(String , int)호출");		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
