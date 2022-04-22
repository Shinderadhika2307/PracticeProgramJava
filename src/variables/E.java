package variables;

public class E {
static int a; //takes default value 0
	public static void main(String[] args) {
		System.out.println(a);//0//global variable value will taken
		int a=10;
		System.out.println(a);//10 //local variable value will taken
		System.out.println(E.a);//0 //global variable value will be taken

	}

}
