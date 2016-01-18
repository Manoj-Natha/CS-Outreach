package Inheritance;
import java.util.Scanner;

class Rational {
	private int num;
	private int denom;
	
	Rational () {
		num=1;
		denom=1;
	}
	
	Rational (int i1) {
		num= i1;
		denom=1;
	}
	
	Rational (int i1, int i2) {
		num= i1;
		denom= i2;
	}
	
	Rational (double d) {
		denom=1;
		if(d%1==0)
		{
			num=(int)d;
		}
		else{
			while (d%1!=0)
			{
				d=d*10;
				denom=denom*10;
			}
			
			num=(int)d;
		}
	}
	
	public void display() {
		System.out.println("The fraction is: " +num+ "/" +denom);
	}
	
	private int gcd() {
		int x=num;
		int y=denom;
		int r = y%x;
		while (r!=0)
		{
			y=x;
			x=r;
			r=y%x;
		}
		return x;
	}
	
	public void simplify() {
		int gcd= gcd();
		num= num/gcd;
		denom= denom/gcd;
		System.out.println("The simplified fraction is: " +num+ "/" +denom);
	}
	
	
}


public class fractions {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the numerator and the denominator: ");
		int Num= s.nextInt();
		int Denom= s.nextInt();
		System.out.println("Enter an appropriate decimal value between 0 and 1.");
		double g= s.nextDouble();
		Rational r1= new Rational();
		Rational r2= new Rational(Num);
		Rational r3= new Rational(Num, Denom);
		Rational r4= new Rational(g);
		
		
		System.out.println("Method calls for r1 object:");
		r1.display();
		r1.simplify();
		r1.display();
		
		System.out.println("Method calls for r2 object:");
		r2.display();
		r2.simplify();
		r2.display();
		
		System.out.println("Method calls for r3 object:");
		r3.display();
		r3.simplify();
		r3.display();
		
		System.out.println("Method calls for r4 object:");
		r4.display();
		r4.simplify();
		r4.display();
	}

}
