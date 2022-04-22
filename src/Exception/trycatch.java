package Exception;

public class trycatch {

	public static void main(String[] args) {
	System.out.println(1);
	try
	{
		int a=10;
		int b=0;
		int c=a/b;
	}
	catch(ArithmeticException obj)//(exception obj)//(RunTimeException obj)//(throwable e)
	{
		System.out.println(obj);
		System.out.println("dont devide by 0");
	}
	System.out.println(2);

	}
	

}
//try
//statement which are responcible for exception must be written in try block
//whenever exception occure try block throws object of any  throwable class hierarchy which is created by JVM
//catch
//catch block is used to catch the thrown throwable type object
//if object is called that means exception is handled
//if object not called exception not handled

//exception handling mechanism allows programmer to continue the execution of program