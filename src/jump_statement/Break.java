
//write a program to print 1 to 10 numbers
//If in between any number is divisible by 3 and 6 then stop printing

package jump_statement;

public class Break {

	public static void main(String[] args) {
		
		System.out.println("...using for...");
		for(int i=1;i<=10;i++) //range 1 to10
		{
			if(i%3==0 && i%6==0) //break if number is divisible by 3 and 6 
			{
				System.out.println("..breakpoin...");
				break;  //break should be last statement of block
						}
			System.out.println(i);
		}
		
		
		
		
		System.out.println("...using while...");
		int i=1;
		while(i<=10) //range 1 to10
		{
			if(i%2==0 && i%4==0)     //break if number is divisible by 2 and 4
			{
				System.out.println("..breakpoin...");
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
