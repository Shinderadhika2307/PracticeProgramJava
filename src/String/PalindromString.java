package String;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String s1=sc.nextLine();
		String[]s2=s1.split(" ");
		String NewString="";
		for(int i=s2.length-1;i>=0;i--)
		{
			NewString=NewString+s2[i]+" ";
		}
		System.out.println("Reverse String is: "+NewString);
		String s3=NewString.trim();
		
		if(s3.equals(s1))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}

	}

}
