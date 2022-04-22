package logicalprogramming;

import java.util.Scanner;

public class UsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		switch(num%2)
		{
		case 0:
			System.out.println("number is even");
			break;
		case 1:
			System.out.println("number is odd");
			break;
			
		}

	}

}
