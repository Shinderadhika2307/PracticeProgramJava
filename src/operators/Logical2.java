package operators;

public class Logical2 {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println(a++>b && a>=b); //false
		System.out.println(a<b && b-->=20); //true
		System.out.println(a++>b || b<20); //True
		System.out.println(a); //12
		System.out.println(b); //19

	}

}
 