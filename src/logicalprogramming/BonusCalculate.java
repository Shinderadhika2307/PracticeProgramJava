//Calculate bonus
package logicalprogramming;

import java.util.Scanner;

public class BonusCalculate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Salary:");
		int salary=sc.nextInt();
		
		System.out.println("Enter grade:");
		int grade=sc.nextInt();
		
		System.out.println("Enter Expereince:");
		int Experiance=sc.nextInt();
		
		if(Experiance>2)
		{
			if(grade>4)
			{
				System.out.println("You are applicable for 15% bonus");
				int bonus=salary*15/100;
				System.out.println("bonus ammount is"+bonus);
				int new_salary;				
				new_salary=salary+bonus; //or  //bonus_salary=115*salary/100;
				System.out.println("Your salary including bonus is:" +new_salary);
				
			}
		}
		else
		{
			System.out.println("you are not applicable for bonus");
		}

	}

}
