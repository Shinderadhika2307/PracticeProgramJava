package logicalprogramming;

import java.util.Scanner;

public class LargestOfThreeNmber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente any 3 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c) //a>b a>c a>b>c
			{
				System.out.println(a+"is gretter");
			}
			else //a>b a<c  c>a>b
			{
				System.out.println(c+"is gretter");
			}
		}
		else //first if condition fails means a<b
		{
			if(b>c) //b>a>c
			{
				System.out.println(b+" is gretter");
			}
			else //b<c a<b a<b<c
			{
				System.out.println(c+" is gretter");
			}
		}

	}

}
