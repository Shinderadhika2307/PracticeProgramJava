//WAP to count occurance of specific word from given sentence
package String;

import java.util.Arrays;
import java.util.Scanner;

public class CountSpecificWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence:");
		String s=sc.nextLine();
		System.out.println("Enter Word to check:");
		String ss=sc.next();
		String []s1=s.split(" ");
		System.out.println(Arrays.toString(s1));
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equalsIgnoreCase(ss))
			{
				count++;
			}
		}
		System.out.println(ss+" is occured "+count+" times ");

	}

}
