
public class Pattern08 {

	public static void main(String[] args) {
		int i;
		int j;
		int n = 7;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				if(j==1 || i==1 || j==n-i+1 )
				{
					System.out.print(i+j-1+ " ");
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


