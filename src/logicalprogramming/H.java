// write a program two swap two numbers without using 3rd variable
package logicalprogramming;
import java.util.Scanner;
public class H {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter first no:");
		int a=sc.nextInt(); //10
		System.out.println("Enter second no:");
		int b=sc.nextInt();  //20
		a=a+b; //a=10+20=30
		b=a-b; //b=30-20=10
		a=a-b; //a=30-10=20
		System.out.println(a);//20
		System.out.println(b); //10

	}

}
