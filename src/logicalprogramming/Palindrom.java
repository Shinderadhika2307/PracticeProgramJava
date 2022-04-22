package logicalprogramming;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num= sc.nextInt();
		int temp=num;
		int c=0;
		while(temp>0)
		{
			int rem=temp%10;
			c=(c*10)+rem;  //main logic
			temp=temp/10;
			
		}
		if(c==num)
		{
			System.out.println("no is palindrom");
			
		}
		else
		{
			System.out.println("no is not palindrom");
		}

	}

}
