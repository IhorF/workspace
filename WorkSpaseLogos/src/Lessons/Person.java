package Lessons;

public class Person {

	int age;
	String name;
	int walk;

	Person() {
	}

	Person(int age, String name) {
		System.out.println("age = " + this.age + " Name = " + this.name);
		this.age = age;
		System.out.println("age = " + this.age + " Name = " + this.name);
		this.name = name;
		System.out.println("age = " + this.age + " Name = " + this.name);
	}

	void talk() {
		System.out.println(name + " : " + "Bla bla");
	}

	void walk(int walk) {
		System.out.println(name + " : " + "walked " + walk);
		this.walk += walk;

	}
	void totalyWalk() {
		System.out.println(name + " : " + "totalyWalked " + walk);


	}

	public static void main(String[] args) {
		Person p = new Person();
		p.age = 18;
		System.out.println("age = " + p.age);
		p.name = "Petro";
		System.out.println("Name = " + p.name);
		p.talk();
		Person p2 = new Person(25, "Igor");
		p2.talk();
		p.walk(100);
		p2.walk(200);
		p.walk(100);
		p2.walk(200);
		p.totalyWalk();
		p2.totalyWalk();
	}

}
