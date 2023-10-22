package fawadPackage;

public class MethodOverlaoding2 {
	static void change(int a ) {
		a = 98;
	}
    static void change2(int[] arr) {
    	arr[0] = 98;
    }

	public static void main(String[] args) {
//		int[] marks = {52,60,45,80,90,94,32,};
//		int x = 45;
//		change(x);
//		System.out.println("The value of x after running change is: " + x);
//		
		int[] marks = {52,60,45,80,90,94,32};
		change2(marks);
		System.out.println("The value of The x after changing the value is : "+ marks[0]);
	

	}

}
