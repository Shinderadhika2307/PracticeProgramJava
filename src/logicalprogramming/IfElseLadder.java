package logicalprogramming;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		System.out.println("Enter total marks:");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=75 && marks<=100 )
		{
			System.out.println("Distiction");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("First Class");
		}
		else if(marks>=35 && marks<60)
		{
			System.out.println("Pass");
		}
		else if(marks<35)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("invalid marks entered");
		}
			

	}

}
