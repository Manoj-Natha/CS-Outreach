package Inheritance;
class outer{
	public int num;
	static class inner{
		public void indisplay(){
			System.out.println("This method is inside static inner class");
		}
	}
	
	public void outdisplay(){
		System.out.println("This method is outer class");
	}
}


public class staticInnerClass {

	public static void main(String[] args) {
		outer o=new outer();
		o.outdisplay();
		outer.inner i=new outer.inner();
		i.indisplay();
		

	}

}
