package Methods;

public class Method3 {

	public static void main(String[] args) {
		int p=10;
		int q=20;
		
		System.out.println("Addition is: " +add(p,q));
		System.out.println("Multiplication is: " +multiply(p,q));
		System.out.println("Division is: " +division(p,q));
		System.out.println("Substraction is: " +substraction(p,q));
		//System.out.println("Addition is: " +add(p));  CTE, Actual arguments and formal arguments should be same
		

	}
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	public void add(int a,int b,int c)
	{
		
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
