package Constructor;

public class J {
	int a;
	long b;
	
	public J(int a, long b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}
		

	public static void main(String[] args) {
		
		new J(100,(long)50); //bydefult integer value is considered as int, so for byte and short we have to do typecasting.
		

	}

}
