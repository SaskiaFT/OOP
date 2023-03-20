package oop;
// inheritance
public abstract class Animal {
	
	public String name;
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public abstract void maakGeluid();
}
