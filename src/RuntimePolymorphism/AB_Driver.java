package RuntimePolymorphism;

public class AB_Driver {

	public static void main(String[] args) {
		A obj=new A();
		obj.toPrint(12, 13);
		A obj1=new B();
		obj1.toPrint(12, 13);
				
				

	}

}
