//seprate even and odd numbers from given range
package Methods;

public class EvenOdd {
	public static void evenOdd(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ "is even number");
			}
		
			else if(i%2!=0)
			{
				System.out.println(i+ "is odd number");
			}
		}
		
	}

	public static void main(String[] args) {
		evenOdd(10,30);
		

	}

}
