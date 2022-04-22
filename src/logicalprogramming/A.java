//write a program to take 2 inputs and print product of two numbers.
package logicalprogramming;
import java.util.Scanner;   //need to add libraries for scanner class
public class A {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number: ");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
System.out.println("Product of two numbers: ");
int c= a*b;
System.out.println(c);
	}

}
