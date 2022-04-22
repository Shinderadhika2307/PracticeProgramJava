package Exception;

public class trycatch1 {

	public static void main(String[] args) {
		System.out.println(1);
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
		}
		catch(NullPointerException obj)
		{
			System.out.println(obj);
		}
		System.out.println(2);
	}

}
