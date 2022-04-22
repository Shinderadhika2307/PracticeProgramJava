package constructorInheritance;

public class Z extends Y {
	Z()
	{
		super(10,'a');
		System.out.println("From Z()");
		
	}
	Z(int a)
	{
		super(10);
		System.out.println("from Z(int a)");
		
	}

}
