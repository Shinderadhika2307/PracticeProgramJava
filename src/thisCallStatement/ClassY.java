package thisCallStatement;

public class ClassY extends ClassX{
	{
		System.out.println("From IIB of ClassY");
	}
    ClassY()
	{
		super(15);
		System.out.println("From ClassY()");
	}
	ClassY(int a,double b)
	{
		this();
		System.out.println("from ClassY(int a,double b)");
	}
	ClassY( double a)
	{
		
	}

	public static void main(String[] args) {
	new ClassX();
	System.out.println("********************");
	new ClassX(10);
	System.out.println("********************");
	new ClassX(12.7);
	System.out.println("********************");
	new ClassY();
	System.out.println("********************");
	new ClassY(14,67.98);
	
	}

}
