
// Hi- if number is even and divisible by 3
//hello - if number is even
//bye -if number is odd and divisible by 3 and 5
//good bye- if none of the above



package logicalprogramming;

import java.util.Scanner;

public class selectionstatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number to check");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Hello..");
			if(num%3==0)
			{
				System.out.println("Hi..");
			}
			
		}
		else if(num%2==1 && num%5==0 && num%3==0)
		{
			System.out.println("bye..");
		}
		else
		{
			System.out.println("Good Bye..");
		}

	}

}
