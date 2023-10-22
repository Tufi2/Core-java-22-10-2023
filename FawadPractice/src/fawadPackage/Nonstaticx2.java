package fawadPackage;

public class Nonstaticx2 {
	public double add(double x, double y) {
		   double z= x+y;
		return z;
	}
	public double subtract(double x, double y) {
		
		double z1 = x-y;
		return z1;
	}
	public double multiplication(double x, double y) {
		double z2 = x*y;
		return z2;
	}
	

	public static void main(String[] args) {
	double a = 10;
	double b = 20;
	double c;
	
	Nonstaticx2 obj = new Nonstaticx2();
	c = obj.add(a, b) ;
	double a1 = 20;
	double b1 = 10;
	double c1;
	Nonstaticx2 obj1 = new Nonstaticx2();
	c1 = obj1.subtract(a1, b1);
	double a2 = 20;
	double b2 = 10;
	double c2;
	Nonstaticx2 obj11 = new Nonstaticx2();
	c2 = obj11.multiplication(a2, b2);
	
	System.out.println("The Addition of the the X and Y is: " +c);
	System.out.println("The sub of X and Y is: " + c1);
	System.out.println("The Mul of X2 and Y2 is: " + c2);
	
	
     
	}

}
