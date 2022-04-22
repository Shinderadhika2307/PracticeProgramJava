//print  numbers in given range

package Methods;

public class givenRange {

	public static void givenRange(int a,int b)
	{
		System.out.println("numbers in given range are: ");
		for(int i=a;i<=b; i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("From main");
		givenRange(10,20);
		givenRange(1,10);

	}

}
