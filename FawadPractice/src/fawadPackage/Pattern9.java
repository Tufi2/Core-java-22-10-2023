package fawadPackage;

public class Pattern9 {

	public static void main(String[] args) {
		int  n =10;
		for(int i = 1; i<=n;i++)  // i can also take i = 1; i<=n 
		{
			for(int j = 1; j<=i;j++) 
			{
				if(i<10)
				{
					System.out.print("0");
				}
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
