package Exception;

public class nestedtrycatch {

	public static void main(String[] args) {
		System.out.println(1);
		try
		{
			try
			{
				int[]a=null;
				System.out.println(a[2]);
				
			}
			catch(NullPointerException e)
			{
				System.out.println("handled");
			}
		
			
		System.out.println(2);
		System.out.println(3);
		System.out.println(10/0);
		
		}
		catch(ArithmeticException obj)
		{
			System.out.println("handled");
		}
		System.out.println(4);
	}

}
//we can use try catch inside another try catch and it is called as nested try catch