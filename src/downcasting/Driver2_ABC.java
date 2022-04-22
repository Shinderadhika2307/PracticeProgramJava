//ClassCastException

package downcasting;

public class Driver2_ABC {

	public static void main(String[] args) {
		A obj=new B(); //no instance for class C
		System.out.println(((B)obj).a); //B obj1=(B)obj; same meaning
		System.out.println(((B)obj).b);
		System.out.println(((C)obj).c); //ClassCastException 
		
			

	}

}
