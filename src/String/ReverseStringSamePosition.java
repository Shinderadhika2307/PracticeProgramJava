package String;

import java.util.Arrays;

public class ReverseStringSamePosition {

	public static void main(String[] args) {
		String s1="Rose is Flower";
		String[]s=s1.split(" ");
		String s2="";
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			String rword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				rword=rword+word.charAt(j);
			}
			s2=s2+rword+" ";
}
System.out.println(s2);		
		
		
	}

}
