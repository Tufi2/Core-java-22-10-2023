
public class Calculator {
	int a = 50;
	int b = 40;
	
	void add()
	{
	int c;
	c = a+b;
	System.out.println(c);
	}


	public static void main(String[] args) {
		int n=10;
		// TODO Auto-generated method stub
         Calculator Cal =new Calculator();
         Cal.add();
         multiply();
         printN(n);
	}


	private static void printN(int n) {
		printN(n-1);
		
		System.out.println(n);
		
	}


	private static void multiply() {
		
		
	}
	
	

}
