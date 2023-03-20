package oop;

public class Product {
	
	public String name;	
	private double price;
	public boolean availability;
	private double discount;
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public void stelNaamIn(String name) {
		this.name = name;
	}
	
	public String WatIsjouwNaam() {
		return name;
	}
	
	public double WatIsDePrijs() {
		return price;
	}
	
	public double WatIsDeDiscount() {
		return discount;
	}
	
	public boolean productAvailibility() {
		return availability = true;
	}	
	
	public Product(){
		System.out.println("In constructor");
	}
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product(Double price) {
		this.price = price;
	}
	
	public Product(String name, double price, boolean availability, double discount) {
		this.name = name;
		this.price = price;
		this.availability = availability;
		this.discount = discount;
		System.out.println("Gelukt!");
	}
}

//	Vandaag: string, int, boolean, double
	
//	String -> text
//	int -> heel getal, (byte/short/int/long)
//	boolean -> true or false
//	double/float -> decimaal getal, double -> 64 bit, float -> 32 bit


