package oop;

public class Admin extends Person {
	public Admin (String name, int age) {
		super(name, age);
	}
		public void getType() {
			System.out.println(name  + " is an admin");
		}
}
