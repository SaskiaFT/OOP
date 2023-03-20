package oop;

/**
 * @author saski
 *
 */
public class Application {

	public static void main(String[] args) {
//		System.out.println("Hello world");
//		
//		Product p = new Product();
//		p.name = "TV";
//		
//		Product p2 = new Product();
//		p2.name = "Laptop";
//		
//		System.out.println(p.name);
//		System.out.println(p2.name);
//		p.printName();
//		p2.printName();
//		
//		p.stelNaamIn("Wasmachine");
//		p.printName();
//		
//		String productName = p.WatIsjouwNaam();
//		System.out.println("Product naam uit methode is " + productName);
//		
//		double productPrice = p.WatIsDePrijs();
//		System.out.println("Product prijs uit methode is " + productPrice);
//		
//		double productDiscount = p.WatIsDeDiscount();
//		System.out.println("Product discount uit methode is " + productDiscount);
//		
//		boolean productAvailable = p.productAvailibility();
//		System.out.println("Product uit methode is " + productAvailable);
//		
////		new Product("PC");
////		new Product(100.0);
//		new Product("Desktop", 50.0, true, 12.0);
		
//		Animal animal = new Animal();
//		animal.name = "Dier";
		
//		Dog dog = new Dog();
//		dog.name = "Woefie";
//		dog.printName();
//		dog.maakGeluid();
//		
//		Cat cat = new Cat();
//		cat.name = "Betsie";
//		cat.printName();
//		cat.maakGeluid();
		
//		Person p1 = new Person("Theo", 30);
		Admin admin = new Admin("Theo", 30);
		admin.buy("PC");
		admin.sell("Wasmachine");
		admin.reserve("Laptop");
		admin.getType();
		
//		Person p2 = new Person ("Elsa", 20);
		User user = new User("Elsa", 20);
		user.buy("Mobile Phone");
		user.sell("Music box");
		user.reserve("Lamp");
	}
	
}
