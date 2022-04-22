// write a program two swap two numbers using 3rd variable

package logicalprogramming;
import java.util.Scanner;
public class G {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter first no:");
	int a=sc.nextInt();
	System.out.println("Enter second no:");
	int b=sc.nextInt();
	int c=0;
	c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);
	

	}

}
