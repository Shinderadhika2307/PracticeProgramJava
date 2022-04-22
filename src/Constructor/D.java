//Consructor Overloading

package Constructor;

public class D {
	int a;
	public D()
	{
		System.out.println("From D()");
	}

	public D(int a)
	{
	System.out.println(" From D(int a)");
	System.out.println(this.a); //0
	System.out.println(a);   //10
	this.a=a;
	System.out.println(this.a);   //10
	
	}
	public D(int a,int b)
	{
		System.out.println(" From D(int a, int b)");
		System.out.println(this.a);   //0   every constructor will take default value of global variable..it will not change from constructor to constructor 
		System.out.println(a);       //100
		System.out.println(b);   //200
	}
	public static void main(String[] args) {
	new D();
	new D(10);
	new D(100,200);

		

	}

}
