package Inheritance;


class calci {
	protected int r;
	public int l;
	public void add(int a,int b){
		r=a+b;
		System.out.println("the add result is:"+r);
	}
	

	public void sub(int a,int b){
		r=a-b;
		System.out.println("the sub result is:"+r);
	}
	
}

public class othercalc extends calci{
		
	public void mul(int a,int b){
		r=a*b;
		System.out.println("The mul result is:"+r);
	}

	public static void main(String[] args) {
		othercalc o=new othercalc();
		o.add(2,3);
		o.sub(2,1);
		o.mul(2,4);

	}

}
