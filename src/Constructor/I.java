package Constructor;

public class I {
	int a=10;
	int b=20;
	I()
	{
		
	}
	I(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		I obj=new I();
		obj=new I(30,40); //reinitialize
		
		I obj1=new I(100,200);
		obj1=new I();   //reinitialize constructor
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj1.a);
		System.out.println(obj1.b);

		
	}

}
