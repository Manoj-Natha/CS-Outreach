package Inheritance;
import java.util.Scanner;
class Employee{
	public Scanner s= new Scanner(System.in);
	public String Name;
	public String designation;
	public double salary;
	public String email;
	public String dob;
	public static int count;
	
	
	Employee() {
		System.out.println("\nThis is the constructor of the employee.");
		System.out.println("Name?");
		Name= s.next();
		System.out.println("Email?");
		email= s.next();
		System.out.println("Date of birth?");
		dob= s.next();
		
	}
	
	public void display(){
		System.out.print("\nName: " +Name);
		System.out.print("\nDate of birth: " +dob);
		System.out.print("\nEmail: " +email);
	}
}

class Manager extends Employee{
	public double bonus;
	Manager() {
		super();
		System.out.println("Salary?");
		salary= s.nextDouble();
		System.out.println("Designation?");
		designation= s.next();
		System.out.println("Bonus?");
		System.out.print("$");
		bonus= s.nextDouble();
		salary= salary+bonus;
	}
	
	public void display() {
		System.out.println("The manager has the following information: \n");
		super.display();
		System.out.print("\nDesignation: " +designation);
		System.out.print("\nSalary: $" +salary);
		System.out.println("Bonus: " +bonus);
	}
}



class Secretary extends Employee{
	public double bonus;
	Secretary() {
		super();
		System.out.println("Salary?");
		salary= s.nextDouble();
		System.out.println("Designation?");
		designation= s.next();
		System.out.println("Bonus?");
		System.out.print("$");
		bonus= s.nextDouble();
		salary= salary+bonus;
	}
	
	public void display() {
		System.out.println("The secretary has the following information: \n");
		super.display();
		System.out.print("\nDesignation: " +designation);
		System.out.print("\nSalary: $" +salary);
		System.out.println("Bonus: " +bonus);
		
	}
}

class Programmer extends Employee{
	public double bonus;
	Programmer() {
		super();
		System.out.println("Salary?");
		salary= s.nextDouble();
		System.out.println("Designation?");
		designation= s.next();
		System.out.println("Bonus?");
		System.out.print("$");
		bonus= s.nextDouble();
		salary= salary+bonus;
	}
	public void display() {
		System.out.println("The programmer has the following information.");
		super.display();
		System.out.print("\nDesignation: " +designation);
		System.out.print("\nSalary: $" +salary);
		System.out.println("Bonus: " +bonus);
	}
}

class ExecOff extends Manager{
	public double extraBonus;
	ExecOff() {
		super();
		System.out.println("Extra bonus?");
		extraBonus= s.nextDouble();
		salary= super.salary+extraBonus;
	}
	
	public void display() {
		System.out.println("The executive officer has the following information: ");
		super.display();
		System.out.println("\nExtraBonus: $" +extraBonus);
		
	}
}


public class inhertquestion {

	public static void main(String[] args) {
		
		System.out.println("Creating an object for programer");
		Programmer p= new Programmer();
		System.out.println("display method for programer");
		p.display();

		System.out.println("Creating an object for secretary");
		Secretary s= new Secretary();
		System.out.println("display method for secretary");
		s.display();

		System.out.println("Creating an object for manager");
		Manager m= new Manager();
		System.out.println("display method for manager");
		m.display(); 

		System.out.println("Creating an object for ExecOff");
		ExecOff e= new ExecOff();
		System.out.println("display method for ExecOff");
		e.display();
		
	}

}
