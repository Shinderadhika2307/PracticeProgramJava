package Constructor;

public class H {
	int a=100;
	int b=200;
	public H()
	{
		
	}
	public H(int c,int d)
	{
		a=c;
		b=d;
	}

	public static void main(String[] args) {
		System.out.println("From Main....");
		H kk=new H();
		H kkk=new H(300,400);
		System.out.println(kk.a);  //100
		System.out.println(kk.b);   //200
		System.out.println(kkk.a);    //300
		System.out.println(kkk.b);   //400
		kk.m1();
		kkk.m1();
		m2();  //static method no need to call through object
			

	}
	public void m1()
	{
		System.out.println("From m1()....");
		System.out.println(a);  //100 //we can call nonstatic variable through nonstatic method without using object, because already object is created for method.
	}
	
	public static void m2()
	{
		System.out.println("From m2()....");
		H kk=new H();           //objects are local to perticular method only
		System.out.println(kk.a);
	}

}
