package variables;

public class B {
	//System.out.println(ch3); // CTE Execution starts from top to bottom hence we can not use it before declare and initialization
	public static void main(String[] args) {
		
char ch='3', ch1='z';
char ch3='r';
char ch2;
System.out.println(ch);
System.out.println(ch1);
//System.out.println(ch2);// CTE cannot use local variables without initialization
System.out.println(ch3);
	}

}
