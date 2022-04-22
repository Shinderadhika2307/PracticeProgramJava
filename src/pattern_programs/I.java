package pattern_programs;

public class I {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)  //for rows
		{
		
			
			for(int j=4;j>=i;j--)   //for space
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)  //for *
			{
				if(k==1)
				{
				System.out.print("* ");
				}
				else {
				System.out.print("* " + "* ");
				}
			}
			System.out.println();
		}
		
	}
}
