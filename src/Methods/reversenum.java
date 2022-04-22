//print number from 100 to 1

package Methods;

public class reversenum {
	public void reverseNum(int a, int b)
	{
		System.out.println("reverse numbers are");
		for(int i=a;i>=b;i--)
		{
		System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		reversenum obj=new reversenum();
		obj.reverseNum(100,1);
		obj.reverseNum(23, 0);

	}

}
