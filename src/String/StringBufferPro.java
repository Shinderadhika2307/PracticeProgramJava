package String;

public class StringBufferPro {
	public static void main(String[]args)
	{
	System.out.println("*************Using StringBuffer************");
		
	StringBuffer s1=new StringBuffer("Schools are closed.");
	StringBuffer s2=s1;
	System.out.println(s1.append("Reopen in June."));
	System.out.println(s1);
	System.out.println(s2);
	System.out.println("*************Using String****************");
	String s3=new String("Schools are closed.");
	String s4=s3;
	System.out.println(s4.concat("Reopen in June."));
	System.out.println(s3);//original string object not change
	System.out.println(s4);//original string object not change
	}
}
//append method worrks like concatenation