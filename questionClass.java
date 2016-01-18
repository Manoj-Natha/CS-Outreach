package Inheritance;

class parent{
	int n;
	parent i=new parent();
	
	public void display1(){
	System.out.println("This is display 1");
	}
	
	
	public void display2(){
		System.out.println("This is display 2");
		parent j=new parent();
		j.display1();
	}
	
	
	
} 

public class questionClass extends parent{

	
	public void display3()
	{
		i.display1();
		i.display2();
		j.display1();
		
		
	}
	public static void main(String[] args) {
		
		
		
	}

}
