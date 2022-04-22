package String;

public class ReverseString1 {

	public static void main(String[] args) {
		String s1="Rose is flower";
		String []s=s1.split(" ");
		String s2=" ";
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			s2=" "+word+s2;
		}
		String s4=s2.trim();
		System.out.println(s4);
		
	}

}
