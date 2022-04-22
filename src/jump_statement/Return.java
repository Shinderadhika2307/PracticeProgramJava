package jump_statement;

import java.util.Scanner;

public class Return {

	public static void main(String[] args) {
		int salary=salary();
		int increment=salary*10/100;
		System.out.println("incremet is: "+increment);
		int new_salary=salary+increment;
		System.out.println("new salary is"+new_salary);

	}
	
	public static int salary()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String s=sc.nextLine();
		System.out.println("Enter your salary");
		int a=sc.nextInt();
			return a;
		
		
	}

}

//return statement should last statement of block
//value which is returned & return type should be same
//same datatype should use to save returned value
//return statement can return value (10), variable (a) or expression (a*b)