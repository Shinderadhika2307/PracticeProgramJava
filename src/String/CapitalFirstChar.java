//Capitalize first char of each word in string
package String;

import java.util.Scanner;

public class CapitalFirstChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter sentense:");
		String s1=sc.nextLine();
		String s2="";
		String []s3=s1.split(" ");
		String NewWord="";
		for(int i=0;i<s3.length;i++)
		{
		String w=s3[i];
			for (int j=0;j<w.length()-1;j++)
			{
				String first=w.substring(0,1);
				String afterfirst=w.substring(1);
				NewWord=first.toUpperCase()+afterfirst;			
				
				
			}
			s2=s2+NewWord+" ";
		}
		String s4=s2.trim();
		System.out.println(s4);
	}

}
