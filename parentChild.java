package Inheritance;
import java.util.Scanner;

class father{
	public String name;
	public int yearBorn;
	public String hobby;
	public Scanner s= new Scanner(System.in);
	
	father() {
		System.out.println("Enter the details of the father.");
		System.out.println("Name?");
		name= s.next();
		System.out.println("Year born?");
		yearBorn= s.nextInt();
		System.out.println("Hobby?");
		hobby= s.next();
	}
	
	public void display() {
		System.out.println("The details of the parent are: ");
		System.out.println("Name: " +name);
		System.out.println("Year born: " +yearBorn);
		System.out.println("Hobby: " +hobby);
	}
	
}

class son extends father{
	public String name;
	public int yearBorn;
	public String hobby;
	son() {
		//super();
		System.out.println("Enter the details of the son.");
		System.out.println("Name");
		name= s.next();
		System.out.println("Year born?");
		yearBorn= s.nextInt();
		System.out.println("Hobby?");
		hobby= s.next();
	}
	
	
	public void display() {
		super.display();
			System.out.println("The details of the child are: ");
			System.out.println("Name: " +name);
			System.out.println("Year born: " +yearBorn);
			System.out.println("Hobby: " +hobby);
	}
	
	public void ageDiff() {
		System.out.println("The age difference between the parent and the child is: " +Math.abs(yearBorn- super.yearBorn));
	}
	

	public void hobbyCheck() {
		if (hobby.equals(super.hobby)) {
			System.out.println("The parent and the child share a hobby.");
		}
		
		else {
			System.out.println("The parent and the child do not share a hobby.");
		}
	}
	
}


public class parentChild {

	public static void main(String[] args) {
		son c= new son();
		c.display();
		c.hobbyCheck();
		c.ageDiff();

	}

}
