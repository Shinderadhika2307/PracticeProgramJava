/* declaration, initialization and reinitialization */
package variables;

public class A {
public static void main(String[]args)
{
	int a;//declaration
	a=200;//initialization
	
	String s="Radhika Sambhaji Deshmukh";//declaration and initialization
	
	char ch1='a',ch2='1',ch3='$';// multiple declaration and initialization in single line
	
	boolean b;
	boolean c;
	b=false;
	c=true;
	//b= false, c=true; CTE
	System.out.println(a);
	a=100; // Reinitialization of a
	System.out.println(a);
	System.out.println(s);
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println(ch3);
	System.out.println(b);
	System.out.println(c);
}
}

