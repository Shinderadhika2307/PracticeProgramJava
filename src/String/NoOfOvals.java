
//WAP to count no of ovals in given String
package String;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfOvals {

	public static void main(String[] args) {
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter String");
		String s1=sc.nextLine();
		char[]ch=s1.toCharArray(); //String to character Array
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' ||ch[i]=='e'|| ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||
					ch[i]=='A' ||ch[i]=='E'|| ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U')
				{
				
						count++;
				}
	}
		
		System.out.println("no of ovals are:"+count);

}
}