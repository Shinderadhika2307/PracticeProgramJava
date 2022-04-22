package logicalprogramming;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to check:");
int num=sc.nextInt();
boolean flag=false;
for(int i=2;i<num/2;i++) //checks prime number is divisible by any number except 1 and num.
{
	if(num%i==0)
	{
		flag=true;
		break;   //if flag true means number is divisible. so statement is break here
	}
}
if(flag==false)
{
	System.out.println(num+ " is prime number");
}
else
{
	System.out.println(num+ " is not prime number");
}
	}

}
