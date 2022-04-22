package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

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
	System.out.println("***Orioginal array***");
	System.out.println(Arrays.toString(a));
	
	for(int i=0;i<a.length/2;i++)
	{
		int temp=a[(a.length-1)-i];
		a[(a.length-1)-i]=a[i];
		a[i]=temp;
	}
	
	System.out.println("***Reversed array***");
	System.out.println(Arrays.toString(a));
	
	}

}
