package Inheritance;
class outclass
{
	int num;
	String msg;
	public void outdisplay(){
		System.out.println("This method belongs to outer class");
		
		class inclass{
			int n;
			public void indisplay(){
				System.out.println("This method belongs to inner class");
			}	
		}
		
		inclass i=new inclass();
		i.indisplay();
	}
	
}


public class methodLocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outclass o=new outclass();
		o.outdisplay();
		
	}

}
