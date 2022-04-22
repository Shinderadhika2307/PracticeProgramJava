package Upcasting;

public class Driver_AB {

	public static void main(String[] args) {
		A p=new B();
		p.m1();
		//p.m2(); we can call only inherited properties of superclass
//or
		B obj=new B();
		A obj1=obj;
		obj1.m1();
		//obj1.m2(); we can call only inherited properties of superclass
	}
}
//converting subclass reference to superclass reference