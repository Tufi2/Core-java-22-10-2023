package fawadPackage;
import java.util.*;

public class Basic2 {
	public static int add(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		
	int c=add(3,2);
	System.out.println(c);
	int[] array1= {1,7,4,78,9};
	Arrays.sort(array1);
	for(int i=0;i<array1.length;i++)
	{
		System.out.println(array1[i]);
	}

	}

}
