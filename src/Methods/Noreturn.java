/* we can have return statement in a method which has returntype void*/
/* that return statement returns any value*/


package Methods;

public class Noreturn {

	public static void main(String[] args) {
		System.out.println("From main");
		test();
		

	}
	public static void test()
	{
		int a=10;
		System.out.println(a);
		return;
		//  System.out.println(a); //return statement should be last statement of block or method //CTE
		}
	

}
