package Exception;

public class trymultiplecatch1 {

	public static void main(String[] args) {
	System.out.println(1);
try
{
	int[]a= {10,20,30};
	System.out.println(a[5]);
}
catch(ArithmeticException obj)
{
	System.out.println(obj);
}
catch(ArrayIndexOutOfBoundsException obj1)
{
	System.out.println(obj1);
}
catch(RuntimeException obj2)
{
	System.out.println(obj2);
}
	}

}
//a try can have multiple catch blocks and suitable catch block will gets executed

