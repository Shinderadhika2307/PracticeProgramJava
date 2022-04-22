package inherritance;

public class Flower {
	static String type;
	String color;
	int petals;

	public static void smell(String s)
	{
		System.out.println(type+" having"+s+"smell");
		
	}
	public void use(String s)
	{
		System.out.println("Use Of "+type+" is "+s);
	}

}
