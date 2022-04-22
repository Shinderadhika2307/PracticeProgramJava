package logicalprogramming;

import java.util.Scanner;

public class LoginCredential {
	static String UID="EMP565";
	static String PWD="Mahee123";

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid User ID:");
		String UID=sc.next();
		System.out.println("Enter valid Password:");
		String PWD=sc.next();
if(UID.contains(LoginCredential.UID)&& PWD.contains(LoginCredential.PWD))
{
	System.out.println("You logged in successfully");
}
else
{
	System.out.println("Please enter valid UID & Password");
}
	}

}
