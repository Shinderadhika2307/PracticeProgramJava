package constructorInheritance;

public class Y extends X {
	Y(double a)
	{
		super('a');
	
		System.out.println("From Y(double a)");
		
	}
	Y(int a,char b)
	{
		super(10);
		System.out.println("From Y(int a,char b)");
	}

}
