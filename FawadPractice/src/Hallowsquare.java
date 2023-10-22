import java.util.Scanner;
public class Hallowsquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
        int i;
		int j;
	
		
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 ||i==n-1||j==0||j==n-1)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}


