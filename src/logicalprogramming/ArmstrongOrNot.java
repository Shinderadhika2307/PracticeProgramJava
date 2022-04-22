//armstrong or not using while loop
package logicalprogramming;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check:");
		int num=sc.nextInt();
	int temp=num;
	int num1=0;
	while(temp>0)
	{
		int reminder=temp%10;
		num1=num1+reminder*reminder*reminder;
		temp=temp/10;
	
	}
	System.out.println("number is: "+num1);
	if(num==num1)
	{
		System.out.println("number is armstrong");
	}
	else
	{
	System.out.println("no is not armstrong");
	
	}
	}

}
