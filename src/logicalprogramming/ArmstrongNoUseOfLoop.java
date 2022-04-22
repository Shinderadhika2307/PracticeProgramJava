package logicalprogramming;

import java.util.Scanner;

public class ArmstrongNoUseOfLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 digit number:");
		int a=sc.nextInt();
		int temp=a;
		int c=0;
		int p=temp%10;
		temp=temp/10;
		
		int q=temp%10;
		temp=temp/10;
		
		int r=temp%10;
		
		c=p*p*p+q*q*q+r*r*r;
		if(c==a)
		{
			System.out.println("no is armstrong");
			
		}
		else
		{
			System.out.println("no is not armstrong");
		}
		
		

	}

}
