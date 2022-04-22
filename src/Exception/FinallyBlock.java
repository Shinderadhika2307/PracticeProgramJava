package Exception;

public class FinallyBlock {

	public static void main(String[] args) {
	try {
	
		int a=10;
		int b=0;
		int c=a/b;
	}
/*	catch(Exception e)
	{
		System.out.println("handled");
		System.out.println(e);
	} */
	finally
	{
	System.out.println("This is end");
	}
	
	}

}
//Finally block gets executed in all the following scenarios
//exception is not occurred
//Exception occured and handled
//Exception occured and not handled
//statement which are mandatory to be executed must be written iside finally block

