package class11;

public class Dog {
	
	//state
	//attribute/properties/fields
	
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	//these are the behavior of a dog
	//Methods /functions
	
	void bark() {
		System.out.println("Barking......");
		
	}
	void sleep() {
		System.out.println("Dog is sleeping.......");
	}
	public static void main(String[] args) {
		//creating objects from a class
		//new Dog();=> it creates an object of class dog
		Dog dog1=new Dog();
		//calling a behavior on an object
		dog1.bark();
		
	}
	
	
	

}
