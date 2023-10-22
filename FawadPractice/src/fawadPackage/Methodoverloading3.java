package fawadPackage;

public class Methodoverloading3 {
	static void tufii() {
		System.out.println("Asalamualiakum akhi");
	}
	static void tufii(int a ) {
		System.out.println(  "Asalamualiakum akhi! " + a + " please!");
	}
		static void tufii(double a) {
			System.out.println("Asalamualiakum akhi! " + a + " please!");
		}
		
	

	public static void main(String[] args) {
		tufii();
		tufii(500);
		tufii(50.0);
		

	}

}
