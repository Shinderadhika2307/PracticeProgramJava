package abstraction;

public class Driver_ABC {

	public static void main(String[] args) {
		A obj=new C();
		obj.test();
		obj.demo();

		B obj1=(B)obj;
		obj1.test();
		obj1.demo();
		
	}

}
