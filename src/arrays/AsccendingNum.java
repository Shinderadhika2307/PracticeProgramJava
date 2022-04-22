package arrays;

import java.util.Arrays;

public class AsccendingNum {

	public static void main(String[] args) {
		int a[]= {45,34,19,41,9};
		System.out.println("Array elements are ");
		//print array elements first
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//for asccending order
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
				
			}
		}
				System.out.println("assending order is:");
				
				
				System.out.println(Arrays.toString(a));
				
			}
		

	}


