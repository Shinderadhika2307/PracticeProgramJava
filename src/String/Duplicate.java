//find duplicate word from string
package String;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter string:");
		String s1=sc.nextLine();
		String[] s2=s1.split(" ");
		Arrays.sort(s2);
		
		System.out.println(Arrays.toString(s2));
		for(int i=0;i<s2.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].equalsIgnoreCase(s2[j]))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count>1)
			{
			System.out.println(s2[i]+" is repeated "+count+" times");
			i=i+(count-1);
			}
		}
		

	}

}
