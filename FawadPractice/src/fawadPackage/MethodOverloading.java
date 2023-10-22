package fawadPackage;

public class MethodOverloading {
	static void go(int[] array) {  
		// Creating Method
 		System.out .println("array[0]: " + array[0]);
		System.out .println("array[1]: " + array[1]);
		array[1] = 22;
	}
	static void go(int i) {  
		// Creating Method
 		System.out .println("go(int i)");
 		
	} 
	static void go(short s) {  
		// Creating Method
 		System.out .println("go(short s)");
	}

	public static void main(String[] args) {
		int[] array = {1,2};
		go(array);  // calling Method 
		System.out.println("array[1]: " + array[1]);
		go(1000);
		byte b = 22;
		go(b);
		 

		}

}
