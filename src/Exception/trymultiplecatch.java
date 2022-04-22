package Exception;

public class trymultiplecatch {

	public static void main(String[] args) {
try
{
	int a=10;
	int b=0;
	System.out.println(a/10);
	
}

catch(Exception obj)
{
	System.out.println("Exception handled");
}
//    catch(ArithmeticException obj1)
//    {
//    System.out.println("Exception handled");	
//    }

	}

}
//it will generate compiletime error
//suitable catch block is checked from top to bottom
//in catch block superclass must be written at bottom

