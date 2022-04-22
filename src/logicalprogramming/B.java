//take two number from user and perform addition, multiplication,substraction and multiplication on it.

package logicalprogramming;
import java.util.Scanner;
public class B {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a= S.nextInt();
		System.out.println("Enter second number:");
		int b=S.nextInt();
		int c= a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		System.out.println("Addition is:" +c);
		System.out.println("substraction is:" +d);
		System.out.println("Multiplication is:" +e);
		System.out.println("Division is:" +f);
		
		

	}

}
