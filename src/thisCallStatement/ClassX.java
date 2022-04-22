package thisCallStatement;

public class ClassX {
	{
		System.out.println("From IIB of ClassX");
	}
	ClassX()
	{
		System.out.println("From ClassX()");
	}
	ClassX(int a)
	{
		this(10.5);
		System.out.println("From ClassX(int a)");
	}
	ClassX(double a)
	{
		this();
		System.out.println("from ClassX(double a)");
	}


}
