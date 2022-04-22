
//WAP to print given character is in range e to j or not
package logicalprogramming;

import java.util.Scanner;

public class CharacterInRangeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter character to check");
		char ch=sc.next().charAt(0);
		if(ch>='e' && ch<='j' || ch>='E' && ch<='J')
		{
			System.out.println(ch+" is in given range");
		}
		else
		{
			System.out.println(ch+" is in not in given range");
		}

	}

}
