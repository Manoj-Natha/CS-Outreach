package Inheritance;
class outerClass{
	public int num;
	
	private class innerClass{
		public void InnerDisplay()
		{
			System.out.println("This method is in inner class");
		}
	}
	
	public void outerDisplay()
	{
		System.out.println("this method is the outer class method calling the inner class method innerDisplay");
		innerClass i=new innerClass();
		i.InnerDisplay();
	}
	
}

public class privateInnerClass {

	public static void main(String[] args) {
		outerClass o=new outerClass();
		o.outerDisplay();
		
	}

}
