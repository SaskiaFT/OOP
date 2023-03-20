package oop;

public class User extends Person{
	public User(String name, int age) {
		super(name,age);
}
	
public void getType() {
		System.out.println(name + " is a user");
	}
}
