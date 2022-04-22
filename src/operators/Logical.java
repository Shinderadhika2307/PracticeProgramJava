package operators;

public class Logical {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println(a>b && b>a); //false
		System.out.println(a<b && a<=b); //true
		System.out.println(a>b || b>a); //true
		System.out.println(a>=10 || b>=10); //true
		System.out.println(a>=10 && b>=10); //true
		System.out.println(!(a==10));

	}

}
/*     &&
 T  T -->T
 T  F -->F
 F  T -->F
 F  F -->F

      ||
T  T --> T
T  F --> T
F  T --> T
F  F --> F

!
!a --> a

*/