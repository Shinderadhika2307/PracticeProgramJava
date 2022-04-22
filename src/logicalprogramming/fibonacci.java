package logicalprogramming;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers you want in fibonacci series:");
		int num=sc.nextInt();
		int f1=0;
		int f2=1;
		int fibo;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=2;i<num;i++)
		{
			fibo=f1+f2;
			System.out.println(fibo);
			f1=f2;
			f2=fibo;
			
		}
			
				
		
				

	}

}
