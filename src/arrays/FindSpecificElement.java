package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindSpecificElement {

	public static void main(String[] args) {
		System.out.println("*****Enter input from user*****");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size]; //declare and instantiate array
		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++) //initialize array
		{
		System.out.println("Enter "+(i+1)+ " element:");
		a[i]=sc.nextInt();
		
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter element you want to find");
		int p=sc.nextInt();
		
		findElement(a,p);

	}
	public static void findElement(int []a,int element)
	{
		for(int i=0;i<a.length;i++) {
			if(a[i]==element)
			{
				System.out.println(element+ "is present at " + (i+1)+ " position");
			}
			
			
		}
		
	}

}
