package variables;

public class LocalVariable1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		m2();
		m1();
		m3();
		
	}
	public static void m1()
	{
		char ch='a';
		System.out.println(ch);
	}
	public static void m2()
	{
		String velocity="Testing Institute";
		System.out.println(velocity); 
	}
	public static void m3()
	{
		boolean b=false;
		System.out.println(b);
	}

}
