package Lessons;

public class Human {

	private int age;

	

	public Human(){}

	public Human(int age) {
		this.age = age;
	}


	void walk() {
		System.out.println("go go go");

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + "]";
	}

	}

