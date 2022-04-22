package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargest {
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
			int secondLarg=seconLargest(a);
			System.out.println("Second largest element is: "+secondLarg);
		}
			public static int seconLargest(int []a)
		{
			int firstLargest=0;
			int secondLargest=0;
			if(a[0]>a[1])
			{
	     	 firstLargest=a[0];
	       	secondLargest=a[1];
			}
			else
			{
				firstLargest=a[1];
				secondLargest=a[0];
			}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>firstLargest)
			{
				secondLargest=firstLargest;
				firstLargest=a[i];
			}
			else if(a[i]>secondLargest)
			{
				secondLargest=a[i];
			}
		}
		return secondLargest;
		}

	}


