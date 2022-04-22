/* each datatype have specific length, hence it can save perticular size data */
package datatypes;

public class A {
public static void main(String[] args)
{
	byte a=127;
	short b= 122;
	int c= 267908904;
	long p= 5789; //it is not compulsory to write "L" at end.
	long d= 45678909690L;// If number is bigger than integer capacity(10 digit), letter "L" required to add at last. 
	long e=12L; //If we  add "L" for small number, it will not show error
	
	float f= 70.5f; //  float datatype always require "f" at end of digits.
	double g= 654679.9786544899; // it is not compulsory to write "d" at end
	double h= 5677.89776d; // If number is bigger than floating capacity, letter "d" required to add at last.
	double i= a;
	
	System.out.println(a); 
	System.out.println(b);  
	System.out.println(c);  
	System.out.println(d);
	System.out.println(p);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
	
	
}
}
