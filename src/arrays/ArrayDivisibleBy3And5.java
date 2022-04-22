
//WAP to generate first 10 numbers which are divisible by 3 & 5..Store them in array..print elements of array
package arrays;

import java.util.Arrays;

public class ArrayDivisibleBy3And5 {

	public static void main(String[] args) {
		int a[]=new int[10];
		int j=1;
		for(int i=0;i<a.length;j++)
		{
			if(j%3==0 && j%5==0)
			{
				a[i]=j;
			i++;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
