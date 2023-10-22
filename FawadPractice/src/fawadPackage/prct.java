package fawadPackage;
import java.util.*;
public class prct {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=scan.nextInt();
		int[] array_name=new int[size];
		System.out.println("Enter arry elements");
		for(int i=0;i<size;i++)
		{
			array_name[i]=scan.nextInt();
		}
		System.out.print("Array value are:");
		for(int j=0;j<size;j++)
		{
			System.out.println( array_name[j]);
		}
	 	 
	

	}

}
