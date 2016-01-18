package Inheritance;

class outerclass{
	private int num=10;
	
	class innerclass{
		public void InnerDisplay()
		{
			System.out.println("This method is in inner class");
		}
	}
	
	public void outerDisplay()
	{
		System.out.println("this method is in outer class with num as "+num);
	}
	
}



public class publicInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outerclass o1=new outerclass();
		o1.outerDisplay();
		
		outerclass o2=new outerclass();
		
		
		
		outerclass.innerclass i1=o1.new innerclass();
		i1.InnerDisplay();
		
		outerclass.innerclass i2=o2.new innerclass();
		i2.InnerDisplay();
		
	}

}
