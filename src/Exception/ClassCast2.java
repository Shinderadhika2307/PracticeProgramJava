package Exception;

public class ClassCast2 extends ClassCast1 {

	public void test1()
	{
		System.out.println("from test1()");
		

	}
	public static void main(String[]args)
	{
		ClassCast1 obj=new ClassCast1();
		ClassCast2 obj1=(ClassCast2)obj;//no object or no instance for subclass
		System.out.println(obj1);
	}

}
