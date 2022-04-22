package String;

import java.util.Scanner;

public class DeleteSpecificWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter sentence:");
		String s1=sc.nextLine();
		System.out.println("Enter word to remove:");
		String word=sc.next();
		String NewString="";
		String[]ss=s1.split(" ");
		for(int i=0;i<ss.length;i++)
		{
			if(ss[i].equalsIgnoreCase(word))
			{
				
				continue;
				
			}
			NewString=NewString+ss[i]+" ";
			
		}
		System.out.println("final sentence is:"+NewString);

	}

}
