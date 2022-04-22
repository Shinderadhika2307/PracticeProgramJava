//write program take 3 numbers from user and print average of three numbers.

package logicalprogramming;
import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter any three numbers:");
		int a=num.nextInt();
		int b=num.nextInt();
		int c=num.nextInt();
		int average= (a+b+c)/3;
		System.out.println("Average of 3 numbers is:"+average);
		

	}

}
