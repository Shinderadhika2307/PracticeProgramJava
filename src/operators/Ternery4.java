//Largest of 4 number
package operators;

public class Ternery4 {

	public static void main(String[] args) {
		int a=10, b=20,c=30,d=40;
		int large=(a>b?(a>c?(a>d?a:d):(c>d?c:d)):b>c?(b>d?b:d):(c>d?c:d));
		System.out.println("Largest number is: " +large);

	}

}
