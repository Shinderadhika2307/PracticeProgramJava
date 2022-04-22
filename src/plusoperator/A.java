package plusoperator;

public class A {

	public static void main(String[] args) {
	
		//plus operator act as addition
		System.out.println(10+10);//20
		System.out.println(1.10+10);//11.1
		System.out.println('a'+10);//107
		System.out.println(20+'b');//118
		System.out.println('a'+'b');//195
		System.out.println("---------------");
		//plus operator act as concatenation
		System.out.println(10+"10");
		System.out.println("a"+10);
		System.out.println("A"+"A");
		System.out.println("A"+true);
		//System.out.println('a'+false);  is not possible
		
	}

}
