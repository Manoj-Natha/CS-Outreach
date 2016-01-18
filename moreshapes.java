package Inheritance;
import java.util.Scanner;


class Rectangle {
	private double length;
	private double width;
	
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
	
	public double area(){
		double rarea= length*width;
		return rarea;
	}
}

class Circle {
	private double radius;
	
	public double getValueRadius() {
		return radius;
	}
	
	public void setValueRadius(double newValueRadius) {
		radius = newValueRadius;
	}
	private void details() {
		System.out.println("The radius of the circle is: " +radius);
	}
	
	public void display() {
		details();
	}
	
	public double area() {
		double carea = 3.14*radius*radius;
		return carea;
	}
}

class Triangle {
	private double a;
	private double b;
	private double c;
	
	
	public double area() {
		double s= .5*(a+b+c);
		double sqar= (s)*(s-a)*(s-b)*(s-c);
		double tarea= Math.sqrt(sqar);
		return tarea;
	}
	
	public double getValuea() {
		return a;
	}
	
	public void setValuea(double newValuea) {
		a= newValuea;
	}
	public double getValueb() {
		return b;
	}
	
	public void setValueb(double newValueb) {
		b= newValueb;
	}
	public double getValuec() {
		return c;
	}
	
	public void setValuec(double newValuec) {
		c= newValuec;
	}
	
	private void details() {
		System.out.println("The sides of the triangle are: " +a+ ", " +b+ ",and " +c);
	}
	
	public void display() {
		details();
	}
}

public class moreshapes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dimensions of the rectangle");
		System.out.print("Length: ");
		double Length= s.nextDouble();
		System.out.print("Width: ");
		double Width= s.nextDouble();
		
		System.out.print("Enter the radius of the circle: ");
		double Radius= s.nextDouble();
		
		System.out.println("Enter the sides of the triangle: ");
		double A= s.nextDouble();
		double B= s.nextDouble();
		double C= s.nextDouble();
		
		Triangle t= new Triangle();
		t.setValuea(A);
		t.setValueb(B);
		t.setValuec(C);
		t.display();
		double tr= t.area();
		System.out.println("The area of the triangle is: " +tr);
		
		Circle c= new Circle();
		c.setValueRadius(Radius);
		c.display();
		double q= c.area();
		System.out.println("The area of the circle is: " +q);
		
		Rectangle r= new Rectangle();
		r.setValueLength(Length);
		r.setValueWidth(Width);
		r.display();
		double p= r.area();
		System.out.println("The area of the rectangle is: " +p);

	}

}
