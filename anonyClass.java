package Inheritance;
abstract class unknownclass
{
public abstract void display();
}


public class anonyClass {

	public static void main(String[] args) {
		unknownclass u=new unknownclass(){
			public void display()
			{
				System.out.println("This method is in anonymous class");
			}
		};
		u.display();
		
		
	}

}
