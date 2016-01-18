package Inheritance;

class calculator
{
	public double a= 7;
	public double b=4;
	public void multiply()
	{
		double c= a*b;
		System.out.println("The product is : "+c);	
	}

	public double add()
	{
		double c=a+b;
		return c;
	}
	
	public void divide() 
	{
		double c= a/b;
		System.out.println("The quotient is" +c);
	}
	
	public double subtract() 
	{
		double c= a-b;
		return c;
	}
}

public class return_types {

public static void main(String args[])
{
	calculator c=new calculator();
	c.multiply();
	double result;
	result = c.add();
	double oresult= c.subtract();
	c.divide();
	System.out.println("The difference is: " +oresult);
	System.out.println("the sum is :"+result);
}
	
	
}
