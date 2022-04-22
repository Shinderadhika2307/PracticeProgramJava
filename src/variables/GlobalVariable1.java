//static global variables

package variables;

public class GlobalVariable1 {
static int Emp_id=10;
static String Name="Radhika";
static String Designation="Autonation Testing Engineer";

	public static void main(String[] args) {
		
		String Name="Radhika Kisan Shinde";
		System.out.println("--------Employee Details-------");
		System.out.println("Employee id is: "+Emp_id); //10
		System.out.println("Employee name is: "+GlobalVariable1.Name); //global variable
		System.out.println("Full name is: "+Name); //local variable
		System.out.println("Designation is: "+Designation);
		
		

	}

}
