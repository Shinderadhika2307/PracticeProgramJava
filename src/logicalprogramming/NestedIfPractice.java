//largest of tree numbers

package logicalprogramming;

import java.util.Scanner;

public class NestedIfPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is largest number");
			}
						
		}
		else if(b>c)
		{
			if(b>a)
			{
				System.out.println(b+" is largest number");
			}
			
			
		}
		else
		{
			System.out.println(c+" is largest");
		}
		

	}

}
