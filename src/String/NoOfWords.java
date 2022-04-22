//WAP to count no of words in given String
package String;

import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter String:");
		String s=sc.nextLine();
		int count=0;
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			count++;
		}
		System.out.println("No of words in string are:"+count);
		
		

	}

}
