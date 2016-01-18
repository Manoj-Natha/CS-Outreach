package Inheritance;

import java.util.Scanner;
class Rect {
	private double length;
	private double width;
	public static int count=0;
	Rect()
	{
		length=1;
		width=1;
	}
	
	Rect (double l1, double l2) {
		length= l1;
		width = l2;
	}
	
	
	
	public static void incCount()
	{
		count++;
	}
	
	
	public double getValueLength() {
		return length;
	}
	
	public double getValueWidth() {
		return width;
	}
	
	public void setValueLength(double newValue) {
		length= newValue;
	}
	
	public void setValueWidth(double newValue) {
		width= newValue;
	}
	
	private void details(){
		System.out.println("The length of the rectangle is" +length);
		System.out.println("The width of the rectangle is" +width);
	}
	public void display(){
		details();
	}
	
	public void area(){
		double rarea= length*width;
		System.out.println("The area of the rectangle is: " +rarea);
	}
}



public class StaticExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rect r1=new Rect();
		Rect.incCount();
		r1.display();
		r1.area();
		System.out.println("Enter the dimensions of the rectangle.");
		int p= s.nextInt();
		int q= s.nextInt();
		Rect r2= new Rect(p,q);
		Rect.incCount();
		r2.display();
		r2.area();
		
		System.out.println("The number of rect objects are "+Rect.count);
		
		
	}

}
