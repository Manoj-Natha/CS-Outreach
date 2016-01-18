package Inheritance;
import java.util.Scanner;

class Temperature {
	private double t;
	private String unit;
	
	
	Temperature () {
		t=0;
		unit = "Farenheit";
		System.out.println("Temperature object has been created with values of 0 Farenheit");
	}
	Temperature (double d) {
		t= d;
		unit = "Farenheit";
		System.out.println("Temperature object has been created with a defined temperature");
	}
	
	Temperature (double d, String s) {
		t=d;
		unit=s;
		System.out.println("User defined temperature and units.");
	}
	
	public double getTemp() {
		return t;
	}
	
	
	public void setTemp(double newTemp) {
		t= newTemp;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String newUnit) {
		unit= newUnit;
	}
	
	private void details() {
		System.out.println("The temperature in degrees " +unit+ " is: " +t);
	}
	
	public void display() {
		details();
	}
	
	public void ConvertToF() {
		if (unit.equals("Farenheit")) {
			System.out.println("This temperature is already in degrees Farenheit.\n There is no need of a conversion.");
		}
		
		else if (unit.equals("Celsius")) {
			t= 1.8*t + 32;
			unit= "Farenheit";
			System.out.println("The temperature is: " +t+ "degrees " +unit+ ".");
		}
		
		else {
			System.out.println("Please enter a valid unit.");
		}
	}
	
	public void rateTemp() {
		if (unit.equals("Celsius")) {
			System.out.println("You need to convert to Farenheit first.");
		}
		
		else if (unit.equals("Farenheit")) {
				if (t < 0) {
				System.out.println("The temperature is extremely cold.");
			}
			
			else if (t>=0 && t<50) {
				System.out.println("The temperature is cold.");
			}
			
			else if (t>=50 && t<90) {
				System.out.println("The temperature is warm.");
			}
			
			else {
				System.out.println("It is very hot outside.");
			}
			
		}
	}

	}








public class Temp {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		
		Temperature temp1= new Temperature();
				
		
		System.out.print("Enter the temperature for temp2 object: ");
		Double p= s.nextDouble();
		
		Temperature temp2= new Temperature(p);
		

		System.out.print("Enter the temperature for temp3 object: ");
		p= s.nextDouble();
		System.out.println("What are the units for temp3 object? ");
		String q= s.next();

		Temperature temp3= new Temperature(p,q);
		
		
		temp1.display();
		temp1.ConvertToF();
		temp1.rateTemp();
		
		temp2.display();
		temp2.ConvertToF();
		temp2.rateTemp();
		
		temp3.display();
		temp3.rateTemp();
		temp3.ConvertToF();
		temp3.rateTemp();
		
		
		
	}

}
