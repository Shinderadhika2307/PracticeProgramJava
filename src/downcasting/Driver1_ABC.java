package downcasting;

public class Driver1_ABC {

	public static void main(String[] args) {
		//A obj=new C() ClassCastException no instance for B and C
		A obj1=new C(); //instance for B &C
		System.out.println(obj1.a);
		//System.out.println(obj1.b);
		//System.out.println(obj1.c); we can call only inherited properties of A
		
		B obj2=(B)obj1;  //Downcasting
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		//System.out.println(obj2.c); //we can call only inherited properties of A & B
		
		C obj3=(C)obj1;   //Downcasting
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.c);
		
	
	}

}
//ClassCastException generally occurs during downcasting
//while downcasting superclass reference into subclass reference which does not have instance in the object.