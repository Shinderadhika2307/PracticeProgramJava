package String;

import java.util.Arrays;

public class DuplicateChar {

	public static void main(String[] args) {
		String s="afffhhhkkkbbb";
		char[]a=s.toCharArray();
		Arrays.sort(a);;
		System.out.println(Arrays.toString(a));
	
		for(int i=0;i<a.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
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
				System.out.println(a[i]+" is repeated "+count+ " times");
				i=i+(count-1);
			}
		}

	}

}
