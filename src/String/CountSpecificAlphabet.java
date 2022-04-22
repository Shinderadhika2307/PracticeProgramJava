//WAP to count no of specific alphabet/character in given string
package String;

import java.util.Arrays;
import java.util.Scanner;

public class CountSpecificAlphabet {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter Sentence:");
	String s=sc.nextLine();
	System.out.println("Enter alphabet to search");
    char ch=sc.next().charAt(0);
    char[]c=s.toCharArray();
    System.out.println(Arrays.toString(c));
    int count=0;
    for(int i=0;i<c.length;i++)
    {
    	if(c[i]==ch)
    	{
    		count++;
    	}
    	
    }
    System.out.println("character repeated "+count+" times");
	}

}
