package Inheritance;
import java.util.Scanner;

class complexNumber {
	private double real;
	private double imaginary;
	private static int count = 0;
	
	complexNumber() {
		real= 0;
		imaginary= 0;
	}
	
	complexNumber(double newReal) {
		real= newReal;
		imaginary= 0;
	}
	
	complexNumber(double newReal, double newImag) {
		real= newReal;
		imaginary= newImag;
	}
	
	public static complexNumber add(complexNumber c1, complexNumber c2)
	{
		complexNumber c3= new complexNumber();
		c3.real=c1.real+c2.real;
		c3.imaginary=c1.imaginary+c2.imaginary;
		
		return c3;
	}
	
	public static complexNumber Subtract(complexNumber c2, complexNumber c1) {
		complexNumber c3= new complexNumber();
		c3.real=c2.real-c1.real;
		c3.imaginary=c2.imaginary-c1.imaginary;
		return c3;
	}
	
	public static complexNumber Multiply(complexNumber c2, complexNumber c1) {
		complexNumber c3= new complexNumber();
		c3.real= (c2.real*c1.real)-(c2.imaginary*c1.imaginary);
		c3.imaginary= (c2.real*c1.imaginary)+(c2.imaginary*c1.real); 
		return c3;
	}
	
	public static complexNumber Divide(complexNumber c2, complexNumber c1) {
		complexNumber c3= new complexNumber();
		c3.real= ((c2.real*c1.real)+(c2.imaginary*c1.imaginary))/(Math.pow(c1.real, 2) + Math.pow(c1.imaginary, 2));
		c3.imaginary= ((c2.real*c1.imaginary)+(c2.imaginary*c1.real))/(Math.pow(c1.real, 2) + Math.pow(c1.imaginary, 2));
		return c3;
	}
	
	public void display() {
		if (imaginary>0) {
			System.out.println("Your number is: " +real+ " + " +imaginary+ "i");
		}
		
		else if (imaginary<0) {
			System.out.println("Your number is: " +real+ " - " +Math.abs(imaginary)+ "i");
		}
		
		else {
			System.out.println("Your number is: " +real+ " + " +imaginary+ "i");
		}
	
	}
	
	public static void incCount() {
		count++;
	}
	
	public static int getValue() {
		return count;
	}
}





public class complexcom {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("What is your real value?");
		double q= s.nextDouble();
		System.out.println("What is your imaginary coefficient?");
		double p= s.nextDouble();
		
		complexNumber c1= new complexNumber(p,q);
		complexNumber c2= new complexNumber(q,p);
		System.out.println("Method calls for c1 object:");
		c1.display();
		complexNumber.incCount();
		
		System.out.println("\nMethod calls for c2 object:");
		c2.display();
		complexNumber.incCount();
		
		complexNumber c3;
		complexNumber c4;
		complexNumber c5;
		complexNumber c6;
		
		c3=complexNumber.add(c1, c2);
		System.out.println("\nSum: ");
		c3.display();
		
		c4=complexNumber.Subtract(c1, c2);
		System.out.println("\nDifference: ");
		c4.display();
		
		c5=complexNumber.Multiply(c1, c2);
		System.out.println("\nProduct: ");
		c5.display();
		
		c6=complexNumber.Divide(c1, c2);
		System.out.println("\nQuotient: ");
		c6.display();
		
		
		
		int y= complexNumber.getValue();
		System.out.println("There are " +y+ " objects created.");
		
		
	}

}
