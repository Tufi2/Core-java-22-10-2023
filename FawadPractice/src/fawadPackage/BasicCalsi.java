package fawadPackage;

public class BasicCalsi {
	public int c1;

	 int  logic(int x, int y) {  // non Static method
		int z;
		if(x>y) {
			z = x+y;	
		}
		else {
			z = (x +y)*5;
			
		}
		return z; 
		
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c ;
		BasicCalsi obj = new BasicCalsi(); //we need to make the object in the non static method 
		//with the name of the class, then we have to call the object.
		c =obj.logic(a,b);
		int a1 = 2;
		int b1 = 1;
		int c1;
		c1 =obj.logic(a1,b1);
		System.out.println(c);
		System.out.println(c1);
	}
}
		 
