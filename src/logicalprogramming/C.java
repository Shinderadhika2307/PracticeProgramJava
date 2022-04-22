//write program that takes a number from user and print its multiplication table upto 10

package logicalprogramming;
import java.util.Scanner;
public class C {

	public static void main(String[] args) {
		
Scanner S=new Scanner(System.in);
System.out.println("Enter number: ");
int a= S.nextInt();
System.out.println("Output is:");
for(int i=1;i<=10;i++)
{
	System.out.println(a*i);
}

	}

}
