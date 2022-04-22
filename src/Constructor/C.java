//parameterize constructor

package Constructor;

public class C {
	int a=10;
	int b;
	String c;
	public C()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	} 
	public C(int a,int b,String c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		
	}
	

	public static void main(String[] args) {
	System.out.println("From main");

	//	C obj=new C(); // if user defined constructor is available, then we can not call default constructor
		// programmer explicitly need to add default constructor  
C c=new C();	
C obj= new C(1,2,"Radhika");
System.out.println(obj);
C obj1= new C(3,4,"Kisan");
System.out.println(obj1);

	}

}
