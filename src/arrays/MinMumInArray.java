package arrays;

import java.util.Scanner;

public class MinMumInArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter size of arreay");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Please enter elements of array: ");
	for(int i=0;i<size;i++)
	{
		System.out.println("enter your"+(i+1)+" element");
		a[i]=sc.nextInt();
	}
		
	
		int minNumber=a[0];
		{
		 for(int i=1;i<a.length;i++)
		 {
			 if(minNumber>a[i])
			 {
				 minNumber=a[i];
			 }
		 }
		 System.out.println("Minimum number is:"+minNumber);
		}

	}

}
