package fawadPackage;

public class Nonstatic {
	void dumb() 
	{
		System.out.println("F");
				
				
	}
	static void deaf()
	{
        System.out.println("Are you dumb or what?!");
	}
	
	public static void main(String[] args) {
		System.out.println("Hi there!");
		deaf();
		Nonstatic x1= new Nonstatic();
		x1.dumb();
		

	}

}
