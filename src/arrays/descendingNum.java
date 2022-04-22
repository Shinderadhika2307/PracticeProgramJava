package arrays;

import java.util.Arrays;

public class descendingNum {

	public static void main(String[] args) {
		int a[]= {5,1,9,5,9}; 
		
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
				
			}			
			
		}
		System.out.println("Descending order is:");
		System.out.println(Arrays.toString(a));

	}

}
