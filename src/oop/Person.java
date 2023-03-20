package oop;

public abstract class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
	 public abstract void getType();
	
	public void buy (String item) {
		System.out.println(this.name + " bought " + item);
	}
	
	public void sell (String item) {
		System.out.println(this.name + " sold " + item);
	}
	
	public void reserve(String item) {
		System.out.println(this.name + " reserved " + item);
	}
}
