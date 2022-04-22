package Methods;

public class Sample {
	
int a=10;
String b="Sakshi";

static int c=20;
static String d="Radhika";
	public static void main(String[] args) {
		System.out.println(Sample.c);
		System.out.println(d);
		
		Sample k=new Sample();
		k.m1();
		m2();
		k.m3(100,200);

	}
	public void m1()
	{
		//Sample k=new Sample();
		System.out.println(a);
		System.out.println(b);
	
	}
	public static void m2()
	{
		Sample kk=new Sample();
		kk.m1();
	}
	public void m3(int a,int c)
	{
	this.a=a;
	this.c=c;
	System.out.println(this.a);
	System.out.println(this.c);
	this.a=this.c;
	System.out.println(this.a);
	}
	

}
