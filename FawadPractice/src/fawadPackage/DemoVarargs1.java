package fawadPackage;
// VARARGS are variable length arguments.

public class DemoVarargs1 {
	static int sum(int a , int b ) {
		return a+b;
	}
	
	static int sum(int a , int b ,int c) {
		return a+b+c;
	}
	static int sum(int a , int b ,int c,int d) {
		return a+b+c+d;
		//So if we have to continue add numbers or anything we have to make 
		// different methods each time ...to skip this we use VARARGS.
//		public static void foo(int...arr)
//		{
			//arr is available here as int[]
//			  }	
	}
	public static void main(String[] args) {
		System.out.println("Welcome to varargs: ");
		System.out.println("The sum of a + b is : " + sum(4,5));
		System.out.println("The sum of a + b + c  is : " + sum(4,5,7));
		System.out.println("The sum of a + b + c + d is : " + sum(4,5,7,8));

	}

}
