package Inheritance;

class baseClass{
	baseClass() {
		System.out.println("This is the constructor of super class..!!");
	}
	public void display(){
		System.out.println("This is display of base class");
	}

	
}

public class overridingExample extends baseClass{
	
	overridingExample() {
		System.out.println("This is subclass constructor..!!");
	}
	
	
	public void display(){
		System.out.println("This is display of overriding class");
	}
	
	public void display1(){
		System.out.println("This is a new display of overriding class");
	}
	

	
	public static void main(String[] args){
	
		 baseClass b= new baseClass();
		 baseClass o=new overridingExample(); 
		
		b.display();
		o.display();	
		o.display1();
		
	}
	
}




