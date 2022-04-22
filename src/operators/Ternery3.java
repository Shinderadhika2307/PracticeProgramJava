//Largest of 3 numbers
package operators;

public class Ternery3 {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int d=(a>b?(a>c?a:c):(b>c?b:c));
		System.out.println("Largest number is: " +d);

	}

}
