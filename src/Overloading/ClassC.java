package Overloading;

public class ClassC extends MethodOverloading{

	public static int add(int a,int b,char ch)
	{
		return(a+b+ch);
	}
	public static void main(String[] args) {
	System.out.println(add(12,87,'a'));	
	System.out.println(add(12,76));

	}

}
