package Constructor;

public class F {
int a;
int b;
public F(int a,int b)
{
	this.a=a;
	this.b=b;
	System.out.println(this.a);
	System.out.println(this.b);

}
public F()
{
	System.out.println(this.a);
	System.out.println(this.b);
}

public static void main(String[] args) {
		System.out.println("From main");
F obj=new F(10,20);
F obj1=new F(30,40);
F obj2=new F();
obj2.a=100;
obj2.b=200;
System.out.println(obj2.a);
System.out.println(obj2.b);
System.out.println(obj1.b);
obj.test(); //we can call non static method using object
obj1.test();
	}
public void test()
{
	System.out.println("Called through object");
}

}
