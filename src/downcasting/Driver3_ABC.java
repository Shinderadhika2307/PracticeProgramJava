package downcasting;

public class Driver3_ABC {

	public static void main(String[] args) {
		A obj=new B();
		B obj1=(B)obj;
		System.out.println(obj1 instanceof Object);
		System.out.println(obj1 instanceof A);
		System.out.println(new B() instanceof B); //same meaning
		System.out.println(new B() instanceof C);

	}

}
//instanceOf operator used to check object is having instance of given class or not.