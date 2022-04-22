      /*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
*/

package pattern_programs;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern();
		pattern();
		pattern();

	}
	public static void pattern()
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
	}

}
}
