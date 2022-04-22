package Exception;

import java.util.Scanner;

public class SalaryExceptionDriver {
int salary;
SalaryExceptionDriver (int salary)
{
	this.salary=salary;
	System.out.println(this.salary);
}
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter Salary");
int sal=sc.nextInt();
if (sal>=15000)
{
	SalaryExceptionDriver e1=new SalaryExceptionDriver(sal);
}
else
{
	throw new SalaryException();
}
	}

}
