package logicalprogramming;

import java.util.Scanner;

public class EvenOddGivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int i= sc.nextInt();
		for(int a=1;a<=i;a++)
		{
			
			if(a%2==0)
			{
				System.out.println(a+" is Even number");
			}
			else 
			{
				System.out.println(a+" is odd number");
			}
		}
		
		
	
			}

}
