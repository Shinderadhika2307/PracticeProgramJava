
//This() statement is used to call the constructor of same class
//It is used to achieve constructor chaining within class
//we cannot have Super() statement and this() statement in one constructor

package thisCallStatement;

public class A {
	{
		System.out.println("From IIB of A");
	}
	A()
	{
		System.out.println("From A()");
	}
	A(int a)
	{
		this();
		System.out.println("From A(int a)");
		
	}
	public static void main(String[] args) {
		A obj= new A();
		A obj1=new A(10);

	}

}
/* after compilation A() work like
A()
{
super();
-------
------
System.out.println("From IIB of A");
System.out.println("From A()");
}
*/