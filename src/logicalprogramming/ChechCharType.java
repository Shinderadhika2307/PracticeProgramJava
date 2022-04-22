package logicalprogramming;

import java.util.Scanner;

public class ChechCharType {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character:");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is alphabet");
			if(ch>='a' && ch<='z')
			{
				System.out.println(ch+ " is Lowercase Alphabet");
			}
			else if(ch>='A' && ch<='Z')
			{
				System.out.println(ch+ " is Uppercase Alphabet");
			}
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is digit");
			
		}
		else if(ch==' ')
		{
			System.out.println(ch+ " is space");
		}
		else
		{
			System.out.println(ch+" is special character");
		}

	}

}
