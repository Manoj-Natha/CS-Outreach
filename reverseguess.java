package Inheritance;
import java.util.Scanner;
import java.util.Random;
public class reverseguess {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Random r= new Random();
		int a=(int) r.nextInt(990)+10;
		
		int i;
		
		while(true) {
		System.out.println("Guess my number. It is between 10, and 1000");
		int b= s.nextInt();
		
		if (a>b) {
			System.out.println("No, that is less than my number.");
		}
		
		else if (a<b) {
			System.out.println("No, that is greater than my number");
		}
		
		else if (a==b) {
			System.out.println("That is my number! You win.");
			break;
		}
		}
		
		
		
		
		
		

	}

}
