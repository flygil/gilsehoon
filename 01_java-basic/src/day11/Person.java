package day11;

public class Person {
	//private String name; //접근제한자를 
	String name;
	int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		//return "name=" + name + "age=" + age;
		return String.format("name = %s, age = %d",name, age);
	}
}
