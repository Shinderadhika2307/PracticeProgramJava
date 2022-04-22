package interface2;
public class Calculate1 extends A implements Interface1 {
	public int calculate()
	{
		int a=30;
		int b=20;
		int c=a-b;
		return c;
	}
	public static void main(String args[])
	{
		A obj=new A();
		int c=obj.calculate();
		System.out.println("Addition is:"+c);
		Calculate1 obj1=new Calculate1();
		int d=obj1.calculate();
		System.out.println("substraction is:"+d);
	}
}
