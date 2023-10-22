package fawadPackage;
//In previous Example we learn how to add various numbers by creating 
//new methods for each of the function..
//In this example we will see how to add or to do any any operation by using VARARGS

public class DemoVarargs2 {
 static int sum (int...arr) {
	 
	 
	 int result = 0;
	 for (int a: arr){
		 result += a;
	 }
	 return result;
 }
	public static void main(String[] args) {
		
		System.out.println("Welcome to varargs: ");
		System.out.println("The sum of a + b is : " + sum(4,5));
		System.out.println("The sum of a + b + c  is : " + sum(4,5,7));
		System.out.println("The sum of a + b + c + d is : " + sum(4,5,7,8));
		
		
		
		
		
	}

}
