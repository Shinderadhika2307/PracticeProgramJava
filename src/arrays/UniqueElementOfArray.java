package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementOfArray {

	public static void main(String[] args) {
		System.out.println("*****Enter input from user*****");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++)
		{
		System.out.println("Enter "+(i+1)+ " element:");
		a[i]=sc.nextInt();
		
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Unique  numbers are: ");
		
	for(int i=0;i<(a.length);i++)
	{
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				a[i]=0;
				
			}
		}
		if(a[i]!=0)
		{
			System.out.println(a[i]);
		}
		
		}
		}

}
