//Divisible by 5 and 3

package operators;

public class Ternery6 {

	public static void main(String[] args) {
		int a=10;
		String s=((a%5==0 && a%3==0)?"Divisible by 5 and 3":"Not divisible by 5 and 3");
		
		System.out.println(s);

	}

}
