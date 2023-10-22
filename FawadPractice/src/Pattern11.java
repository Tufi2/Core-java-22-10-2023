
public class Pattern11 {

	public static void main(String[] args) {
		int i;
		int j;
		int n = 5;
		int count = 1;
		for(i=1;i<=n;i++)
		{
			count=1;
			for(j=1;j<=(2*i)-1;j++)
			{
				System.out.print(count + " ");
				if(i>j)
				{
				count++;
			}
				else
				{
					count--;
				}
			System.out.println();
			
		}
		

	}

	}
}
