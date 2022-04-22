/* globle and local variables */
package variables;

public class C {
	static boolean ch;      // globle variable can used without initialization 
static int a;               // globle variable can used without initialization 
static int b=100;

	public static void main(String[] args) {
		
System.out.println(C.a);//0 globle a
// or
System.out.println(C.ch);
System.out.println(a);//0 globle a
int a=200;
System.out.println(a); //local a
System.out.println(b); //local b
System.out.println(ch);
	}

}

/* if local variable and globle variable are same we can use globle variable with the help of classname*/
/* globle variable can use without initialization..default value is taken */