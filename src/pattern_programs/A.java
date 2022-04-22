/*

        * 
      * * 
    * * * 
  * * * * 
* * * * *  

*/

package pattern_programs;

public class A {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)  //for rows
		{
			
			for(int j=4;j>=i;j--)   //for space
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)  //for *
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
