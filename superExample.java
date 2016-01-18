package Inheritance;

class parentClass{
	public int num;
	parentClass(int i) {
		System.out.println("This is the constructor of super class..!!");
		num=i;
	}
	public void display(){
		System.out.println("This is display of parent class and the num has value : "+num);
	}

	
}

public class superExample extends parentClass{
	public int num=20;
	
	superExample(int j) {
		super(j);
		System.out.println("This is subclass constructor..!!");
	}
	
	public void display(){
		System.out.println("This is display of child class and the num has value : "+num);
	}
	
	public void mydisplay(){
		super.display();
		num=40;
		super.num=5;
		super.display();
		display();
	}
	
	
	public static void main(String[] args){
		int j= 34;
	
		 superExample s= new superExample(j);
		
		
		s.display();
		s.mydisplay();
		
		
	}
	
}
