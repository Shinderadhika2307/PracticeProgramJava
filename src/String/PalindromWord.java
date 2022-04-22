package String;

import java.util.Scanner;

public class PalindromWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word:");
		String s1=sc.next();
		String rword="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rword=rword+s1.charAt(i);
		}
		System.out.println(rword);
if(rword.equals(s1))
{
	System.out.println("given word is palindrome");
}
else
{
	System.out.println("not palindrom");
}
	}

}
