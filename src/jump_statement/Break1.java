
//write a program to print only odd numbers in between 200 to 100
//if any odd number is divisible by 6 and 7 then stop printing

package jump_statement;

public class Break1 {

	public static void main(String[] args) {
		for(int i=200;i>=100;i--)
		{
			if(i%2==1)
			{
				if(i%3==0 && i%7==0)
				{
					System.out.println("..breakpoint..");  //breaks at 189
					break;
				}
				System.out.println(i);
			}
		}
	}

}

//break should be last statement of block
//if we put any statement after break compiler throws unreachable code error
