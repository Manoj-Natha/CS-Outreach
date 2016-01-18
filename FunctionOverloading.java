package Inheritance;

public class FunctionOverloading {
	public static float area(int radius) {
		return (22/7)*radius*radius;
	}
	
	public static float area(int base, int height) {
		return (float)0.5*(float)base*(float)height;
	}
	
	public static int area(int length, int breadth, int height) {
		return 2*(length*breadth +breadth*height + height*length);
	}
	public static void main(String args[]) {
		float aC = area(3);
		float aT = area(2, 4);
		int aCuboid = area(2, 3, 4);
		
		System.out.println(aC);
		System.out.println(aT);
		System.out.println(aCuboid);
		
	}
}
