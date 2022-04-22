//object is nothing but address or reference of constructor

package Constructor;

public class A {
	A()
	{
		System.out.println("From constructor A");
	} 

	public static void main(String[] args) {
		System.out.println("From Main");
		A obj=new A();
		System.out.println(obj);   //Prints address of reference of constructor
		

	}

}


