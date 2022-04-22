package Methods;

public class Method2 {

	public static void main(String[] args) {
	System.out.println("From Main");
	
	int d= add(2,8);
	System.out.println("Addition is: "+d);
	
	int e= multiply(2,4);
	System.out.println("Multiplication is: "+e);
	
	int f= division(2,4);
	System.out.println("Division is: "+f);
	
	int g= substraction(2,4);
	System.out.println("Addition is: "+g);
		

	}
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	public static int multiply(int a,int b)
	{
		int c=a*b;
		return c;
		
	}
	public static int division(int a,int b)
	{
		int c=a/b;
		return c;
		
	}
	public static int substraction(int a,int b)
	{
		int c=a-b;
		return c;
		
	}




}
