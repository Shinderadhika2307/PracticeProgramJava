
//WAP to generate first 10 odd numbers,store them in arrays and print elements of array

package arrays;

import java.util.Arrays;

public class StoreOddNumInArray {

	public static void main(String[] args) {
		int a[]=new int[10];
		int j=1;
		for(int i=0;i<a.length;j++)
		{
			if(j%2==0)
			{
				a[i]=j;
				i++;  //if odd then only number store in array and i index will increase by 1
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
