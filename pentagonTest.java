package Inheritance;
import java.util.Scanner;
class Pentagon
{
	private double arr[]=new double[5];
	public final  int no_of_sides=5;
	
	Pentagon()
	{
		for(int i=0;i<no_of_sides;i++){
			arr[i]=1;
		}
		
	}
	
	Pentagon(double[] a){
		for(int i=0;i<no_of_sides;i++){
			arr[i]=a[i];
		}
	}
	
	public void perimeter(){
		double r=0;
		for(int i=0;i<no_of_sides;i++){
			r+=arr[i];
		}
		System.out.println("The perimeter of this pentagon is " +r);
	}
	
	public void display() {
		for (int i=1; i<= no_of_sides; i++) {
			System.out.println("The length of side " +i+ " is " +arr[i-1]);
		}
		
	}
	
	

}


public class pentagonTest {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int i;
		
		
		double arr[]= new double[5];
		
		
		for (i=1; i<=5; i++) {
			System.out.println("Enter the length of side " +i+ ".");
			arr[i-1]= s.nextDouble();
		}
		
		Pentagon p1= new Pentagon();
		Pentagon p2= new Pentagon(arr);
		
		p1.no_of_sides=6;
		
		p1.perimeter();
		p2.perimeter();
		
		p1.display();
		p2.display();

	}

}
