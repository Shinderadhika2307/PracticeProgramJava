/*

         *  
       *   *  
     *   *   *  
   *   *   *   *  
 *   *   *   *   *  

*/


package pattern_programs;

public class C {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("  "); //two spaces
			}
			for(int k=1;k<=i;k++)  
			{
				System.out.print(" *  ");   //one space before, two space after
			}
			System.out.println();
		}

	}

}
