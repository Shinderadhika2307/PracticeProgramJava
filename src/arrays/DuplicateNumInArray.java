package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumInArray {

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
	
for(int i=0;i<(a.length);i++)
{
	int count=0;
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j] )
		{
		count=count+1;
		//System.out.println(a[i]);
		}
		
	}
	if(count==0)
	{
		continue;
	}
	System.out.println(a[i]+ " is repeated "+count+ " times");
	
}

	}

}
