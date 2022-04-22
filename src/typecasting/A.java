/*Widening */
package typecasting;

public class A {

	public static void main(String[] args)	
	{
		 byte b= 46; //-128 to 127
		 float a= b;  //byte to float
		 System.out.println(a);  //widening 46.0
		 
		 char ch='9';
		 double d= ch; //char to double
		 System.out.println(d);//widening 97.0
		 
		 short c=4567;
		 int e=c; //short to int
		 System.out.println(e);//widening 4567
		 
	}

}
